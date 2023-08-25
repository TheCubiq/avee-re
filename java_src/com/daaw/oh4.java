package com.daaw;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class oh4 implements wz7 {

    /* renamed from: a */
    public final m08 f21559a;

    public oh4(m08 m08Var) {
        this.f21559a = m08Var;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((sm4) this.f21559a).m10155a().f27654A);
        } catch (JSONException unused) {
            return null;
        }
    }
}
