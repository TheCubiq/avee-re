package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class iu5 extends nu5 {
    public final b94 a;
    public final l15 b;
    public final sp4 c;
    public final pw4 d;

    public iu5(b94 b94Var, l15 l15Var, sp4 sp4Var, pw4 pw4Var) {
        this.a = b94Var;
        this.b = l15Var;
        this.c = sp4Var;
        this.d = pw4Var;
    }

    @Override // com.daaw.nu5
    public final f77 c(ri6 ri6Var, Bundle bundle) {
        p15 m = this.a.m();
        sp4 sp4Var = this.c;
        sp4Var.f(ri6Var);
        sp4Var.d(bundle);
        m.e(sp4Var.g());
        m.l(this.d);
        m.d(this.b);
        m.c(new wi4(null));
        jn4 a = m.zzg().a();
        return a.i(a.j());
    }
}
