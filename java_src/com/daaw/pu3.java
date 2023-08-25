package com.daaw;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class pu3 {

    /* renamed from: a */
    public final List f23287a;

    /* renamed from: b */
    public final String f23288b;

    /* renamed from: c */
    public final String f23289c;

    /* renamed from: d */
    public final String f23290d;

    /* renamed from: e */
    public final boolean f23291e;

    /* renamed from: f */
    public final boolean f23292f;

    /* renamed from: g */
    public final String f23293g;

    /* renamed from: h */
    public final String f23294h;

    /* renamed from: i */
    public final String f23295i;

    /* renamed from: j */
    public final int f23296j;

    /* renamed from: k */
    public final JSONObject f23297k;

    /* renamed from: l */
    public final String f23298l;

    /* renamed from: m */
    public final String f23299m;

    public pu3(JSONObject jSONObject) {
        this.f23295i = jSONObject.optString("url");
        this.f23288b = jSONObject.optString("base_uri");
        this.f23289c = jSONObject.optString("post_parameters");
        this.f23291e = m13121j(jSONObject.optString("drt_include"));
        this.f23292f = m13121j(jSONObject.optString("cookies_include", "true"));
        this.f23293g = jSONObject.optString("request_id");
        this.f23290d = jSONObject.optString("type");
        String optString = jSONObject.optString("errors");
        this.f23287a = optString == null ? null : Arrays.asList(optString.split(","));
        this.f23296j = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        this.f23294h = jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f23297k = optJSONObject == null ? new JSONObject() : optJSONObject;
        this.f23298l = jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f23299m = jSONObject.optString("pool_key");
    }

    /* renamed from: j */
    public static boolean m13121j(String str) {
        return str != null && (str.equals("1") || str.equals("true"));
    }

    /* renamed from: a */
    public final int m13130a() {
        return this.f23296j;
    }

    /* renamed from: b */
    public final String m13129b() {
        return this.f23288b;
    }

    /* renamed from: c */
    public final String m13128c() {
        return this.f23299m;
    }

    /* renamed from: d */
    public final String m13127d() {
        return this.f23289c;
    }

    /* renamed from: e */
    public final String m13126e() {
        return this.f23295i;
    }

    /* renamed from: f */
    public final List m13125f() {
        return this.f23287a;
    }

    /* renamed from: g */
    public final JSONObject m13124g() {
        return this.f23297k;
    }

    /* renamed from: h */
    public final boolean m13123h() {
        return this.f23292f;
    }

    /* renamed from: i */
    public final boolean m13122i() {
        return this.f23291e;
    }
}
