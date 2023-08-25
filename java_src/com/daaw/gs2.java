package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class gs2 extends it2 {
    public gs2() {
        this.a.add(db3.BITWISE_AND);
        this.a.add(db3.BITWISE_LEFT_SHIFT);
        this.a.add(db3.BITWISE_NOT);
        this.a.add(db3.BITWISE_OR);
        this.a.add(db3.BITWISE_RIGHT_SHIFT);
        this.a.add(db3.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.a.add(db3.BITWISE_XOR);
    }

    @Override // com.daaw.it2
    public final gl2 a(String str, w07 w07Var, List list) {
        db3 db3Var = db3.ADD;
        switch (ou7.e(str).ordinal()) {
            case 4:
                ou7.h(db3.BITWISE_AND.name(), 2, list);
                return new tb2(Double.valueOf(ou7.b(w07Var.b((gl2) list.get(0)).zzh().doubleValue()) & ou7.b(w07Var.b((gl2) list.get(1)).zzh().doubleValue())));
            case 5:
                ou7.h(db3.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new tb2(Double.valueOf(ou7.b(w07Var.b((gl2) list.get(0)).zzh().doubleValue()) << ((int) (ou7.d(w07Var.b((gl2) list.get(1)).zzh().doubleValue()) & 31))));
            case 6:
                ou7.h(db3.BITWISE_NOT.name(), 1, list);
                return new tb2(Double.valueOf(ou7.b(w07Var.b((gl2) list.get(0)).zzh().doubleValue()) ^ (-1)));
            case 7:
                ou7.h(db3.BITWISE_OR.name(), 2, list);
                return new tb2(Double.valueOf(ou7.b(w07Var.b((gl2) list.get(0)).zzh().doubleValue()) | ou7.b(w07Var.b((gl2) list.get(1)).zzh().doubleValue())));
            case 8:
                ou7.h(db3.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new tb2(Double.valueOf(ou7.b(w07Var.b((gl2) list.get(0)).zzh().doubleValue()) >> ((int) (ou7.d(w07Var.b((gl2) list.get(1)).zzh().doubleValue()) & 31))));
            case 9:
                ou7.h(db3.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new tb2(Double.valueOf(ou7.d(w07Var.b((gl2) list.get(0)).zzh().doubleValue()) >>> ((int) (ou7.d(w07Var.b((gl2) list.get(1)).zzh().doubleValue()) & 31))));
            case 10:
                ou7.h(db3.BITWISE_XOR.name(), 2, list);
                return new tb2(Double.valueOf(ou7.b(w07Var.b((gl2) list.get(0)).zzh().doubleValue()) ^ ou7.b(w07Var.b((gl2) list.get(1)).zzh().doubleValue())));
            default:
                return super.b(str);
        }
    }
}
