package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
/* loaded from: classes.dex */
public final class lf5 implements ze5 {
    public final long a;
    public final iz5 b;

    public lf5(long j, Context context, ef5 ef5Var, b94 b94Var, String str) {
        this.a = j;
        sf6 y = b94Var.y();
        y.b(context);
        y.a(new zzq());
        y.zzb(str);
        iz5 zza = y.zzd().zza();
        this.b = zza;
        zza.zzD(new kf5(this, ef5Var));
    }

    @Override // com.daaw.ze5
    public final void a(zzl zzlVar) {
        this.b.zzaa(zzlVar);
    }

    @Override // com.daaw.ze5
    public final void zza() {
        this.b.zzx();
    }

    @Override // com.daaw.ze5
    public final void zzc() {
        this.b.zzW(nt0.g3(null));
    }
}
