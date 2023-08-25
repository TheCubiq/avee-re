package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
/* loaded from: classes.dex */
public final class gx3 {
    public final ag a;
    public final zzg b;
    public final ky3 c;

    public gx3(ag agVar, zzg zzgVar, ky3 ky3Var) {
        this.a = agVar;
        this.b = zzgVar;
        this.c = ky3Var;
    }

    public final void a() {
        if (((Boolean) zzba.zzc().b(g93.o0)).booleanValue()) {
            this.c.y();
        }
    }

    public final void b(int i, long j) {
        if (((Boolean) zzba.zzc().b(g93.n0)).booleanValue()) {
            return;
        }
        if (j - this.b.zzf() < 0) {
            zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) zzba.zzc().b(g93.o0)).booleanValue()) {
            this.b.zzK(i);
        } else {
            this.b.zzK(-1);
        }
        this.b.zzL(j);
        a();
    }
}
