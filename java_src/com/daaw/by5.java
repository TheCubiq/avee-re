package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbm;
import com.google.android.gms.ads.internal.client.zzl;
/* loaded from: classes.dex */
public final class by5 extends zzbm {

    /* renamed from: p */
    public final lz5 f5278p;

    public by5(Context context, b94 b94Var, pi6 pi6Var, u35 u35Var, zzbh zzbhVar) {
        nz5 nz5Var = new nz5(u35Var, b94Var.mo26310C());
        nz5Var.m14704e(zzbhVar);
        this.f5278p = new lz5(new xz5(b94Var, context, nz5Var, pi6Var), pi6Var.m13354i());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zze() {
        return this.f5278p.m16358a();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zzf() {
        return this.f5278p.m16357b();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzg(zzl zzlVar) {
        this.f5278p.m16355d(zzlVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized void zzh(zzl zzlVar, int i) {
        this.f5278p.m16355d(zzlVar, i);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized boolean zzi() {
        return this.f5278p.m16354e();
    }
}
