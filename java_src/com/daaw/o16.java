package com.daaw;

import com.google.android.gms.internal.ads.zzchu;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class o16 implements i76 {

    /* renamed from: a */
    public final g77 f20920a;

    /* renamed from: b */
    public final ri6 f20921b;

    /* renamed from: c */
    public final zzchu f20922c;

    /* renamed from: d */
    public final xz3 f20923d;

    public o16(g77 g77Var, ri6 ri6Var, zzchu zzchuVar, xz3 xz3Var) {
        this.f20920a = g77Var;
        this.f20921b = ri6Var;
        this.f20922c = zzchuVar;
        this.f20923d = xz3Var;
    }

    /* renamed from: a */
    public final /* synthetic */ p16 m14650a() {
        return new p16(this.f20921b.f25350j, this.f20922c, this.f20923d.m4387i());
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 9;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.f20920a.mo20112M(new Callable() { // from class: com.daaw.n16
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o16.this.m14650a();
            }
        });
    }
}
