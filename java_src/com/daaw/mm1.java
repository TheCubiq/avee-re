package com.daaw;

import android.annotation.TargetApi;
import android.os.Trace;
/* loaded from: classes.dex */
public final class mm1 {
    /* renamed from: a */
    public static void m15937a(String str) {
        if (sq1.f26525a >= 18) {
            m15936b(str);
        }
    }

    @TargetApi(18)
    /* renamed from: b */
    public static void m15936b(String str) {
        Trace.beginSection(str);
    }

    /* renamed from: c */
    public static void m15935c() {
        if (sq1.f26525a >= 18) {
            m15934d();
        }
    }

    @TargetApi(18)
    /* renamed from: d */
    public static void m15934d() {
        Trace.endSection();
    }
}
