package com.daaw;

import android.media.metrics.LogSessionId;
/* loaded from: classes.dex */
public final class fp8 {
    public static void a(zo8 zo8Var, lh8 lh8Var) {
        LogSessionId a = lh8Var.a();
        if (a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        zo8Var.b.setString("log-session-id", a.getStringId());
    }
}
