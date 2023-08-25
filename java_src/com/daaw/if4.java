package com.daaw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class if4 {

    /* renamed from: a */
    public final Map f13618a;

    /* renamed from: b */
    public final Map f13619b;

    public if4(Map map, Map map2) {
        this.f13618a = map;
        this.f13619b = map2;
    }

    /* renamed from: a */
    public final void m19850a(fi6 fi6Var) {
        for (di6 di6Var : fi6Var.f9624b.f8509c) {
            if (this.f13618a.containsKey(di6Var.f7130a)) {
                ((lf4) this.f13618a.get(di6Var.f7130a)).mo3778b(di6Var.f7131b);
            } else if (this.f13619b.containsKey(di6Var.f7130a)) {
                kf4 kf4Var = (kf4) this.f13619b.get(di6Var.f7130a);
                JSONObject jSONObject = di6Var.f7131b;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                kf4Var.mo6086a(hashMap);
            }
        }
    }
}
