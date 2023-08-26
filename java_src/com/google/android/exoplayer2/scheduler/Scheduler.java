package com.google.android.exoplayer2.scheduler;
/* loaded from: classes.dex */
public interface Scheduler {
    public static final boolean DEBUG = false;

    boolean cancel();

    boolean schedule(Requirements requirements, String str, String str2);
}
