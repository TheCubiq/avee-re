package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.util.UUID;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class o25 implements wz7 {
    public final m08 a;
    public final m08 b;

    public o25(m08 m08Var, m08 m08Var2) {
        this.a = m08Var;
        this.b = m08Var2;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzchu a = ((u94) this.a).a();
        zzt.zzp();
        return new m03(UUID.randomUUID().toString(), a, "native", new JSONObject(), false, true);
    }
}
