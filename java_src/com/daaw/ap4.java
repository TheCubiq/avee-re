package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzccb;
import com.google.android.gms.internal.ads.zzchu;
/* loaded from: classes.dex */
public final class ap4 implements pt4 {
    public final Context p;
    public final ri6 q;
    public final zzchu r;
    public final zzg s;
    public final fg5 t;
    public final vo6 u;

    public ap4(Context context, ri6 ri6Var, zzchu zzchuVar, zzg zzgVar, fg5 fg5Var, vo6 vo6Var) {
        this.p = context;
        this.q = ri6Var;
        this.r = zzchuVar;
        this.s = zzgVar;
        this.t = fg5Var;
        this.u = vo6Var;
    }

    @Override // com.daaw.pt4
    public final void F(fi6 fi6Var) {
    }

    @Override // com.daaw.pt4
    public final void e(zzccb zzccbVar) {
        if (((Boolean) zzba.zzc().b(g93.v3)).booleanValue()) {
            zzt.zza().zzc(this.p, this.r, this.q.f, this.s.zzh(), this.u);
        }
        this.t.r();
    }
}
