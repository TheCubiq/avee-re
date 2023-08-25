package com.daaw;
/* loaded from: classes.dex */
public final class ll4 {
    public static final ll4 e = new ll4(0, 0, 0, 1.0f);
    public static final th8 f = new th8() { // from class: com.daaw.qj4
    };
    public final int a;
    public final int b;
    public final int c;
    public final float d;

    public ll4(int i, int i2, int i3, float f2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ll4) {
            ll4 ll4Var = (ll4) obj;
            if (this.a == ll4Var.a && this.b == ll4Var.b && this.c == ll4Var.c && this.d == ll4Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a + 217) * 31) + this.b) * 31) + this.c) * 31) + Float.floatToRawIntBits(this.d);
    }
}
