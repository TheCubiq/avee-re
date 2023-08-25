package com.daaw;

import android.text.TextUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class xr implements bc1 {
    public final String a;
    public final vb0 b;
    public final ml0 c;

    public xr(String str, vb0 vb0Var) {
        this(str, vb0Var, ml0.f());
    }

    public xr(String str, vb0 vb0Var, ml0 ml0Var) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.c = ml0Var;
        this.b = vb0Var;
        this.a = str;
    }

    @Override // com.daaw.bc1
    public JSONObject a(ac1 ac1Var, boolean z) {
        if (z) {
            try {
                Map<String, String> f = f(ac1Var);
                ub0 b = b(d(f), ac1Var);
                ml0 ml0Var = this.c;
                ml0Var.b("Requesting settings from " + this.a);
                ml0 ml0Var2 = this.c;
                ml0Var2.i("Settings query params were: " + f);
                return g(b.c());
            } catch (IOException e) {
                this.c.e("Settings request failed.", e);
                return null;
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }

    public final ub0 b(ub0 ub0Var, ac1 ac1Var) {
        c(ub0Var, "X-CRASHLYTICS-GOOGLE-APP-ID", ac1Var.a);
        c(ub0Var, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(ub0Var, "X-CRASHLYTICS-API-CLIENT-VERSION", dm.i());
        c(ub0Var, "Accept", "application/json");
        c(ub0Var, "X-CRASHLYTICS-DEVICE-MODEL", ac1Var.b);
        c(ub0Var, "X-CRASHLYTICS-OS-BUILD-VERSION", ac1Var.c);
        c(ub0Var, "X-CRASHLYTICS-OS-DISPLAY-VERSION", ac1Var.d);
        c(ub0Var, "X-CRASHLYTICS-INSTALLATION-ID", ac1Var.e.a());
        return ub0Var;
    }

    public final void c(ub0 ub0Var, String str, String str2) {
        if (str2 != null) {
            ub0Var.d(str, str2);
        }
    }

    public ub0 d(Map<String, String> map) {
        ub0 a = this.b.a(this.a, map);
        return a.d("User-Agent", "Crashlytics Android SDK/" + dm.i()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    public final JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            ml0 ml0Var = this.c;
            ml0Var.l("Failed to parse settings JSON from " + this.a, e);
            ml0 ml0Var2 = this.c;
            ml0Var2.k("Settings response " + str);
            return null;
        }
    }

    public final Map<String, String> f(ac1 ac1Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", ac1Var.h);
        hashMap.put("display_version", ac1Var.g);
        hashMap.put("source", Integer.toString(ac1Var.i));
        String str = ac1Var.f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public JSONObject g(wb0 wb0Var) {
        int b = wb0Var.b();
        ml0 ml0Var = this.c;
        ml0Var.i("Settings response code was: " + b);
        if (h(b)) {
            return e(wb0Var.a());
        }
        ml0 ml0Var2 = this.c;
        ml0Var2.d("Settings request failed; (status: " + b + ") from " + this.a);
        return null;
    }

    public boolean h(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }
}
