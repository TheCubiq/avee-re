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

    /* renamed from: a */
    public final zzchu f12875a;

    /* renamed from: b */
    public final f77 f12876b;

    /* renamed from: c */
    public final th6 f12877c;

    /* renamed from: d */
    public final a74 f12878d;

    /* renamed from: e */
    public final ri6 f12879e;

    /* renamed from: f */
    public final bh3 f12880f;

    /* renamed from: g */
    public final boolean f12881g;

    public hr5(zzchu zzchuVar, f77 f77Var, th6 th6Var, a74 a74Var, ri6 ri6Var, boolean z, bh3 bh3Var) {
        this.f12875a = zzchuVar;
        this.f12876b = f77Var;
        this.f12877c = th6Var;
        this.f12878d = a74Var;
        this.f12879e = ri6Var;
        this.f12881g = z;
        this.f12880f = bh3Var;
    }

    @Override // com.daaw.c15
    /* renamed from: a */
    public final void mo3165a(boolean z, Context context, br4 br4Var) {
        int i;
        gi4 gi4Var = (gi4) s67.m10626q(this.f12876b);
        this.f12878d.mo6417g0(true);
        boolean m26168e = this.f12881g ? this.f12880f.m26168e(true) : true;
        boolean z2 = this.f12881g;
        zzj zzjVar = new zzj(m26168e, true, z2 ? this.f12880f.m26169d() : false, z2 ? this.f12880f.m26172a() : 0.0f, -1, z, this.f12877c.f27669P, false);
        if (br4Var != null) {
            br4Var.zzf();
        }
        zzt.zzi();
        p05 mo21572i = gi4Var.mo21572i();
        a74 a74Var = this.f12878d;
        int i2 = this.f12877c.f27671R;
        if (i2 == -1) {
            zzw zzwVar = this.f12879e.f25350j;
            if (zzwVar != null) {
                int i3 = zzwVar.zza;
                if (i3 == 1) {
                    i = 7;
                } else if (i3 == 2) {
                    i = 6;
                }
                zzchu zzchuVar = this.f12875a;
                th6 th6Var = this.f12877c;
                String str = th6Var.f27656C;
                yh6 yh6Var = th6Var.f27715t;
                zzm.zza(context, new AdOverlayInfoParcel((zza) null, mo21572i, (zzz) null, a74Var, i, zzchuVar, str, zzjVar, yh6Var.f33682b, yh6Var.f33681a, this.f12879e.f25346f, br4Var), true);
            }
            k04.zze("Error setting app open orientation; no targeting orientation available.");
            i2 = this.f12877c.f27671R;
        }
        i = i2;
        zzchu zzchuVar2 = this.f12875a;
        th6 th6Var2 = this.f12877c;
        String str2 = th6Var2.f27656C;
        yh6 yh6Var2 = th6Var2.f27715t;
        zzm.zza(context, new AdOverlayInfoParcel((zza) null, mo21572i, (zzz) null, a74Var, i, zzchuVar2, str2, zzjVar, yh6Var2.f33682b, yh6Var2.f33681a, this.f12879e.f25346f, br4Var), true);
    }
}
