package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public final class m94 implements wz7 {
    public final m08 a;
    public final m08 b;

    public m94(m08 m08Var, m08 m08Var2) {
        this.a = m08Var;
        this.b = m08Var2;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        hg5 hg5Var = (hg5) this.a.zzb();
        g77 g77Var = z04.a;
        e08.b(g77Var);
        Set singleton = ((Boolean) zzba.zzc().b(g93.w1)).booleanValue() ? Collections.singleton(new ly4(hg5Var, g77Var)) : Collections.emptySet();
        e08.b(singleton);
        return singleton;
    }
}
