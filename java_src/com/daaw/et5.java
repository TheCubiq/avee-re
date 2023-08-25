package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
/* loaded from: classes.dex */
public final class et5 implements c15 {
    public final Context a;
    public final zzchu b;
    public final f77 c;
    public final th6 d;
    public final a74 e;
    public final ri6 f;
    public final bh3 g;
    public final boolean h;

    public et5(Context context, zzchu zzchuVar, f77 f77Var, th6 th6Var, a74 a74Var, ri6 ri6Var, boolean z, bh3 bh3Var) {
        this.a = context;
        this.b = zzchuVar;
        this.c = f77Var;
        this.d = th6Var;
        this.e = a74Var;
        this.f = ri6Var;
        this.g = bh3Var;
        this.h = z;
    }

    @Override // com.daaw.c15
    public final void a(boolean z, Context context, br4 br4Var) {
        pz4 pz4Var = (pz4) s67.q(this.c);
        this.e.g0(true);
        boolean e = this.h ? this.g.e(false) : false;
        zzt.zzp();
        boolean zzE = zzs.zzE(this.a);
        boolean z2 = this.h;
        zzj zzjVar = new zzj(e, zzE, z2 ? this.g.d() : false, z2 ? this.g.a() : 0.0f, -1, z, this.d.P, false);
        if (br4Var != null) {
            br4Var.zzf();
        }
        zzt.zzi();
        p05 j = pz4Var.j();
        a74 a74Var = this.e;
        th6 th6Var = this.d;
        int i = th6Var.R;
        zzchu zzchuVar = this.b;
        String str = th6Var.C;
        yh6 yh6Var = th6Var.t;
        zzm.zza(context, new AdOverlayInfoParcel((zza) null, j, (zzz) null, a74Var, i, zzchuVar, str, zzjVar, yh6Var.b, yh6Var.a, this.f.f, br4Var), true);
    }
}
