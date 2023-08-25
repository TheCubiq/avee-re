package com.daaw;

import android.view.View;
/* loaded from: classes.dex */
public final class ei4 extends zl4 {
    public final View i;
    public final a74 j;
    public final uh6 k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final wh4 o;
    public t23 p;

    public ei4(yl4 yl4Var, View view, a74 a74Var, uh6 uh6Var, int i, boolean z, boolean z2, wh4 wh4Var) {
        super(yl4Var);
        this.i = view;
        this.j = a74Var;
        this.k = uh6Var;
        this.l = i;
        this.m = z;
        this.n = z2;
        this.o = wh4Var;
    }

    public final int h() {
        return this.l;
    }

    public final View i() {
        return this.i;
    }

    public final uh6 j() {
        return vi6.b(this.b.s, this.k);
    }

    public final void k(j23 j23Var) {
        this.j.u0(j23Var);
    }

    public final boolean l() {
        return this.m;
    }

    public final boolean m() {
        return this.n;
    }

    public final boolean n() {
        return this.j.i();
    }

    public final boolean o() {
        return this.j.zzP() != null && this.j.zzP().a();
    }

    public final void p(long j, int i) {
        this.o.a(j, i);
    }

    public final t23 q() {
        return this.p;
    }

    public final void r(t23 t23Var) {
        this.p = t23Var;
    }
}
