package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class u36 implements i76 {

    /* renamed from: a */
    public final g77 f28519a;

    public u36(g77 g77Var) {
        this.f28519a = g77Var;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 20;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.f28519a.mo20112M(new Callable() { // from class: com.daaw.t36
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new v36(zzt.zzs().zzb(), zzt.zzs().zzm());
            }
        });
    }
}
