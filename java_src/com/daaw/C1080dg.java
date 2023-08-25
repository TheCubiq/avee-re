package com.daaw;

import java.io.Closeable;
/* renamed from: com.daaw.dg */
/* loaded from: classes2.dex */
public final class C1080dg {
    /* renamed from: a */
    public static final void m24422a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C3651xy.m4411a(th, th2);
            }
        }
    }
}
