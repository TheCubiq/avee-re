package com.daaw;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class r46 implements i76 {
    public final g77 a;
    public final sh6 b;

    public r46(g77 g77Var, sh6 sh6Var) {
        this.a = g77Var;
        this.b = sh6Var;
    }

    public final /* synthetic */ s46 a() {
        return new s46(this.b);
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 25;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.a.M(new Callable() { // from class: com.daaw.q46
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return r46.this.a();
            }
        });
    }
}
