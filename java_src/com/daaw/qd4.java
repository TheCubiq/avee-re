package com.daaw;

import com.google.android.gms.ads.nonagon.signalgeneration.zzag;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import com.google.android.gms.ads.nonagon.signalgeneration.zzh;
/* loaded from: classes.dex */
public final class qd4 implements zzg {

    /* renamed from: a */
    public final bb4 f23870a;

    /* renamed from: b */
    public up4 f23871b;

    /* renamed from: c */
    public zzag f23872c;

    public /* synthetic */ qd4(bb4 bb4Var, pd4 pd4Var) {
        this.f23870a = bb4Var;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final /* synthetic */ zzg zza(up4 up4Var) {
        this.f23871b = up4Var;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final /* synthetic */ zzg zzb(zzag zzagVar) {
        this.f23872c = zzagVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final zzh zzc() {
        e08.m23800c(this.f23871b, up4.class);
        e08.m23800c(this.f23872c, zzag.class);
        return new sd4(this.f23870a, this.f23872c, new ln4(), new xd5(), this.f23871b, null, null, null);
    }
}
