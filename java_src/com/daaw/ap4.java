package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzccb;
import com.google.android.gms.internal.ads.zzchu;
/* loaded from: classes.dex */
public final class ap4 implements pt4 {

    /* renamed from: p */
    public final Context f3417p;

    /* renamed from: q */
    public final ri6 f3418q;

    /* renamed from: r */
    public final zzchu f3419r;

    /* renamed from: s */
    public final zzg f3420s;

    /* renamed from: t */
    public final fg5 f3421t;

    /* renamed from: u */
    public final vo6 f3422u;

    public ap4(Context context, ri6 ri6Var, zzchu zzchuVar, zzg zzgVar, fg5 fg5Var, vo6 vo6Var) {
        this.f3417p = context;
        this.f3418q = ri6Var;
        this.f3419r = zzchuVar;
        this.f3420s = zzgVar;
        this.f3421t = fg5Var;
        this.f3422u = vo6Var;
    }

    @Override // com.daaw.pt4
    /* renamed from: F */
    public final void mo5181F(fi6 fi6Var) {
    }

    @Override // com.daaw.pt4
    /* renamed from: e */
    public final void mo5174e(zzccb zzccbVar) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10856v3)).booleanValue()) {
            zzt.zza().zzc(this.f3417p, this.f3419r, this.f3418q.f25346f, this.f3420s.zzh(), this.f3422u);
        }
        this.f3421t.m22672r();
    }
}
