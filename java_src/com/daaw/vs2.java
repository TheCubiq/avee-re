package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class vs2 {

    /* renamed from: a */
    public final int f30551a = 1;

    /* renamed from: b */
    public final byte[] f30552b;

    public vs2(int i, byte[] bArr) {
        this.f30552b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && vs2.class == obj.getClass() && Arrays.equals(this.f30552b, ((vs2) obj).f30552b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f30552b) + 31;
    }
}
