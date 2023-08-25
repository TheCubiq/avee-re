package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public final class fo6 implements cy4, er4, gy4 {
    public final to6 p;
    public final io6 q;

    public fo6(Context context, to6 to6Var) {
        this.p = to6Var;
        this.q = ho6.a(context, 13);
    }

    @Override // com.daaw.er4
    public final void A(zze zzeVar) {
        if (((Boolean) ta3.d.e()).booleanValue()) {
            to6 to6Var = this.p;
            io6 io6Var = this.q;
            io6Var.m(zzeVar.zza().toString());
            io6Var.zzf(false);
            to6Var.a(io6Var);
        }
    }

    @Override // com.daaw.gy4
    public final void zza() {
    }

    @Override // com.daaw.gy4
    public final void zzb() {
        if (((Boolean) ta3.d.e()).booleanValue()) {
            to6 to6Var = this.p;
            io6 io6Var = this.q;
            io6Var.zzf(true);
            to6Var.a(io6Var);
        }
    }

    @Override // com.daaw.cy4
    public final void zzf() {
    }

    @Override // com.daaw.cy4
    public final void zzg() {
        if (((Boolean) ta3.d.e()).booleanValue()) {
            this.q.zzh();
        }
    }
}
