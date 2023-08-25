package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
/* loaded from: classes.dex */
public final class gx3 {

    /* renamed from: a */
    public final InterfaceC0623ag f11835a;

    /* renamed from: b */
    public final zzg f11836b;

    /* renamed from: c */
    public final ky3 f11837c;

    public gx3(InterfaceC0623ag interfaceC0623ag, zzg zzgVar, ky3 ky3Var) {
        this.f11835a = interfaceC0623ag;
        this.f11836b = zzgVar;
        this.f11837c = ky3Var;
    }

    /* renamed from: a */
    public final void m21145a() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10776o0)).booleanValue()) {
            this.f11837c.m17318y();
        }
    }

    /* renamed from: b */
    public final void m21144b(int i, long j) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10765n0)).booleanValue()) {
            return;
        }
        if (j - this.f11836b.zzf() < 0) {
            zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10776o0)).booleanValue()) {
            this.f11836b.zzK(i);
        } else {
            this.f11836b.zzK(-1);
        }
        this.f11836b.zzL(j);
        m21145a();
    }
}
