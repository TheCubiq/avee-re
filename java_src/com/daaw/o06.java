package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class o06 implements i76 {
    public final g77 a;
    public final ri6 b;
    public final dj6 c;

    public o06(g77 g77Var, ri6 ri6Var, dj6 dj6Var) {
        this.a = g77Var;
        this.b = ri6Var;
        this.c = dj6Var;
    }

    public final /* synthetic */ p06 a() {
        String str = null;
        if (((Boolean) zzba.zzc().b(g93.E6)).booleanValue() && "requester_type_2".equals(zzf.zzb(this.b.d))) {
            str = dj6.a();
        }
        return new p06(str);
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 5;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.a.M(new Callable() { // from class: com.daaw.n06
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o06.this.a();
            }
        });
    }
}
