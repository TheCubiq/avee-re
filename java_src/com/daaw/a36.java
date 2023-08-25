package com.daaw;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class a36 implements i76 {

    /* renamed from: a */
    public final g77 f2757a;

    /* renamed from: b */
    public final db5 f2758b;

    /* renamed from: c */
    public final String f2759c;

    /* renamed from: d */
    public final ri6 f2760d;

    public a36(g77 g77Var, db5 db5Var, ri6 ri6Var, String str) {
        this.f2757a = g77Var;
        this.f2758b = db5Var;
        this.f2760d = ri6Var;
        this.f2759c = str;
    }

    /* renamed from: a */
    public final /* synthetic */ b36 m27717a() {
        return new b36(this.f2758b.m24566b(this.f2760d.f25346f, this.f2759c), this.f2758b.m24567a());
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 17;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.f2757a.mo20112M(new Callable() { // from class: com.daaw.z26
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return a36.this.m27717a();
            }
        });
    }
}
