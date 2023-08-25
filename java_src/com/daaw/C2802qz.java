package com.daaw;

import java.io.IOException;
/* renamed from: com.daaw.qz */
/* loaded from: classes.dex */
public final class C2802qz extends Exception {

    /* renamed from: p */
    public final int f24654p;

    /* renamed from: q */
    public final int f24655q;

    public C2802qz(int i, String str, Throwable th, int i2) {
        super(str, th);
        this.f24654p = i;
        this.f24655q = i2;
    }

    /* renamed from: a */
    public static C2802qz m11927a(Exception exc, int i) {
        return new C2802qz(1, null, exc, i);
    }

    /* renamed from: b */
    public static C2802qz m11926b(IOException iOException) {
        return new C2802qz(0, null, iOException, -1);
    }

    /* renamed from: c */
    public static C2802qz m11925c(RuntimeException runtimeException) {
        return new C2802qz(2, null, runtimeException, -1);
    }
}
