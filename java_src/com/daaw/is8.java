package com.daaw;
/* loaded from: classes.dex */
public final class is8 {
    public static final is8 d = new is8(0, 0, 0);
    public static final th8 e = new th8() { // from class: com.daaw.dr8
    };
    public final int a = 0;
    public final int b;
    public final int c;

    public is8(int i, int i2, int i3) {
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof is8) {
            is8 is8Var = (is8) obj;
            int i = is8Var.a;
            return this.b == is8Var.b && this.c == is8Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b + 16337) * 31) + this.c;
    }
}
