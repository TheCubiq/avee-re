package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public final class m94 implements wz7 {

    /* renamed from: a */
    public final m08 f18683a;

    /* renamed from: b */
    public final m08 f18684b;

    public m94(m08 m08Var, m08 m08Var2) {
        this.f18683a = m08Var;
        this.f18684b = m08Var2;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        hg5 hg5Var = (hg5) this.f18683a.zzb();
        g77 g77Var = z04.f34305a;
        e08.m23801b(g77Var);
        Set singleton = ((Boolean) zzba.zzc().m23658b(g93.f10865w1)).booleanValue() ? Collections.singleton(new ly4(hg5Var, g77Var)) : Collections.emptySet();
        e08.m23801b(singleton);
        return singleton;
    }
}
