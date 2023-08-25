package com.daaw;

import android.util.SparseArray;
/* loaded from: classes.dex */
public final class nd2 implements gd2 {
    public final cj5 a = new cj5(new byte[4], 4);
    public final /* synthetic */ pd2 b;

    public nd2(pd2 pd2Var) {
        this.b = pd2Var;
    }

    @Override // com.daaw.gd2
    public final void a(ik5 ik5Var) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        int i;
        if (ik5Var.s() == 0 && (ik5Var.s() & 128) != 0) {
            ik5Var.g(6);
            int i2 = ik5Var.i() / 4;
            for (int i3 = 0; i3 < i2; i3++) {
                ik5Var.a(this.a, 4);
                int c = this.a.c(16);
                this.a.j(3);
                if (c == 0) {
                    this.a.j(13);
                } else {
                    int c2 = this.a.c(13);
                    sparseArray2 = this.b.e;
                    if (sparseArray2.get(c2) == null) {
                        pd2 pd2Var = this.b;
                        sparseArray3 = pd2Var.e;
                        sparseArray3.put(c2, new hd2(new od2(pd2Var, c2)));
                        pd2 pd2Var2 = this.b;
                        i = pd2Var2.k;
                        pd2Var2.k = i + 1;
                    }
                }
            }
            sparseArray = this.b.e;
            sparseArray.remove(0);
        }
    }

    @Override // com.daaw.gd2
    public final void b(cr5 cr5Var, m09 m09Var, td2 td2Var) {
    }
}
