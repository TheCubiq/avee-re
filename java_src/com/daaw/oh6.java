package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public final class oh6 implements pz5 {

    /* renamed from: a */
    public final /* synthetic */ qh6 f21563a;

    public oh6(qh6 qh6Var) {
        this.f21563a = qh6Var;
    }

    @Override // com.daaw.pz5
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2496a(Object obj) {
        j95 j95Var;
        gi6 gi6Var;
        j95 j95Var2 = (j95) obj;
        synchronized (this.f21563a) {
            this.f21563a.f23963s = j95Var2;
            if (((Boolean) zzba.zzc().m23658b(g93.f10625a3)).booleanValue()) {
                hi6 m18706j = j95Var2.m18706j();
                gi6Var = this.f21563a.f23962r;
                m18706j.f12556a = gi6Var;
            }
            j95Var = this.f21563a.f23963s;
            j95Var.mo2131b();
        }
    }

    @Override // com.daaw.pz5
    public final void zza() {
        synchronized (this.f21563a) {
            this.f21563a.f23963s = null;
        }
    }
}
