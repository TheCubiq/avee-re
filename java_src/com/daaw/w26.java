package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class w26 implements i76 {

    /* renamed from: a */
    public final g77 f30849a;

    public w26(g77 g77Var) {
        this.f30849a = g77Var;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 55;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.f30849a.mo20112M(new Callable() { // from class: com.daaw.v26
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new x26(Long.valueOf(zzt.zzB().mo15860a() - zzt.zzo().m11915h().zzh().m17296a()).longValue());
            }
        });
    }
}
