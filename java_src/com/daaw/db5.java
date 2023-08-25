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
    public final Map a = new ConcurrentHashMap();
    public JSONObject b;
    public final Executor c;
    public boolean d;
    public JSONObject e;

    public db5(Executor executor) {
        this.c = executor;
    }

    @CheckForNull
    public final JSONObject a() {
        if (((Boolean) zzba.zzc().b(g93.x3)).booleanValue()) {
            return this.b;
        }
        return null;
    }

    @CheckForNull
    public final JSONObject b(String str, String str2) {
        if (!((Boolean) zzba.zzc().b(g93.w3)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.d) {
            f();
        }
        Map map = (Map) this.a.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String a = fb5.a(this.e, str, str2);
        if (a == null) {
            return null;
        }
        return (JSONObject) map.get(a);
    }

    public final void c() {
        zzt.zzo().h().zzq(new Runnable() { // from class: com.daaw.ab5
            @Override // java.lang.Runnable
            public final void run() {
                db5.this.e();
            }
        });
        this.c.execute(new Runnable() { // from class: com.daaw.bb5
            @Override // java.lang.Runnable
            public final void run() {
                db5.this.f();
            }
        });
    }

    public final /* synthetic */ void e() {
        this.c.execute(new Runnable() { // from class: com.daaw.cb5
            @Override // java.lang.Runnable
            public final void run() {
                db5.this.d();
            }
        });
    }

    /* renamed from: g */
    public final synchronized void f() {
        Map map;
        this.d = true;
        kz3 zzh = zzt.zzo().h().zzh();
        if (zzh == null) {
            return;
        }
        JSONObject f = zzh.f();
        if (f == null) {
            return;
        }
        this.b = ((Boolean) zzba.zzc().b(g93.x3)).booleanValue() ? f.optJSONObject("common_settings") : null;
        this.e = f.optJSONObject("ad_unit_patterns");
        JSONArray optJSONArray = f.optJSONArray("ad_unit_id_settings");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("ad_unit_id");
                    String optString2 = optJSONObject.optString("format");
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                    if (optString != null && optJSONObject2 != null && optString2 != null) {
                        if (this.a.containsKey(optString2)) {
                            map = (Map) this.a.get(optString2);
                        } else {
                            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                            this.a.put(optString2, concurrentHashMap);
                            map = concurrentHashMap;
                        }
                        map.put(optString, optJSONObject2);
                    }
                }
            }
        }
    }
}
