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

    /* renamed from: p */
    public final Context f4104p;

    /* renamed from: q */
    public final b94 f4105q;

    /* renamed from: r */
    public final pi6 f4106r;

    /* renamed from: s */
    public final s35 f4107s;

    /* renamed from: t */
    public zzbh f4108t;

    public ay5(b94 b94Var, Context context, String str) {
        pi6 pi6Var = new pi6();
        this.f4106r = pi6Var;
        this.f4107s = new s35();
        this.f4105q = b94Var;
        pi6Var.m13370J(str);
        this.f4104p = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final zzbn zze() {
        u35 m10728g = this.f4107s.m10728g();
        this.f4106r.m13361b(m10728g.m8594i());
        this.f4106r.m13360c(m10728g.m8595h());
        pi6 pi6Var = this.f4106r;
        if (pi6Var.m13339x() == null) {
            pi6Var.m13371I(zzq.zzc());
        }
        return new by5(this.f4104p, this.f4105q, this.f4106r, m10728g, this.f4108t);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(wd3 wd3Var) {
        this.f4107s.m10734a(wd3Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(zd3 zd3Var) {
        this.f4107s.m10733b(zd3Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(String str, fe3 fe3Var, ce3 ce3Var) {
        this.f4107s.m10732c(str, fe3Var, ce3Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(sj3 sj3Var) {
        this.f4107s.m10731d(sj3Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(je3 je3Var, zzq zzqVar) {
        this.f4107s.m10730e(je3Var);
        this.f4106r.m13371I(zzqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(me3 me3Var) {
        this.f4107s.m10729f(me3Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(zzbh zzbhVar) {
        this.f4108t = zzbhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.f4106r.m13372H(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbsl zzbslVar) {
        this.f4106r.m13367M(zzbslVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzblz zzblzVar) {
        this.f4106r.m13362a(zzblzVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        this.f4106r.m13359d(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(zzcf zzcfVar) {
        this.f4106r.m13346q(zzcfVar);
    }
}
