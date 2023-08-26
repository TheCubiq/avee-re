package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.MpegAudioHeader;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.util.Util;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ConstantBitrateSeeker implements Mp3Extractor.Seeker {
    private static final int BITS_PER_BYTE = 8;
    private final int bitrate;
    private final long dataSize;
    private final long durationUs;
    private final long firstFramePosition;
    private final int frameSize;

    public ConstantBitrateSeeker(long j, long j2, MpegAudioHeader mpegAudioHeader) {
        this.firstFramePosition = j2;
        this.frameSize = mpegAudioHeader.frameSize;
        this.bitrate = mpegAudioHeader.bitrate;
        if (j == -1) {
            this.dataSize = -1L;
            this.durationUs = C.TIME_UNSET;
            return;
        }
        this.dataSize = j - j2;
        this.durationUs = getTimeUs(j);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return this.dataSize != -1;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j) {
        long j2 = this.dataSize;
        if (j2 == -1) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.firstFramePosition));
        }
        int i = this.frameSize;
        long constrainValue = Util.constrainValue((((this.bitrate * j) / 8000000) / i) * i, 0L, j2 - i);
        long j3 = this.firstFramePosition + constrainValue;
        long timeUs = getTimeUs(j3);
        SeekPoint seekPoint = new SeekPoint(timeUs, j3);
        if (timeUs < j) {
            long j4 = this.dataSize;
            int i2 = this.frameSize;
            if (constrainValue != j4 - i2) {
                long j5 = j3 + i2;
                return new SeekMap.SeekPoints(seekPoint, new SeekPoint(getTimeUs(j5), j5));
            }
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Mp3Extractor.Seeker
    public long getTimeUs(long j) {
        return ((Math.max(0L, j - this.firstFramePosition) * 1000000) * 8) / this.bitrate;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }
}
