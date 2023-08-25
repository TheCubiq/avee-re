package com.daaw;

import java.io.IOException;
/* loaded from: classes.dex */
public final class kp2 extends Exception {
    public kp2(int i, String str, Throwable th, int i2) {
        super(null, th);
    }

    /* renamed from: a */
    public static kp2 m17548a(Exception exc, int i) {
        return new kp2(1, null, exc, i);
    }

    /* renamed from: b */
    public static kp2 m17547b(IOException iOException) {
        return new kp2(0, null, iOException, -1);
    }

    /* renamed from: c */
    public static kp2 m17546c(RuntimeException runtimeException) {
        return new kp2(2, null, runtimeException, -1);
    }
}
