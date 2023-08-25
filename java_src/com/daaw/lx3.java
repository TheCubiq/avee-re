package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.Objects;
/* loaded from: classes.dex */
public final class lx3 {
    public Context a;
    public ag b;
    public zzg c;
    public ky3 d;

    public /* synthetic */ lx3(kx3 kx3Var) {
    }

    public final lx3 a(zzg zzgVar) {
        this.c = zzgVar;
        return this;
    }

    public final lx3 b(Context context) {
        Objects.requireNonNull(context);
        this.a = context;
        return this;
    }

    public final lx3 c(ag agVar) {
        Objects.requireNonNull(agVar);
        this.b = agVar;
        return this;
    }

    public final lx3 d(ky3 ky3Var) {
        this.d = ky3Var;
        return this;
    }

    public final ly3 e() {
        e08.c(this.a, Context.class);
        e08.c(this.b, ag.class);
        e08.c(this.c, zzg.class);
        e08.c(this.d, ky3.class);
        return new rx3(this.a, this.b, this.c, this.d, null);
    }
}
