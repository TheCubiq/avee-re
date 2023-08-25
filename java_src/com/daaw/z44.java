package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class z44 implements Iterable {
    public final List p = new ArrayList();

    public final y44 d(y24 y24Var) {
        Iterator it = iterator();
        while (it.hasNext()) {
            y44 y44Var = (y44) it.next();
            if (y44Var.c == y24Var) {
                return y44Var;
            }
        }
        return null;
    }

    public final void e(y44 y44Var) {
        this.p.add(y44Var);
    }

    public final void f(y44 y44Var) {
        this.p.remove(y44Var);
    }

    public final boolean h(y24 y24Var) {
        ArrayList<y44> arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            y44 y44Var = (y44) it.next();
            if (y44Var.c == y24Var) {
                arrayList.add(y44Var);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (y44 y44Var2 : arrayList) {
            y44Var2.d.h();
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.p.iterator();
    }
}
