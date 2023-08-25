package com.daaw;
/* loaded from: classes.dex */
public class md3 {

    /* renamed from: a */
    public final Object f18805a;

    /* renamed from: b */
    public final int f18806b;

    /* renamed from: c */
    public final int f18807c;

    /* renamed from: d */
    public final long f18808d;

    /* renamed from: e */
    public final int f18809e;

    public md3(md3 md3Var) {
        this.f18805a = md3Var.f18805a;
        this.f18806b = md3Var.f18806b;
        this.f18807c = md3Var.f18807c;
        this.f18808d = md3Var.f18808d;
        this.f18809e = md3Var.f18809e;
    }

    public md3(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public md3(Object obj, int i, int i2, long j, int i3) {
        this.f18805a = obj;
        this.f18806b = i;
        this.f18807c = i2;
        this.f18808d = j;
        this.f18809e = i3;
    }

    public md3(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public md3(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    /* renamed from: a */
    public final md3 m16080a(Object obj) {
        return this.f18805a.equals(obj) ? this : new md3(obj, this.f18806b, this.f18807c, this.f18808d, this.f18809e);
    }

    /* renamed from: b */
    public final boolean m16079b() {
        return this.f18806b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof md3) {
            md3 md3Var = (md3) obj;
            return this.f18805a.equals(md3Var.f18805a) && this.f18806b == md3Var.f18806b && this.f18807c == md3Var.f18807c && this.f18808d == md3Var.f18808d && this.f18809e == md3Var.f18809e;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f18805a.hashCode() + 527) * 31) + this.f18806b) * 31) + this.f18807c) * 31) + ((int) this.f18808d)) * 31) + this.f18809e;
    }
}
