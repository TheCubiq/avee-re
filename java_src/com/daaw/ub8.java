package com.daaw;
/* loaded from: classes2.dex */
public class ub8 {

    /* renamed from: c */
    public static final l88 f28864c = l88.f17143c;

    /* renamed from: a */
    public volatile zd8 f28865a;

    /* renamed from: b */
    public volatile y68 f28866b;

    /* renamed from: a */
    public final int m8343a() {
        if (this.f28866b != null) {
            return ((p68) this.f28866b).f22647t.length;
        }
        if (this.f28865a != null) {
            return this.f28865a.mo2461c();
        }
        return 0;
    }

    /* renamed from: b */
    public final y68 m8342b() {
        if (this.f28866b != null) {
            return this.f28866b;
        }
        synchronized (this) {
            if (this.f28866b != null) {
                return this.f28866b;
            }
            this.f28866b = this.f28865a == null ? y68.f33399q : this.f28865a.zzbs();
            return this.f28866b;
        }
    }

    /* renamed from: c */
    public final void m8341c(zd8 zd8Var) {
        if (this.f28865a != null) {
            return;
        }
        synchronized (this) {
            if (this.f28865a == null) {
                try {
                    this.f28865a = zd8Var;
                    this.f28866b = y68.f33399q;
                } catch (mb8 unused) {
                    this.f28865a = zd8Var;
                    this.f28866b = y68.f33399q;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ub8) {
            ub8 ub8Var = (ub8) obj;
            zd8 zd8Var = this.f28865a;
            zd8 zd8Var2 = ub8Var.f28865a;
            if (zd8Var == null && zd8Var2 == null) {
                return m8342b().equals(ub8Var.m8342b());
            }
            if (zd8Var == null || zd8Var2 == null) {
                if (zd8Var != null) {
                    ub8Var.m8341c(zd8Var.mo18673d());
                    return zd8Var.equals(ub8Var.f28865a);
                }
                m8341c(zd8Var2.mo18673d());
                return this.f28865a.equals(zd8Var2);
            }
            return zd8Var.equals(zd8Var2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }
}
