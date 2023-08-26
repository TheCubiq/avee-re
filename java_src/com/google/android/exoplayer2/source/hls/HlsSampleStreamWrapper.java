package com.google.android.exoplayer2.source.hls;

import android.os.Handler;
import android.util.Log;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.hls.HlsChunkSource;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class HlsSampleStreamWrapper implements Loader.Callback<Chunk>, Loader.ReleaseCallback, SequenceableLoader, ExtractorOutput, SampleQueue.UpstreamFormatChangedListener {
    private static final int PRIMARY_TYPE_AUDIO = 2;
    private static final int PRIMARY_TYPE_NONE = 0;
    private static final int PRIMARY_TYPE_TEXT = 1;
    private static final int PRIMARY_TYPE_VIDEO = 3;
    public static final int SAMPLE_QUEUE_INDEX_NO_MAPPING_FATAL = -2;
    public static final int SAMPLE_QUEUE_INDEX_NO_MAPPING_NON_FATAL = -3;
    public static final int SAMPLE_QUEUE_INDEX_PENDING = -1;
    private static final String TAG = "HlsSampleStreamWrapper";
    private final Allocator allocator;
    private boolean audioSampleQueueMappingDone;
    private final Callback callback;
    private final HlsChunkSource chunkSource;
    private Format downstreamTrackFormat;
    private int enabledTrackGroupCount;
    private final MediaSourceEventListener.EventDispatcher eventDispatcher;
    private boolean haveAudioVideoSampleQueues;
    private long lastSeekPositionUs;
    private boolean loadingFinished;
    private final int minLoadableRetryCount;
    private final Format muxedAudioFormat;
    private TrackGroupArray optionalTrackGroups;
    private long pendingResetPositionUs;
    private boolean pendingResetUpstreamFormats;
    private boolean prepared;
    private int primaryTrackGroupIndex;
    private boolean released;
    private long sampleOffsetUs;
    private boolean sampleQueuesBuilt;
    private boolean seenFirstTrackSelection;
    private int[] trackGroupToSampleQueueIndex;
    private TrackGroupArray trackGroups;
    private final int trackType;
    private boolean tracksEnded;
    private boolean videoSampleQueueMappingDone;
    private final Loader loader = new Loader("Loader:HlsSampleStreamWrapper");
    private final HlsChunkSource.HlsChunkHolder nextChunkHolder = new HlsChunkSource.HlsChunkHolder();
    private int[] sampleQueueTrackIds = new int[0];
    private int audioSampleQueueIndex = -1;
    private int videoSampleQueueIndex = -1;
    private SampleQueue[] sampleQueues = new SampleQueue[0];
    private boolean[] sampleQueueIsAudioVideoFlags = new boolean[0];
    private boolean[] sampleQueuesEnabledStates = new boolean[0];
    private final ArrayList<HlsMediaChunk> mediaChunks = new ArrayList<>();
    private final ArrayList<HlsSampleStream> hlsSampleStreams = new ArrayList<>();
    private final Runnable maybeFinishPrepareRunnable = new Runnable() { // from class: com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.1
        @Override // java.lang.Runnable
        public void run() {
            HlsSampleStreamWrapper.this.maybeFinishPrepare();
        }
    };
    private final Runnable onTracksEndedRunnable = new Runnable() { // from class: com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.2
        @Override // java.lang.Runnable
        public void run() {
            HlsSampleStreamWrapper.this.onTracksEnded();
        }
    };
    private final Handler handler = new Handler();

    /* loaded from: classes.dex */
    public interface Callback extends SequenceableLoader.Callback<HlsSampleStreamWrapper> {
        void onPlaylistRefreshRequired(HlsMasterPlaylist.HlsUrl hlsUrl);

        void onPrepared();
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
    }

    public HlsSampleStreamWrapper(int i, Callback callback, HlsChunkSource hlsChunkSource, Allocator allocator, long j, Format format, int i2, MediaSourceEventListener.EventDispatcher eventDispatcher) {
        this.trackType = i;
        this.callback = callback;
        this.chunkSource = hlsChunkSource;
        this.allocator = allocator;
        this.muxedAudioFormat = format;
        this.minLoadableRetryCount = i2;
        this.eventDispatcher = eventDispatcher;
        this.lastSeekPositionUs = j;
        this.pendingResetPositionUs = j;
    }

    public void continuePreparing() {
        if (this.prepared) {
            return;
        }
        continueLoading(this.lastSeekPositionUs);
    }

    public void prepareWithMasterPlaylistInfo(TrackGroupArray trackGroupArray, int i, TrackGroupArray trackGroupArray2) {
        this.prepared = true;
        this.trackGroups = trackGroupArray;
        this.optionalTrackGroups = trackGroupArray2;
        this.primaryTrackGroupIndex = i;
        this.callback.onPrepared();
    }

    public void maybeThrowPrepareError() throws IOException {
        maybeThrowError();
    }

    public TrackGroupArray getTrackGroups() {
        return this.trackGroups;
    }

    public int bindSampleQueueToSampleStream(int i) {
        int i2 = this.trackGroupToSampleQueueIndex[i];
        if (i2 == -1) {
            return this.optionalTrackGroups.indexOf(this.trackGroups.get(i)) == -1 ? -2 : -3;
        }
        boolean[] zArr = this.sampleQueuesEnabledStates;
        if (zArr[i2]) {
            return -2;
        }
        zArr[i2] = true;
        return i2;
    }

    public void unbindSampleQueue(int i) {
        int i2 = this.trackGroupToSampleQueueIndex[i];
        Assertions.checkState(this.sampleQueuesEnabledStates[i2]);
        this.sampleQueuesEnabledStates[i2] = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean selectTracks(TrackSelection[] trackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j, boolean z) {
        boolean z2;
        boolean z3;
        Assertions.checkState(this.prepared);
        int i = this.enabledTrackGroupCount;
        int i2 = 0;
        for (int i3 = 0; i3 < trackSelectionArr.length; i3++) {
            if (sampleStreamArr[i3] != null && (trackSelectionArr[i3] == null || !zArr[i3])) {
                this.enabledTrackGroupCount--;
                ((HlsSampleStream) sampleStreamArr[i3]).unbindSampleQueue();
                sampleStreamArr[i3] = null;
            }
        }
        boolean z4 = z || (!this.seenFirstTrackSelection ? j == this.lastSeekPositionUs : i != 0);
        TrackSelection trackSelection = this.chunkSource.getTrackSelection();
        boolean z5 = z4;
        TrackSelection trackSelection2 = trackSelection;
        for (int i4 = 0; i4 < trackSelectionArr.length; i4++) {
            if (sampleStreamArr[i4] == null && trackSelectionArr[i4] != null) {
                this.enabledTrackGroupCount++;
                TrackSelection trackSelection3 = trackSelectionArr[i4];
                int indexOf = this.trackGroups.indexOf(trackSelection3.getTrackGroup());
                if (indexOf == this.primaryTrackGroupIndex) {
                    this.chunkSource.selectTracks(trackSelection3);
                    trackSelection2 = trackSelection3;
                }
                sampleStreamArr[i4] = new HlsSampleStream(this, indexOf);
                zArr2[i4] = true;
                if (this.trackGroupToSampleQueueIndex != null) {
                    ((HlsSampleStream) sampleStreamArr[i4]).bindSampleQueue();
                }
                if (this.sampleQueuesBuilt && !z5) {
                    SampleQueue sampleQueue = this.sampleQueues[this.trackGroupToSampleQueueIndex[indexOf]];
                    sampleQueue.rewind();
                    z5 = sampleQueue.advanceTo(j, true, true) == -1 && sampleQueue.getReadIndex() != 0;
                }
            }
        }
        if (this.enabledTrackGroupCount == 0) {
            this.chunkSource.reset();
            this.downstreamTrackFormat = null;
            this.mediaChunks.clear();
            if (this.loader.isLoading()) {
                if (this.sampleQueuesBuilt) {
                    SampleQueue[] sampleQueueArr = this.sampleQueues;
                    int length = sampleQueueArr.length;
                    while (i2 < length) {
                        sampleQueueArr[i2].discardToEnd();
                        i2++;
                    }
                }
                this.loader.cancelLoading();
            } else {
                resetSampleQueues();
            }
        } else {
            if (!this.mediaChunks.isEmpty() && !Util.areEqual(trackSelection2, trackSelection)) {
                if (!this.seenFirstTrackSelection) {
                    trackSelection2.updateSelectedTrack(j, j < 0 ? -j : 0L, C.TIME_UNSET);
                    if (trackSelection2.getSelectedIndexInTrackGroup() == this.chunkSource.getTrackGroup().indexOf(getLastMediaChunk().trackFormat)) {
                        z3 = false;
                        if (z3) {
                            this.pendingResetUpstreamFormats = true;
                            z2 = true;
                            z5 = true;
                            if (z5) {
                                seekToUs(j, z2);
                                while (i2 < sampleStreamArr.length) {
                                    if (sampleStreamArr[i2] != null) {
                                        zArr2[i2] = true;
                                    }
                                    i2++;
                                }
                            }
                        }
                    }
                }
                z3 = true;
                if (z3) {
                }
            }
            z2 = z;
            if (z5) {
            }
        }
        updateSampleStreams(sampleStreamArr);
        this.seenFirstTrackSelection = true;
        return z5;
    }

    public void discardBuffer(long j, boolean z) {
        if (this.sampleQueuesBuilt) {
            int length = this.sampleQueues.length;
            for (int i = 0; i < length; i++) {
                this.sampleQueues[i].discardTo(j, z, this.sampleQueuesEnabledStates[i]);
            }
        }
    }

    public boolean seekToUs(long j, boolean z) {
        this.lastSeekPositionUs = j;
        if (!this.sampleQueuesBuilt || z || isPendingReset() || !seekInsideBufferUs(j)) {
            this.pendingResetPositionUs = j;
            this.loadingFinished = false;
            this.mediaChunks.clear();
            if (this.loader.isLoading()) {
                this.loader.cancelLoading();
                return true;
            }
            resetSampleQueues();
            return true;
        }
        return false;
    }

    public void release() {
        if (this.prepared) {
            for (SampleQueue sampleQueue : this.sampleQueues) {
                sampleQueue.discardToEnd();
            }
        }
        this.loader.release(this);
        this.handler.removeCallbacksAndMessages(null);
        this.released = true;
        this.hlsSampleStreams.clear();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
        resetSampleQueues();
    }

    public void setIsTimestampMaster(boolean z) {
        this.chunkSource.setIsTimestampMaster(z);
    }

    public boolean onPlaylistError(HlsMasterPlaylist.HlsUrl hlsUrl, boolean z) {
        return this.chunkSource.onPlaylistError(hlsUrl, z);
    }

    public boolean isReady(int i) {
        return this.loadingFinished || (!isPendingReset() && this.sampleQueues[i].hasNextSample());
    }

    public void maybeThrowError() throws IOException {
        this.loader.maybeThrowError();
        this.chunkSource.maybeThrowError();
    }

    public int readData(int i, FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z) {
        if (isPendingReset()) {
            return -3;
        }
        if (!this.mediaChunks.isEmpty()) {
            int i2 = 0;
            while (i2 < this.mediaChunks.size() - 1 && finishedReadingChunk(this.mediaChunks.get(i2))) {
                i2++;
            }
            if (i2 > 0) {
                Util.removeRange(this.mediaChunks, 0, i2);
            }
            HlsMediaChunk hlsMediaChunk = this.mediaChunks.get(0);
            Format format = hlsMediaChunk.trackFormat;
            if (!format.equals(this.downstreamTrackFormat)) {
                this.eventDispatcher.downstreamFormatChanged(this.trackType, format, hlsMediaChunk.trackSelectionReason, hlsMediaChunk.trackSelectionData, hlsMediaChunk.startTimeUs);
            }
            this.downstreamTrackFormat = format;
        }
        return this.sampleQueues[i].read(formatHolder, decoderInputBuffer, z, this.loadingFinished, this.lastSeekPositionUs);
    }

    public int skipData(int i, long j) {
        if (isPendingReset()) {
            return 0;
        }
        SampleQueue sampleQueue = this.sampleQueues[i];
        if (this.loadingFinished && j > sampleQueue.getLargestQueuedTimestampUs()) {
            return sampleQueue.advanceToEnd();
        }
        int advanceTo = sampleQueue.advanceTo(j, true, true);
        if (advanceTo == -1) {
            return 0;
        }
        return advanceTo;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        ArrayList<HlsMediaChunk> arrayList;
        if (this.loadingFinished) {
            return Long.MIN_VALUE;
        }
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        long j = this.lastSeekPositionUs;
        HlsMediaChunk lastMediaChunk = getLastMediaChunk();
        if (!lastMediaChunk.isLoadCompleted()) {
            lastMediaChunk = this.mediaChunks.size() > 1 ? this.mediaChunks.get(arrayList.size() - 2) : null;
        }
        if (lastMediaChunk != null) {
            j = Math.max(j, lastMediaChunk.endTimeUs);
        }
        if (this.sampleQueuesBuilt) {
            for (SampleQueue sampleQueue : this.sampleQueues) {
                j = Math.max(j, sampleQueue.getLargestQueuedTimestampUs());
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        if (this.loadingFinished) {
            return Long.MIN_VALUE;
        }
        return getLastMediaChunk().endTimeUs;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j) {
        HlsMediaChunk lastMediaChunk;
        long j2;
        if (this.loadingFinished || this.loader.isLoading()) {
            return false;
        }
        if (isPendingReset()) {
            lastMediaChunk = null;
            j2 = this.pendingResetPositionUs;
        } else {
            lastMediaChunk = getLastMediaChunk();
            j2 = lastMediaChunk.endTimeUs;
        }
        this.chunkSource.getNextChunk(lastMediaChunk, j, j2, this.nextChunkHolder);
        boolean z = this.nextChunkHolder.endOfStream;
        Chunk chunk = this.nextChunkHolder.chunk;
        HlsMasterPlaylist.HlsUrl hlsUrl = this.nextChunkHolder.playlist;
        this.nextChunkHolder.clear();
        if (z) {
            this.pendingResetPositionUs = C.TIME_UNSET;
            this.loadingFinished = true;
            return true;
        } else if (chunk == null) {
            if (hlsUrl != null) {
                this.callback.onPlaylistRefreshRequired(hlsUrl);
            }
            return false;
        } else {
            if (isMediaChunk(chunk)) {
                this.pendingResetPositionUs = C.TIME_UNSET;
                HlsMediaChunk hlsMediaChunk = (HlsMediaChunk) chunk;
                hlsMediaChunk.init(this);
                this.mediaChunks.add(hlsMediaChunk);
            }
            this.eventDispatcher.loadStarted(chunk.dataSpec, chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, this.loader.startLoading(chunk, this, this.minLoadableRetryCount));
            return true;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public void onLoadCompleted(Chunk chunk, long j, long j2) {
        this.chunkSource.onChunkLoadCompleted(chunk);
        this.eventDispatcher.loadCompleted(chunk.dataSpec, chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, j, j2, chunk.bytesLoaded());
        if (!this.prepared) {
            continueLoading(this.lastSeekPositionUs);
        } else {
            this.callback.onContinueLoadingRequested(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public void onLoadCanceled(Chunk chunk, long j, long j2, boolean z) {
        this.eventDispatcher.loadCanceled(chunk.dataSpec, chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, j, j2, chunk.bytesLoaded());
        if (z) {
            return;
        }
        resetSampleQueues();
        if (this.enabledTrackGroupCount > 0) {
            this.callback.onContinueLoadingRequested(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public int onLoadError(Chunk chunk, long j, long j2, IOException iOException) {
        boolean z;
        long bytesLoaded = chunk.bytesLoaded();
        boolean isMediaChunk = isMediaChunk(chunk);
        if (this.chunkSource.onChunkLoadError(chunk, !isMediaChunk || bytesLoaded == 0, iOException)) {
            if (isMediaChunk) {
                ArrayList<HlsMediaChunk> arrayList = this.mediaChunks;
                Assertions.checkState(arrayList.remove(arrayList.size() - 1) == chunk);
                if (this.mediaChunks.isEmpty()) {
                    this.pendingResetPositionUs = this.lastSeekPositionUs;
                }
            }
            z = true;
        } else {
            z = false;
        }
        this.eventDispatcher.loadError(chunk.dataSpec, chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, j, j2, chunk.bytesLoaded(), iOException, z);
        if (!z) {
            return iOException instanceof ParserException ? 3 : 0;
        } else if (!this.prepared) {
            continueLoading(this.lastSeekPositionUs);
            return 2;
        } else {
            this.callback.onContinueLoadingRequested(this);
            return 2;
        }
    }

    public void init(int i, boolean z, boolean z2) {
        if (!z2) {
            this.audioSampleQueueMappingDone = false;
            this.videoSampleQueueMappingDone = false;
        }
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.sourceId(i);
        }
        if (z) {
            for (SampleQueue sampleQueue2 : this.sampleQueues) {
                sampleQueue2.splice();
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public TrackOutput track(int i, int i2) {
        SampleQueue[] sampleQueueArr = this.sampleQueues;
        int length = sampleQueueArr.length;
        boolean z = false;
        if (i2 == 1) {
            int i3 = this.audioSampleQueueIndex;
            if (i3 != -1) {
                if (this.audioSampleQueueMappingDone) {
                    return this.sampleQueueTrackIds[i3] == i ? sampleQueueArr[i3] : createDummyTrackOutput(i, i2);
                }
                this.audioSampleQueueMappingDone = true;
                this.sampleQueueTrackIds[i3] = i;
                return sampleQueueArr[i3];
            } else if (this.tracksEnded) {
                return createDummyTrackOutput(i, i2);
            }
        } else if (i2 == 2) {
            int i4 = this.videoSampleQueueIndex;
            if (i4 != -1) {
                if (this.videoSampleQueueMappingDone) {
                    return this.sampleQueueTrackIds[i4] == i ? sampleQueueArr[i4] : createDummyTrackOutput(i, i2);
                }
                this.videoSampleQueueMappingDone = true;
                this.sampleQueueTrackIds[i4] = i;
                return sampleQueueArr[i4];
            } else if (this.tracksEnded) {
                return createDummyTrackOutput(i, i2);
            }
        } else {
            for (int i5 = 0; i5 < length; i5++) {
                if (this.sampleQueueTrackIds[i5] == i) {
                    return this.sampleQueues[i5];
                }
            }
            if (this.tracksEnded) {
                return createDummyTrackOutput(i, i2);
            }
        }
        SampleQueue sampleQueue = new SampleQueue(this.allocator);
        sampleQueue.setSampleOffsetUs(this.sampleOffsetUs);
        sampleQueue.setUpstreamFormatChangeListener(this);
        int i6 = length + 1;
        int[] copyOf = Arrays.copyOf(this.sampleQueueTrackIds, i6);
        this.sampleQueueTrackIds = copyOf;
        copyOf[length] = i;
        SampleQueue[] sampleQueueArr2 = (SampleQueue[]) Arrays.copyOf(this.sampleQueues, i6);
        this.sampleQueues = sampleQueueArr2;
        sampleQueueArr2[length] = sampleQueue;
        boolean[] copyOf2 = Arrays.copyOf(this.sampleQueueIsAudioVideoFlags, i6);
        this.sampleQueueIsAudioVideoFlags = copyOf2;
        copyOf2[length] = (i2 == 1 || i2 == 2) ? true : true;
        this.haveAudioVideoSampleQueues |= this.sampleQueueIsAudioVideoFlags[length];
        if (i2 == 1) {
            this.audioSampleQueueMappingDone = true;
            this.audioSampleQueueIndex = length;
        } else if (i2 == 2) {
            this.videoSampleQueueMappingDone = true;
            this.videoSampleQueueIndex = length;
        }
        this.sampleQueuesEnabledStates = Arrays.copyOf(this.sampleQueuesEnabledStates, i6);
        return sampleQueue;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void endTracks() {
        this.tracksEnded = true;
        this.handler.post(this.onTracksEndedRunnable);
    }

    @Override // com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener
    public void onUpstreamFormatChanged(Format format) {
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    public void setSampleOffsetUs(long j) {
        this.sampleOffsetUs = j;
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.setSampleOffsetUs(j);
        }
    }

    private void updateSampleStreams(SampleStream[] sampleStreamArr) {
        this.hlsSampleStreams.clear();
        for (SampleStream sampleStream : sampleStreamArr) {
            if (sampleStream != null) {
                this.hlsSampleStreams.add((HlsSampleStream) sampleStream);
            }
        }
    }

    private boolean finishedReadingChunk(HlsMediaChunk hlsMediaChunk) {
        int i = hlsMediaChunk.uid;
        int length = this.sampleQueues.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.sampleQueuesEnabledStates[i2] && this.sampleQueues[i2].peekSourceId() == i) {
                return false;
            }
        }
        return true;
    }

    private void resetSampleQueues() {
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.reset(this.pendingResetUpstreamFormats);
        }
        this.pendingResetUpstreamFormats = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTracksEnded() {
        this.sampleQueuesBuilt = true;
        maybeFinishPrepare();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFinishPrepare() {
        if (!this.released && this.trackGroupToSampleQueueIndex == null && this.sampleQueuesBuilt) {
            for (SampleQueue sampleQueue : this.sampleQueues) {
                if (sampleQueue.getUpstreamFormat() == null) {
                    return;
                }
            }
            if (this.trackGroups != null) {
                mapSampleQueuesToMatchTrackGroups();
                return;
            }
            buildTracksFromSampleStreams();
            this.prepared = true;
            this.callback.onPrepared();
        }
    }

    private void mapSampleQueuesToMatchTrackGroups() {
        int i = this.trackGroups.length;
        int[] iArr = new int[i];
        this.trackGroupToSampleQueueIndex = iArr;
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = 0;
            while (true) {
                SampleQueue[] sampleQueueArr = this.sampleQueues;
                if (i3 >= sampleQueueArr.length) {
                    break;
                } else if (formatsMatch(sampleQueueArr[i3].getUpstreamFormat(), this.trackGroups.get(i2).getFormat(0))) {
                    this.trackGroupToSampleQueueIndex[i2] = i3;
                    break;
                } else {
                    i3++;
                }
            }
        }
        Iterator<HlsSampleStream> it = this.hlsSampleStreams.iterator();
        while (it.hasNext()) {
            it.next().bindSampleQueue();
        }
    }

    private void buildTracksFromSampleStreams() {
        int length = this.sampleQueues.length;
        int i = 0;
        char c = 0;
        int i2 = -1;
        while (true) {
            char c2 = 3;
            if (i >= length) {
                break;
            }
            String str = this.sampleQueues[i].getUpstreamFormat().sampleMimeType;
            if (!MimeTypes.isVideo(str)) {
                if (MimeTypes.isAudio(str)) {
                    c2 = 2;
                } else {
                    c2 = MimeTypes.isText(str) ? (char) 1 : (char) 0;
                }
            }
            if (c2 > c) {
                i2 = i;
                c = c2;
            } else if (c2 == c && i2 != -1) {
                i2 = -1;
            }
            i++;
        }
        TrackGroup trackGroup = this.chunkSource.getTrackGroup();
        int i3 = trackGroup.length;
        this.primaryTrackGroupIndex = -1;
        this.trackGroupToSampleQueueIndex = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            this.trackGroupToSampleQueueIndex[i4] = i4;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        for (int i5 = 0; i5 < length; i5++) {
            Format upstreamFormat = this.sampleQueues[i5].getUpstreamFormat();
            if (i5 == i2) {
                Format[] formatArr = new Format[i3];
                for (int i6 = 0; i6 < i3; i6++) {
                    formatArr[i6] = deriveFormat(trackGroup.getFormat(i6), upstreamFormat, true);
                }
                trackGroupArr[i5] = new TrackGroup(formatArr);
                this.primaryTrackGroupIndex = i5;
            } else {
                trackGroupArr[i5] = new TrackGroup(deriveFormat((c == 3 && MimeTypes.isAudio(upstreamFormat.sampleMimeType)) ? this.muxedAudioFormat : null, upstreamFormat, false));
            }
        }
        this.trackGroups = new TrackGroupArray(trackGroupArr);
        Assertions.checkState(this.optionalTrackGroups == null);
        this.optionalTrackGroups = TrackGroupArray.EMPTY;
    }

    private HlsMediaChunk getLastMediaChunk() {
        ArrayList<HlsMediaChunk> arrayList = this.mediaChunks;
        return arrayList.get(arrayList.size() - 1);
    }

    private boolean isPendingReset() {
        return this.pendingResetPositionUs != C.TIME_UNSET;
    }

    private boolean seekInsideBufferUs(long j) {
        int i;
        int length = this.sampleQueues.length;
        while (true) {
            if (i >= length) {
                return true;
            }
            SampleQueue sampleQueue = this.sampleQueues[i];
            sampleQueue.rewind();
            i = ((sampleQueue.advanceTo(j, true, false) != -1) || (!this.sampleQueueIsAudioVideoFlags[i] && this.haveAudioVideoSampleQueues)) ? i + 1 : 0;
        }
        return false;
    }

    private static Format deriveFormat(Format format, Format format2, boolean z) {
        if (format == null) {
            return format2;
        }
        int i = z ? format.bitrate : -1;
        String codecsOfType = Util.getCodecsOfType(format.codecs, MimeTypes.getTrackType(format2.sampleMimeType));
        String mediaMimeType = MimeTypes.getMediaMimeType(codecsOfType);
        if (mediaMimeType == null) {
            mediaMimeType = format2.sampleMimeType;
        }
        return format2.copyWithContainerInfo(format.id, mediaMimeType, codecsOfType, i, format.width, format.height, format.selectionFlags, format.language);
    }

    private static boolean isMediaChunk(Chunk chunk) {
        return chunk instanceof HlsMediaChunk;
    }

    private static boolean formatsMatch(Format format, Format format2) {
        String str = format.sampleMimeType;
        String str2 = format2.sampleMimeType;
        int trackType = MimeTypes.getTrackType(str);
        if (trackType != 3) {
            return trackType == MimeTypes.getTrackType(str2);
        } else if (Util.areEqual(str, str2)) {
            return !(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str)) || format.accessibilityChannel == format2.accessibilityChannel;
        } else {
            return false;
        }
    }

    private static DummyTrackOutput createDummyTrackOutput(int i, int i2) {
        Log.w(TAG, "Unmapped track with id " + i + " of type " + i2);
        return new DummyTrackOutput();
    }
}
