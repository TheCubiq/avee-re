package com.google.android.exoplayer2.source.smoothstreaming;

import android.util.Base64;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.chunk.ChunkSampleStream;
import com.google.android.exoplayer2.source.smoothstreaming.SsChunkSource;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import java.io.IOException;
import java.util.ArrayList;
/* loaded from: classes.dex */
final class SsMediaPeriod implements MediaPeriod, SequenceableLoader.Callback<ChunkSampleStream<SsChunkSource>> {
    private static final int INITIALIZATION_VECTOR_SIZE = 8;
    private final Allocator allocator;
    private MediaPeriod.Callback callback;
    private final SsChunkSource.Factory chunkSourceFactory;
    private SequenceableLoader compositeSequenceableLoader;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final MediaSourceEventListener.EventDispatcher eventDispatcher;
    private SsManifest manifest;
    private final LoaderErrorThrower manifestLoaderErrorThrower;
    private final int minLoadableRetryCount;
    private boolean notifiedReadingStarted;
    private ChunkSampleStream<SsChunkSource>[] sampleStreams;
    private final TrackEncryptionBox[] trackEncryptionBoxes;
    private final TrackGroupArray trackGroups;

    public SsMediaPeriod(SsManifest ssManifest, SsChunkSource.Factory factory, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, int i, MediaSourceEventListener.EventDispatcher eventDispatcher, LoaderErrorThrower loaderErrorThrower, Allocator allocator) {
        this.chunkSourceFactory = factory;
        this.manifestLoaderErrorThrower = loaderErrorThrower;
        this.minLoadableRetryCount = i;
        this.eventDispatcher = eventDispatcher;
        this.allocator = allocator;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.trackGroups = buildTrackGroups(ssManifest);
        SsManifest.ProtectionElement protectionElement = ssManifest.protectionElement;
        if (protectionElement != null) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[]{new TrackEncryptionBox(true, null, 8, getProtectionElementKeyId(protectionElement.data), 0, 0, null)};
        } else {
            this.trackEncryptionBoxes = null;
        }
        this.manifest = ssManifest;
        ChunkSampleStream<SsChunkSource>[] newSampleStreamArray = newSampleStreamArray(0);
        this.sampleStreams = newSampleStreamArray;
        this.compositeSequenceableLoader = compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(newSampleStreamArray);
        eventDispatcher.mediaPeriodCreated();
    }

    public void updateManifest(SsManifest ssManifest) {
        this.manifest = ssManifest;
        for (ChunkSampleStream<SsChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.getChunkSource().updateManifest(ssManifest);
        }
        this.callback.onContinueLoadingRequested(this);
    }

    public void release() {
        for (ChunkSampleStream<SsChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.release();
        }
        this.callback = null;
        this.eventDispatcher.mediaPeriodReleased();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j) {
        this.callback = callback;
        callback.onPrepared(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        this.manifestLoaderErrorThrower.maybeThrowError();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return this.trackGroups;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(TrackSelection[] trackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < trackSelectionArr.length; i++) {
            if (sampleStreamArr[i] != null) {
                ChunkSampleStream chunkSampleStream = (ChunkSampleStream) sampleStreamArr[i];
                if (trackSelectionArr[i] == null || !zArr[i]) {
                    chunkSampleStream.release();
                    sampleStreamArr[i] = null;
                } else {
                    arrayList.add(chunkSampleStream);
                }
            }
            if (sampleStreamArr[i] == null && trackSelectionArr[i] != null) {
                ChunkSampleStream<SsChunkSource> buildSampleStream = buildSampleStream(trackSelectionArr[i], j);
                arrayList.add(buildSampleStream);
                sampleStreamArr[i] = buildSampleStream;
                zArr2[i] = true;
            }
        }
        ChunkSampleStream<SsChunkSource>[] newSampleStreamArray = newSampleStreamArray(arrayList.size());
        this.sampleStreams = newSampleStreamArray;
        arrayList.toArray(newSampleStreamArray);
        this.compositeSequenceableLoader = this.compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(this.sampleStreams);
        return j;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long j, boolean z) {
        for (ChunkSampleStream<SsChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.discardBuffer(j, z);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
        this.compositeSequenceableLoader.reevaluateBuffer(j);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j) {
        return this.compositeSequenceableLoader.continueLoading(j);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.compositeSequenceableLoader.getNextLoadPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        if (this.notifiedReadingStarted) {
            return C.TIME_UNSET;
        }
        this.eventDispatcher.readingStarted();
        this.notifiedReadingStarted = true;
        return C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.compositeSequenceableLoader.getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long j) {
        for (ChunkSampleStream<SsChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.seekToUs(j);
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        ChunkSampleStream<SsChunkSource>[] chunkSampleStreamArr;
        for (ChunkSampleStream<SsChunkSource> chunkSampleStream : this.sampleStreams) {
            if (chunkSampleStream.primaryTrackType == 2) {
                return chunkSampleStream.getAdjustedSeekPositionUs(j, seekParameters);
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(ChunkSampleStream<SsChunkSource> chunkSampleStream) {
        this.callback.onContinueLoadingRequested(this);
    }

    private ChunkSampleStream<SsChunkSource> buildSampleStream(TrackSelection trackSelection, long j) {
        int indexOf = this.trackGroups.indexOf(trackSelection.getTrackGroup());
        return new ChunkSampleStream<>(this.manifest.streamElements[indexOf].type, null, null, this.chunkSourceFactory.createChunkSource(this.manifestLoaderErrorThrower, this.manifest, indexOf, trackSelection, this.trackEncryptionBoxes), this, this.allocator, j, this.minLoadableRetryCount, this.eventDispatcher);
    }

    private static TrackGroupArray buildTrackGroups(SsManifest ssManifest) {
        TrackGroup[] trackGroupArr = new TrackGroup[ssManifest.streamElements.length];
        for (int i = 0; i < ssManifest.streamElements.length; i++) {
            trackGroupArr[i] = new TrackGroup(ssManifest.streamElements[i].formats);
        }
        return new TrackGroupArray(trackGroupArr);
    }

    private static ChunkSampleStream<SsChunkSource>[] newSampleStreamArray(int i) {
        return new ChunkSampleStream[i];
    }

    private static byte[] getProtectionElementKeyId(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i += 2) {
            sb.append((char) bArr[i]);
        }
        String sb2 = sb.toString();
        byte[] decode = Base64.decode(sb2.substring(sb2.indexOf("<KID>") + 5, sb2.indexOf("</KID>")), 0);
        swap(decode, 0, 3);
        swap(decode, 1, 2);
        swap(decode, 4, 5);
        swap(decode, 6, 7);
        return decode;
    }

    private static void swap(byte[] bArr, int i, int i2) {
        byte b = bArr[i];
        bArr[i] = bArr[i2];
        bArr[i2] = b;
    }
}
