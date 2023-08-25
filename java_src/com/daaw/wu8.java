package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class wu8 extends ad2 {

    /* renamed from: r */
    public final vz8 f31529r;

    public wu8(vz8 vz8Var) {
        super("internal.registerCallback");
        this.f31529r = vz8Var;
    }

    @Override // com.daaw.ad2
    /* renamed from: a */
    public final gl2 mo5780a(w07 w07Var, List list) {
        ou7.m13916h(this.f3097p, 3, list);
        String zzi = w07Var.m6608b((gl2) list.get(0)).zzi();
        gl2 m6608b = w07Var.m6608b((gl2) list.get(1));
        if (m6608b instanceof ck2) {
            gl2 m6608b2 = w07Var.m6608b((gl2) list.get(2));
            if (m6608b2 instanceof th2) {
                th2 th2Var = (th2) m6608b2;
                if (th2Var.zzt("type")) {
                    this.f31529r.m6637a(zzi, th2Var.zzt("priority") ? ou7.m13922b(th2Var.mo2706f("priority").zzh().doubleValue()) : 1000, (ck2) m6608b, th2Var.mo2706f("type").zzi());
                    return gl2.f11420g;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
