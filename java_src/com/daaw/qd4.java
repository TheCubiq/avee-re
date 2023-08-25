package com.daaw;

import com.google.android.gms.ads.nonagon.signalgeneration.zzag;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import com.google.android.gms.ads.nonagon.signalgeneration.zzh;
/* loaded from: classes.dex */
public final class qd4 implements zzg {
    public final bb4 a;
    public up4 b;
    public zzag c;

    public /* synthetic */ qd4(bb4 bb4Var, pd4 pd4Var) {
        this.a = bb4Var;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final /* synthetic */ zzg zza(up4 up4Var) {
        this.b = up4Var;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final /* synthetic */ zzg zzb(zzag zzagVar) {
        this.c = zzagVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final zzh zzc() {
        e08.c(this.b, up4.class);
        e08.c(this.c, zzag.class);
        return new sd4(this.a, this.c, new ln4(), new xd5(), this.b, null, null, null);
    }
}
