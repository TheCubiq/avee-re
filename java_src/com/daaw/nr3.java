package com.daaw;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class nr3 {

    /* renamed from: a */
    public final boolean f20604a;

    /* renamed from: b */
    public final String f20605b;

    public nr3(boolean z, String str) {
        this.f20604a = z;
        this.f20605b = str;
    }

    /* renamed from: a */
    public static nr3 m14854a(JSONObject jSONObject) {
        return new nr3(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""));
    }
}
