package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class g46 implements i76 {

    /* renamed from: a */
    public final g77 f10260a;

    /* renamed from: b */
    public final dh5 f10261b;

    public g46(g77 g77Var, dh5 dh5Var) {
        this.f10260a = g77Var;
        this.f10261b = dh5Var;
    }

    /* renamed from: a */
    public final /* synthetic */ h46 m21966a() {
        return new h46(this.f10261b.m24408c(), this.f10261b.m24396o(), zzt.zzs().zzl());
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 23;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.f10260a.mo20112M(new Callable() { // from class: com.daaw.f46
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return g46.this.m21966a();
            }
        });
    }
}
