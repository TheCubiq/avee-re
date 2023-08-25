package com.daaw;

import com.google.android.gms.internal.ads.zzchu;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class o16 implements i76 {
    public final g77 a;
    public final ri6 b;
    public final zzchu c;
    public final xz3 d;

    public o16(g77 g77Var, ri6 ri6Var, zzchu zzchuVar, xz3 xz3Var) {
        this.a = g77Var;
        this.b = ri6Var;
        this.c = zzchuVar;
        this.d = xz3Var;
    }

    public final /* synthetic */ p16 a() {
        return new p16(this.b.j, this.c, this.d.i());
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 9;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.a.M(new Callable() { // from class: com.daaw.n16
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o16.this.a();
            }
        });
    }
}
