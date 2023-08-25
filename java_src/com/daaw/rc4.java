package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public final class rc4 implements jf5 {
    public final Context a;
    public final zh3 b;
    public final bb4 c;
    public final rc4 d = this;
    public final m08 e;
    public final m08 f;
    public final m08 g;
    public final m08 h;

    public /* synthetic */ rc4(bb4 bb4Var, Context context, zh3 zh3Var, qc4 qc4Var) {
        this.c = bb4Var;
        this.a = context;
        this.b = zh3Var;
        wz7 a = xz7.a(this);
        this.e = a;
        wz7 a2 = xz7.a(zh3Var);
        this.f = a2;
        ff5 ff5Var = new ff5(a2);
        this.g = ff5Var;
        this.h = vz7.b(new hf5(a, ff5Var));
    }

    @Override // com.daaw.jf5
    public final af5 zzb() {
        return new lc4(this.c, this.d, null);
    }

    @Override // com.daaw.jf5
    public final gf5 zzd() {
        return (gf5) this.h.zzb();
    }
}
