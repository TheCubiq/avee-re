package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public final class hk4 implements wz7 {
    public final m08 a;

    public hk4(m08 m08Var) {
        this.a = m08Var;
    }

    @Override // com.daaw.m08
    /* renamed from: a */
    public final Boolean zzb() {
        boolean z = true;
        if (((cq4) this.a).a().a() == null) {
            if (!((Boolean) zzba.zzc().b(g93.X4)).booleanValue()) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
