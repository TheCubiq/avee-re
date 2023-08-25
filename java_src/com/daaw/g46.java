package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class g46 implements i76 {
    public final g77 a;
    public final dh5 b;

    public g46(g77 g77Var, dh5 dh5Var) {
        this.a = g77Var;
        this.b = dh5Var;
    }

    public final /* synthetic */ h46 a() {
        return new h46(this.b.c(), this.b.o(), zzt.zzs().zzl());
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 23;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.a.M(new Callable() { // from class: com.daaw.f46
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return g46.this.a();
            }
        });
    }
}
