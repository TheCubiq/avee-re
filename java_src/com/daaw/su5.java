package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class su5 extends nu5 {
    public final b94 a;
    public final sp4 b;
    public final pw4 c;

    public su5(b94 b94Var, sp4 sp4Var, pw4 pw4Var) {
        this.a = b94Var;
        this.b = sp4Var;
        this.c = pw4Var;
    }

    @Override // com.daaw.nu5
    public final f77 c(ri6 ri6Var, Bundle bundle) {
        n95 n = this.a.n();
        sp4 sp4Var = this.b;
        sp4Var.f(ri6Var);
        sp4Var.d(bundle);
        n.a(sp4Var.g());
        n.b(this.c);
        jn4 zzb = n.zze().zzb();
        return zzb.i(zzb.j());
    }
}
