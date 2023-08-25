package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzbu;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class lb6 implements h76 {
    public final String a;

    public lb6(String str) {
        this.a = str;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (TextUtils.isEmpty(this.a)) {
                return;
            }
            zzbu.zzf(jSONObject, "pii").put("adsid", this.a);
        } catch (JSONException e) {
            k04.zzk("Failed putting trustless token.", e);
        }
    }
}
