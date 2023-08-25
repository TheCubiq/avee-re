package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbm;
import com.google.android.gms.ads.internal.client.zzl;
/* loaded from: classes.dex */
public final class by5 extends zzbm {
    public final lz5 p;

    public by5(Context context, b94 b94Var, pi6 pi6Var, u35 u35Var, zzbh zzbhVar) {
        nz5 nz5Var = new nz5(u35Var, b94Var.C());
        nz5Var.e(zzbhVar);
        this.p = new lz5(new xz5(b94Var, context, nz5Var, pi6Var), pi6Var.i());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zze() {
        return this.p.a();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zzf() {
        return this.p.b();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzg(zzl zzlVar) {
        this.p.d(zzlVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized void zzh(zzl zzlVar, int i) {
        this.p.d(zzlVar, i);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized boolean zzi() {
        return this.p.e();
    }
}
