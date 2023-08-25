package com.daaw;

import com.daaw.ft;
/* loaded from: classes.dex */
public class pt extends ft {
    public int m;

    public pt(kx1 kx1Var) {
        super(kx1Var);
        this.e = kx1Var instanceof sb0 ? ft.a.HORIZONTAL_DIMENSION : ft.a.VERTICAL_DIMENSION;
    }

    @Override // com.daaw.ft
    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (zs zsVar : this.k) {
            zsVar.a(zsVar);
        }
    }
}
