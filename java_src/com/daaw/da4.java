package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
/* loaded from: classes.dex */
public final class da4 implements wz7 {

    /* renamed from: a */
    public final m08 f6718a;

    /* renamed from: b */
    public final m08 f6719b;

    public da4(m08 m08Var, m08 m08Var2) {
        this.f6718a = m08Var;
        this.f6719b = m08Var2;
    }

    @Override // com.daaw.m08
    /* renamed from: a */
    public final xu3 zzb() {
        Context m20923a = ((h94) this.f6718a).m20923a();
        vo6 vo6Var = (vo6) this.f6719b.zzb();
        xl3 m14177b = zzt.zzf().m14177b(m20923a, zzchu.m1093h(), vo6Var);
        rl3 rl3Var = ul3.f29176b;
        m14177b.m5010a("google.afma.request.getAdDictionary", rl3Var, rl3Var);
        return new wu3(m20923a, zzt.zzf().m14177b(m20923a, zzchu.m1093h(), vo6Var).m5010a("google.afma.sdkConstants.getSdkConstants", rl3Var, rl3Var));
    }
}
