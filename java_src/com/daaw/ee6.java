package com.daaw;

import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class ee6 implements cl6 {
    public final ye6 a;
    public final df6 b;
    public final zzl c;
    public final String d;
    public final Executor e;
    public final zzw f;
    public final rk6 g;

    public ee6(ye6 ye6Var, df6 df6Var, zzl zzlVar, String str, Executor executor, zzw zzwVar, rk6 rk6Var) {
        this.a = ye6Var;
        this.b = df6Var;
        this.c = zzlVar;
        this.d = str;
        this.e = executor;
        this.f = zzwVar;
        this.g = rk6Var;
    }

    @Override // com.daaw.cl6
    public final rk6 zza() {
        return this.g;
    }

    @Override // com.daaw.cl6
    public final Executor zzb() {
        return this.e;
    }
}
