package com.daaw;

import android.text.TextUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* renamed from: com.daaw.xr */
/* loaded from: classes2.dex */
public class C3565xr implements bc1 {

    /* renamed from: a */
    public final String f32893a;

    /* renamed from: b */
    public final vb0 f32894b;

    /* renamed from: c */
    public final ml0 f32895c;

    public C3565xr(String str, vb0 vb0Var) {
        this(str, vb0Var, ml0.m15976f());
    }

    public C3565xr(String str, vb0 vb0Var, ml0 ml0Var) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f32895c = ml0Var;
        this.f32894b = vb0Var;
        this.f32893a = str;
    }

    @Override // com.daaw.bc1
    /* renamed from: a */
    public JSONObject mo4796a(ac1 ac1Var, boolean z) {
        if (z) {
            try {
                Map<String, String> m4791f = m4791f(ac1Var);
                ub0 m4795b = m4795b(m4793d(m4791f), ac1Var);
                ml0 ml0Var = this.f32895c;
                ml0Var.m15980b("Requesting settings from " + this.f32893a);
                ml0 ml0Var2 = this.f32895c;
                ml0Var2.m15973i("Settings query params were: " + m4791f);
                return m4790g(m4795b.m8355c());
            } catch (IOException e) {
                this.f32895c.m15977e("Settings request failed.", e);
                return null;
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }

    /* renamed from: b */
    public final ub0 m4795b(ub0 ub0Var, ac1 ac1Var) {
        m4794c(ub0Var, "X-CRASHLYTICS-GOOGLE-APP-ID", ac1Var.f3055a);
        m4794c(ub0Var, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        m4794c(ub0Var, "X-CRASHLYTICS-API-CLIENT-VERSION", C1103dm.m24242i());
        m4794c(ub0Var, "Accept", "application/json");
        m4794c(ub0Var, "X-CRASHLYTICS-DEVICE-MODEL", ac1Var.f3056b);
        m4794c(ub0Var, "X-CRASHLYTICS-OS-BUILD-VERSION", ac1Var.f3057c);
        m4794c(ub0Var, "X-CRASHLYTICS-OS-DISPLAY-VERSION", ac1Var.f3058d);
        m4794c(ub0Var, "X-CRASHLYTICS-INSTALLATION-ID", ac1Var.f3059e.mo8304a());
        return ub0Var;
    }

    /* renamed from: c */
    public final void m4794c(ub0 ub0Var, String str, String str2) {
        if (str2 != null) {
            ub0Var.m8354d(str, str2);
        }
    }

    /* renamed from: d */
    public ub0 m4793d(Map<String, String> map) {
        ub0 m7297a = this.f32894b.m7297a(this.f32893a, map);
        return m7297a.m8354d("User-Agent", "Crashlytics Android SDK/" + C1103dm.m24242i()).m8354d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    /* renamed from: e */
    public final JSONObject m4792e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            ml0 ml0Var = this.f32895c;
            ml0Var.m15970l("Failed to parse settings JSON from " + this.f32893a, e);
            ml0 ml0Var2 = this.f32895c;
            ml0Var2.m15971k("Settings response " + str);
            return null;
        }
    }

    /* renamed from: f */
    public final Map<String, String> m4791f(ac1 ac1Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", ac1Var.f3062h);
        hashMap.put("display_version", ac1Var.f3061g);
        hashMap.put("source", Integer.toString(ac1Var.f3063i));
        String str = ac1Var.f3060f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    /* renamed from: g */
    public JSONObject m4790g(wb0 wb0Var) {
        int m6226b = wb0Var.m6226b();
        ml0 ml0Var = this.f32895c;
        ml0Var.m15973i("Settings response code was: " + m6226b);
        if (m4789h(m6226b)) {
            return m4792e(wb0Var.m6227a());
        }
        ml0 ml0Var2 = this.f32895c;
        ml0Var2.m15978d("Settings request failed; (status: " + m6226b + ") from " + this.f32893a);
        return null;
    }

    /* renamed from: h */
    public boolean m4789h(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }
}
