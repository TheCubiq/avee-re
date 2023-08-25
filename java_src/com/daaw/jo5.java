package com.daaw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class jo5 implements fn6 {
    public final Map p = new HashMap();
    public final Map q = new HashMap();
    public final nn6 r;

    public jo5(Set set, nn6 nn6Var) {
        ym6 ym6Var;
        String str;
        ym6 ym6Var2;
        String str2;
        this.r = nn6Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            io5 io5Var = (io5) it.next();
            Map map = this.p;
            ym6Var = io5Var.b;
            str = io5Var.a;
            map.put(ym6Var, str);
            Map map2 = this.q;
            ym6Var2 = io5Var.c;
            str2 = io5Var.a;
            map2.put(ym6Var2, str2);
        }
    }

    @Override // com.daaw.fn6
    public final void A(ym6 ym6Var, String str) {
        this.r.d("task.".concat(String.valueOf(str)));
        if (this.p.containsKey(ym6Var)) {
            this.r.d("label.".concat(String.valueOf((String) this.p.get(ym6Var))));
        }
    }

    @Override // com.daaw.fn6
    public final void M(ym6 ym6Var, String str) {
        this.r.e("task.".concat(String.valueOf(str)), "s.");
        if (this.q.containsKey(ym6Var)) {
            this.r.e("label.".concat(String.valueOf((String) this.q.get(ym6Var))), "s.");
        }
    }

    @Override // com.daaw.fn6
    public final void S(ym6 ym6Var, String str, Throwable th) {
        this.r.e("task.".concat(String.valueOf(str)), "f.");
        if (this.q.containsKey(ym6Var)) {
            this.r.e("label.".concat(String.valueOf((String) this.q.get(ym6Var))), "f.");
        }
    }

    @Override // com.daaw.fn6
    public final void k(ym6 ym6Var, String str) {
    }
}
