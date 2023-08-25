package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class um3 {
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final List j;
    public final String k;
    public final List l;
    public final List m;
    public final List n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final List t;
    public final String u;
    public final String v;

    public um3(JSONObject jSONObject) {
        List list;
        this.b = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.c = Collections.unmodifiableList(arrayList);
        this.d = jSONObject.optString("allocation_id", null);
        zzt.zzg();
        this.f = wm3.a(jSONObject, "clickurl");
        zzt.zzg();
        this.g = wm3.a(jSONObject, "imp_urls");
        zzt.zzg();
        this.h = wm3.a(jSONObject, "downloaded_imp_urls");
        zzt.zzg();
        this.j = wm3.a(jSONObject, "fill_urls");
        zzt.zzg();
        this.l = wm3.a(jSONObject, "video_start_urls");
        zzt.zzg();
        this.n = wm3.a(jSONObject, "video_complete_urls");
        zzt.zzg();
        this.m = wm3.a(jSONObject, "video_reward_urls");
        this.o = jSONObject.optString("transaction_id");
        this.p = jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            zzt.zzg();
            list = wm3.a(optJSONObject, "manual_impression_urls");
        } else {
            list = null;
        }
        this.i = list;
        this.a = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.k = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.e = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.q = jSONObject.optString("html_template", null);
        this.r = jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        this.s = optJSONObject3 != null ? optJSONObject3.toString() : null;
        zzt.zzg();
        this.t = wm3.a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.u = optJSONObject4 != null ? optJSONObject4.toString() : null;
        this.v = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
