package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.util.UUID;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class eh4 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;
    public final m08 d;

    public eh4(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
        this.d = m08Var4;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        ((sm4) this.a).a();
        zzchu a = ((u94) this.b).a();
        JSONObject jSONObject = (JSONObject) this.c.zzb();
        String str = (String) this.d.zzb();
        boolean equals = "native".equals(str);
        zzt.zzp();
        return new m03(UUID.randomUUID().toString(), a, str, jSONObject, false, equals);
    }
}
