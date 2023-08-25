package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class q73 extends it2 {
    public q73() {
        this.f13989a.add(db3.ADD);
        this.f13989a.add(db3.DIVIDE);
        this.f13989a.add(db3.MODULUS);
        this.f13989a.add(db3.MULTIPLY);
        this.f13989a.add(db3.NEGATE);
        this.f13989a.add(db3.POST_DECREMENT);
        this.f13989a.add(db3.POST_INCREMENT);
        this.f13989a.add(db3.PRE_DECREMENT);
        this.f13989a.add(db3.PRE_INCREMENT);
        this.f13989a.add(db3.SUBTRACT);
    }

    @Override // com.daaw.it2
    /* renamed from: a */
    public final gl2 mo3983a(String str, w07 w07Var, List list) {
        db3 db3Var = db3.ADD;
        int ordinal = ou7.m13919e(str).ordinal();
        if (ordinal == 0) {
            ou7.m13916h(db3Var.name(), 2, list);
            gl2 m6608b = w07Var.m6608b((gl2) list.get(0));
            gl2 m6608b2 = w07Var.m6608b((gl2) list.get(1));
            return ((m6608b instanceof og2) || (m6608b instanceof wp2) || (m6608b2 instanceof og2) || (m6608b2 instanceof wp2)) ? new wp2(String.valueOf(m6608b.zzi()).concat(String.valueOf(m6608b2.zzi()))) : new tb2(Double.valueOf(m6608b.zzh().doubleValue() + m6608b2.zzh().doubleValue()));
        } else if (ordinal == 21) {
            ou7.m13916h(db3.DIVIDE.name(), 2, list);
            return new tb2(Double.valueOf(w07Var.m6608b((gl2) list.get(0)).zzh().doubleValue() / w07Var.m6608b((gl2) list.get(1)).zzh().doubleValue()));
        } else if (ordinal == 59) {
            ou7.m13916h(db3.SUBTRACT.name(), 2, list);
            return new tb2(Double.valueOf(w07Var.m6608b((gl2) list.get(0)).zzh().doubleValue() + new tb2(Double.valueOf(-w07Var.m6608b((gl2) list.get(1)).zzh().doubleValue())).zzh().doubleValue()));
        } else if (ordinal == 52 || ordinal == 53) {
            ou7.m13916h(str, 2, list);
            gl2 m6608b3 = w07Var.m6608b((gl2) list.get(0));
            w07Var.m6608b((gl2) list.get(1));
            return m6608b3;
        } else if (ordinal == 55 || ordinal == 56) {
            ou7.m13916h(str, 1, list);
            return w07Var.m6608b((gl2) list.get(0));
        } else {
            switch (ordinal) {
                case 44:
                    ou7.m13916h(db3.MODULUS.name(), 2, list);
                    return new tb2(Double.valueOf(w07Var.m6608b((gl2) list.get(0)).zzh().doubleValue() % w07Var.m6608b((gl2) list.get(1)).zzh().doubleValue()));
                case 45:
                    ou7.m13916h(db3.MULTIPLY.name(), 2, list);
                    return new tb2(Double.valueOf(w07Var.m6608b((gl2) list.get(0)).zzh().doubleValue() * w07Var.m6608b((gl2) list.get(1)).zzh().doubleValue()));
                case 46:
                    ou7.m13916h(db3.NEGATE.name(), 1, list);
                    return new tb2(Double.valueOf(-w07Var.m6608b((gl2) list.get(0)).zzh().doubleValue()));
                default:
                    return super.m19432b(str);
            }
        }
    }
}
