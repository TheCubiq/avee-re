package com.daaw;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class am3 implements mh3 {

    /* renamed from: a */
    public final al3 f3313a;

    /* renamed from: b */
    public final e14 f3314b;

    /* renamed from: c */
    public final /* synthetic */ bm3 f3315c;

    public am3(bm3 bm3Var, al3 al3Var, e14 e14Var) {
        this.f3315c = bm3Var;
        this.f3313a = al3Var;
        this.f3314b = e14Var;
    }

    @Override // com.daaw.mh3
    /* renamed from: a */
    public final void mo16027a(JSONObject jSONObject) {
        pl3 pl3Var;
        try {
            try {
                e14 e14Var = this.f3314b;
                pl3Var = this.f3315c.f4959a;
                e14Var.m23797b(pl3Var.mo8081b(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e) {
                this.f3314b.m23796c(e);
            }
        } finally {
            this.f3313a.m27356g();
        }
    }

    @Override // com.daaw.mh3
    public final void zza(String str) {
        try {
            if (str == null) {
                this.f3314b.m23796c(new ml3());
            } else {
                this.f3314b.m23796c(new ml3(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            this.f3313a.m27356g();
            throw th;
        }
        this.f3313a.m27356g();
    }
}
