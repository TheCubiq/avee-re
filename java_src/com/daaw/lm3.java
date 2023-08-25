package com.daaw;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class lm3 implements mh3 {

    /* renamed from: a */
    public final e14 f17539a;

    /* renamed from: b */
    public final /* synthetic */ mm3 f17540b;

    public lm3(mm3 mm3Var, e14 e14Var) {
        this.f17540b = mm3Var;
        this.f17539a = e14Var;
    }

    @Override // com.daaw.mh3
    /* renamed from: a */
    public final void mo16027a(JSONObject jSONObject) {
        try {
            this.f17539a.m23797b(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.f17539a.m23796c(e);
        }
    }

    @Override // com.daaw.mh3
    public final void zza(String str) {
        try {
            if (str == null) {
                this.f17539a.m23796c(new ml3());
            } else {
                this.f17539a.m23796c(new ml3(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
