package com.daaw;
/* loaded from: classes.dex */
public final class fq2 {

    /* renamed from: d */
    public static final fq2 f9781d = new fq2(1.0f, 1.0f);

    /* renamed from: a */
    public final float f9782a;

    /* renamed from: b */
    public final float f9783b = 1.0f;

    /* renamed from: c */
    public final int f9784c;

    public fq2(float f, float f2) {
        this.f9782a = f;
        this.f9784c = Math.round(f * 1000.0f);
    }

    /* renamed from: a */
    public final long m22414a(long j) {
        return j * this.f9784c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && fq2.class == obj.getClass() && this.f9782a == ((fq2) obj).f9782a;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f9782a) + 527) * 31) + Float.floatToRawIntBits(1.0f);
    }
}
