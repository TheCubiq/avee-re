package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class px5 {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    public final Executor d;
    public JSONObject e;

    public px5(Executor executor) {
        this.d = executor;
    }

    public static final Bundle l(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final synchronized Map a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Map map = (Map) this.c.get(str);
            if (map == null) {
                return b27.d();
            }
            List<rx5> list = (List) map.get(str2);
            if (list == null) {
                String a = fb5.a(this.e, str2, str);
                if (((Boolean) zzba.zzc().b(g93.Z8)).booleanValue()) {
                    a = a.toLowerCase(Locale.ROOT);
                }
                list = (List) map.get(a);
            }
            if (list == null) {
                return b27.d();
            }
            HashMap hashMap = new HashMap();
            for (rx5 rx5Var : list) {
                String str3 = rx5Var.a;
                if (!hashMap.containsKey(str3)) {
                    hashMap.put(str3, new ArrayList());
                }
                ((List) hashMap.get(str3)).add(rx5Var.c);
            }
            return b27.c(hashMap);
        }
        return b27.d();
    }

    public final synchronized Map b() {
        return b27.c(this.b);
    }

    public final void d() {
        zzt.zzo().h().zzq(new Runnable() { // from class: com.daaw.nx5
            @Override // java.lang.Runnable
            public final void run() {
                px5.this.e();
            }
        });
        this.d.execute(new ox5(this));
    }

    public final /* synthetic */ void e() {
        this.d.execute(new ox5(this));
    }

    public final synchronized void f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.a.containsKey(str)) {
            return;
        }
        this.a.put(str, new rx5(str, "", new Bundle()));
    }

    public final synchronized List g(JSONObject jSONObject, String str) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        Bundle l = l(jSONObject.optJSONObject("data"));
        JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
        if (optJSONArray == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            String optString = optJSONArray.optString(i, "");
            if (!TextUtils.isEmpty(optString)) {
                arrayList2.add(optString);
            }
        }
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str2 = (String) arrayList2.get(i2);
            f(str2);
            if (((rx5) this.a.get(str2)) != null) {
                arrayList.add(new rx5(str2, str, l));
            }
        }
        return arrayList;
    }

    public final synchronized void h() {
        this.b.clear();
        this.a.clear();
        j();
        k();
    }

    public final synchronized void i(String str, String str2, List list) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Map map = (Map) this.c.get(str);
        if (map == null) {
            map = new HashMap();
        }
        this.c.put(str, map);
        List list2 = (List) map.get(str2);
        if (list2 == null) {
            list2 = new ArrayList();
        }
        list2.addAll(list);
        map.put(str2, list2);
    }

    public final synchronized void j() {
        JSONArray optJSONArray;
        JSONObject f = zzt.zzo().h().zzh().f();
        if (f != null) {
            try {
                JSONArray optJSONArray2 = f.optJSONArray("ad_unit_id_settings");
                this.e = f.optJSONObject("ad_unit_patterns");
                if (optJSONArray2 != null) {
                    for (int i = 0; i < optJSONArray2.length(); i++) {
                        JSONObject jSONObject = optJSONArray2.getJSONObject(i);
                        String lowerCase = ((Boolean) zzba.zzc().b(g93.Z8)).booleanValue() ? jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject.optString("ad_unit_id", "");
                        String optString = jSONObject.optString("format", "");
                        ArrayList arrayList = new ArrayList();
                        JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                        if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                arrayList.addAll(g(optJSONArray.getJSONObject(i2), optString));
                            }
                        }
                        i(optString, lowerCase, arrayList);
                    }
                }
            } catch (JSONException e) {
                zze.zzb("Malformed config loading JSON.", e);
            }
        }
    }

    public final synchronized void k() {
        if (!((Boolean) kb3.f.e()).booleanValue()) {
            if (((Boolean) zzba.zzc().b(g93.B1)).booleanValue()) {
                JSONObject f = zzt.zzo().h().zzh().f();
                if (f == null) {
                    return;
                }
                try {
                    JSONArray jSONArray = f.getJSONArray("signal_adapters");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        Bundle l = l(jSONObject.optJSONObject("data"));
                        String optString = jSONObject.optString("adapter_class_name");
                        boolean optBoolean = jSONObject.optBoolean("render", false);
                        boolean optBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(optString)) {
                            this.b.put(optString, new xx5(optString, optBoolean2, optBoolean, l));
                        }
                    }
                } catch (JSONException e) {
                    zze.zzb("Malformed config loading JSON.", e);
                }
            }
        }
    }
}
