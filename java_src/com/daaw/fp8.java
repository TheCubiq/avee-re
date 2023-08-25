package com.daaw;

import android.media.metrics.LogSessionId;
/* loaded from: classes.dex */
public final class fp8 {
    /* renamed from: a */
    public static void m22419a(zo8 zo8Var, lh8 lh8Var) {
        LogSessionId m16945a = lh8Var.m16945a();
        if (m16945a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        zo8Var.f35331b.setString("log-session-id", m16945a.getStringId());
    }
}
