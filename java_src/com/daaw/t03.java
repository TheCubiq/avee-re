package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class t03 extends it2 {
    public t03() {
        this.f13989a.add(db3.AND);
        this.f13989a.add(db3.NOT);
        this.f13989a.add(db3.OR);
    }

    @Override // com.daaw.it2
    /* renamed from: a */
    public final gl2 mo3983a(String str, w07 w07Var, List list) {
        db3 db3Var = db3.ADD;
        int ordinal = ou7.m13919e(str).ordinal();
        if (ordinal == 1) {
            ou7.m13916h(db3.AND.name(), 2, list);
            gl2 m6608b = w07Var.m6608b((gl2) list.get(0));
            if (!m6608b.zzg().booleanValue()) {
                return m6608b;
            }
        } else if (ordinal == 47) {
            ou7.m13916h(db3.NOT.name(), 1, list);
            return new g92(Boolean.valueOf(!w07Var.m6608b((gl2) list.get(0)).zzg().booleanValue()));
        } else if (ordinal != 50) {
            return super.m19432b(str);
        } else {
            ou7.m13916h(db3.OR.name(), 2, list);
            gl2 m6608b2 = w07Var.m6608b((gl2) list.get(0));
            if (m6608b2.zzg().booleanValue()) {
                return m6608b2;
            }
        }
        return w07Var.m6608b((gl2) list.get(1));
    }
}
