package com.daaw;

import android.graphics.Insets;
import android.graphics.Rect;
/* loaded from: classes.dex */
public final class gg0 {
    public static final gg0 e = new gg0(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    /* loaded from: classes.dex */
    public static class a {
        public static Insets a(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    public gg0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static gg0 a(gg0 gg0Var, gg0 gg0Var2) {
        return b(Math.max(gg0Var.a, gg0Var2.a), Math.max(gg0Var.b, gg0Var2.b), Math.max(gg0Var.c, gg0Var2.c), Math.max(gg0Var.d, gg0Var2.d));
    }

    public static gg0 b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new gg0(i, i2, i3, i4);
    }

    public static gg0 c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static gg0 d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.a, this.b, this.c, this.d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gg0.class != obj.getClass()) {
            return false;
        }
        gg0 gg0Var = (gg0) obj;
        return this.d == gg0Var.d && this.a == gg0Var.a && this.c == gg0Var.c && this.b == gg0Var.b;
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
