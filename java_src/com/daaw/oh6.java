package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public final class oh6 implements pz5 {
    public final /* synthetic */ qh6 a;

    public oh6(qh6 qh6Var) {
        this.a = qh6Var;
    }

    @Override // com.daaw.pz5
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        j95 j95Var;
        gi6 gi6Var;
        j95 j95Var2 = (j95) obj;
        synchronized (this.a) {
            this.a.s = j95Var2;
            if (((Boolean) zzba.zzc().b(g93.a3)).booleanValue()) {
                hi6 j = j95Var2.j();
                gi6Var = this.a.r;
                j.a = gi6Var;
            }
            j95Var = this.a.s;
            j95Var.b();
        }
    }

    @Override // com.daaw.pz5
    public final void zza() {
        synchronized (this.a) {
            this.a.s = null;
        }
    }
}
