package com.daaw;

import java.util.HashMap;
import java.util.List;
/* loaded from: classes2.dex */
public final class q98 extends ad2 {
    public final z42 r;

    public q98(z42 z42Var) {
        super("internal.eventLogger");
        this.r = z42Var;
    }

    @Override // com.daaw.ad2
    public final gl2 a(w07 w07Var, List list) {
        ou7.h(this.p, 3, list);
        String zzi = w07Var.b((gl2) list.get(0)).zzi();
        long a = (long) ou7.a(w07Var.b((gl2) list.get(1)).zzh().doubleValue());
        gl2 b = w07Var.b((gl2) list.get(2));
        this.r.e(zzi, a, b instanceof th2 ? ou7.g((th2) b) : new HashMap());
        return gl2.g;
    }
}
