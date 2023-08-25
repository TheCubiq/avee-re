package com.daaw;

import java.io.Closeable;
/* loaded from: classes2.dex */
public final class dg {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                xy.a(th, th2);
            }
        }
    }
}
