package com.daaw;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public abstract class wt0 {
    public boolean a;
    public CopyOnWriteArrayList<td> b = new CopyOnWriteArrayList<>();
    public uj<Boolean> c;

    public wt0(boolean z) {
        this.a = z;
    }

    public void a(td tdVar) {
        this.b.add(tdVar);
    }

    public abstract void b();

    public final boolean c() {
        return this.a;
    }

    public final void d() {
        Iterator<td> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    public void e(td tdVar) {
        this.b.remove(tdVar);
    }

    public final void f(boolean z) {
        this.a = z;
        uj<Boolean> ujVar = this.c;
        if (ujVar != null) {
            ujVar.a(Boolean.valueOf(z));
        }
    }

    public void g(uj<Boolean> ujVar) {
        this.c = ujVar;
    }
}
