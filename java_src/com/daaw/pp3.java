package com.daaw;
/* loaded from: classes.dex */
public final class pp3 {

    /* renamed from: d */
    public static final pp3 f23129d = new pp3(1.0f, 1.0f);

    /* renamed from: e */
    public static final th8 f23130e = new th8() { // from class: com.daaw.mo3
    };

    /* renamed from: a */
    public final float f23131a;

    /* renamed from: b */
    public final float f23132b;

    /* renamed from: c */
    public final int f23133c;

    public pp3(float f, float f2) {
        uo4.m7874d(f > 0.0f);
        uo4.m7874d(f2 > 0.0f);
        this.f23131a = f;
        this.f23132b = f2;
        this.f23133c = Math.round(f * 1000.0f);
    }

    /* renamed from: a */
    public final long m13234a(long j) {
        return j * this.f23133c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pp3.class == obj.getClass()) {
            pp3 pp3Var = (pp3) obj;
            if (this.f23131a == pp3Var.f23131a && this.f23132b == pp3Var.f23132b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f23131a) + 527) * 31) + Float.floatToRawIntBits(this.f23132b);
    }

    public final String toString() {
        return it5.m19389i("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f23131a), Float.valueOf(this.f23132b));
    }
}
