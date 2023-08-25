package com.daaw;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class a36 implements i76 {
    public final g77 a;
    public final db5 b;
    public final String c;
    public final ri6 d;

    public a36(g77 g77Var, db5 db5Var, ri6 ri6Var, String str) {
        this.a = g77Var;
        this.b = db5Var;
        this.d = ri6Var;
        this.c = str;
    }

    public final /* synthetic */ b36 a() {
        return new b36(this.b.b(this.d.f, this.c), this.b.a());
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 17;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.a.M(new Callable() { // from class: com.daaw.z26
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return a36.this.a();
            }
        });
    }
}
