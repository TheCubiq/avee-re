package com.daaw;

import com.google.android.gms.ads.internal.util.zze;
/* loaded from: classes.dex */
public final class yk3 implements i14 {
    public final /* synthetic */ al3 a;

    public yk3(al3 al3Var) {
        this.a = al3Var;
    }

    @Override // com.daaw.i14
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        il3 il3Var;
        kl3 kl3Var = (kl3) obj;
        zze.zza("Releasing engine reference.");
        il3Var = this.a.d;
        il3Var.i();
    }
}
