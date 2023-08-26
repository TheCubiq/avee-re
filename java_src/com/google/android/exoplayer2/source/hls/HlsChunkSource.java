package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.google.android.exoplayer2.source.chunk.DataChunk;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.trackselection.BaseTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
class HlsChunkSource {
    private final DataSource encryptionDataSource;
    private byte[] encryptionIv;
    private String encryptionIvString;
    private byte[] encryptionKey;
    private Uri encryptionKeyUri;
    private HlsMasterPlaylist.HlsUrl expectedPlaylistUrl;
    private final HlsExtractorFactory extractorFactory;
    private IOException fatalError;
    private boolean independentSegments;
    private boolean isTimestampMaster;
    private long liveEdgeInPeriodTimeUs = C.TIME_UNSET;
    private final DataSource mediaDataSource;
    private final List<Format> muxedCaptionFormats;
    private final HlsPlaylistTracker playlistTracker;
    private byte[] scratchSpace;
    private boolean seenExpectedPlaylistError;
    private final TimestampAdjusterProvider timestampAdjusterProvider;
    private final TrackGroup trackGroup;
    private TrackSelection trackSelection;
    private final HlsMasterPlaylist.HlsUrl[] variants;

    /* loaded from: classes.dex */
    public static final class HlsChunkHolder {
        public Chunk chunk;
        public boolean endOfStream;
        public HlsMasterPlaylist.HlsUrl playlist;

        public HlsChunkHolder() {
            clear();
        }

        public void clear() {
            this.chunk = null;
            this.endOfStream = false;
            this.playlist = null;
        }
    }

    public HlsChunkSource(HlsExtractorFactory hlsExtractorFactory, HlsPlaylistTracker hlsPlaylistTracker, HlsMasterPlaylist.HlsUrl[] hlsUrlArr, HlsDataSourceFactory hlsDataSourceFactory, TimestampAdjusterProvider timestampAdjusterProvider, List<Format> list) {
        this.extractorFactory = hlsExtractorFactory;
        this.playlistTracker = hlsPlaylistTracker;
        this.variants = hlsUrlArr;
        this.timestampAdjusterProvider = timestampAdjusterProvider;
        this.muxedCaptionFormats = list;
        Format[] formatArr = new Format[hlsUrlArr.length];
        int[] iArr = new int[hlsUrlArr.length];
        for (int i = 0; i < hlsUrlArr.length; i++) {
            formatArr[i] = hlsUrlArr[i].format;
            iArr[i] = i;
        }
        this.mediaDataSource = hlsDataSourceFactory.createDataSource(1);
        this.encryptionDataSource = hlsDataSourceFactory.createDataSource(3);
        TrackGroup trackGroup = new TrackGroup(formatArr);
        this.trackGroup = trackGroup;
        this.trackSelection = new InitializationTrackSelection(trackGroup, iArr);
    }

    public void maybeThrowError() throws IOException {
        IOException iOException = this.fatalError;
        if (iOException != null) {
            throw iOException;
        }
        HlsMasterPlaylist.HlsUrl hlsUrl = this.expectedPlaylistUrl;
        if (hlsUrl == null || !this.seenExpectedPlaylistError) {
            return;
        }
        this.playlistTracker.maybeThrowPlaylistRefreshError(hlsUrl);
    }

    public TrackGroup getTrackGroup() {
        return this.trackGroup;
    }

    public void selectTracks(TrackSelection trackSelection) {
        this.trackSelection = trackSelection;
    }

    public TrackSelection getTrackSelection() {
        return this.trackSelection;
    }

    public void reset() {
        this.fatalError = null;
    }

    public void setIsTimestampMaster(boolean z) {
        this.isTimestampMaster = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getNextChunk(HlsMediaChunk hlsMediaChunk, long j, long j2, HlsChunkHolder hlsChunkHolder) {
        long binarySearchFloor;
        HlsMediaPlaylist hlsMediaPlaylist;
        long j3;
        int indexOf = hlsMediaChunk == null ? -1 : this.trackGroup.indexOf(hlsMediaChunk.trackFormat);
        long j4 = j2 - j;
        long resolveTimeToLiveEdgeUs = resolveTimeToLiveEdgeUs(j);
        if (hlsMediaChunk != null && !this.independentSegments) {
            long durationUs = hlsMediaChunk.getDurationUs();
            j4 = Math.max(0L, j4 - durationUs);
            if (resolveTimeToLiveEdgeUs != C.TIME_UNSET) {
                resolveTimeToLiveEdgeUs = Math.max(0L, resolveTimeToLiveEdgeUs - durationUs);
            }
        }
        this.trackSelection.updateSelectedTrack(j, j4, resolveTimeToLiveEdgeUs);
        int selectedIndexInTrackGroup = this.trackSelection.getSelectedIndexInTrackGroup();
        boolean z = indexOf != selectedIndexInTrackGroup;
        HlsMasterPlaylist.HlsUrl hlsUrl = this.variants[selectedIndexInTrackGroup];
        if (!this.playlistTracker.isSnapshotValid(hlsUrl)) {
            hlsChunkHolder.playlist = hlsUrl;
            this.seenExpectedPlaylistError &= this.expectedPlaylistUrl == hlsUrl;
            this.expectedPlaylistUrl = hlsUrl;
            return;
        }
        HlsMediaPlaylist playlistSnapshot = this.playlistTracker.getPlaylistSnapshot(hlsUrl);
        this.independentSegments = playlistSnapshot.hasIndependentSegmentsTag;
        updateLiveEdgeTimeUs(playlistSnapshot);
        long initialStartTimeUs = playlistSnapshot.startTimeUs - this.playlistTracker.getInitialStartTimeUs();
        if (hlsMediaChunk == null || z) {
            long j5 = playlistSnapshot.durationUs + initialStartTimeUs;
            long j6 = (hlsMediaChunk == null || this.independentSegments) ? j2 : hlsMediaChunk.startTimeUs;
            if (!playlistSnapshot.hasEndTag && j6 >= j5) {
                binarySearchFloor = playlistSnapshot.mediaSequence + playlistSnapshot.segments.size();
            } else {
                binarySearchFloor = Util.binarySearchFloor((List<? extends Comparable<? super Long>>) playlistSnapshot.segments, Long.valueOf(j6 - initialStartTimeUs), true, !this.playlistTracker.isLive() || hlsMediaChunk == null) + playlistSnapshot.mediaSequence;
                if (binarySearchFloor < playlistSnapshot.mediaSequence && hlsMediaChunk != null) {
                    hlsUrl = this.variants[indexOf];
                    HlsMediaPlaylist playlistSnapshot2 = this.playlistTracker.getPlaylistSnapshot(hlsUrl);
                    binarySearchFloor = hlsMediaChunk.getNextChunkIndex();
                    initialStartTimeUs = playlistSnapshot2.startTimeUs - this.playlistTracker.getInitialStartTimeUs();
                    playlistSnapshot = playlistSnapshot2;
                    hlsMediaPlaylist = playlistSnapshot;
                    j3 = binarySearchFloor;
                    HlsMasterPlaylist.HlsUrl hlsUrl2 = hlsUrl;
                    if (j3 >= hlsMediaPlaylist.mediaSequence) {
                        this.fatalError = new BehindLiveWindowException();
                        return;
                    }
                    int i = (int) (j3 - hlsMediaPlaylist.mediaSequence);
                    if (i >= hlsMediaPlaylist.segments.size()) {
                        if (hlsMediaPlaylist.hasEndTag) {
                            hlsChunkHolder.endOfStream = true;
                            return;
                        }
                        hlsChunkHolder.playlist = hlsUrl2;
                        this.seenExpectedPlaylistError &= this.expectedPlaylistUrl == hlsUrl2;
                        this.expectedPlaylistUrl = hlsUrl2;
                        return;
                    }
                    this.seenExpectedPlaylistError = false;
                    this.expectedPlaylistUrl = null;
                    HlsMediaPlaylist.Segment segment = hlsMediaPlaylist.segments.get(i);
                    if (segment.fullSegmentEncryptionKeyUri != null) {
                        Uri resolveToUri = UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, segment.fullSegmentEncryptionKeyUri);
                        if (!resolveToUri.equals(this.encryptionKeyUri)) {
                            hlsChunkHolder.chunk = newEncryptionKeyChunk(resolveToUri, segment.encryptionIV, indexOf, this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData());
                            return;
                        } else if (!Util.areEqual(segment.encryptionIV, this.encryptionIvString)) {
                            setEncryptionData(resolveToUri, segment.encryptionIV, this.encryptionKey);
                        }
                    } else {
                        clearEncryptionData();
                    }
                    HlsMediaPlaylist.Segment segment2 = segment.initializationSegment;
                    DataSpec dataSpec = segment2 != null ? new DataSpec(UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, segment2.url), segment2.byterangeOffset, segment2.byterangeLength, null) : null;
                    long j7 = segment.relativeStartTimeUs + initialStartTimeUs;
                    int i2 = hlsMediaPlaylist.discontinuitySequence + segment.relativeDiscontinuitySequence;
                    hlsChunkHolder.chunk = new HlsMediaChunk(this.extractorFactory, this.mediaDataSource, new DataSpec(UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, segment.url), segment.byterangeOffset, segment.byterangeLength, null), dataSpec, hlsUrl2, this.muxedCaptionFormats, this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), j7, j7 + segment.durationUs, j3, i2, segment.hasGapTag, this.isTimestampMaster, this.timestampAdjusterProvider.getAdjuster(i2), hlsMediaChunk, hlsMediaPlaylist.drmInitData, this.encryptionKey, this.encryptionIv);
                    return;
                }
            }
        } else {
            binarySearchFloor = hlsMediaChunk.getNextChunkIndex();
        }
        indexOf = selectedIndexInTrackGroup;
        hlsMediaPlaylist = playlistSnapshot;
        j3 = binarySearchFloor;
        HlsMasterPlaylist.HlsUrl hlsUrl22 = hlsUrl;
        if (j3 >= hlsMediaPlaylist.mediaSequence) {
        }
    }

    public void onChunkLoadCompleted(Chunk chunk) {
        if (chunk instanceof EncryptionKeyChunk) {
            EncryptionKeyChunk encryptionKeyChunk = (EncryptionKeyChunk) chunk;
            this.scratchSpace = encryptionKeyChunk.getDataHolder();
            setEncryptionData(encryptionKeyChunk.dataSpec.uri, encryptionKeyChunk.iv, encryptionKeyChunk.getResult());
        }
    }

    public boolean onChunkLoadError(Chunk chunk, boolean z, IOException iOException) {
        if (z) {
            TrackSelection trackSelection = this.trackSelection;
            if (ChunkedTrackBlacklistUtil.maybeBlacklistTrack(trackSelection, trackSelection.indexOf(this.trackGroup.indexOf(chunk.trackFormat)), iOException)) {
                return true;
            }
        }
        return false;
    }

    public boolean onPlaylistError(HlsMasterPlaylist.HlsUrl hlsUrl, boolean z) {
        int indexOf;
        int indexOf2 = this.trackGroup.indexOf(hlsUrl.format);
        if (indexOf2 == -1 || (indexOf = this.trackSelection.indexOf(indexOf2)) == -1) {
            return true;
        }
        this.seenExpectedPlaylistError = (this.expectedPlaylistUrl == hlsUrl) | this.seenExpectedPlaylistError;
        return !z || this.trackSelection.blacklist(indexOf, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
    }

    private long resolveTimeToLiveEdgeUs(long j) {
        return (this.liveEdgeInPeriodTimeUs > C.TIME_UNSET ? 1 : (this.liveEdgeInPeriodTimeUs == C.TIME_UNSET ? 0 : -1)) != 0 ? this.liveEdgeInPeriodTimeUs - j : C.TIME_UNSET;
    }

    private void updateLiveEdgeTimeUs(HlsMediaPlaylist hlsMediaPlaylist) {
        this.liveEdgeInPeriodTimeUs = hlsMediaPlaylist.hasEndTag ? C.TIME_UNSET : hlsMediaPlaylist.getEndTimeUs() - this.playlistTracker.getInitialStartTimeUs();
    }

    private EncryptionKeyChunk newEncryptionKeyChunk(Uri uri, String str, int i, int i2, Object obj) {
        return new EncryptionKeyChunk(this.encryptionDataSource, new DataSpec(uri, 0L, -1L, null, 1), this.variants[i].format, i2, obj, this.scratchSpace, str);
    }

    private void setEncryptionData(Uri uri, String str, byte[] bArr) {
        byte[] byteArray = new BigInteger(Util.toLowerInvariant(str).startsWith("0x") ? str.substring(2) : str, 16).toByteArray();
        byte[] bArr2 = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr2, (16 - byteArray.length) + length, byteArray.length - length);
        this.encryptionKeyUri = uri;
        this.encryptionKey = bArr;
        this.encryptionIvString = str;
        this.encryptionIv = bArr2;
    }

    private void clearEncryptionData() {
        this.encryptionKeyUri = null;
        this.encryptionKey = null;
        this.encryptionIvString = null;
        this.encryptionIv = null;
    }

    /* loaded from: classes.dex */
    private static final class InitializationTrackSelection extends BaseTrackSelection {
        private int selectedIndex;

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public Object getSelectionData() {
            return null;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public int getSelectionReason() {
            return 0;
        }

        public InitializationTrackSelection(TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr);
            this.selectedIndex = indexOf(trackGroup.getFormat(0));
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public void updateSelectedTrack(long j, long j2, long j3) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (isBlacklisted(this.selectedIndex, elapsedRealtime)) {
                for (int i = this.length - 1; i >= 0; i--) {
                    if (!isBlacklisted(i, elapsedRealtime)) {
                        this.selectedIndex = i;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public int getSelectedIndex() {
            return this.selectedIndex;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class EncryptionKeyChunk extends DataChunk {
        public final String iv;
        private byte[] result;

        public EncryptionKeyChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i, Object obj, byte[] bArr, String str) {
            super(dataSource, dataSpec, 3, format, i, obj, bArr);
            this.iv = str;
        }

        @Override // com.google.android.exoplayer2.source.chunk.DataChunk
        protected void consume(byte[] bArr, int i) throws IOException {
            this.result = Arrays.copyOf(bArr, i);
        }

        public byte[] getResult() {
            return this.result;
        }
    }
}
