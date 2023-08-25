package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbu;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class n35 extends o35 {
    public final JSONObject b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final JSONObject h;

    public n35(th6 th6Var, JSONObject jSONObject) {
        super(th6Var);
        this.b = zzbu.zzg(jSONObject, "tracking_urls_and_actions", "active_view");
        this.c = zzbu.zzk(false, jSONObject, "allow_pub_owned_ad_view");
        this.d = zzbu.zzk(false, jSONObject, "attribution", "allow_pub_rendering");
        this.e = zzbu.zzk(false, jSONObject, "enable_omid");
        this.g = zzbu.zzb("", jSONObject, "watermark_overlay_png_base64");
        this.f = jSONObject.optJSONObject("overlay") != null;
        this.h = ((Boolean) zzba.zzc().b(g93.C4)).booleanValue() ? jSONObject.optJSONObject("omid_settings") : null;
    }

    @Override // com.daaw.o35
    public final ui6 a() {
        JSONObject jSONObject = this.h;
        return jSONObject != null ? new ui6(jSONObject) : this.a.W;
    }

    @Override // com.daaw.o35
    public final String b() {
        return this.g;
    }

    @Override // com.daaw.o35
    public final JSONObject c() {
        JSONObject jSONObject = this.b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.a.A);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.daaw.o35
    public final boolean d() {
        return this.e;
    }

    @Override // com.daaw.o35
    public final boolean e() {
        return this.c;
    }

    @Override // com.daaw.o35
    public final boolean f() {
        return this.d;
    }

    @Override // com.daaw.o35
    public final boolean g() {
        return this.f;
    }
}
