package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public final class ck2 extends ad2 {
    public final List r;
    public final List s;
    public w07 t;

    public ck2(ck2 ck2Var) {
        super(ck2Var.p);
        ArrayList arrayList = new ArrayList(ck2Var.r.size());
        this.r = arrayList;
        arrayList.addAll(ck2Var.r);
        ArrayList arrayList2 = new ArrayList(ck2Var.s.size());
        this.s = arrayList2;
        arrayList2.addAll(ck2Var.s);
        this.t = ck2Var.t;
    }

    public ck2(String str, List list, List list2, w07 w07Var) {
        super(str);
        this.r = new ArrayList();
        this.t = w07Var;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.r.add(((gl2) it.next()).zzi());
            }
        }
        this.s = new ArrayList(list2);
    }

    @Override // com.daaw.ad2
    public final gl2 a(w07 w07Var, List list) {
        String str;
        gl2 gl2Var;
        w07 a = this.t.a();
        for (int i = 0; i < this.r.size(); i++) {
            if (i < list.size()) {
                str = (String) this.r.get(i);
                gl2Var = w07Var.b((gl2) list.get(i));
            } else {
                str = (String) this.r.get(i);
                gl2Var = gl2.g;
            }
            a.e(str, gl2Var);
        }
        for (gl2 gl2Var2 : this.s) {
            gl2 b = a.b(gl2Var2);
            if (b instanceof km2) {
                b = a.b(gl2Var2);
            }
            if (b instanceof oa2) {
                return ((oa2) b).a();
            }
        }
        return gl2.g;
    }

    @Override // com.daaw.ad2, com.daaw.gl2
    public final gl2 zzd() {
        return new ck2(this);
    }
}
