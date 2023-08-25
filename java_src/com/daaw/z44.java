package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class z44 implements Iterable {

    /* renamed from: p */
    public final List f34449p = new ArrayList();

    /* renamed from: d */
    public final y44 m2820d(y24 y24Var) {
        Iterator it = iterator();
        while (it.hasNext()) {
            y44 y44Var = (y44) it.next();
            if (y44Var.f33350c == y24Var) {
                return y44Var;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m2819e(y44 y44Var) {
        this.f34449p.add(y44Var);
    }

    /* renamed from: f */
    public final void m2818f(y44 y44Var) {
        this.f34449p.remove(y44Var);
    }

    /* renamed from: h */
    public final boolean m2817h(y24 y24Var) {
        ArrayList<y44> arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            y44 y44Var = (y44) it.next();
            if (y44Var.f33350c == y24Var) {
                arrayList.add(y44Var);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (y44 y44Var2 : arrayList) {
            y44Var2.f33351d.mo10703h();
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f34449p.iterator();
    }
}
