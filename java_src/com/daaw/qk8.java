package com.daaw;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
/* loaded from: classes.dex */
public final class qk8 {
    public static void a(AudioTrack audioTrack, lh8 lh8Var) {
        LogSessionId a = lh8Var.a();
        if (a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(a);
    }
}
