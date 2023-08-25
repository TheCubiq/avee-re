package com.daaw;
/* loaded from: classes.dex */
public final class pd7 implements ed7 {
    public final dq7 a;
    public final dq7 b;

    public pd7(byte[] bArr, byte[] bArr2) {
        this.a = dq7.b(bArr);
        this.b = dq7.b(bArr2);
    }

    public static pd7 a(byte[] bArr) {
        return new pd7(bArr, yp7.c(bArr));
    }
}
