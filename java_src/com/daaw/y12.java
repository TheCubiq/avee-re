package com.daaw;

import com.google.android.gms.common.Feature;
/* loaded from: classes.dex */
public final class y12 extends m12<Boolean> {
    public final gk0<?> c;

    public y12(gk0<?> gk0Var, tj1<Boolean> tj1Var) {
        super(4, tj1Var);
        this.c = gk0Var;
    }

    @Override // com.daaw.b22
    public final /* bridge */ /* synthetic */ void d(tz1 tz1Var, boolean z) {
    }

    @Override // com.daaw.q02
    public final boolean f(i02<?> i02Var) {
        if (i02Var.u().get(this.c) == null) {
            return false;
        }
        throw null;
    }

    @Override // com.daaw.q02
    public final Feature[] g(i02<?> i02Var) {
        if (i02Var.u().get(this.c) == null) {
            return null;
        }
        throw null;
    }

    @Override // com.daaw.m12
    public final void h(i02<?> i02Var) {
        if (i02Var.u().remove(this.c) == null) {
            this.b.e(Boolean.FALSE);
        } else {
            i02Var.s();
            throw null;
        }
    }
}
