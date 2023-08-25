package com.daaw;

import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class y36 implements i76 {
    public final g77 a;
    public final ri6 b;

    public y36(g77 g77Var, ri6 ri6Var) {
        this.a = g77Var;
        this.b = ri6Var;
    }

    public final /* synthetic */ z36 a() {
        return new z36("requester_type_2".equals(zzf.zzb(this.b.d)));
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 21;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.a.M(new Callable() { // from class: com.daaw.x36
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return y36.this.a();
            }
        });
    }
}
