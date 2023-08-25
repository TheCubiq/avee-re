package com.daaw;
/* loaded from: classes.dex */
public final class zw0 {
    public static final zw0 e = new zw0(1.0f);
    public final float a;
    public final float b;
    public final boolean c;
    public final int d;

    public zw0(float f) {
        this(f, 1.0f, false);
    }

    public zw0(float f, float f2, boolean z) {
        s6.a(f > 0.0f);
        s6.a(f2 > 0.0f);
        this.a = f;
        this.b = f2;
        this.c = z;
        this.d = Math.round(f * 1000.0f);
    }

    public long a(long j) {
        return j * this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zw0.class != obj.getClass()) {
            return false;
        }
        zw0 zw0Var = (zw0) obj;
        return this.a == zw0Var.a && this.b == zw0Var.b && this.c == zw0Var.c;
    }

    public int hashCode() {
        return ((((527 + Float.floatToRawIntBits(this.a)) * 31) + Float.floatToRawIntBits(this.b)) * 31) + (this.c ? 1 : 0);
    }
}
