package com.daaw;

import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public final class dq7 {
    public final byte[] a;

    public dq7(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
    }

    public static dq7 b(byte[] bArr) {
        Objects.requireNonNull(bArr, "data must be non-null");
        return new dq7(bArr, 0, bArr.length);
    }

    public final int a() {
        return this.a.length;
    }

    public final byte[] c() {
        byte[] bArr = this.a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dq7) {
            return Arrays.equals(((dq7) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        String a = op7.a(this.a);
        return "Bytes(" + a + ")";
    }
}
