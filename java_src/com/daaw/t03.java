package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class t03 extends it2 {
    public t03() {
        this.a.add(db3.AND);
        this.a.add(db3.NOT);
        this.a.add(db3.OR);
    }

    @Override // com.daaw.it2
    public final gl2 a(String str, w07 w07Var, List list) {
        db3 db3Var = db3.ADD;
        int ordinal = ou7.e(str).ordinal();
        if (ordinal == 1) {
            ou7.h(db3.AND.name(), 2, list);
            gl2 b = w07Var.b((gl2) list.get(0));
            if (!b.zzg().booleanValue()) {
                return b;
            }
        } else if (ordinal == 47) {
            ou7.h(db3.NOT.name(), 1, list);
            return new g92(Boolean.valueOf(!w07Var.b((gl2) list.get(0)).zzg().booleanValue()));
        } else if (ordinal != 50) {
            return super.b(str);
        } else {
            ou7.h(db3.OR.name(), 2, list);
            gl2 b2 = w07Var.b((gl2) list.get(0));
            if (b2.zzg().booleanValue()) {
                return b2;
            }
        }
        return w07Var.b((gl2) list.get(1));
    }
}
