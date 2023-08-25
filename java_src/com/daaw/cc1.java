package com.daaw;

import com.daaw.tb1;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class cc1 implements yb1 {
    /* renamed from: b */
    public static tb1.C3042a m25452b(JSONObject jSONObject) {
        return new tb1.C3042a(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false));
    }

    /* renamed from: c */
    public static tb1.C3043b m25451c(JSONObject jSONObject) {
        return new tb1.C3043b(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    /* renamed from: d */
    public static long m25450d(InterfaceC2196mn interfaceC2196mn, long j, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return (j * 1000) + interfaceC2196mn.mo6059a();
    }

    @Override // com.daaw.yb1
    /* renamed from: a */
    public tb1 mo3943a(InterfaceC2196mn interfaceC2196mn, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new tb1(m25450d(interfaceC2196mn, optInt2, jSONObject), m25451c(jSONObject.has("session") ? jSONObject.getJSONObject("session") : new JSONObject()), m25452b(jSONObject.getJSONObject("features")), optInt, optInt2, jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d), jSONObject.optDouble("on_demand_backoff_base", 1.2d), jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60));
    }
}
