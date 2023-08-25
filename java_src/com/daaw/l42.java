package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class l42 {

    /* renamed from: a */
    public final int f17026a;

    /* renamed from: b */
    public final byte[] f17027b;

    /* renamed from: c */
    public final int f17028c;

    /* renamed from: d */
    public final int f17029d;

    public l42(int i, byte[] bArr, int i2, int i3) {
        this.f17026a = i;
        this.f17027b = bArr;
        this.f17028c = i2;
        this.f17029d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l42.class == obj.getClass()) {
            l42 l42Var = (l42) obj;
            if (this.f17026a == l42Var.f17026a && this.f17028c == l42Var.f17028c && this.f17029d == l42Var.f17029d && Arrays.equals(this.f17027b, l42Var.f17027b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f17026a * 31) + Arrays.hashCode(this.f17027b)) * 31) + this.f17028c) * 31) + this.f17029d;
    }
}
