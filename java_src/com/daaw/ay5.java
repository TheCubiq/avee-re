package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbp;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbsl;
/* loaded from: classes.dex */
public final class ay5 extends zzbp {
    public final Context p;
    public final b94 q;
    public final pi6 r;
    public final s35 s;
    public zzbh t;

    public ay5(b94 b94Var, Context context, String str) {
        pi6 pi6Var = new pi6();
        this.r = pi6Var;
        this.s = new s35();
        this.q = b94Var;
        pi6Var.J(str);
        this.p = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final zzbn zze() {
        u35 g = this.s.g();
        this.r.b(g.i());
        this.r.c(g.h());
        pi6 pi6Var = this.r;
        if (pi6Var.x() == null) {
            pi6Var.I(zzq.zzc());
        }
        return new by5(this.p, this.q, this.r, g, this.t);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(wd3 wd3Var) {
        this.s.a(wd3Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(zd3 zd3Var) {
        this.s.b(zd3Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(String str, fe3 fe3Var, ce3 ce3Var) {
        this.s.c(str, fe3Var, ce3Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(sj3 sj3Var) {
        this.s.d(sj3Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(je3 je3Var, zzq zzqVar) {
        this.s.e(je3Var);
        this.r.I(zzqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(me3 me3Var) {
        this.s.f(me3Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(zzbh zzbhVar) {
        this.t = zzbhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.r.H(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbsl zzbslVar) {
        this.r.M(zzbslVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzblz zzblzVar) {
        this.r.a(zzblzVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        this.r.d(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(zzcf zzcfVar) {
        this.r.q(zzcfVar);
    }
}
