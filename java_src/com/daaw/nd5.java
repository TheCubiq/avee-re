package com.daaw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class nd5 implements fn6 {

    /* renamed from: q */
    public final fd5 f20062q;

    /* renamed from: r */
    public final InterfaceC0623ag f20063r;

    /* renamed from: p */
    public final Map f20061p = new HashMap();

    /* renamed from: s */
    public final Map f20064s = new HashMap();

    public nd5(fd5 fd5Var, Set set, InterfaceC0623ag interfaceC0623ag) {
        ym6 ym6Var;
        this.f20062q = fd5Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            md5 md5Var = (md5) it.next();
            Map map = this.f20064s;
            ym6Var = md5Var.f18817c;
            map.put(ym6Var, md5Var);
        }
        this.f20063r = interfaceC0623ag;
    }

    @Override // com.daaw.fn6
    /* renamed from: A */
    public final void mo5182A(ym6 ym6Var, String str) {
        this.f20061p.put(ym6Var, Long.valueOf(this.f20063r.mo15859b()));
    }

    @Override // com.daaw.fn6
    /* renamed from: M */
    public final void mo5179M(ym6 ym6Var, String str) {
        if (this.f20061p.containsKey(ym6Var)) {
            this.f20062q.m22773a().put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(this.f20063r.mo15859b() - ((Long) this.f20061p.get(ym6Var)).longValue()))));
        }
        if (this.f20064s.containsKey(ym6Var)) {
            m15219a(ym6Var, true);
        }
    }

    @Override // com.daaw.fn6
    /* renamed from: S */
    public final void mo5178S(ym6 ym6Var, String str, Throwable th) {
        if (this.f20061p.containsKey(ym6Var)) {
            this.f20062q.m22773a().put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(this.f20063r.mo15859b() - ((Long) this.f20061p.get(ym6Var)).longValue()))));
        }
        if (this.f20064s.containsKey(ym6Var)) {
            m15219a(ym6Var, false);
        }
    }

    /* renamed from: a */
    public final void m15219a(ym6 ym6Var, boolean z) {
        ym6 ym6Var2;
        String str;
        ym6Var2 = ((md5) this.f20064s.get(ym6Var)).f18816b;
        String str2 = true != z ? "f." : "s.";
        if (this.f20061p.containsKey(ym6Var2)) {
            long mo15859b = this.f20063r.mo15859b();
            long longValue = ((Long) this.f20061p.get(ym6Var2)).longValue();
            Map m22773a = this.f20062q.m22773a();
            str = ((md5) this.f20064s.get(ym6Var)).f18815a;
            m22773a.put("label.".concat(str), str2.concat(String.valueOf(Long.toString(mo15859b - longValue))));
        }
    }

    @Override // com.daaw.fn6
    /* renamed from: k */
    public final void mo5172k(ym6 ym6Var, String str) {
    }
}
