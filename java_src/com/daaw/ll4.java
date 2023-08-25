package com.daaw;
/* loaded from: classes.dex */
public final class ll4 {

    /* renamed from: e */
    public static final ll4 f17520e = new ll4(0, 0, 0, 1.0f);

    /* renamed from: f */
    public static final th8 f17521f = new th8() { // from class: com.daaw.qj4
    };

    /* renamed from: a */
    public final int f17522a;

    /* renamed from: b */
    public final int f17523b;

    /* renamed from: c */
    public final int f17524c;

    /* renamed from: d */
    public final float f17525d;

    public ll4(int i, int i2, int i3, float f) {
        this.f17522a = i;
        this.f17523b = i2;
        this.f17524c = i3;
        this.f17525d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ll4) {
            ll4 ll4Var = (ll4) obj;
            if (this.f17522a == ll4Var.f17522a && this.f17523b == ll4Var.f17523b && this.f17524c == ll4Var.f17524c && this.f17525d == ll4Var.f17525d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f17522a + 217) * 31) + this.f17523b) * 31) + this.f17524c) * 31) + Float.floatToRawIntBits(this.f17525d);
    }
}
