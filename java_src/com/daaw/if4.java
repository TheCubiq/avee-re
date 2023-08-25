package com.daaw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class if4 {
    public final Map a;
    public final Map b;

    public if4(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final void a(fi6 fi6Var) {
        for (di6 di6Var : fi6Var.b.c) {
            if (this.a.containsKey(di6Var.a)) {
                ((lf4) this.a.get(di6Var.a)).b(di6Var.b);
            } else if (this.b.containsKey(di6Var.a)) {
                kf4 kf4Var = (kf4) this.b.get(di6Var.a);
                JSONObject jSONObject = di6Var.b;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                kf4Var.a(hashMap);
            }
        }
    }
}
