package com.daaw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class nd5 implements fn6 {
    public final fd5 q;
    public final ag r;
    public final Map p = new HashMap();
    public final Map s = new HashMap();

    public nd5(fd5 fd5Var, Set set, ag agVar) {
        ym6 ym6Var;
        this.q = fd5Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            md5 md5Var = (md5) it.next();
            Map map = this.s;
            ym6Var = md5Var.c;
            map.put(ym6Var, md5Var);
        }
        this.r = agVar;
    }

    @Override // com.daaw.fn6
    public final void A(ym6 ym6Var, String str) {
        this.p.put(ym6Var, Long.valueOf(this.r.b()));
    }

    @Override // com.daaw.fn6
    public final void M(ym6 ym6Var, String str) {
        if (this.p.containsKey(ym6Var)) {
            this.q.a().put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(this.r.b() - ((Long) this.p.get(ym6Var)).longValue()))));
        }
        if (this.s.containsKey(ym6Var)) {
            a(ym6Var, true);
        }
    }

    @Override // com.daaw.fn6
    public final void S(ym6 ym6Var, String str, Throwable th) {
        if (this.p.containsKey(ym6Var)) {
            this.q.a().put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(this.r.b() - ((Long) this.p.get(ym6Var)).longValue()))));
        }
        if (this.s.containsKey(ym6Var)) {
            a(ym6Var, false);
        }
    }

    public final void a(ym6 ym6Var, boolean z) {
        ym6 ym6Var2;
        String str;
        ym6Var2 = ((md5) this.s.get(ym6Var)).b;
        String str2 = true != z ? "f." : "s.";
        if (this.p.containsKey(ym6Var2)) {
            long b = this.r.b();
            long longValue = ((Long) this.p.get(ym6Var2)).longValue();
            Map a = this.q.a();
            str = ((md5) this.s.get(ym6Var)).a;
            a.put("label.".concat(str), str2.concat(String.valueOf(Long.toString(b - longValue))));
        }
    }

    @Override // com.daaw.fn6
    public final void k(ym6 ym6Var, String str) {
    }
}
