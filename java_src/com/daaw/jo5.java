package com.daaw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class jo5 implements fn6 {

    /* renamed from: p */
    public final Map f15279p = new HashMap();

    /* renamed from: q */
    public final Map f15280q = new HashMap();

    /* renamed from: r */
    public final nn6 f15281r;

    public jo5(Set set, nn6 nn6Var) {
        ym6 ym6Var;
        String str;
        ym6 ym6Var2;
        String str2;
        this.f15281r = nn6Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            io5 io5Var = (io5) it.next();
            Map map = this.f15279p;
            ym6Var = io5Var.f13887b;
            str = io5Var.f13886a;
            map.put(ym6Var, str);
            Map map2 = this.f15280q;
            ym6Var2 = io5Var.f13888c;
            str2 = io5Var.f13886a;
            map2.put(ym6Var2, str2);
        }
    }

    @Override // com.daaw.fn6
    /* renamed from: A */
    public final void mo5182A(ym6 ym6Var, String str) {
        this.f15281r.m14951d("task.".concat(String.valueOf(str)));
        if (this.f15279p.containsKey(ym6Var)) {
            this.f15281r.m14951d("label.".concat(String.valueOf((String) this.f15279p.get(ym6Var))));
        }
    }

    @Override // com.daaw.fn6
    /* renamed from: M */
    public final void mo5179M(ym6 ym6Var, String str) {
        this.f15281r.m14950e("task.".concat(String.valueOf(str)), "s.");
        if (this.f15280q.containsKey(ym6Var)) {
            this.f15281r.m14950e("label.".concat(String.valueOf((String) this.f15280q.get(ym6Var))), "s.");
        }
    }

    @Override // com.daaw.fn6
    /* renamed from: S */
    public final void mo5178S(ym6 ym6Var, String str, Throwable th) {
        this.f15281r.m14950e("task.".concat(String.valueOf(str)), "f.");
        if (this.f15280q.containsKey(ym6Var)) {
            this.f15281r.m14950e("label.".concat(String.valueOf((String) this.f15280q.get(ym6Var))), "f.");
        }
    }

    @Override // com.daaw.fn6
    /* renamed from: k */
    public final void mo5172k(ym6 ym6Var, String str) {
    }
}
