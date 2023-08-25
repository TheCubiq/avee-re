package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public final class fo6 implements cy4, er4, gy4 {

    /* renamed from: p */
    public final to6 f9744p;

    /* renamed from: q */
    public final io6 f9745q;

    public fo6(Context context, to6 to6Var) {
        this.f9744p = to6Var;
        this.f9745q = ho6.m20568a(context, 13);
    }

    @Override // com.daaw.er4
    /* renamed from: A */
    public final void mo9178A(zze zzeVar) {
        if (((Boolean) ta3.f27159d.m16137e()).booleanValue()) {
            to6 to6Var = this.f9744p;
            io6 io6Var = this.f9745q;
            io6Var.mo17582m(zzeVar.zza().toString());
            io6Var.zzf(false);
            to6Var.m8902a(io6Var);
        }
    }

    @Override // com.daaw.gy4
    public final void zza() {
    }

    @Override // com.daaw.gy4
    public final void zzb() {
        if (((Boolean) ta3.f27159d.m16137e()).booleanValue()) {
            to6 to6Var = this.f9744p;
            io6 io6Var = this.f9745q;
            io6Var.zzf(true);
            to6Var.m8902a(io6Var);
        }
    }

    @Override // com.daaw.cy4
    public final void zzf() {
    }

    @Override // com.daaw.cy4
    public final void zzg() {
        if (((Boolean) ta3.f27159d.m16137e()).booleanValue()) {
            this.f9745q.zzh();
        }
    }
}
