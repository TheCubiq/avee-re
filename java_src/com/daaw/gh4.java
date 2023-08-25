package com.daaw;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class gh4 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;

    public gh4(m08 m08Var, m08 m08Var2, m08 m08Var3) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        ah4 ah4Var = (ah4) this.a.zzb();
        g77 g77Var = z04.a;
        e08.b(g77Var);
        Set emptySet = ((JSONObject) this.c.zzb()) == null ? Collections.emptySet() : Collections.singleton(new ly4(ah4Var, g77Var));
        e08.b(emptySet);
        return emptySet;
    }
}
