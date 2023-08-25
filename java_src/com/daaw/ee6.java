package com.daaw;

import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class ee6 implements cl6 {

    /* renamed from: a */
    public final ye6 f8415a;

    /* renamed from: b */
    public final df6 f8416b;

    /* renamed from: c */
    public final zzl f8417c;

    /* renamed from: d */
    public final String f8418d;

    /* renamed from: e */
    public final Executor f8419e;

    /* renamed from: f */
    public final zzw f8420f;

    /* renamed from: g */
    public final rk6 f8421g;

    public ee6(ye6 ye6Var, df6 df6Var, zzl zzlVar, String str, Executor executor, zzw zzwVar, rk6 rk6Var) {
        this.f8415a = ye6Var;
        this.f8416b = df6Var;
        this.f8417c = zzlVar;
        this.f8418d = str;
        this.f8419e = executor;
        this.f8420f = zzwVar;
        this.f8421g = rk6Var;
    }

    @Override // com.daaw.cl6
    public final rk6 zza() {
        return this.f8421g;
    }

    @Override // com.daaw.cl6
    public final Executor zzb() {
        return this.f8419e;
    }
}
