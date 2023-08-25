package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class kz3 {
    public String d;
    public String e;
    public long f;
    public JSONObject g;
    public boolean h;
    public boolean j;
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final Map c = new HashMap();
    public final List i = new ArrayList();

    public kz3(String str, long j) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        JSONObject optJSONObject3;
        this.h = false;
        this.j = false;
        this.e = str;
        this.f = j;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.g = jSONObject;
            if (jSONObject.optInt("status", -1) != 1) {
                this.h = false;
                k04.zzj("App settings could not be fetched successfully.");
                return;
            }
            this.h = true;
            this.d = this.g.optString("app_id");
            JSONArray optJSONArray2 = this.g.optJSONArray("ad_unit_id_settings");
            if (optJSONArray2 != null) {
                for (int i = 0; i < optJSONArray2.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray2.getJSONObject(i);
                    String optString = jSONObject2.optString("format");
                    String optString2 = jSONObject2.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        if ("interstitial".equalsIgnoreCase(optString)) {
                            this.b.add(optString2);
                        } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject3 = jSONObject2.optJSONObject("mediation_config")) != null) {
                            this.c.put(optString2, new vm3(optJSONObject3));
                        }
                    }
                }
            }
            JSONArray optJSONArray3 = this.g.optJSONArray("persistable_banner_ad_unit_ids");
            if (optJSONArray3 != null) {
                for (int i2 = 0; i2 < optJSONArray3.length(); i2++) {
                    this.a.add(optJSONArray3.optString(i2));
                }
            }
            if (((Boolean) zzba.zzc().b(g93.p6)).booleanValue() && (optJSONObject2 = this.g.optJSONObject("common_settings")) != null && (optJSONArray = optJSONObject2.optJSONArray("loeid")) != null) {
                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                    this.i.add(optJSONArray.get(i3).toString());
                }
            }
            if (!((Boolean) zzba.zzc().b(g93.K5)).booleanValue() || (optJSONObject = this.g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.j = optJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e) {
            k04.zzk("Exception occurred while processing app setting json", e);
            zzt.zzo().u(e, "AppSettings.parseAppSettingsJson");
        }
    }

    public final long a() {
        return this.f;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final List d() {
        return this.i;
    }

    public final Map e() {
        return this.c;
    }

    public final JSONObject f() {
        return this.g;
    }

    public final void g(long j) {
        this.f = j;
    }

    public final boolean h() {
        return this.j;
    }

    public final boolean i() {
        return this.h;
    }
}
