package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class qu5 extends nu5 {
    public final b94 a;
    public final sp4 b;
    public final cx5 c;
    public final pw4 d;

    public qu5(b94 b94Var, sp4 sp4Var, cx5 cx5Var, pw4 pw4Var) {
        this.a = b94Var;
        this.b = sp4Var;
        this.c = cx5Var;
        this.d = pw4Var;
    }

    @Override // com.daaw.nu5
    public final f77 c(ri6 ri6Var, Bundle bundle) {
        r05 l = this.a.l();
        sp4 sp4Var = this.b;
        sp4Var.f(ri6Var);
        sp4Var.d(bundle);
        l.g(sp4Var.g());
        l.m(this.d);
        l.h(this.c);
        jn4 a = l.zzf().a();
        return a.i(a.j());
    }
}
