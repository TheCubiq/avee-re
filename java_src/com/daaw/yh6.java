package com.daaw;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.zzbu;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class yh6 {
    public final String a;
    public final String b;
    public final JSONObject c;
    public final JSONObject d;

    public yh6(JsonReader jsonReader) {
        JSONObject zzh = zzbu.zzh(jsonReader);
        this.d = zzh;
        this.a = zzh.optString("ad_html", null);
        this.b = zzh.optString("ad_base_url", null);
        this.c = zzh.optJSONObject("ad_json");
    }
}
