package com.daaw;

import android.os.Bundle;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public final class ou5 extends nu5 {
    public final b94 a;
    public final sp4 b;
    public final cx5 c;
    public final pw4 d;
    public final l15 e;
    public final jt4 f;
    public final ViewGroup g;
    public final wv4 h;

    public ou5(b94 b94Var, sp4 sp4Var, cx5 cx5Var, pw4 pw4Var, l15 l15Var, jt4 jt4Var, ViewGroup viewGroup, wv4 wv4Var) {
        this.a = b94Var;
        this.b = sp4Var;
        this.c = cx5Var;
        this.d = pw4Var;
        this.e = l15Var;
        this.f = jt4Var;
        this.g = viewGroup;
        this.h = wv4Var;
    }

    @Override // com.daaw.nu5
    public final f77 c(ri6 ri6Var, Bundle bundle) {
        yj4 j = this.a.j();
        sp4 sp4Var = this.b;
        sp4Var.f(ri6Var);
        sp4Var.d(bundle);
        j.n(sp4Var.g());
        j.k(this.d);
        j.o(this.c);
        j.d(this.e);
        j.i(new rl4(this.f, this.h));
        j.c(new wi4(this.g));
        jn4 d = j.zzj().d();
        return d.i(d.j());
    }
}
