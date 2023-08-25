package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
/* loaded from: classes.dex */
public final class lf5 implements ze5 {

    /* renamed from: a */
    public final long f17372a;

    /* renamed from: b */
    public final iz5 f17373b;

    public lf5(long j, Context context, ef5 ef5Var, b94 b94Var, String str) {
        this.f17372a = j;
        sf6 mo26235y = b94Var.mo26235y();
        mo26235y.mo10384b(context);
        mo26235y.mo10385a(new zzq());
        mo26235y.zzb(str);
        iz5 zza = mo26235y.zzd().zza();
        this.f17373b = zza;
        zza.zzD(new kf5(this, ef5Var));
    }

    @Override // com.daaw.ze5
    /* renamed from: a */
    public final void mo2418a(zzl zzlVar) {
        this.f17373b.zzaa(zzlVar);
    }

    @Override // com.daaw.ze5
    public final void zza() {
        this.f17373b.zzx();
    }

    @Override // com.daaw.ze5
    public final void zzc() {
        this.f17373b.zzW(nt0.m14830g3(null));
    }
}
