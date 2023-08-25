package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class q73 extends it2 {
    public q73() {
        this.a.add(db3.ADD);
        this.a.add(db3.DIVIDE);
        this.a.add(db3.MODULUS);
        this.a.add(db3.MULTIPLY);
        this.a.add(db3.NEGATE);
        this.a.add(db3.POST_DECREMENT);
        this.a.add(db3.POST_INCREMENT);
        this.a.add(db3.PRE_DECREMENT);
        this.a.add(db3.PRE_INCREMENT);
        this.a.add(db3.SUBTRACT);
    }

    @Override // com.daaw.it2
    public final gl2 a(String str, w07 w07Var, List list) {
        db3 db3Var = db3.ADD;
        int ordinal = ou7.e(str).ordinal();
        if (ordinal == 0) {
            ou7.h(db3Var.name(), 2, list);
            gl2 b = w07Var.b((gl2) list.get(0));
            gl2 b2 = w07Var.b((gl2) list.get(1));
            return ((b instanceof og2) || (b instanceof wp2) || (b2 instanceof og2) || (b2 instanceof wp2)) ? new wp2(String.valueOf(b.zzi()).concat(String.valueOf(b2.zzi()))) : new tb2(Double.valueOf(b.zzh().doubleValue() + b2.zzh().doubleValue()));
        } else if (ordinal == 21) {
            ou7.h(db3.DIVIDE.name(), 2, list);
            return new tb2(Double.valueOf(w07Var.b((gl2) list.get(0)).zzh().doubleValue() / w07Var.b((gl2) list.get(1)).zzh().doubleValue()));
        } else if (ordinal == 59) {
            ou7.h(db3.SUBTRACT.name(), 2, list);
            return new tb2(Double.valueOf(w07Var.b((gl2) list.get(0)).zzh().doubleValue() + new tb2(Double.valueOf(-w07Var.b((gl2) list.get(1)).zzh().doubleValue())).zzh().doubleValue()));
        } else if (ordinal == 52 || ordinal == 53) {
            ou7.h(str, 2, list);
            gl2 b3 = w07Var.b((gl2) list.get(0));
            w07Var.b((gl2) list.get(1));
            return b3;
        } else if (ordinal == 55 || ordinal == 56) {
            ou7.h(str, 1, list);
            return w07Var.b((gl2) list.get(0));
        } else {
            switch (ordinal) {
                case 44:
                    ou7.h(db3.MODULUS.name(), 2, list);
                    return new tb2(Double.valueOf(w07Var.b((gl2) list.get(0)).zzh().doubleValue() % w07Var.b((gl2) list.get(1)).zzh().doubleValue()));
                case 45:
                    ou7.h(db3.MULTIPLY.name(), 2, list);
                    return new tb2(Double.valueOf(w07Var.b((gl2) list.get(0)).zzh().doubleValue() * w07Var.b((gl2) list.get(1)).zzh().doubleValue()));
                case 46:
                    ou7.h(db3.NEGATE.name(), 1, list);
                    return new tb2(Double.valueOf(-w07Var.b((gl2) list.get(0)).zzh().doubleValue()));
                default:
                    return super.b(str);
            }
        }
    }
}
