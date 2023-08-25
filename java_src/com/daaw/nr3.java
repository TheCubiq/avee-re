package com.daaw;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class nr3 {
    public final boolean a;
    public final String b;

    public nr3(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public static nr3 a(JSONObject jSONObject) {
        return new nr3(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""));
    }
}
