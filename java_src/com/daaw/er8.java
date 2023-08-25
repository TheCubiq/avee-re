package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class er8 extends ad2 {
    public final boolean r;
    public final boolean s;
    public final /* synthetic */ js8 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er8(js8 js8Var, boolean z, boolean z2) {
        super("log");
        this.t = js8Var;
        this.r = z;
        this.s = z2;
    }

    @Override // com.daaw.ad2
    public final gl2 a(w07 w07Var, List list) {
        List arrayList;
        zp8 zp8Var;
        zp8 zp8Var2;
        ou7.i("log", 1, list);
        if (list.size() == 1) {
            zp8Var2 = this.t.r;
            zp8Var2.a(3, w07Var.b((gl2) list.get(0)).zzi(), Collections.emptyList(), this.r, this.s);
        } else {
            int b = ou7.b(w07Var.b((gl2) list.get(0)).zzh().doubleValue());
            int i = b != 2 ? b != 3 ? b != 5 ? b != 6 ? 3 : 2 : 5 : 1 : 4;
            String zzi = w07Var.b((gl2) list.get(1)).zzi();
            if (list.size() == 2) {
                zp8Var = this.t.r;
                arrayList = Collections.emptyList();
            } else {
                arrayList = new ArrayList();
                for (int i2 = 2; i2 < Math.min(list.size(), 5); i2++) {
                    arrayList.add(w07Var.b((gl2) list.get(i2)).zzi());
                }
                zp8Var = this.t.r;
            }
            zp8Var.a(i, zzi, arrayList, this.r, this.s);
        }
        return gl2.g;
    }
}
