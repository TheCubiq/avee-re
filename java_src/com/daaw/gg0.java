package com.daaw;

import android.graphics.Insets;
import android.graphics.Rect;
/* loaded from: classes.dex */
public final class gg0 {

    /* renamed from: e */
    public static final gg0 f11214e = new gg0(0, 0, 0, 0);

    /* renamed from: a */
    public final int f11215a;

    /* renamed from: b */
    public final int f11216b;

    /* renamed from: c */
    public final int f11217c;

    /* renamed from: d */
    public final int f11218d;

    /* renamed from: com.daaw.gg0$a */
    /* loaded from: classes.dex */
    public static class C1400a {
        /* renamed from: a */
        public static Insets m21656a(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    public gg0(int i, int i2, int i3, int i4) {
        this.f11215a = i;
        this.f11216b = i2;
        this.f11217c = i3;
        this.f11218d = i4;
    }

    /* renamed from: a */
    public static gg0 m21661a(gg0 gg0Var, gg0 gg0Var2) {
        return m21660b(Math.max(gg0Var.f11215a, gg0Var2.f11215a), Math.max(gg0Var.f11216b, gg0Var2.f11216b), Math.max(gg0Var.f11217c, gg0Var2.f11217c), Math.max(gg0Var.f11218d, gg0Var2.f11218d));
    }

    /* renamed from: b */
    public static gg0 m21660b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f11214e : new gg0(i, i2, i3, i4);
    }

    /* renamed from: c */
    public static gg0 m21659c(Rect rect) {
        return m21660b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d */
    public static gg0 m21658d(Insets insets) {
        return m21660b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: e */
    public Insets m21657e() {
        return C1400a.m21656a(this.f11215a, this.f11216b, this.f11217c, this.f11218d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gg0.class != obj.getClass()) {
            return false;
        }
        gg0 gg0Var = (gg0) obj;
        return this.f11218d == gg0Var.f11218d && this.f11215a == gg0Var.f11215a && this.f11217c == gg0Var.f11217c && this.f11216b == gg0Var.f11216b;
    }

    public int hashCode() {
        return (((((this.f11215a * 31) + this.f11216b) * 31) + this.f11217c) * 31) + this.f11218d;
    }

    public String toString() {
        return "Insets{left=" + this.f11215a + ", top=" + this.f11216b + ", right=" + this.f11217c + ", bottom=" + this.f11218d + '}';
    }
}
