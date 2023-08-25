package com.daaw;
/* loaded from: classes.dex */
public final class zw0 {

    /* renamed from: e */
    public static final zw0 f35604e = new zw0(1.0f);

    /* renamed from: a */
    public final float f35605a;

    /* renamed from: b */
    public final float f35606b;

    /* renamed from: c */
    public final boolean f35607c;

    /* renamed from: d */
    public final int f35608d;

    public zw0(float f) {
        this(f, 1.0f, false);
    }

    public zw0(float f, float f2, boolean z) {
        C2914s6.m10690a(f > 0.0f);
        C2914s6.m10690a(f2 > 0.0f);
        this.f35605a = f;
        this.f35606b = f2;
        this.f35607c = z;
        this.f35608d = Math.round(f * 1000.0f);
    }

    /* renamed from: a */
    public long m1826a(long j) {
        return j * this.f35608d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zw0.class != obj.getClass()) {
            return false;
        }
        zw0 zw0Var = (zw0) obj;
        return this.f35605a == zw0Var.f35605a && this.f35606b == zw0Var.f35606b && this.f35607c == zw0Var.f35607c;
    }

    public int hashCode() {
        return ((((527 + Float.floatToRawIntBits(this.f35605a)) * 31) + Float.floatToRawIntBits(this.f35606b)) * 31) + (this.f35607c ? 1 : 0);
    }
}
