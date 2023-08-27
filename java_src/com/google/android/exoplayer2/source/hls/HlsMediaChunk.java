package com.google.android.exoplayer2.source.hls;

import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class HlsMediaChunk extends MediaChunk {
    private static final String PRIV_TIMESTAMP_FRAME_OWNER = "com.apple.streaming.transportStreamTimestamp";
    private static final AtomicInteger uidSource = new AtomicInteger();
    private int bytesLoaded;
    public final int discontinuitySequenceNumber;
    private final Extractor extractor;
    private final boolean hasGapTag;
    public final HlsMasterPlaylist.HlsUrl hlsUrl;
    private final ParsableByteArray id3Data;
    private final Id3Decoder id3Decoder;
    private boolean id3TimestampPeeked;
    private final DataSource initDataSource;
    private final DataSpec initDataSpec;
    private boolean initLoadCompleted;
    private int initSegmentBytesLoaded;
    private final boolean isEncrypted;
    private final boolean isMasterTimestampSource;
    private final boolean isPackedAudioExtractor;
    private volatile boolean loadCanceled;
    private volatile boolean loadCompleted;
    private HlsSampleStreamWrapper output;
    private final boolean reusingExtractor;
    private final boolean shouldSpliceIn;
    private final TimestampAdjuster timestampAdjuster;
    public final int uid;

    public HlsMediaChunk(HlsExtractorFactory hlsExtractorFactory, DataSource dataSource, DataSpec dataSpec, DataSpec dataSpec2, HlsMasterPlaylist.HlsUrl hlsUrl, List<Format> list, int i, Object obj, long j, long j2, long j3, int i2, boolean z, boolean z2, TimestampAdjuster timestampAdjuster, HlsMediaChunk hlsMediaChunk, DrmInitData drmInitData, byte[] bArr, byte[] bArr2) {
        super(buildDataSource(dataSource, bArr, bArr2), dataSpec, hlsUrl.format, i, obj, j, j2, j3);
        DataSpec dataSpec3;
        Extractor extractor;
        ParsableByteArray parsableByteArray;
        this.discontinuitySequenceNumber = i2;
        this.initDataSpec = dataSpec2;
        this.hlsUrl = hlsUrl;
        this.isMasterTimestampSource = z2;
        this.timestampAdjuster = timestampAdjuster;
        this.isEncrypted = this.dataSource instanceof Aes128DataSource;
        this.hasGapTag = z;
        boolean z3 = true;
        if (hlsMediaChunk != null) {
            boolean z4 = hlsMediaChunk.hlsUrl != hlsUrl;
            this.shouldSpliceIn = z4;
            extractor = (hlsMediaChunk.discontinuitySequenceNumber != i2 || z4) ? null : hlsMediaChunk.extractor;
            dataSpec3 = dataSpec;
        } else {
            this.shouldSpliceIn = false;
            dataSpec3 = dataSpec;
            extractor = null;
        }
        Pair<Extractor, Boolean> createExtractor = hlsExtractorFactory.createExtractor(extractor, dataSpec3.uri, this.trackFormat, list, drmInitData, timestampAdjuster);
        this.extractor = (Extractor) createExtractor.first;
        this.isPackedAudioExtractor = ((Boolean) createExtractor.second).booleanValue();
        boolean z5 = this.extractor == extractor;
        this.reusingExtractor = z5;
        this.initLoadCompleted = (!z5 || dataSpec2 == null) ? false : false;
        if (!this.isPackedAudioExtractor) {
            this.id3Decoder = null;
            this.id3Data = null;
        } else if (hlsMediaChunk != null && (parsableByteArray = hlsMediaChunk.id3Data) != null) {
            this.id3Decoder = hlsMediaChunk.id3Decoder;
            this.id3Data = parsableByteArray;
        } else {
            this.id3Decoder = new Id3Decoder();
            this.id3Data = new ParsableByteArray(10);
        }
        this.initDataSource = dataSource;
        this.uid = uidSource.getAndIncrement();
    }

    public void init(HlsSampleStreamWrapper hlsSampleStreamWrapper) {
        this.output = hlsSampleStreamWrapper;
        hlsSampleStreamWrapper.init(this.uid, this.shouldSpliceIn, this.reusingExtractor);
        if (this.reusingExtractor) {
            return;
        }
        this.extractor.init(hlsSampleStreamWrapper);
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    @Override // com.google.android.exoplayer2.source.chunk.Chunk
    public long bytesLoaded() {
        return this.bytesLoaded;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void cancelLoad() {
        this.loadCanceled = true;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void load() throws IOException, InterruptedException {
        maybeLoadInitData();
        if (this.loadCanceled) {
            return;
        }
        if (!this.hasGapTag) {
            loadMedia();
        }
        this.loadCompleted = true;
    }

    private void maybeLoadInitData() throws IOException, InterruptedException {
        DataSpec dataSpec;
        if (this.initLoadCompleted || (dataSpec = this.initDataSpec) == null) {
            return;
        }
        DataSpec subrange = dataSpec.subrange(this.initSegmentBytesLoaded);
        try {
            DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(this.initDataSource, subrange.absoluteStreamPosition, this.initDataSource.open(subrange));
            int i = 0;
            while (i == 0 && !this.loadCanceled) {
                i = this.extractor.read(defaultExtractorInput, null);
            }
            this.initSegmentBytesLoaded = (int) (defaultExtractorInput.getPosition() - this.initDataSpec.absoluteStreamPosition);
            Util.closeQuietly(this.initDataSource);
            this.initLoadCompleted = true;
        } catch (Throwable th) {
            Util.closeQuietly(this.initDataSource);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[Catch: all -> 0x00a2, TryCatch #1 {all -> 0x00a2, blocks: (B:15:0x0038, B:17:0x004c, B:19:0x0050, B:21:0x0061, B:23:0x006a, B:22:0x0068, B:25:0x006f, B:34:0x0090, B:27:0x0076, B:29:0x007a), top: B:41:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068 A[Catch: all -> 0x00a2, TryCatch #1 {all -> 0x00a2, blocks: (B:15:0x0038, B:17:0x004c, B:19:0x0050, B:21:0x0061, B:23:0x006a, B:22:0x0068, B:25:0x006f, B:34:0x0090, B:27:0x0076, B:29:0x007a), top: B:41:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f A[Catch: all -> 0x00a2, TRY_LEAVE, TryCatch #1 {all -> 0x00a2, blocks: (B:15:0x0038, B:17:0x004c, B:19:0x0050, B:21:0x0061, B:23:0x006a, B:22:0x0068, B:25:0x006f, B:34:0x0090, B:27:0x0076, B:29:0x007a), top: B:41:0x0038 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void loadMedia() throws IOException, InterruptedException {
        DataSpec subrange;
        boolean z;
        DefaultExtractorInput defaultExtractorInput;
        int i = 0;
        try {
            if (this.isEncrypted) {
                subrange = this.dataSpec;
                if (this.bytesLoaded != 0) {
                    z = true;
                    if (this.isMasterTimestampSource) {
                        this.timestampAdjuster.waitUntilInitialized();
                    } else if (this.timestampAdjuster.getFirstSampleTimestampUs() == Long.MAX_VALUE) {
                        this.timestampAdjuster.setFirstSampleTimestampUs(this.startTimeUs);
                    }
                    defaultExtractorInput = new DefaultExtractorInput(this.dataSource, subrange.absoluteStreamPosition, this.dataSource.open(subrange));
                    if (this.isPackedAudioExtractor && !this.id3TimestampPeeked) {
                        long peekId3PrivTimestamp = peekId3PrivTimestamp(defaultExtractorInput);
                        this.id3TimestampPeeked = true;
                        this.output.setSampleOffsetUs(peekId3PrivTimestamp == C.TIME_UNSET ? this.timestampAdjuster.adjustTsTimestamp(peekId3PrivTimestamp) : this.startTimeUs);
                    }
                    if (z) {
                        defaultExtractorInput.skipFully(this.bytesLoaded);
                    }
                    while (i == 0 && !this.loadCanceled) {
                        i = this.extractor.read(defaultExtractorInput, null);
                    }
                    this.bytesLoaded = (int) (defaultExtractorInput.getPosition() - this.dataSpec.absoluteStreamPosition);
                    return;
                }
            } else {
                subrange = this.dataSpec.subrange(this.bytesLoaded);
            }
            defaultExtractorInput = new DefaultExtractorInput(this.dataSource, subrange.absoluteStreamPosition, this.dataSource.open(subrange));
            if (this.isPackedAudioExtractor) {
                long peekId3PrivTimestamp2 = peekId3PrivTimestamp(defaultExtractorInput);
                this.id3TimestampPeeked = true;
                this.output.setSampleOffsetUs(peekId3PrivTimestamp2 == C.TIME_UNSET ? this.timestampAdjuster.adjustTsTimestamp(peekId3PrivTimestamp2) : this.startTimeUs);
            }
            if (z) {
            }
            while (i == 0) {
                i = this.extractor.read(defaultExtractorInput, null);
            }
            this.bytesLoaded = (int) (defaultExtractorInput.getPosition() - this.dataSpec.absoluteStreamPosition);
            return;
        } finally {
            Util.closeQuietly(this.dataSource);
        }
        z = false;
        if (this.isMasterTimestampSource) {
        }
    }

    private long peekId3PrivTimestamp(ExtractorInput extractorInput) throws IOException, InterruptedException {
        Metadata decode;
        extractorInput.resetPeekPosition();
        if (extractorInput.peekFully(this.id3Data.data, 0, 10, true)) {
            this.id3Data.reset(10);
            if (this.id3Data.readUnsignedInt24() != Id3Decoder.ID3_TAG) {
                return C.TIME_UNSET;
            }
            this.id3Data.skipBytes(3);
            int readSynchSafeInt = this.id3Data.readSynchSafeInt();
            int i = readSynchSafeInt + 10;
            if (i > this.id3Data.capacity()) {
                byte[] bArr = this.id3Data.data;
                this.id3Data.reset(i);
                System.arraycopy(bArr, 0, this.id3Data.data, 0, 10);
            }
            if (extractorInput.peekFully(this.id3Data.data, 10, readSynchSafeInt, true) && (decode = this.id3Decoder.decode(this.id3Data.data, readSynchSafeInt)) != null) {
                int length = decode.length();
                for (int i2 = 0; i2 < length; i2++) {
                    Metadata.Entry entry = decode.get(i2);
                    if (entry instanceof PrivFrame) {
                        PrivFrame privFrame = (PrivFrame) entry;
                        if (PRIV_TIMESTAMP_FRAME_OWNER.equals(privFrame.owner)) {
                            System.arraycopy(privFrame.privateData, 0, this.id3Data.data, 0, 8);
                            this.id3Data.reset(8);
                            return this.id3Data.readLong() & 8589934591L;
                        }
                    }
                }
                return C.TIME_UNSET;
            }
            return C.TIME_UNSET;
        }
        return C.TIME_UNSET;
    }

    private static DataSource buildDataSource(DataSource dataSource, byte[] bArr, byte[] bArr2) {
        return bArr != null ? new Aes128DataSource(dataSource, bArr, bArr2) : dataSource;
    }
}
