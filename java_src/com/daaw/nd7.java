package com.daaw;
/* loaded from: classes.dex */
public final class nd7 implements ed7 {
    public final dq7 a;
    public final dq7 b;

    public nd7(byte[] bArr, byte[] bArr2) {
        this.a = dq7.b(bArr);
        this.b = dq7.b(bArr2);
    }

    public static nd7 a(byte[] bArr, byte[] bArr2, int i) {
        cp7.e(cp7.j(cp7.k(i), 1, bArr2), cp7.h(i, bArr));
        return new nd7(bArr, bArr2);
    }
}
