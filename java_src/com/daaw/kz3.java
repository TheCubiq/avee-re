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

    /* renamed from: d */
    public String f16898d;

    /* renamed from: e */
    public String f16899e;

    /* renamed from: f */
    public long f16900f;

    /* renamed from: g */
    public JSONObject f16901g;

    /* renamed from: h */
    public boolean f16902h;

    /* renamed from: j */
    public boolean f16904j;

    /* renamed from: a */
    public final List f16895a = new ArrayList();

    /* renamed from: b */
    public final List f16896b = new ArrayList();

    /* renamed from: c */
    public final Map f16897c = new HashMap();

    /* renamed from: i */
    public final List f16903i = new ArrayList();

    public kz3(String str, long j) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        JSONObject optJSONObject3;
        this.f16902h = false;
        this.f16904j = false;
        this.f16899e = str;
        this.f16900f = j;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f16901g = jSONObject;
            if (jSONObject.optInt("status", -1) != 1) {
                this.f16902h = false;
                k04.zzj("App settings could not be fetched successfully.");
                return;
            }
            this.f16902h = true;
            this.f16898d = this.f16901g.optString("app_id");
            JSONArray optJSONArray2 = this.f16901g.optJSONArray("ad_unit_id_settings");
            if (optJSONArray2 != null) {
                for (int i = 0; i < optJSONArray2.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray2.getJSONObject(i);
                    String optString = jSONObject2.optString("format");
                    String optString2 = jSONObject2.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        if ("interstitial".equalsIgnoreCase(optString)) {
                            this.f16896b.add(optString2);
                        } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject3 = jSONObject2.optJSONObject("mediation_config")) != null) {
                            this.f16897c.put(optString2, new vm3(optJSONObject3));
                        }
                    }
                }
            }
            JSONArray optJSONArray3 = this.f16901g.optJSONArray("persistable_banner_ad_unit_ids");
            if (optJSONArray3 != null) {
                for (int i2 = 0; i2 < optJSONArray3.length(); i2++) {
                    this.f16895a.add(optJSONArray3.optString(i2));
                }
            }
            if (((Boolean) zzba.zzc().m23658b(g93.f10793p6)).booleanValue() && (optJSONObject2 = this.f16901g.optJSONObject("common_settings")) != null && (optJSONArray = optJSONObject2.optJSONArray("loeid")) != null) {
                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                    this.f16903i.add(optJSONArray.get(i3).toString());
                }
            }
            if (!((Boolean) zzba.zzc().m23658b(g93.f10467K5)).booleanValue() || (optJSONObject = this.f16901g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.f16904j = optJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e) {
            k04.zzk("Exception occurred while processing app setting json", e);
            zzt.zzo().m11902u(e, "AppSettings.parseAppSettingsJson");
        }
    }

    /* renamed from: a */
    public final long m17296a() {
        return this.f16900f;
    }

    /* renamed from: b */
    public final String m17295b() {
        return this.f16898d;
    }

    /* renamed from: c */
    public final String m17294c() {
        return this.f16899e;
    }

    /* renamed from: d */
    public final List m17293d() {
        return this.f16903i;
    }

    /* renamed from: e */
    public final Map m17292e() {
        return this.f16897c;
    }

    /* renamed from: f */
    public final JSONObject m17291f() {
        return this.f16901g;
    }

    /* renamed from: g */
    public final void m17290g(long j) {
        this.f16900f = j;
    }

    /* renamed from: h */
    public final boolean m17289h() {
        return this.f16904j;
    }

    /* renamed from: i */
    public final boolean m17288i() {
        return this.f16902h;
    }
}
