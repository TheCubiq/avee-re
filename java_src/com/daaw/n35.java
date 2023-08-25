package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbu;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class n35 extends o35 {

    /* renamed from: b */
    public final JSONObject f19444b;

    /* renamed from: c */
    public final boolean f19445c;

    /* renamed from: d */
    public final boolean f19446d;

    /* renamed from: e */
    public final boolean f19447e;

    /* renamed from: f */
    public final boolean f19448f;

    /* renamed from: g */
    public final String f19449g;

    /* renamed from: h */
    public final JSONObject f19450h;

    public n35(th6 th6Var, JSONObject jSONObject) {
        super(th6Var);
        this.f19444b = zzbu.zzg(jSONObject, "tracking_urls_and_actions", "active_view");
        this.f19445c = zzbu.zzk(false, jSONObject, "allow_pub_owned_ad_view");
        this.f19446d = zzbu.zzk(false, jSONObject, "attribution", "allow_pub_rendering");
        this.f19447e = zzbu.zzk(false, jSONObject, "enable_omid");
        this.f19449g = zzbu.zzb("", jSONObject, "watermark_overlay_png_base64");
        this.f19448f = jSONObject.optJSONObject("overlay") != null;
        this.f19450h = ((Boolean) zzba.zzc().m23658b(g93.f10386C4)).booleanValue() ? jSONObject.optJSONObject("omid_settings") : null;
    }

    @Override // com.daaw.o35
    /* renamed from: a */
    public final ui6 mo14582a() {
        JSONObject jSONObject = this.f19450h;
        return jSONObject != null ? new ui6(jSONObject) : this.f21011a.f27676W;
    }

    @Override // com.daaw.o35
    /* renamed from: b */
    public final String mo14581b() {
        return this.f19449g;
    }

    @Override // com.daaw.o35
    /* renamed from: c */
    public final JSONObject mo14580c() {
        JSONObject jSONObject = this.f19444b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.f21011a.f27654A);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.daaw.o35
    /* renamed from: d */
    public final boolean mo14579d() {
        return this.f19447e;
    }

    @Override // com.daaw.o35
    /* renamed from: e */
    public final boolean mo14578e() {
        return this.f19445c;
    }

    @Override // com.daaw.o35
    /* renamed from: f */
    public final boolean mo14577f() {
        return this.f19446d;
    }

    @Override // com.daaw.o35
    /* renamed from: g */
    public final boolean mo14576g() {
        return this.f19448f;
    }
}
