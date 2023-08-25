package com.daaw;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class lv5 implements sq5 {
    @GuardedBy("this")

    /* renamed from: a */
    public final Map f17821a = new HashMap();

    /* renamed from: b */
    public final ya5 f17822b;

    public lv5(ya5 ya5Var) {
        this.f17822b = ya5Var;
    }

    @Override // com.daaw.sq5
    /* renamed from: a */
    public final tq5 mo9886a(String str, JSONObject jSONObject) {
        tq5 tq5Var;
        synchronized (this) {
            tq5Var = (tq5) this.f17821a.get(str);
            if (tq5Var == null) {
                tq5Var = new tq5(this.f17822b.m3950c(str, jSONObject), new zs5(), str);
                this.f17821a.put(str, tq5Var);
            }
        }
        return tq5Var;
    }
}
