package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class vs2 {
    public final int a = 1;
    public final byte[] b;

    public vs2(int i, byte[] bArr) {
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && vs2.class == obj.getClass() && Arrays.equals(this.b, ((vs2) obj).b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + 31;
    }
}
