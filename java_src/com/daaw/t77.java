package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class t77 extends e77 {
    public final v57 r;
    public final /* synthetic */ v77 s;

    public t77(v77 v77Var, v57 v57Var) {
        this.s = v77Var;
        Objects.requireNonNull(v57Var);
        this.r = v57Var;
    }

    @Override // com.daaw.e77
    public final /* bridge */ /* synthetic */ Object a() {
        f77 zza = this.r.zza();
        sy6.d(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.r);
        return zza;
    }

    @Override // com.daaw.e77
    public final String b() {
        return this.r.toString();
    }

    @Override // com.daaw.e77
    public final void d(Throwable th) {
        this.s.i(th);
    }

    @Override // com.daaw.e77
    public final /* synthetic */ void e(Object obj) {
        this.s.w((f77) obj);
    }

    @Override // com.daaw.e77
    public final boolean f() {
        return this.s.isDone();
    }
}
