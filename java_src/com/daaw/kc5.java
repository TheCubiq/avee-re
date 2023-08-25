package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class kc5 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;
    public final m08 d;

    public kc5(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
        this.d = m08Var4;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        final String str = (String) this.a.zzb();
        Context a = ((h94) this.b).a();
        g77 g77Var = z04.a;
        e08.b(g77Var);
        Map zzb = ((a08) this.d).zzb();
        if (((Boolean) zzba.zzc().b(g93.s4)).booleanValue()) {
            x33 x33Var = new x33(new g43(a));
            x33Var.b(new w33() { // from class: com.daaw.lc5
                @Override // com.daaw.w33
                public final void a(u53 u53Var) {
                    u53Var.z(str);
                }
            });
            emptySet = Collections.singleton(new ly4(new nc5(x33Var, zzb), g77Var));
        } else {
            emptySet = Collections.emptySet();
        }
        e08.b(emptySet);
        return emptySet;
    }
}
