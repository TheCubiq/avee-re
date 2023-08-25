package com.daaw;

import android.os.Handler;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class jn8 {

    /* renamed from: a */
    public final int f15251a;

    /* renamed from: b */
    public final pr8 f15252b;

    /* renamed from: c */
    public final CopyOnWriteArrayList f15253c;

    public jn8() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public jn8(CopyOnWriteArrayList copyOnWriteArrayList, int i, pr8 pr8Var) {
        this.f15253c = copyOnWriteArrayList;
        this.f15251a = i;
        this.f15252b = pr8Var;
    }

    /* renamed from: a */
    public final jn8 m18379a(int i, pr8 pr8Var) {
        return new jn8(this.f15253c, i, pr8Var);
    }

    /* renamed from: b */
    public final void m18378b(Handler handler, ln8 ln8Var) {
        Objects.requireNonNull(ln8Var);
        this.f15253c.add(new hn8(handler, ln8Var));
    }

    /* renamed from: c */
    public final void m18377c(ln8 ln8Var) {
        Iterator it = this.f15253c.iterator();
        while (it.hasNext()) {
            hn8 hn8Var = (hn8) it.next();
            if (hn8Var.f12696b == ln8Var) {
                this.f15253c.remove(hn8Var);
            }
        }
    }
}
