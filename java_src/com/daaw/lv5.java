package com.daaw;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class lv5 implements sq5 {
    @GuardedBy("this")
    public final Map a = new HashMap();
    public final ya5 b;

    public lv5(ya5 ya5Var) {
        this.b = ya5Var;
    }

    @Override // com.daaw.sq5
    public final tq5 a(String str, JSONObject jSONObject) {
        tq5 tq5Var;
        synchronized (this) {
            tq5Var = (tq5) this.a.get(str);
            if (tq5Var == null) {
                tq5Var = new tq5(this.b.c(str, jSONObject), new zs5(), str);
                this.a.put(str, tq5Var);
            }
        }
        return tq5Var;
    }
}
