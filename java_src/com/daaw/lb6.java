package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzbu;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class lb6 implements h76 {

    /* renamed from: a */
    public final String f17233a;

    public lb6(String str) {
        this.f17233a = str;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (TextUtils.isEmpty(this.f17233a)) {
                return;
            }
            zzbu.zzf(jSONObject, "pii").put("adsid", this.f17233a);
        } catch (JSONException e) {
            k04.zzk("Failed putting trustless token.", e);
        }
    }
}
