package com.daaw;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class pu3 {
    public final List a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final JSONObject k;
    public final String l;
    public final String m;

    public pu3(JSONObject jSONObject) {
        this.i = jSONObject.optString("url");
        this.b = jSONObject.optString("base_uri");
        this.c = jSONObject.optString("post_parameters");
        this.e = j(jSONObject.optString("drt_include"));
        this.f = j(jSONObject.optString("cookies_include", "true"));
        this.g = jSONObject.optString("request_id");
        this.d = jSONObject.optString("type");
        String optString = jSONObject.optString("errors");
        this.a = optString == null ? null : Arrays.asList(optString.split(","));
        this.j = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        this.h = jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.k = optJSONObject == null ? new JSONObject() : optJSONObject;
        this.l = jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.m = jSONObject.optString("pool_key");
    }

    public static boolean j(String str) {
        return str != null && (str.equals("1") || str.equals("true"));
    }

    public final int a() {
        return this.j;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.m;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.i;
    }

    public final List f() {
        return this.a;
    }

    public final JSONObject g() {
        return this.k;
    }

    public final boolean h() {
        return this.f;
    }

    public final boolean i() {
        return this.e;
    }
}
