package com.daaw;

import android.os.Build;
import android.webkit.WebView;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class xq6 {
    public xr6 a;
    public long b;
    public int c;

    public xq6() {
        b();
        this.a = new xr6(null);
    }

    public final WebView a() {
        return (WebView) this.a.get();
    }

    public final void b() {
        this.b = System.nanoTime();
        this.c = 1;
    }

    public void c() {
        this.a.clear();
    }

    public final void d(String str, long j) {
        if (j < this.b || this.c == 3) {
            return;
        }
        this.c = 3;
        qq6.a().f(a(), str);
    }

    public final void e(String str, long j) {
        if (j >= this.b) {
            this.c = 2;
            qq6.a().f(a(), str);
        }
    }

    public void f(xp6 xp6Var, vp6 vp6Var) {
        g(xp6Var, vp6Var, null);
    }

    public final void g(xp6 xp6Var, vp6 vp6Var, JSONObject jSONObject) {
        String h = xp6Var.h();
        JSONObject jSONObject2 = new JSONObject();
        br6.h(jSONObject2, "environment", "app");
        br6.h(jSONObject2, "adSessionType", vp6Var.d());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        br6.h(jSONObject3, "deviceType", str + "; " + str2);
        br6.h(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        br6.h(jSONObject3, "os", "Android");
        br6.h(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        br6.h(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        br6.h(jSONObject4, "partnerName", vp6Var.e().b());
        br6.h(jSONObject4, "partnerVersion", vp6Var.e().c());
        br6.h(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        br6.h(jSONObject5, "libraryVersion", "1.3.37-google_20220829");
        br6.h(jSONObject5, "appId", oq6.b().a().getApplicationContext().getPackageName());
        br6.h(jSONObject2, "app", jSONObject5);
        if (vp6Var.f() != null) {
            br6.h(jSONObject2, "contentUrl", vp6Var.f());
        }
        br6.h(jSONObject2, "customReferenceData", vp6Var.g());
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = vp6Var.h().iterator();
        if (it.hasNext()) {
            gq6 gq6Var = (gq6) it.next();
            throw null;
        } else {
            qq6.a().g(a(), h, jSONObject2, jSONObject6, jSONObject);
        }
    }

    public final void h(float f) {
        qq6.a().e(a(), f);
    }

    public final void i(WebView webView) {
        this.a = new xr6(webView);
    }

    public void j() {
    }

    public final boolean k() {
        return this.a.get() != 0;
    }
}
