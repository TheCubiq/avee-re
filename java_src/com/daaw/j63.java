package com.daaw;

import com.google.android.gms.ads.internal.util.zzbo;
/* loaded from: classes.dex */
public final class j63 implements uf2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ bb3 b;

    public j63(zzbo zzboVar, String str, bb3 bb3Var) {
        this.a = str;
        this.b = bb3Var;
    }

    @Override // com.daaw.uf2
    public final void a(zf2 zf2Var) {
        String str = this.a;
        String exc = zf2Var.toString();
        k04.zzj("Failed to load URL: " + str + "\n" + exc);
        this.b.zza(null);
    }
}
