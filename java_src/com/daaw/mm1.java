package com.daaw;

import android.annotation.TargetApi;
import android.os.Trace;
/* loaded from: classes.dex */
public final class mm1 {
    public static void a(String str) {
        if (sq1.a >= 18) {
            b(str);
        }
    }

    @TargetApi(18)
    public static void b(String str) {
        Trace.beginSection(str);
    }

    public static void c() {
        if (sq1.a >= 18) {
            d();
        }
    }

    @TargetApi(18)
    public static void d() {
        Trace.endSection();
    }
}
