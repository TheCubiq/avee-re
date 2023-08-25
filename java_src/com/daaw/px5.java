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

    /* renamed from: a */
    public final Map f23511a = new HashMap();

    /* renamed from: b */
    public final Map f23512b = new HashMap();

    /* renamed from: c */
    public final Map f23513c = new HashMap();

    /* renamed from: d */
    public final Executor f23514d;

    /* renamed from: e */
    public JSONObject f23515e;

    public px5(Executor executor) {
        this.f23514d = executor;
    }

    /* renamed from: l */
    public static final Bundle m12887l(JSONObject jSONObject) {
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

    /* renamed from: a */
    public final synchronized Map m12898a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Map map = (Map) this.f23513c.get(str);
            if (map == null) {
                return b27.m26518d();
            }
            List<rx5> list = (List) map.get(str2);
            if (list == null) {
                String m22812a = fb5.m22812a(this.f23515e, str2, str);
                if (((Boolean) zzba.zzc().m23658b(g93.f10620Z8)).booleanValue()) {
                    m22812a = m22812a.toLowerCase(Locale.ROOT);
                }
                list = (List) map.get(m22812a);
            }
            if (list == null) {
                return b27.m26518d();
            }
            HashMap hashMap = new HashMap();
            for (rx5 rx5Var : list) {
                String str3 = rx5Var.f25699a;
                if (!hashMap.containsKey(str3)) {
                    hashMap.put(str3, new ArrayList());
                }
                ((List) hashMap.get(str3)).add(rx5Var.f25701c);
            }
            return b27.m26519c(hashMap);
        }
        return b27.m26518d();
    }

    /* renamed from: b */
    public final synchronized Map m12897b() {
        return b27.m26519c(this.f23512b);
    }

    /* renamed from: d */
    public final void m12895d() {
        zzt.zzo().m11915h().zzq(new Runnable() { // from class: com.daaw.nx5
            @Override // java.lang.Runnable
            public final void run() {
                px5.this.m12894e();
            }
        });
        this.f23514d.execute(new ox5(this));
    }

    /* renamed from: e */
    public final /* synthetic */ void m12894e() {
        this.f23514d.execute(new ox5(this));
    }

    /* renamed from: f */
    public final synchronized void m12893f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f23511a.containsKey(str)) {
            return;
        }
        this.f23511a.put(str, new rx5(str, "", new Bundle()));
    }

    /* renamed from: g */
    public final synchronized List m12892g(JSONObject jSONObject, String str) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        Bundle m12887l = m12887l(jSONObject.optJSONObject("data"));
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
            m12893f(str2);
            if (((rx5) this.f23511a.get(str2)) != null) {
                arrayList.add(new rx5(str2, str, m12887l));
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public final synchronized void m12891h() {
        this.f23512b.clear();
        this.f23511a.clear();
        m12889j();
        m12888k();
    }

    /* renamed from: i */
    public final synchronized void m12890i(String str, String str2, List list) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Map map = (Map) this.f23513c.get(str);
        if (map == null) {
            map = new HashMap();
        }
        this.f23513c.put(str, map);
        List list2 = (List) map.get(str2);
        if (list2 == null) {
            list2 = new ArrayList();
        }
        list2.addAll(list);
        map.put(str2, list2);
    }

    /* renamed from: j */
    public final synchronized void m12889j() {
        JSONArray optJSONArray;
        JSONObject m17291f = zzt.zzo().m11915h().zzh().m17291f();
        if (m17291f != null) {
            try {
                JSONArray optJSONArray2 = m17291f.optJSONArray("ad_unit_id_settings");
                this.f23515e = m17291f.optJSONObject("ad_unit_patterns");
                if (optJSONArray2 != null) {
                    for (int i = 0; i < optJSONArray2.length(); i++) {
                        JSONObject jSONObject = optJSONArray2.getJSONObject(i);
                        String lowerCase = ((Boolean) zzba.zzc().m23658b(g93.f10620Z8)).booleanValue() ? jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject.optString("ad_unit_id", "");
                        String optString = jSONObject.optString("format", "");
                        ArrayList arrayList = new ArrayList();
                        JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                        if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                arrayList.addAll(m12892g(optJSONArray.getJSONObject(i2), optString));
                            }
                        }
                        m12890i(optString, lowerCase, arrayList);
                    }
                }
            } catch (JSONException e) {
                zze.zzb("Malformed config loading JSON.", e);
            }
        }
    }

    /* renamed from: k */
    public final synchronized void m12888k() {
        if (!((Boolean) kb3.f16118f.m16137e()).booleanValue()) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10372B1)).booleanValue()) {
                JSONObject m17291f = zzt.zzo().m11915h().zzh().m17291f();
                if (m17291f == null) {
                    return;
                }
                try {
                    JSONArray jSONArray = m17291f.getJSONArray("signal_adapters");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        Bundle m12887l = m12887l(jSONObject.optJSONObject("data"));
                        String optString = jSONObject.optString("adapter_class_name");
                        boolean optBoolean = jSONObject.optBoolean("render", false);
                        boolean optBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(optString)) {
                            this.f23512b.put(optString, new xx5(optString, optBoolean2, optBoolean, m12887l));
                        }
                    }
                } catch (JSONException e) {
                    zze.zzb("Malformed config loading JSON.", e);
                }
            }
        }
    }
}
