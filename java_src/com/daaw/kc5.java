package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class kc5 implements wz7 {

    /* renamed from: a */
    public final m08 f16172a;

    /* renamed from: b */
    public final m08 f16173b;

    /* renamed from: c */
    public final m08 f16174c;

    /* renamed from: d */
    public final m08 f16175d;

    public kc5(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4) {
        this.f16172a = m08Var;
        this.f16173b = m08Var2;
        this.f16174c = m08Var3;
        this.f16175d = m08Var4;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        final String str = (String) this.f16172a.zzb();
        Context m20923a = ((h94) this.f16173b).m20923a();
        g77 g77Var = z04.f34305a;
        e08.m23801b(g77Var);
        Map zzb = ((a08) this.f16175d).zzb();
        if (((Boolean) zzba.zzc().m23658b(g93.f10824s4)).booleanValue()) {
            x33 x33Var = new x33(new g43(m20923a));
            x33Var.m5590b(new w33() { // from class: com.daaw.lc5
                @Override // com.daaw.w33
                /* renamed from: a */
                public final void mo2497a(u53 u53Var) {
                    u53Var.m8568z(str);
                }
            });
            emptySet = Collections.singleton(new ly4(new nc5(x33Var, zzb), g77Var));
        } else {
            emptySet = Collections.emptySet();
        }
        e08.m23801b(emptySet);
        return emptySet;
    }
}
