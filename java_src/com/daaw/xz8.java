package com.daaw;
/* loaded from: classes2.dex */
public final class xz8 extends qy8 {
    public final a06 g;
    public final /* synthetic */ u32 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz8(u32 u32Var, String str, int i, a06 a06Var) {
        super(str, i);
        this.h = u32Var;
        this.g = a06Var;
    }

    @Override // com.daaw.qy8
    public final int a() {
        return this.g.D();
    }

    @Override // com.daaw.qy8
    public final boolean b() {
        return false;
    }

    @Override // com.daaw.qy8
    public final boolean c() {
        return true;
    }

    public final boolean k(Long l, Long l2, we7 we7Var, boolean z) {
        hk5 w;
        String f;
        String str;
        Boolean f2;
        wj8.b();
        boolean B = this.h.a.z().B(this.a, m75.W);
        boolean J = this.g.J();
        boolean K = this.g.K();
        boolean L = this.g.L();
        boolean z2 = J || K || L;
        Boolean bool = null;
        bool = null;
        if (z && !z2) {
            this.h.a.i().v().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.b), this.g.M() ? Integer.valueOf(this.g.D()) : null);
            return true;
        }
        ds5 E = this.g.E();
        boolean J2 = E.J();
        if (we7Var.T()) {
            if (E.L()) {
                f2 = qy8.h(we7Var.E(), E.F());
                bool = qy8.j(f2, J2);
            } else {
                w = this.h.a.i().w();
                f = this.h.a.D().f(we7Var.I());
                str = "No number filter for long property. property";
                w.b(str, f);
            }
        } else if (!we7Var.S()) {
            if (we7Var.V()) {
                if (E.N()) {
                    f2 = qy8.f(we7Var.J(), E.G(), this.h.a.i());
                } else if (!E.L()) {
                    w = this.h.a.i().w();
                    f = this.h.a.D().f(we7Var.I());
                    str = "No string or number filter defined. property";
                } else if (ec8.N(we7Var.J())) {
                    f2 = qy8.i(we7Var.J(), E.F());
                } else {
                    this.h.a.i().w().c("Invalid user property value for Numeric number filter. property, value", this.h.a.D().f(we7Var.I()), we7Var.J());
                }
                bool = qy8.j(f2, J2);
            } else {
                w = this.h.a.i().w();
                f = this.h.a.D().f(we7Var.I());
                str = "User property has no value, property";
            }
            w.b(str, f);
        } else if (E.L()) {
            f2 = qy8.g(we7Var.D(), E.F());
            bool = qy8.j(f2, J2);
        } else {
            w = this.h.a.i().w();
            f = this.h.a.D().f(we7Var.I());
            str = "No number filter for double property. property";
            w.b(str, f);
        }
        this.h.a.i().v().b("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.c = Boolean.TRUE;
        if (!L || bool.booleanValue()) {
            if (!z || this.g.J()) {
                this.d = bool;
            }
            if (bool.booleanValue() && z2 && we7Var.U()) {
                long F = we7Var.F();
                if (l != null) {
                    F = l.longValue();
                }
                if (B && this.g.J() && !this.g.K() && l2 != null) {
                    F = l2.longValue();
                }
                if (this.g.K()) {
                    this.f = Long.valueOf(F);
                } else {
                    this.e = Long.valueOf(F);
                }
            }
            return true;
        }
        return true;
    }
}
