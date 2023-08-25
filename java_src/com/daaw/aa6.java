package com.daaw;

import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class aa6 implements h76 {

    /* renamed from: a */
    public final JSONObject f3022a;

    public aa6(JSONObject jSONObject) {
        this.f3022a = jSONObject;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.f3022a);
        } catch (JSONException unused) {
            zze.zza("Unable to get cache_state");
        }
    }
}
