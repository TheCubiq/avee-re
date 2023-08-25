package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class w26 implements i76 {
    public final g77 a;

    public w26(g77 g77Var) {
        this.a = g77Var;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 55;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.a.M(new Callable() { // from class: com.daaw.v26
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new x26(Long.valueOf(zzt.zzB().a() - zzt.zzo().h().zzh().a()).longValue());
            }
        });
    }
}
