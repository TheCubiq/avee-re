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
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final String g;
    public final String h;

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
                "banner".equalsIgnoreCase(um3Var.v);
                arrayList.add(um3Var);
                if (i < 0) {
                    Iterator it = um3Var.c.iterator();
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
        this.a = Collections.unmodifiableList(arrayList);
        this.g = jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject == null) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.h = null;
            return;
        }
        optJSONObject.optLong("ad_network_timeout_millis", -1L);
        zzt.zzg();
        this.b = wm3.a(optJSONObject, "click_urls");
        zzt.zzg();
        this.c = wm3.a(optJSONObject, "imp_urls");
        zzt.zzg();
        this.d = wm3.a(optJSONObject, "downloaded_imp_urls");
        zzt.zzg();
        this.e = wm3.a(optJSONObject, "nofill_urls");
        zzt.zzg();
        this.f = wm3.a(optJSONObject, "remote_ping_urls");
        optJSONObject.optBoolean("render_in_browser", false);
        optJSONObject.optLong("refresh", -1L);
        zzcdd h = zzcdd.h(optJSONObject.optJSONArray("rewards"));
        this.h = h != null ? h.p : null;
        optJSONObject.optBoolean("use_displayed_impression", false);
        optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
        optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
        optJSONObject.optBoolean("allow_custom_click_gesture", false);
    }
}
