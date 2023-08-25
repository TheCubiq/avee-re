package com.daaw;

import java.util.HashMap;
import java.util.List;
/* loaded from: classes2.dex */
public final class q98 extends ad2 {

    /* renamed from: r */
    public final z42 f23790r;

    public q98(z42 z42Var) {
        super("internal.eventLogger");
        this.f23790r = z42Var;
    }

    @Override // com.daaw.ad2
    /* renamed from: a */
    public final gl2 mo5780a(w07 w07Var, List list) {
        ou7.m13916h(this.f3097p, 3, list);
        String zzi = w07Var.m6608b((gl2) list.get(0)).zzi();
        long m13923a = (long) ou7.m13923a(w07Var.m6608b((gl2) list.get(1)).zzh().doubleValue());
        gl2 m6608b = w07Var.m6608b((gl2) list.get(2));
        this.f23790r.m2822e(zzi, m13923a, m6608b instanceof th2 ? ou7.m13917g((th2) m6608b) : new HashMap());
        return gl2.f11420g;
    }
}
