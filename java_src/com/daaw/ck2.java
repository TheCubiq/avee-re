package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public final class ck2 extends ad2 {

    /* renamed from: r */
    public final List f5929r;

    /* renamed from: s */
    public final List f5930s;

    /* renamed from: t */
    public w07 f5931t;

    public ck2(ck2 ck2Var) {
        super(ck2Var.f3097p);
        ArrayList arrayList = new ArrayList(ck2Var.f5929r.size());
        this.f5929r = arrayList;
        arrayList.addAll(ck2Var.f5929r);
        ArrayList arrayList2 = new ArrayList(ck2Var.f5930s.size());
        this.f5930s = arrayList2;
        arrayList2.addAll(ck2Var.f5930s);
        this.f5931t = ck2Var.f5931t;
    }

    public ck2(String str, List list, List list2, w07 w07Var) {
        super(str);
        this.f5929r = new ArrayList();
        this.f5931t = w07Var;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f5929r.add(((gl2) it.next()).zzi());
            }
        }
        this.f5930s = new ArrayList(list2);
    }

    @Override // com.daaw.ad2
    /* renamed from: a */
    public final gl2 mo5780a(w07 w07Var, List list) {
        String str;
        gl2 gl2Var;
        w07 m6609a = this.f5931t.m6609a();
        for (int i = 0; i < this.f5929r.size(); i++) {
            if (i < list.size()) {
                str = (String) this.f5929r.get(i);
                gl2Var = w07Var.m6608b((gl2) list.get(i));
            } else {
                str = (String) this.f5929r.get(i);
                gl2Var = gl2.f11420g;
            }
            m6609a.m6605e(str, gl2Var);
        }
        for (gl2 gl2Var2 : this.f5930s) {
            gl2 m6608b = m6609a.m6608b(gl2Var2);
            if (m6608b instanceof km2) {
                m6608b = m6609a.m6608b(gl2Var2);
            }
            if (m6608b instanceof oa2) {
                return ((oa2) m6608b).m14433a();
            }
        }
        return gl2.f11420g;
    }

    @Override // com.daaw.ad2, com.daaw.gl2
    public final gl2 zzd() {
        return new ck2(this);
    }
}
