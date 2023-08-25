package com.daaw;

import java.io.IOException;
/* loaded from: classes.dex */
public final class kp2 extends Exception {
    public kp2(int i, String str, Throwable th, int i2) {
        super(null, th);
    }

    public static kp2 a(Exception exc, int i) {
        return new kp2(1, null, exc, i);
    }

    public static kp2 b(IOException iOException) {
        return new kp2(0, null, iOException, -1);
    }

    public static kp2 c(RuntimeException runtimeException) {
        return new kp2(2, null, runtimeException, -1);
    }
}
