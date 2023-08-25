package com.daaw;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class lh4 implements wz7 {

    /* renamed from: a */
    public final m08 f17400a;

    /* renamed from: b */
    public final m08 f17401b;

    /* renamed from: c */
    public final m08 f17402c;

    public lh4(m08 m08Var, m08 m08Var2, m08 m08Var3) {
        this.f17400a = m08Var;
        this.f17401b = m08Var2;
        this.f17402c = m08Var3;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        ah4 ah4Var = (ah4) this.f17400a.zzb();
        g77 g77Var = z04.f34305a;
        e08.m23801b(g77Var);
        Set emptySet = ((JSONObject) this.f17402c.zzb()) == null ? Collections.emptySet() : Collections.singleton(new ly4(ah4Var, g77Var));
        e08.m23801b(emptySet);
        return emptySet;
    }
}
