package com.google.android.exoplayer2.upstream;
/* loaded from: classes.dex */
public interface BandwidthMeter {

    /* loaded from: classes.dex */
    public interface EventListener {
        void onBandwidthSample(int i, long j, long j2);
    }

    long getBitrateEstimate();
}
