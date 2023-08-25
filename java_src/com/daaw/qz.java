package com.daaw;

import java.io.IOException;
/* loaded from: classes.dex */
public final class qz extends Exception {
    public final int p;
    public final int q;

    public qz(int i, String str, Throwable th, int i2) {
        super(str, th);
        this.p = i;
        this.q = i2;
    }

    public static qz a(Exception exc, int i) {
        return new qz(1, null, exc, i);
    }

    public static qz b(IOException iOException) {
        return new qz(0, null, iOException, -1);
    }

    public static qz c(RuntimeException runtimeException) {
        return new qz(2, null, runtimeException, -1);
    }
}
