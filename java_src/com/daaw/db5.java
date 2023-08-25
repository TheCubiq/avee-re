package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class db5 {

    /* renamed from: a */
    public final Map f6895a = new ConcurrentHashMap();

    /* renamed from: b */
    public JSONObject f6896b;

    /* renamed from: c */
    public final Executor f6897c;

    /* renamed from: d */
    public boolean f6898d;

    /* renamed from: e */
    public JSONObject f6899e;

    public db5(Executor executor) {
        this.f6897c = executor;
    }

    @CheckForNull
    /* renamed from: a */
    public final JSONObject m24567a() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10878x3)).booleanValue()) {
            return this.f6896b;
        }
        return null;
    }

    @CheckForNull
    /* renamed from: b */
    public final JSONObject m24566b(String str, String str2) {
        if (!((Boolean) zzba.zzc().m23658b(g93.f10867w3)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.f6898d) {
            m24562f();
        }
        Map map = (Map) this.f6895a.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String m22812a = fb5.m22812a(this.f6899e, str, str2);
        if (m22812a == null) {
            return null;
        }
        return (JSONObject) map.get(m22812a);
    }

    /* renamed from: c */
    public final void m24565c() {
        zzt.zzo().m11915h().zzq(new Runnable() { // from class: com.daaw.ab5
            @Override // java.lang.Runnable
            public final void run() {
                db5.this.m24563e();
            }
        });
        this.f6897c.execute(new Runnable() { // from class: com.daaw.bb5
            @Override // java.lang.Runnable
            public final void run() {
                db5.this.m24562f();
            }
        });
    }

    /* renamed from: e */
    public final /* synthetic */ void m24563e() {
        this.f6897c.execute(new Runnable() { // from class: com.daaw.cb5
            @Override // java.lang.Runnable
            public final void run() {
                db5.this.m24564d();
            }
        });
    }

    /* renamed from: g */
    public final synchronized void m24562f() {
        Map map;
        this.f6898d = true;
        kz3 zzh = zzt.zzo().m11915h().zzh();
        if (zzh == null) {
            return;
        }
        JSONObject m17291f = zzh.m17291f();
        if (m17291f == null) {
            return;
        }
        this.f6896b = ((Boolean) zzba.zzc().m23658b(g93.f10878x3)).booleanValue() ? m17291f.optJSONObject("common_settings") : null;
        this.f6899e = m17291f.optJSONObject("ad_unit_patterns");
        JSONArray optJSONArray = m17291f.optJSONArray("ad_unit_id_settings");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("ad_unit_id");
                    String optString2 = optJSONObject.optString("format");
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                    if (optString != null && optJSONObject2 != null && optString2 != null) {
                        if (this.f6895a.containsKey(optString2)) {
                            map = (Map) this.f6895a.get(optString2);
                        } else {
                            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                            this.f6895a.put(optString2, concurrentHashMap);
                            map = concurrentHashMap;
                        }
                        map.put(optString, optJSONObject2);
                    }
                }
            }
        }
    }
}
