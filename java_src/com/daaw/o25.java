package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.util.UUID;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class o25 implements wz7 {

    /* renamed from: a */
    public final m08 f20965a;

    /* renamed from: b */
    public final m08 f20966b;

    public o25(m08 m08Var, m08 m08Var2) {
        this.f20965a = m08Var;
        this.f20966b = m08Var2;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzchu m8405a = ((u94) this.f20965a).m8405a();
        zzt.zzp();
        return new m03(UUID.randomUUID().toString(), m8405a, "native", new JSONObject(), false, true);
    }
}
