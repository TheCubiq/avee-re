package com.daaw;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcdd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class vm3 {

    /* renamed from: a */
    public final List f30321a;

    /* renamed from: b */
    public final List f30322b;

    /* renamed from: c */
    public final List f30323c;

    /* renamed from: d */
    public final List f30324d;

    /* renamed from: e */
    public final List f30325e;

    /* renamed from: f */
    public final List f30326f;

    /* renamed from: g */
    public final String f30327g;

    /* renamed from: h */
    public final String f30328h;

    public vm3(JSONObject jSONObject) {
        if (k04.zzm(2)) {
            zze.zza("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                um3 um3Var = new um3(jSONArray.getJSONObject(i2));
                "banner".equalsIgnoreCase(um3Var.f29210v);
                arrayList.add(um3Var);
                if (i < 0) {
                    Iterator it = um3Var.f29191c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i = i2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.f30321a = Collections.unmodifiableList(arrayList);
        this.f30327g = jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject == null) {
            this.f30322b = null;
            this.f30323c = null;
            this.f30324d = null;
            this.f30325e = null;
            this.f30326f = null;
            this.f30328h = null;
            return;
        }
        optJSONObject.optLong("ad_network_timeout_millis", -1L);
        zzt.zzg();
        this.f30322b = wm3.m5979a(optJSONObject, "click_urls");
        zzt.zzg();
        this.f30323c = wm3.m5979a(optJSONObject, "imp_urls");
        zzt.zzg();
        this.f30324d = wm3.m5979a(optJSONObject, "downloaded_imp_urls");
        zzt.zzg();
        this.f30325e = wm3.m5979a(optJSONObject, "nofill_urls");
        zzt.zzg();
        this.f30326f = wm3.m5979a(optJSONObject, "remote_ping_urls");
        optJSONObject.optBoolean("render_in_browser", false);
        optJSONObject.optLong("refresh", -1L);
        zzcdd m1095h = zzcdd.m1095h(optJSONObject.optJSONArray("rewards"));
        this.f30328h = m1095h != null ? m1095h.f36977p : null;
        optJSONObject.optBoolean("use_displayed_impression", false);
        optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
        optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
        optJSONObject.optBoolean("allow_custom_click_gesture", false);
    }
}
