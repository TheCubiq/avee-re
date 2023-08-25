package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.util.UUID;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class eh4 implements wz7 {

    /* renamed from: a */
    public final m08 f8481a;

    /* renamed from: b */
    public final m08 f8482b;

    /* renamed from: c */
    public final m08 f8483c;

    /* renamed from: d */
    public final m08 f8484d;

    public eh4(m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4) {
        this.f8481a = m08Var;
        this.f8482b = m08Var2;
        this.f8483c = m08Var3;
        this.f8484d = m08Var4;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        ((sm4) this.f8481a).m10155a();
        zzchu m8405a = ((u94) this.f8482b).m8405a();
        JSONObject jSONObject = (JSONObject) this.f8483c.zzb();
        String str = (String) this.f8484d.zzb();
        boolean equals = "native".equals(str);
        zzt.zzp();
        return new m03(UUID.randomUUID().toString(), m8405a, str, jSONObject, false, equals);
    }
}
