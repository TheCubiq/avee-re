package com.daaw;

import android.util.SparseArray;
/* loaded from: classes.dex */
public final class nd2 implements gd2 {

    /* renamed from: a */
    public final cj5 f20059a = new cj5(new byte[4], 4);

    /* renamed from: b */
    public final /* synthetic */ pd2 f20060b;

    public nd2(pd2 pd2Var) {
        this.f20060b = pd2Var;
    }

    @Override // com.daaw.gd2
    /* renamed from: a */
    public final void mo12624a(ik5 ik5Var) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        int i;
        if (ik5Var.m19703s() == 0 && (ik5Var.m19703s() & 128) != 0) {
            ik5Var.m19715g(6);
            int m19713i = ik5Var.m19713i() / 4;
            for (int i2 = 0; i2 < m19713i; i2++) {
                ik5Var.m19721a(this.f20059a, 4);
                int m25329c = this.f20059a.m25329c(16);
                this.f20059a.m25322j(3);
                if (m25329c == 0) {
                    this.f20059a.m25322j(13);
                } else {
                    int m25329c2 = this.f20059a.m25329c(13);
                    sparseArray2 = this.f20060b.f22853e;
                    if (sparseArray2.get(m25329c2) == null) {
                        pd2 pd2Var = this.f20060b;
                        sparseArray3 = pd2Var.f22853e;
                        sparseArray3.put(m25329c2, new hd2(new od2(pd2Var, m25329c2)));
                        pd2 pd2Var2 = this.f20060b;
                        i = pd2Var2.f22859k;
                        pd2Var2.f22859k = i + 1;
                    }
                }
            }
            sparseArray = this.f20060b.f22853e;
            sparseArray.remove(0);
        }
    }

    @Override // com.daaw.gd2
    /* renamed from: b */
    public final void mo12623b(cr5 cr5Var, m09 m09Var, td2 td2Var) {
    }
}
