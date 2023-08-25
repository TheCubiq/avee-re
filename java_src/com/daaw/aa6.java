package com.daaw;

import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class aa6 implements h76 {
    public final JSONObject a;

    public aa6(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.a);
        } catch (JSONException unused) {
            zze.zza("Unable to get cache_state");
        }
    }
}
