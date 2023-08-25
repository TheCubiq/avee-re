package com.daaw;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public final class kw5 implements xr4 {
    public boolean a = false;
    public final /* synthetic */ tq5 b;
    public final /* synthetic */ e14 c;
    public final /* synthetic */ lw5 d;

    public kw5(lw5 lw5Var, tq5 tq5Var, e14 e14Var) {
        this.d = lw5Var;
        this.b = tq5Var;
        this.c = e14Var;
    }

    @Override // com.daaw.xr4
    public final synchronized void a(int i) {
        if (this.a) {
            return;
        }
        this.a = true;
        c(new zze(i, lw5.e(this.b.a, i), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.daaw.xr4
    public final synchronized void b(int i, String str) {
        if (this.a) {
            return;
        }
        this.a = true;
        if (str == null) {
            str = lw5.e(this.b.a, i);
        }
        c(new zze(i, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    public final synchronized void c(zze zzeVar) {
        int i = 1;
        if (true == ((Boolean) zzba.zzc().b(g93.T4)).booleanValue()) {
            i = 3;
        }
        this.c.c(new uq5(i, zzeVar));
    }

    @Override // com.daaw.xr4
    public final synchronized void zzb(zze zzeVar) {
        if (this.a) {
            return;
        }
        this.a = true;
        c(zzeVar);
    }

    @Override // com.daaw.xr4
    public final synchronized void zzd() {
        this.c.b(null);
    }
}
