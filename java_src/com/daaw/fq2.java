package com.daaw;
/* loaded from: classes.dex */
public final class fq2 {
    public static final fq2 d = new fq2(1.0f, 1.0f);
    public final float a;
    public final float b = 1.0f;
    public final int c;

    public fq2(float f, float f2) {
        this.a = f;
        this.c = Math.round(f * 1000.0f);
    }

    public final long a(long j) {
        return j * this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && fq2.class == obj.getClass() && this.a == ((fq2) obj).a;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.a) + 527) * 31) + Float.floatToRawIntBits(1.0f);
    }
}
