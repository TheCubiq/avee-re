package com.daaw;

import android.os.Build;
import android.webkit.WebView;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class xq6 {

    /* renamed from: a */
    public xr6 f32889a;

    /* renamed from: b */
    public long f32890b;

    /* renamed from: c */
    public int f32891c;

    public xq6() {
        m4810b();
        this.f32889a = new xr6(null);
    }

    /* renamed from: a */
    public final WebView m4811a() {
        return (WebView) this.f32889a.get();
    }

    /* renamed from: b */
    public final void m4810b() {
        this.f32890b = System.nanoTime();
        this.f32891c = 1;
    }

    /* renamed from: c */
    public void mo4809c() {
        this.f32889a.clear();
    }

    /* renamed from: d */
    public final void m4808d(String str, long j) {
        if (j < this.f32890b || this.f32891c == 3) {
            return;
        }
        this.f32891c = 3;
        qq6.m12283a().m12278f(m4811a(), str);
    }

    /* renamed from: e */
    public final void m4807e(String str, long j) {
        if (j >= this.f32890b) {
            this.f32891c = 2;
            qq6.m12283a().m12278f(m4811a(), str);
        }
    }

    /* renamed from: f */
    public void mo4806f(xp6 xp6Var, vp6 vp6Var) {
        m4805g(xp6Var, vp6Var, null);
    }

    /* renamed from: g */
    public final void m4805g(xp6 xp6Var, vp6 vp6Var, JSONObject jSONObject) {
        String m4830h = xp6Var.m4830h();
        JSONObject jSONObject2 = new JSONObject();
        br6.m25875h(jSONObject2, "environment", "app");
        br6.m25875h(jSONObject2, "adSessionType", vp6Var.m6948d());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        br6.m25875h(jSONObject3, "deviceType", str + "; " + str2);
        br6.m25875h(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        br6.m25875h(jSONObject3, "os", "Android");
        br6.m25875h(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        br6.m25875h(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        br6.m25875h(jSONObject4, "partnerName", vp6Var.m6947e().m22401b());
        br6.m25875h(jSONObject4, "partnerVersion", vp6Var.m6947e().m22400c());
        br6.m25875h(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        br6.m25875h(jSONObject5, "libraryVersion", "1.3.37-google_20220829");
        br6.m25875h(jSONObject5, "appId", oq6.m14068b().m14069a().getApplicationContext().getPackageName());
        br6.m25875h(jSONObject2, "app", jSONObject5);
        if (vp6Var.m6946f() != null) {
            br6.m25875h(jSONObject2, "contentUrl", vp6Var.m6946f());
        }
        br6.m25875h(jSONObject2, "customReferenceData", vp6Var.m6945g());
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = vp6Var.m6944h().iterator();
        if (it.hasNext()) {
            gq6 gq6Var = (gq6) it.next();
            throw null;
        } else {
            qq6.m12283a().m12277g(m4811a(), m4830h, jSONObject2, jSONObject6, jSONObject);
        }
    }

    /* renamed from: h */
    public final void m4804h(float f) {
        qq6.m12283a().m12279e(m4811a(), f);
    }

    /* renamed from: i */
    public final void m4803i(WebView webView) {
        this.f32889a = new xr6(webView);
    }

    /* renamed from: j */
    public void mo4802j() {
    }

    /* renamed from: k */
    public final boolean m4801k() {
        return this.f32889a.get() != 0;
    }
}
