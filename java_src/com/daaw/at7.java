package com.daaw;
/* loaded from: classes.dex */
public class at7 {

    /* renamed from: c */
    public static final vr7 f3591c = vr7.f30539c;

    /* renamed from: a */
    public volatile xt7 f3592a;

    /* renamed from: b */
    public volatile yq7 f3593b;

    /* renamed from: a */
    public final int m27033a() {
        if (this.f3593b != null) {
            return ((uq7) this.f3593b).f29455t.length;
        }
        if (this.f3592a != null) {
            return this.f3592a.mo4512i();
        }
        return 0;
    }

    /* renamed from: b */
    public final yq7 m27032b() {
        if (this.f3593b != null) {
            return this.f3593b;
        }
        synchronized (this) {
            if (this.f3593b != null) {
                return this.f3593b;
            }
            this.f3593b = this.f3592a == null ? yq7.f33966q : this.f3592a.mo4514d();
            return this.f3593b;
        }
    }

    /* renamed from: c */
    public final void m27031c(xt7 xt7Var) {
        if (this.f3592a != null) {
            return;
        }
        synchronized (this) {
            if (this.f3592a == null) {
                try {
                    this.f3592a = xt7Var;
                    this.f3593b = yq7.f33966q;
                } catch (xs7 unused) {
                    this.f3592a = xt7Var;
                    this.f3593b = yq7.f33966q;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof at7) {
            at7 at7Var = (at7) obj;
            xt7 xt7Var = this.f3592a;
            xt7 xt7Var2 = at7Var.f3592a;
            if (xt7Var == null && xt7Var2 == null) {
                return m27032b().equals(at7Var.m27032b());
            }
            if (xt7Var == null || xt7Var2 == null) {
                if (xt7Var != null) {
                    at7Var.m27031c(xt7Var.mo3229c());
                    return xt7Var.equals(at7Var.f3592a);
                }
                m27031c(xt7Var2.mo3229c());
                return this.f3592a.equals(xt7Var2);
            }
            return xt7Var.equals(xt7Var2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }
}
