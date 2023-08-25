package com.daaw;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.zzbu;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class yh6 {

    /* renamed from: a */
    public final String f33681a;

    /* renamed from: b */
    public final String f33682b;

    /* renamed from: c */
    public final JSONObject f33683c;

    /* renamed from: d */
    public final JSONObject f33684d;

    public yh6(JsonReader jsonReader) {
        JSONObject zzh = zzbu.zzh(jsonReader);
        this.f33684d = zzh;
        this.f33681a = zzh.optString("ad_html", null);
        this.f33682b = zzh.optString("ad_base_url", null);
        this.f33683c = zzh.optJSONObject("ad_json");
    }
}
