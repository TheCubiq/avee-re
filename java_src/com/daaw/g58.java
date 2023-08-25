package com.daaw;
/* loaded from: classes.dex */
public final class g58 implements v78 {
    public final Object a;
    public l64 b;

    public g58(Object obj, l64 l64Var) {
        this.a = obj;
        this.b = l64Var;
    }

    public static /* bridge */ /* synthetic */ void a(g58 g58Var, l64 l64Var) {
        g58Var.b = l64Var;
    }

    @Override // com.daaw.v78
    public final l64 zza() {
        return this.b;
    }

    @Override // com.daaw.v78
    public final Object zzb() {
        return this.a;
    }
}
