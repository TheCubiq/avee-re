package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
/* loaded from: classes.dex */
public final class hr5 implements c15 {
    public final zzchu a;
    public final f77 b;
    public final th6 c;
    public final a74 d;
    public final ri6 e;
    public final bh3 f;
    public final boolean g;

    public hr5(zzchu zzchuVar, f77 f77Var, th6 th6Var, a74 a74Var, ri6 ri6Var, boolean z, bh3 bh3Var) {
        this.a = zzchuVar;
        this.b = f77Var;
        this.c = th6Var;
        this.d = a74Var;
        this.e = ri6Var;
        this.g = z;
        this.f = bh3Var;
    }

    @Override // com.daaw.c15
    public final void a(boolean z, Context context, br4 br4Var) {
        int i;
        gi4 gi4Var = (gi4) s67.q(this.b);
        this.d.g0(true);
        boolean e = this.g ? this.f.e(true) : true;
        boolean z2 = this.g;
        zzj zzjVar = new zzj(e, true, z2 ? this.f.d() : false, z2 ? this.f.a() : 0.0f, -1, z, this.c.P, false);
        if (br4Var != null) {
            br4Var.zzf();
        }
        zzt.zzi();
        p05 i2 = gi4Var.i();
        a74 a74Var = this.d;
        int i3 = this.c.R;
        if (i3 == -1) {
            zzw zzwVar = this.e.j;
            if (zzwVar != null) {
                int i4 = zzwVar.zza;
                if (i4 == 1) {
                    i = 7;
                } else if (i4 == 2) {
                    i = 6;
                }
                zzchu zzchuVar = this.a;
                th6 th6Var = this.c;
                String str = th6Var.C;
                yh6 yh6Var = th6Var.t;
                zzm.zza(context, new AdOverlayInfoParcel((zza) null, i2, (zzz) null, a74Var, i, zzchuVar, str, zzjVar, yh6Var.b, yh6Var.a, this.e.f, br4Var), true);
            }
            k04.zze("Error setting app open orientation; no targeting orientation available.");
            i3 = this.c.R;
        }
        i = i3;
        zzchu zzchuVar2 = this.a;
        th6 th6Var2 = this.c;
        String str2 = th6Var2.C;
        yh6 yh6Var2 = th6Var2.t;
        zzm.zza(context, new AdOverlayInfoParcel((zza) null, i2, (zzz) null, a74Var, i, zzchuVar2, str2, zzjVar, yh6Var2.b, yh6Var2.a, this.e.f, br4Var), true);
    }
}
