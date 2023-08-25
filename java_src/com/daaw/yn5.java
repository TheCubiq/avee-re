package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class yn5 {

    /* renamed from: a */
    public final xu3 f33892a;

    public yn5(xu3 xu3Var) {
        this.f33892a = xu3Var;
    }

    /* renamed from: a */
    public static void m3481a(Map map, JSONObject jSONObject) {
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

    /* renamed from: b */
    public final void m3480b() {
        c14.m25685a(this.f33892a.mo4502a(), "persistFlags");
    }
}
