package com.daaw.avee.comp.PcmProcess;
/* loaded from: classes.dex */
public class UtilsVisualizerDataProvider {
    public static final long MICROS_PER_SECOND = 1000000;

    public static long bytesToFrames(long j, int i, int i2) {
        return j / ((i2 / 8) * i);
    }

    public static int framesToBytes(long j, int i, int i2) {
        return (int) (j * (i2 / 8) * i);
    }

    public static long framesToDurationUs(long j, long j2) {
        return (j * 1000000) / j2;
    }

    public static int durationUsToFrames(long j, long j2) {
        double d = j2;
        Double.isNaN(d);
        double d2 = j;
        Double.isNaN(d2);
        return (int) ((d / 1000000.0d) * d2);
    }

    public static long bytesToDurationUs(long j, int i, int i2, long j2) {
        return framesToDurationUs(bytesToFrames(j, i, i2), j2);
    }

    public static int durationUsToBytes(long j, int i, int i2, long j2) {
        return framesToBytes(durationUsToFrames(j, j2), i, i2);
    }
}
