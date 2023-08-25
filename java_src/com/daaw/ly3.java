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
    public static ly3 a;

    public static synchronized ly3 d(Context context) {
        synchronized (ly3.class) {
            ly3 ly3Var = a;
            if (ly3Var != null) {
                return ly3Var;
            }
            Context applicationContext = context.getApplicationContext();
            g93.c(applicationContext);
            zzg h = zzt.zzo().h();
            h.zzr(applicationContext);
            lx3 lx3Var = new lx3(null);
            lx3Var.b(applicationContext);
            lx3Var.c(zzt.zzB());
            lx3Var.a(h);
            lx3Var.d(zzt.zzn());
            ly3 e = lx3Var.e();
            a = e;
            e.a().a();
            a.b().c();
            py3 c = a.c();
            if (((Boolean) zzba.zzc().b(g93.o0)).booleanValue()) {
                HashMap hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject((String) zzba.zzc().b(g93.q0));
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
                        c.c(str);
                    }
                    c.d(new ny3(c, hashMap));
                } catch (JSONException e2) {
                    k04.zzf("Failed to parse listening list", e2);
                }
            }
            return a;
        }
    }

    public abstract ex3 a();

    public abstract ix3 b();

    public abstract py3 c();
}
