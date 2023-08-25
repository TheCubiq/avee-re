package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class gs2 extends it2 {
    public gs2() {
        this.f13989a.add(db3.BITWISE_AND);
        this.f13989a.add(db3.BITWISE_LEFT_SHIFT);
        this.f13989a.add(db3.BITWISE_NOT);
        this.f13989a.add(db3.BITWISE_OR);
        this.f13989a.add(db3.BITWISE_RIGHT_SHIFT);
        this.f13989a.add(db3.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f13989a.add(db3.BITWISE_XOR);
    }

    @Override // com.daaw.it2
    /* renamed from: a */
    public final gl2 mo3983a(String str, w07 w07Var, List list) {
        db3 db3Var = db3.ADD;
        switch (ou7.m13919e(str).ordinal()) {
            case 4:
                ou7.m13916h(db3.BITWISE_AND.name(), 2, list);
                return new tb2(Double.valueOf(ou7.m13922b(w07Var.m6608b((gl2) list.get(0)).zzh().doubleValue()) & ou7.m13922b(w07Var.m6608b((gl2) list.get(1)).zzh().doubleValue())));
            case 5:
                ou7.m13916h(db3.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new tb2(Double.valueOf(ou7.m13922b(w07Var.m6608b((gl2) list.get(0)).zzh().doubleValue()) << ((int) (ou7.m13920d(w07Var.m6608b((gl2) list.get(1)).zzh().doubleValue()) & 31))));
            case 6:
                ou7.m13916h(db3.BITWISE_NOT.name(), 1, list);
                return new tb2(Double.valueOf(ou7.m13922b(w07Var.m6608b((gl2) list.get(0)).zzh().doubleValue()) ^ (-1)));
            case 7:
                ou7.m13916h(db3.BITWISE_OR.name(), 2, list);
                return new tb2(Double.valueOf(ou7.m13922b(w07Var.m6608b((gl2) list.get(0)).zzh().doubleValue()) | ou7.m13922b(w07Var.m6608b((gl2) list.get(1)).zzh().doubleValue())));
            case 8:
                ou7.m13916h(db3.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new tb2(Double.valueOf(ou7.m13922b(w07Var.m6608b((gl2) list.get(0)).zzh().doubleValue()) >> ((int) (ou7.m13920d(w07Var.m6608b((gl2) list.get(1)).zzh().doubleValue()) & 31))));
            case 9:
                ou7.m13916h(db3.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new tb2(Double.valueOf(ou7.m13920d(w07Var.m6608b((gl2) list.get(0)).zzh().doubleValue()) >>> ((int) (ou7.m13920d(w07Var.m6608b((gl2) list.get(1)).zzh().doubleValue()) & 31))));
            case 10:
                ou7.m13916h(db3.BITWISE_XOR.name(), 2, list);
                return new tb2(Double.valueOf(ou7.m13922b(w07Var.m6608b((gl2) list.get(0)).zzh().doubleValue()) ^ ou7.m13922b(w07Var.m6608b((gl2) list.get(1)).zzh().doubleValue())));
            default:
                return super.m19432b(str);
        }
    }
}
