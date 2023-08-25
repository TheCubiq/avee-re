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

    /* renamed from: a */
    public final Context f8818a;

    /* renamed from: b */
    public final zzchu f8819b;

    /* renamed from: c */
    public final f77 f8820c;

    /* renamed from: d */
    public final th6 f8821d;

    /* renamed from: e */
    public final a74 f8822e;

    /* renamed from: f */
    public final ri6 f8823f;

    /* renamed from: g */
    public final bh3 f8824g;

    /* renamed from: h */
    public final boolean f8825h;

    public et5(Context context, zzchu zzchuVar, f77 f77Var, th6 th6Var, a74 a74Var, ri6 ri6Var, boolean z, bh3 bh3Var) {
        this.f8818a = context;
        this.f8819b = zzchuVar;
        this.f8820c = f77Var;
        this.f8821d = th6Var;
        this.f8822e = a74Var;
        this.f8823f = ri6Var;
        this.f8824g = bh3Var;
        this.f8825h = z;
    }

    @Override // com.daaw.c15
    /* renamed from: a */
    public final void mo3165a(boolean z, Context context, br4 br4Var) {
        pz4 pz4Var = (pz4) s67.m10626q(this.f8820c);
        this.f8822e.mo6417g0(true);
        boolean m26168e = this.f8825h ? this.f8824g.m26168e(false) : false;
        zzt.zzp();
        boolean zzE = zzs.zzE(this.f8818a);
        boolean z2 = this.f8825h;
        zzj zzjVar = new zzj(m26168e, zzE, z2 ? this.f8824g.m26169d() : false, z2 ? this.f8824g.m26172a() : 0.0f, -1, z, this.f8821d.f27669P, false);
        if (br4Var != null) {
            br4Var.zzf();
        }
        zzt.zzi();
        p05 mo9314j = pz4Var.mo9314j();
        a74 a74Var = this.f8822e;
        th6 th6Var = this.f8821d;
        int i = th6Var.f27671R;
        zzchu zzchuVar = this.f8819b;
        String str = th6Var.f27656C;
        yh6 yh6Var = th6Var.f27715t;
        zzm.zza(context, new AdOverlayInfoParcel((zza) null, mo9314j, (zzz) null, a74Var, i, zzchuVar, str, zzjVar, yh6Var.f33682b, yh6Var.f33681a, this.f8823f.f25346f, br4Var), true);
    }
}
