package com.daaw;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class oh4 implements wz7 {
    public final m08 a;

    public oh4(m08 m08Var) {
        this.a = m08Var;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((sm4) this.a).a().A);
        } catch (JSONException unused) {
            return null;
        }
    }
}
