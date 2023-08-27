package com.google.android.exoplayer2.source.chunk;

import android.util.Log;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.chunk.ChunkExtractorWrapper;
/* loaded from: classes.dex */
public final class BaseMediaChunkOutput implements ChunkExtractorWrapper.TrackOutputProvider {
    private static final String TAG = "BaseMediaChunkOutput";
    private final SampleQueue[] sampleQueues;
    private final int[] trackTypes;

    public BaseMediaChunkOutput(int[] iArr, SampleQueue[] sampleQueueArr) {
        this.trackTypes = iArr;
        this.sampleQueues = sampleQueueArr;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractorWrapper.TrackOutputProvider
    public TrackOutput track(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.trackTypes;
            if (i3 < iArr.length) {
                if (i2 == iArr[i3]) {
                    return this.sampleQueues[i3];
                }
                i3++;
            } else {
                Log.e(TAG, "Unmatched track of type: " + i2);
                return new DummyTrackOutput();
            }
        }
    }

    public int[] getWriteIndices() {
        int[] iArr = new int[this.sampleQueues.length];
        int i = 0;
        while (true) {
            SampleQueue[] sampleQueueArr = this.sampleQueues;
            if (i >= sampleQueueArr.length) {
                return iArr;
            }
            if (sampleQueueArr[i] != null) {
                iArr[i] = sampleQueueArr[i].getWriteIndex();
            }
            i++;
        }
    }

    public void setSampleOffsetUs(long j) {
        SampleQueue[] sampleQueueArr;
        for (SampleQueue sampleQueue : this.sampleQueues) {
            if (sampleQueue != null) {
                sampleQueue.setSampleOffsetUs(j);
            }
        }
    }
}
