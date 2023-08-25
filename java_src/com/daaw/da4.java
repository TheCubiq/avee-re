package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
/* loaded from: classes.dex */
public final class da4 implements wz7 {
    public final m08 a;
    public final m08 b;

    public da4(m08 m08Var, m08 m08Var2) {
        this.a = m08Var;
        this.b = m08Var2;
    }

    @Override // com.daaw.m08
    /* renamed from: a */
    public final xu3 zzb() {
        Context a = ((h94) this.a).a();
        vo6 vo6Var = (vo6) this.b.zzb();
        xl3 b = zzt.zzf().b(a, zzchu.h(), vo6Var);
        rl3 rl3Var = ul3.b;
        b.a("google.afma.request.getAdDictionary", rl3Var, rl3Var);
        return new wu3(a, zzt.zzf().b(a, zzchu.h(), vo6Var).a("google.afma.sdkConstants.getSdkConstants", rl3Var, rl3Var));
    }
}
