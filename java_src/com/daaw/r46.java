package com.daaw;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class r46 implements i76 {

    /* renamed from: a */
    public final g77 f24844a;

    /* renamed from: b */
    public final sh6 f24845b;

    public r46(g77 g77Var, sh6 sh6Var) {
        this.f24844a = g77Var;
        this.f24845b = sh6Var;
    }

    /* renamed from: a */
    public final /* synthetic */ s46 m11754a() {
        return new s46(this.f24845b);
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 25;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.f24844a.mo20112M(new Callable() { // from class: com.daaw.q46
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return r46.this.m11754a();
            }
        });
    }
}
