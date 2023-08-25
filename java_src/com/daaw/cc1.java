package com.daaw;

import com.daaw.tb1;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class cc1 implements yb1 {
    public static tb1.a b(JSONObject jSONObject) {
        return new tb1.a(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false));
    }

    public static tb1.b c(JSONObject jSONObject) {
        return new tb1.b(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    public static long d(mn mnVar, long j, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return (j * 1000) + mnVar.a();
    }

    @Override // com.daaw.yb1
    public tb1 a(mn mnVar, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new tb1(d(mnVar, optInt2, jSONObject), c(jSONObject.has("session") ? jSONObject.getJSONObject("session") : new JSONObject()), b(jSONObject.getJSONObject("features")), optInt, optInt2, jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d), jSONObject.optDouble("on_demand_backoff_base", 1.2d), jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60));
    }
}
