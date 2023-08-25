package com.daaw;
/* loaded from: classes.dex */
public final class pp3 {
    public static final pp3 d = new pp3(1.0f, 1.0f);
    public static final th8 e = new th8() { // from class: com.daaw.mo3
    };
    public final float a;
    public final float b;
    public final int c;

    public pp3(float f, float f2) {
        uo4.d(f > 0.0f);
        uo4.d(f2 > 0.0f);
        this.a = f;
        this.b = f2;
        this.c = Math.round(f * 1000.0f);
    }

    public final long a(long j) {
        return j * this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pp3.class == obj.getClass()) {
            pp3 pp3Var = (pp3) obj;
            if (this.a == pp3Var.a && this.b == pp3Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.a) + 527) * 31) + Float.floatToRawIntBits(this.b);
    }

    public final String toString() {
        return it5.i("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.a), Float.valueOf(this.b));
    }
}
