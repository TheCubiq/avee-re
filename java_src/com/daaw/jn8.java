package com.daaw;

import android.os.Handler;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class jn8 {
    public final int a;
    public final pr8 b;
    public final CopyOnWriteArrayList c;

    public jn8() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public jn8(CopyOnWriteArrayList copyOnWriteArrayList, int i, pr8 pr8Var) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = pr8Var;
    }

    public final jn8 a(int i, pr8 pr8Var) {
        return new jn8(this.c, i, pr8Var);
    }

    public final void b(Handler handler, ln8 ln8Var) {
        Objects.requireNonNull(ln8Var);
        this.c.add(new hn8(handler, ln8Var));
    }

    public final void c(ln8 ln8Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            hn8 hn8Var = (hn8) it.next();
            if (hn8Var.b == ln8Var) {
                this.c.remove(hn8Var);
            }
        }
    }
}
