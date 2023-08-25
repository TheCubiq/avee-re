package com.daaw;
/* loaded from: classes.dex */
public class md3 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public md3(md3 md3Var) {
        this.a = md3Var.a;
        this.b = md3Var.b;
        this.c = md3Var.c;
        this.d = md3Var.d;
        this.e = md3Var.e;
    }

    public md3(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public md3(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public md3(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public md3(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public final md3 a(Object obj) {
        return this.a.equals(obj) ? this : new md3(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof md3) {
            md3 md3Var = (md3) obj;
            return this.a.equals(md3Var.a) && this.b == md3Var.b && this.c == md3Var.c && this.d == md3Var.d && this.e == md3Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }
}
