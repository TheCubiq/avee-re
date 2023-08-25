package com.daaw;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public final class kw5 implements xr4 {

    /* renamed from: a */
    public boolean f16788a = false;

    /* renamed from: b */
    public final /* synthetic */ tq5 f16789b;

    /* renamed from: c */
    public final /* synthetic */ e14 f16790c;

    /* renamed from: d */
    public final /* synthetic */ lw5 f16791d;

    public kw5(lw5 lw5Var, tq5 tq5Var, e14 e14Var) {
        this.f16791d = lw5Var;
        this.f16789b = tq5Var;
        this.f16790c = e14Var;
    }

    @Override // com.daaw.xr4
    /* renamed from: a */
    public final synchronized void mo4786a(int i) {
        if (this.f16788a) {
            return;
        }
        this.f16788a = true;
        m17375c(new zze(i, lw5.m16421e(this.f16789b.f27987a, i), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.daaw.xr4
    /* renamed from: b */
    public final synchronized void mo4785b(int i, String str) {
        if (this.f16788a) {
            return;
        }
        this.f16788a = true;
        if (str == null) {
            str = lw5.m16421e(this.f16789b.f27987a, i);
        }
        m17375c(new zze(i, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    /* renamed from: c */
    public final synchronized void m17375c(zze zzeVar) {
        int i = 1;
        if (true == ((Boolean) zzba.zzc().m23658b(g93.f10556T4)).booleanValue()) {
            i = 3;
        }
        this.f16790c.m23796c(new uq5(i, zzeVar));
    }

    @Override // com.daaw.xr4
    public final synchronized void zzb(zze zzeVar) {
        if (this.f16788a) {
            return;
        }
        this.f16788a = true;
        m17375c(zzeVar);
    }

    @Override // com.daaw.xr4
    public final synchronized void zzd() {
        this.f16790c.m23797b(null);
    }
}
