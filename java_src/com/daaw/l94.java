package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public final class l94 implements wz7 {

    /* renamed from: a */
    public final m08 f17164a;

    /* renamed from: b */
    public final m08 f17165b;

    public l94(m08 m08Var, m08 m08Var2) {
        this.f17164a = m08Var;
        this.f17165b = m08Var2;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        eo5 eo5Var = (eo5) this.f17164a.zzb();
        g77 g77Var = z04.f34305a;
        e08.m23801b(g77Var);
        if (((Boolean) zzba.zzc().m23658b(g93.f10513P1)).booleanValue()) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10469K7)).booleanValue()) {
                emptySet = Collections.singleton(new ly4(eo5Var, g77Var));
                e08.m23801b(emptySet);
                return emptySet;
            }
        }
        emptySet = Collections.emptySet();
        e08.m23801b(emptySet);
        return emptySet;
    }
}
