package com.daaw;

import com.google.android.gms.ads.internal.util.zzbo;
/* loaded from: classes.dex */
public final class j63 implements uf2 {

    /* renamed from: a */
    public final /* synthetic */ String f14450a;

    /* renamed from: b */
    public final /* synthetic */ bb3 f14451b;

    public j63(zzbo zzboVar, String str, bb3 bb3Var) {
        this.f14450a = str;
        this.f14451b = bb3Var;
    }

    @Override // com.daaw.uf2
    /* renamed from: a */
    public final void mo8276a(zf2 zf2Var) {
        String str = this.f14450a;
        String exc = zf2Var.toString();
        k04.zzj("Failed to load URL: " + str + "\n" + exc);
        this.f14451b.zza(null);
    }
}
