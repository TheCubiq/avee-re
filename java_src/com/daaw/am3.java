package com.daaw;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class am3 implements mh3 {
    public final al3 a;
    public final e14 b;
    public final /* synthetic */ bm3 c;

    public am3(bm3 bm3Var, al3 al3Var, e14 e14Var) {
        this.c = bm3Var;
        this.a = al3Var;
        this.b = e14Var;
    }

    @Override // com.daaw.mh3
    public final void a(JSONObject jSONObject) {
        pl3 pl3Var;
        try {
            try {
                e14 e14Var = this.b;
                pl3Var = this.c.a;
                e14Var.b(pl3Var.b(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e) {
                this.b.c(e);
            }
        } finally {
            this.a.g();
        }
    }

    @Override // com.daaw.mh3
    public final void zza(String str) {
        try {
            if (str == null) {
                this.b.c(new ml3());
            } else {
                this.b.c(new ml3(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            this.a.g();
            throw th;
        }
        this.a.g();
    }
}
