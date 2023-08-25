package com.daaw;

import android.os.Trace;
/* loaded from: classes.dex */
public final class nz2 {
    public static void a(String str) {
        if (pz2.a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void b() {
        if (pz2.a >= 18) {
            Trace.endSection();
        }
    }
}
