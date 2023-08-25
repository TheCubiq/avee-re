package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class wu8 extends ad2 {
    public final vz8 r;

    public wu8(vz8 vz8Var) {
        super("internal.registerCallback");
        this.r = vz8Var;
    }

    @Override // com.daaw.ad2
    public final gl2 a(w07 w07Var, List list) {
        ou7.h(this.p, 3, list);
        String zzi = w07Var.b((gl2) list.get(0)).zzi();
        gl2 b = w07Var.b((gl2) list.get(1));
        if (b instanceof ck2) {
            gl2 b2 = w07Var.b((gl2) list.get(2));
            if (b2 instanceof th2) {
                th2 th2Var = (th2) b2;
                if (th2Var.zzt("type")) {
                    this.r.a(zzi, th2Var.zzt("priority") ? ou7.b(th2Var.f("priority").zzh().doubleValue()) : 1000, (ck2) b, th2Var.f("type").zzi());
                    return gl2.g;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
