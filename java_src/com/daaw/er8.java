package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class er8 extends ad2 {

    /* renamed from: r */
    public final boolean f8718r;

    /* renamed from: s */
    public final boolean f8719s;

    /* renamed from: t */
    public final /* synthetic */ js8 f8720t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er8(js8 js8Var, boolean z, boolean z2) {
        super("log");
        this.f8720t = js8Var;
        this.f8718r = z;
        this.f8719s = z2;
    }

    @Override // com.daaw.ad2
    /* renamed from: a */
    public final gl2 mo5780a(w07 w07Var, List list) {
        List arrayList;
        zp8 zp8Var;
        zp8 zp8Var2;
        ou7.m13915i("log", 1, list);
        if (list.size() == 1) {
            zp8Var2 = this.f8720t.f15375r;
            zp8Var2.mo1996a(3, w07Var.m6608b((gl2) list.get(0)).zzi(), Collections.emptyList(), this.f8718r, this.f8719s);
        } else {
            int m13922b = ou7.m13922b(w07Var.m6608b((gl2) list.get(0)).zzh().doubleValue());
            int i = m13922b != 2 ? m13922b != 3 ? m13922b != 5 ? m13922b != 6 ? 3 : 2 : 5 : 1 : 4;
            String zzi = w07Var.m6608b((gl2) list.get(1)).zzi();
            if (list.size() == 2) {
                zp8Var = this.f8720t.f15375r;
                arrayList = Collections.emptyList();
            } else {
                arrayList = new ArrayList();
                for (int i2 = 2; i2 < Math.min(list.size(), 5); i2++) {
                    arrayList.add(w07Var.m6608b((gl2) list.get(i2)).zzi());
                }
                zp8Var = this.f8720t.f15375r;
            }
            zp8Var.mo1996a(i, zzi, arrayList, this.f8718r, this.f8719s);
        }
        return gl2.f11420g;
    }
}
