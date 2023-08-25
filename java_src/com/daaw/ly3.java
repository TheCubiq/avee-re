package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class ly3 {

    /* renamed from: a */
    public static ly3 f17909a;

    /* renamed from: d */
    public static synchronized ly3 m16372d(Context context) {
        synchronized (ly3.class) {
            ly3 ly3Var = f17909a;
            if (ly3Var != null) {
                return ly3Var;
            }
            Context applicationContext = context.getApplicationContext();
            g93.m21879c(applicationContext);
            zzg m11915h = zzt.zzo().m11915h();
            m11915h.zzr(applicationContext);
            lx3 lx3Var = new lx3(null);
            lx3Var.m16385b(applicationContext);
            lx3Var.m16384c(zzt.zzB());
            lx3Var.m16386a(m11915h);
            lx3Var.m16383d(zzt.zzn());
            ly3 m16382e = lx3Var.m16382e();
            f17909a = m16382e;
            m16382e.mo10847a().m23053a();
            f17909a.mo10846b().m19296c();
            py3 mo10845c = f17909a.mo10845c();
            if (((Boolean) zzba.zzc().m23658b(g93.f10776o0)).booleanValue()) {
                HashMap hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject((String) zzba.zzc().m23658b(g93.f10798q0));
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        HashSet hashSet = new HashSet();
                        JSONArray optJSONArray = jSONObject.optJSONArray(next);
                        if (optJSONArray != null) {
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                String optString = optJSONArray.optString(i);
                                if (optString != null) {
                                    hashSet.add(optString);
                                }
                            }
                            hashMap.put(next, hashSet);
                        }
                    }
                    for (String str : hashMap.keySet()) {
                        mo10845c.m12868c(str);
                    }
                    mo10845c.m12867d(new ny3(mo10845c, hashMap));
                } catch (JSONException e) {
                    k04.zzf("Failed to parse listening list", e);
                }
            }
            return f17909a;
        }
    }

    /* renamed from: a */
    public abstract ex3 mo10847a();

    /* renamed from: b */
    public abstract ix3 mo10846b();

    /* renamed from: c */
    public abstract py3 mo10845c();
}
