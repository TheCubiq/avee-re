package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public final class sb5 implements wz7 {

    /* renamed from: a */
    public final m08 f26061a;

    /* renamed from: b */
    public final m08 f26062b;

    public sb5(m08 m08Var, m08 m08Var2) {
        this.f26061a = m08Var;
        this.f26062b = m08Var2;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        g77 g77Var = z04.f34305a;
        e08.m23801b(g77Var);
        Set singleton = ((Boolean) zzba.zzc().m23658b(g93.f10824s4)).booleanValue() ? Collections.singleton(new ly4(((oc5) this.f26062b).zzb(), g77Var)) : Collections.emptySet();
        e08.m23801b(singleton);
        return singleton;
    }
}
