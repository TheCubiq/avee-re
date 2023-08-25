package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
/* loaded from: classes.dex */
public final class lq6 {
    public static final lq6 c = new lq6();
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();

    public static lq6 a() {
        return c;
    }

    public final Collection b() {
        return Collections.unmodifiableCollection(this.b);
    }

    public final Collection c() {
        return Collections.unmodifiableCollection(this.a);
    }

    public final void d(xp6 xp6Var) {
        this.a.add(xp6Var);
    }

    public final void e(xp6 xp6Var) {
        boolean g = g();
        this.a.remove(xp6Var);
        this.b.remove(xp6Var);
        if (!g || g()) {
            return;
        }
        rq6.b().f();
    }

    public final void f(xp6 xp6Var) {
        boolean g = g();
        this.b.add(xp6Var);
        if (g) {
            return;
        }
        rq6.b().e();
    }

    public final boolean g() {
        return this.b.size() > 0;
    }
}
