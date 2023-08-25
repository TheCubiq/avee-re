package com.daaw;

import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class y36 implements i76 {

    /* renamed from: a */
    public final g77 f33327a;

    /* renamed from: b */
    public final ri6 f33328b;

    public y36(g77 g77Var, ri6 ri6Var) {
        this.f33327a = g77Var;
        this.f33328b = ri6Var;
    }

    /* renamed from: a */
    public final /* synthetic */ z36 m4145a() {
        return new z36("requester_type_2".equals(zzf.zzb(this.f33328b.f25344d)));
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 21;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.f33327a.mo20112M(new Callable() { // from class: com.daaw.x36
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return y36.this.m4145a();
            }
        });
    }
}
