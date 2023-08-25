package com.daaw;
/* loaded from: classes.dex */
public final class j57 extends l57 {
    public j57(f77 f77Var, w57 w57Var) {
        super(f77Var, w57Var);
    }

    @Override // com.daaw.l57
    /* renamed from: E */
    public final /* bridge */ /* synthetic */ Object mo17133E(Object obj, Object obj2) {
        w57 w57Var = (w57) obj;
        f77 zza = w57Var.zza(obj2);
        sy6.m9705d(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", w57Var);
        return zza;
    }

    @Override // com.daaw.l57
    /* renamed from: F */
    public final /* synthetic */ void mo17132F(Object obj) {
        m25600w((f77) obj);
    }
}
