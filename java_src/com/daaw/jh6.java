package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public final class jh6 implements pz5 {
    public final /* synthetic */ kh6 a;

    public jh6(kh6 kh6Var) {
        this.a = kh6Var;
    }

    @Override // com.daaw.pz5
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        j95 j95Var;
        gi6 gi6Var;
        j95 j95Var2 = (j95) obj;
        synchronized (this.a) {
            this.a.v = j95Var2;
            if (((Boolean) zzba.zzc().b(g93.a3)).booleanValue()) {
                hi6 j = j95Var2.j();
                gi6Var = this.a.s;
                j.a = gi6Var;
            }
            j95Var = this.a.v;
            j95Var.b();
        }
    }

    @Override // com.daaw.pz5
    public final void zza() {
        synchronized (this.a) {
            this.a.v = null;
        }
    }
}
