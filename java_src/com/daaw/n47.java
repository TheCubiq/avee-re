package com.daaw;
/* loaded from: classes.dex */
public final class n47 extends p47 {
    public n47(f77 f77Var, Class cls, w57 w57Var) {
        super(f77Var, cls, w57Var);
    }

    @Override // com.daaw.p47
    public final /* bridge */ /* synthetic */ Object E(Object obj, Throwable th) {
        w57 w57Var = (w57) obj;
        f77 zza = w57Var.zza(th);
        sy6.d(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", w57Var);
        return zza;
    }

    @Override // com.daaw.p47
    public final /* synthetic */ void F(Object obj) {
        w((f77) obj);
    }
}
