package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public final class l94 implements wz7 {
    public final m08 a;
    public final m08 b;

    public l94(m08 m08Var, m08 m08Var2) {
        this.a = m08Var;
        this.b = m08Var2;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        eo5 eo5Var = (eo5) this.a.zzb();
        g77 g77Var = z04.a;
        e08.b(g77Var);
        if (((Boolean) zzba.zzc().b(g93.P1)).booleanValue()) {
            if (((Boolean) zzba.zzc().b(g93.K7)).booleanValue()) {
                emptySet = Collections.singleton(new ly4(eo5Var, g77Var));
                e08.b(emptySet);
                return emptySet;
            }
        }
        emptySet = Collections.emptySet();
        e08.b(emptySet);
        return emptySet;
    }
}
