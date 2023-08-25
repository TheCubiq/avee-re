package com.daaw;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
/* loaded from: classes.dex */
public final class qk8 {
    /* renamed from: a */
    public static void m12360a(AudioTrack audioTrack, lh8 lh8Var) {
        LogSessionId m16945a = lh8Var.m16945a();
        if (m16945a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(m16945a);
    }
}
