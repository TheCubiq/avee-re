package com.daaw;
/* loaded from: classes.dex */
public final class j57 extends l57 {
    public j57(f77 f77Var, w57 w57Var) {
        super(f77Var, w57Var);
    }

    @Override // com.daaw.l57
    public final /* bridge */ /* synthetic */ Object E(Object obj, Object obj2) {
        w57 w57Var = (w57) obj;
        f77 zza = w57Var.zza(obj2);
        sy6.d(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", w57Var);
        return zza;
    }

    @Override // com.daaw.l57
    public final /* synthetic */ void F(Object obj) {
        w((f77) obj);
    }
}
