package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class yn5 {
    public final xu3 a;

    public yn5(xu3 xu3Var) {
        this.a = xu3Var;
    }

    public static void a(Map map, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("pii");
        if (optJSONObject == null) {
            zze.zza("DSID signal does not exist.");
            return;
        }
        if (!TextUtils.isEmpty(optJSONObject.optString("doritos", ""))) {
            map.put("x-afma-drt-cookie", optJSONObject.optString("doritos", ""));
        }
        if (TextUtils.isEmpty(optJSONObject.optString("doritos_v2", ""))) {
            return;
        }
        map.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", ""));
    }

    public final void b() {
        c14.a(this.a.a(), "persistFlags");
    }
}
