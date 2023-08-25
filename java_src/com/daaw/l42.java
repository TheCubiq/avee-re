package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class l42 {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public l42(int i, byte[] bArr, int i2, int i3) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l42.class == obj.getClass()) {
            l42 l42Var = (l42) obj;
            if (this.a == l42Var.a && this.c == l42Var.c && this.d == l42Var.d && Arrays.equals(this.b, l42Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
    }
}
