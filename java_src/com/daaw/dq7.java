package com.daaw;

import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public final class dq7 {

    /* renamed from: a */
    public final byte[] f7640a;

    public dq7(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f7640a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
    }

    /* renamed from: b */
    public static dq7 m24078b(byte[] bArr) {
        Objects.requireNonNull(bArr, "data must be non-null");
        return new dq7(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public final int m24079a() {
        return this.f7640a.length;
    }

    /* renamed from: c */
    public final byte[] m24077c() {
        byte[] bArr = this.f7640a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dq7) {
            return Arrays.equals(((dq7) obj).f7640a, this.f7640a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7640a);
    }

    public final String toString() {
        String m14096a = op7.m14096a(this.f7640a);
        return "Bytes(" + m14096a + ")";
    }
}
