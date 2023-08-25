package com.daaw;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class lm3 implements mh3 {
    public final e14 a;
    public final /* synthetic */ mm3 b;

    public lm3(mm3 mm3Var, e14 e14Var) {
        this.b = mm3Var;
        this.a = e14Var;
    }

    @Override // com.daaw.mh3
    public final void a(JSONObject jSONObject) {
        try {
            this.a.b(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.a.c(e);
        }
    }

    @Override // com.daaw.mh3
    public final void zza(String str) {
        try {
            if (str == null) {
                this.a.c(new ml3());
            } else {
                this.a.c(new ml3(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
