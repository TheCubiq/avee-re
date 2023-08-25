package com.daaw;
/* loaded from: classes2.dex */
public final class xz8 extends qy8 {

    /* renamed from: g */
    public final a06 f33143g;

    /* renamed from: h */
    public final /* synthetic */ u32 f33144h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz8(u32 u32Var, String str, int i, a06 a06Var) {
        super(str, i);
        this.f33144h = u32Var;
        this.f33143g = a06Var;
    }

    @Override // com.daaw.qy8
    /* renamed from: a */
    public final int mo4372a() {
        return this.f33143g.m27765D();
    }

    @Override // com.daaw.qy8
    /* renamed from: b */
    public final boolean mo4371b() {
        return false;
    }

    @Override // com.daaw.qy8
    /* renamed from: c */
    public final boolean mo4370c() {
        return true;
    }

    /* renamed from: k */
    public final boolean m4369k(Long l, Long l2, we7 we7Var, boolean z) {
        hk5 m14155w;
        String m5131f;
        String str;
        Boolean m11932f;
        wj8.m6042b();
        boolean m12677B = this.f33144h.f25143a.m24020z().m12677B(this.f24648a, m75.f18515W);
        boolean m27759J = this.f33143g.m27759J();
        boolean m27758K = this.f33143g.m27758K();
        boolean m27757L = this.f33143g.m27757L();
        boolean z2 = m27759J || m27758K || m27757L;
        Boolean bool = null;
        bool = null;
        if (z && !z2) {
            this.f33144h.f25143a.mo3895i().m14156v().m20651c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f24649b), this.f33143g.m27756M() ? Integer.valueOf(this.f33143g.m27765D()) : null);
            return true;
        }
        ds5 m27764E = this.f33143g.m27764E();
        boolean m23999J = m27764E.m23999J();
        if (we7Var.m6112T()) {
            if (m27764E.m23997L()) {
                m11932f = qy8.m11930h(we7Var.m6127E(), m27764E.m24003F());
                bool = qy8.m11928j(m11932f, m23999J);
            } else {
                m14155w = this.f33144h.f25143a.mo3895i().m14155w();
                m5131f = this.f33144h.f25143a.m24055D().m5131f(we7Var.m6123I());
                str = "No number filter for long property. property";
                m14155w.m20652b(str, m5131f);
            }
        } else if (!we7Var.m6113S()) {
            if (we7Var.m6110V()) {
                if (m27764E.m23995N()) {
                    m11932f = qy8.m11932f(we7Var.m6122J(), m27764E.m24002G(), this.f33144h.f25143a.mo3895i());
                } else if (!m27764E.m23997L()) {
                    m14155w = this.f33144h.f25143a.mo3895i().m14155w();
                    m5131f = this.f33144h.f25143a.m24055D().m5131f(we7Var.m6123I());
                    str = "No string or number filter defined. property";
                } else if (ec8.m23590N(we7Var.m6122J())) {
                    m11932f = qy8.m11929i(we7Var.m6122J(), m27764E.m24003F());
                } else {
                    this.f33144h.f25143a.mo3895i().m14155w().m20651c("Invalid user property value for Numeric number filter. property, value", this.f33144h.f25143a.m24055D().m5131f(we7Var.m6123I()), we7Var.m6122J());
                }
                bool = qy8.m11928j(m11932f, m23999J);
            } else {
                m14155w = this.f33144h.f25143a.mo3895i().m14155w();
                m5131f = this.f33144h.f25143a.m24055D().m5131f(we7Var.m6123I());
                str = "User property has no value, property";
            }
            m14155w.m20652b(str, m5131f);
        } else if (m27764E.m23997L()) {
            m11932f = qy8.m11931g(we7Var.m6128D(), m27764E.m24003F());
            bool = qy8.m11928j(m11932f, m23999J);
        } else {
            m14155w = this.f33144h.f25143a.mo3895i().m14155w();
            m5131f = this.f33144h.f25143a.m24055D().m5131f(we7Var.m6123I());
            str = "No number filter for double property. property";
            m14155w.m20652b(str, m5131f);
        }
        this.f33144h.f25143a.mo3895i().m14156v().m20652b("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.f24650c = Boolean.TRUE;
        if (!m27757L || bool.booleanValue()) {
            if (!z || this.f33143g.m27759J()) {
                this.f24651d = bool;
            }
            if (bool.booleanValue() && z2 && we7Var.m6111U()) {
                long m6126F = we7Var.m6126F();
                if (l != null) {
                    m6126F = l.longValue();
                }
                if (m12677B && this.f33143g.m27759J() && !this.f33143g.m27758K() && l2 != null) {
                    m6126F = l2.longValue();
                }
                if (this.f33143g.m27758K()) {
                    this.f24653f = Long.valueOf(m6126F);
                } else {
                    this.f24652e = Long.valueOf(m6126F);
                }
            }
            return true;
        }
        return true;
    }
}
