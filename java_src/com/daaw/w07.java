package com.daaw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes2.dex */
public final class w07 {
    public final w07 a;
    public final mu2 b;
    public final Map c = new HashMap();
    public final Map d = new HashMap();

    public w07(w07 w07Var, mu2 mu2Var) {
        this.a = w07Var;
        this.b = mu2Var;
    }

    public final w07 a() {
        return new w07(this, this.b);
    }

    public final gl2 b(gl2 gl2Var) {
        return this.b.a(this, gl2Var);
    }

    public final gl2 c(z72 z72Var) {
        gl2 gl2Var = gl2.g;
        Iterator n = z72Var.n();
        while (n.hasNext()) {
            gl2Var = this.b.a(this, z72Var.k(((Integer) n.next()).intValue()));
            if (gl2Var instanceof oa2) {
                break;
            }
        }
        return gl2Var;
    }

    public final gl2 d(String str) {
        if (this.c.containsKey(str)) {
            return (gl2) this.c.get(str);
        }
        w07 w07Var = this.a;
        if (w07Var != null) {
            return w07Var.d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }

    public final void e(String str, gl2 gl2Var) {
        if (this.d.containsKey(str)) {
            return;
        }
        if (gl2Var == null) {
            this.c.remove(str);
        } else {
            this.c.put(str, gl2Var);
        }
    }

    public final void f(String str, gl2 gl2Var) {
        e(str, gl2Var);
        this.d.put(str, Boolean.TRUE);
    }

    public final void g(String str, gl2 gl2Var) {
        w07 w07Var;
        if (!this.c.containsKey(str) && (w07Var = this.a) != null && w07Var.h(str)) {
            this.a.g(str, gl2Var);
        } else if (this.d.containsKey(str)) {
        } else {
            if (gl2Var == null) {
                this.c.remove(str);
            } else {
                this.c.put(str, gl2Var);
            }
        }
    }

    public final boolean h(String str) {
        if (this.c.containsKey(str)) {
            return true;
        }
        w07 w07Var = this.a;
        if (w07Var != null) {
            return w07Var.h(str);
        }
        return false;
    }
}
