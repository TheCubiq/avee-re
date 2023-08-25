package com.daaw;
/* loaded from: classes2.dex */
public final class ip1<T> extends h91<T> {

    /* renamed from: s */
    public InterfaceC2307nl f13890s;

    /* renamed from: t */
    public Object f13891t;

    @Override // com.daaw.h91, com.daaw.AbstractC1239f
    /* renamed from: i0 */
    public void mo19545i0(Object obj) {
        InterfaceC2307nl interfaceC2307nl = this.f13890s;
        if (interfaceC2307nl != null) {
            bl1.m26073a(interfaceC2307nl, this.f13891t);
            this.f13890s = null;
            this.f13891t = null;
        }
        Object m11315a = C2862rh.m11315a(obj, this.f12204r);
        InterfaceC1438gl<T> interfaceC1438gl = this.f12204r;
        InterfaceC2307nl context = interfaceC1438gl.getContext();
        Object m26071c = bl1.m26071c(context, null);
        ip1<?> m14202c = m26071c != bl1.f4887a ? C2447ol.m14202c(interfaceC1438gl, context, m26071c) : null;
        try {
            this.f12204r.mo7267b(m11315a);
            lp1 lp1Var = lp1.f17593a;
        } finally {
            if (m14202c == null || m14202c.m19544l0()) {
                bl1.m26073a(context, m26071c);
            }
        }
    }

    /* renamed from: l0 */
    public final boolean m19544l0() {
        if (this.f13890s == null) {
            return false;
        }
        this.f13890s = null;
        this.f13891t = null;
        return true;
    }

    /* renamed from: m0 */
    public final void m19543m0(InterfaceC2307nl interfaceC2307nl, Object obj) {
        this.f13890s = interfaceC2307nl;
        this.f13891t = obj;
    }
}
