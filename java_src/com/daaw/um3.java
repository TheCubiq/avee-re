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

    /* renamed from: a */
    public final String f29189a;

    /* renamed from: b */
    public final String f29190b;

    /* renamed from: c */
    public final List f29191c;

    /* renamed from: d */
    public final String f29192d;

    /* renamed from: e */
    public final String f29193e;

    /* renamed from: f */
    public final List f29194f;

    /* renamed from: g */
    public final List f29195g;

    /* renamed from: h */
    public final List f29196h;

    /* renamed from: i */
    public final List f29197i;

    /* renamed from: j */
    public final List f29198j;

    /* renamed from: k */
    public final String f29199k;

    /* renamed from: l */
    public final List f29200l;

    /* renamed from: m */
    public final List f29201m;

    /* renamed from: n */
    public final List f29202n;

    /* renamed from: o */
    public final String f29203o;

    /* renamed from: p */
    public final String f29204p;

    /* renamed from: q */
    public final String f29205q;

    /* renamed from: r */
    public final String f29206r;

    /* renamed from: s */
    public final String f29207s;

    /* renamed from: t */
    public final List f29208t;

    /* renamed from: u */
    public final String f29209u;

    /* renamed from: v */
    public final String f29210v;

    public um3(JSONObject jSONObject) {
        List list;
        this.f29190b = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f29191c = Collections.unmodifiableList(arrayList);
        this.f29192d = jSONObject.optString("allocation_id", null);
        zzt.zzg();
        this.f29194f = wm3.m5979a(jSONObject, "clickurl");
        zzt.zzg();
        this.f29195g = wm3.m5979a(jSONObject, "imp_urls");
        zzt.zzg();
        this.f29196h = wm3.m5979a(jSONObject, "downloaded_imp_urls");
        zzt.zzg();
        this.f29198j = wm3.m5979a(jSONObject, "fill_urls");
        zzt.zzg();
        this.f29200l = wm3.m5979a(jSONObject, "video_start_urls");
        zzt.zzg();
        this.f29202n = wm3.m5979a(jSONObject, "video_complete_urls");
        zzt.zzg();
        this.f29201m = wm3.m5979a(jSONObject, "video_reward_urls");
        this.f29203o = jSONObject.optString("transaction_id");
        this.f29204p = jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            zzt.zzg();
            list = wm3.m5979a(optJSONObject, "manual_impression_urls");
        } else {
            list = null;
        }
        this.f29197i = list;
        this.f29189a = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.f29199k = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.f29193e = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.f29205q = jSONObject.optString("html_template", null);
        this.f29206r = jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        this.f29207s = optJSONObject3 != null ? optJSONObject3.toString() : null;
        zzt.zzg();
        this.f29208t = wm3.m5979a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.f29209u = optJSONObject4 != null ? optJSONObject4.toString() : null;
        this.f29210v = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
