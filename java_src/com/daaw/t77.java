package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class t77 extends e77 {

    /* renamed from: r */
    public final v57 f27105r;

    /* renamed from: s */
    public final /* synthetic */ v77 f27106s;

    public t77(v77 v77Var, v57 v57Var) {
        this.f27106s = v77Var;
        Objects.requireNonNull(v57Var);
        this.f27105r = v57Var;
    }

    @Override // com.daaw.e77
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8452a() {
        f77 zza = this.f27105r.zza();
        sy6.m9705d(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f27105r);
        return zza;
    }

    @Override // com.daaw.e77
    /* renamed from: b */
    public final String mo8451b() {
        return this.f27105r.toString();
    }

    @Override // com.daaw.e77
    /* renamed from: d */
    public final void mo8450d(Throwable th) {
        this.f27106s.mo14485i(th);
    }

    @Override // com.daaw.e77
    /* renamed from: e */
    public final /* synthetic */ void mo8449e(Object obj) {
        this.f27106s.m25600w((f77) obj);
    }

    @Override // com.daaw.e77
    /* renamed from: f */
    public final boolean mo8448f() {
        return this.f27106s.isDone();
    }
}
