package com.daaw;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public final class n88 {
    public final lh8 a;
    public final k88 e;
    public final yr8 f;
    public final jn8 g;
    public final HashMap h;
    public final Set i;
    public boolean j;
    public qz6 k;
    public wt8 l = new wt8(0);
    public final IdentityHashMap c = new IdentityHashMap();
    public final Map d = new HashMap();
    public final List b = new ArrayList();

    public n88(k88 k88Var, fb8 fb8Var, Handler handler, lh8 lh8Var) {
        this.a = lh8Var;
        this.e = k88Var;
        yr8 yr8Var = new yr8();
        this.f = yr8Var;
        jn8 jn8Var = new jn8();
        this.g = jn8Var;
        this.h = new HashMap();
        this.i = new HashSet();
        yr8Var.b(handler, fb8Var);
        jn8Var.b(handler, fb8Var);
    }

    public final int a() {
        return this.b.size();
    }

    public final l64 b() {
        if (this.b.isEmpty()) {
            return l64.a;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            h88 h88Var = (h88) this.b.get(i2);
            h88Var.d = i;
            i += h88Var.a.I().c();
        }
        return new c98(this.b, this.l, null);
    }

    public final /* synthetic */ void e(rr8 rr8Var, l64 l64Var) {
        this.e.zzh();
    }

    public final void f(qz6 qz6Var) {
        uo4.f(!this.j);
        this.k = qz6Var;
        for (int i = 0; i < this.b.size(); i++) {
            h88 h88Var = (h88) this.b.get(i);
            t(h88Var);
            this.i.add(h88Var);
        }
        this.j = true;
    }

    public final void g() {
        for (e88 e88Var : this.h.values()) {
            try {
                e88Var.a.n(e88Var.b);
            } catch (RuntimeException e) {
                s95.c("MediaSourceList", "Failed to release child source.", e);
            }
            e88Var.a.g(e88Var.c);
            e88Var.a.i(e88Var.c);
        }
        this.h.clear();
        this.i.clear();
        this.j = false;
    }

    public final void h(nr8 nr8Var) {
        h88 h88Var = (h88) this.c.remove(nr8Var);
        Objects.requireNonNull(h88Var);
        h88Var.a.l(nr8Var);
        h88Var.c.remove(((br8) nr8Var).p);
        if (!this.c.isEmpty()) {
            r();
        }
        s(h88Var);
    }

    public final boolean i() {
        return this.j;
    }

    public final l64 j(int i, List list, wt8 wt8Var) {
        int i2;
        if (!list.isEmpty()) {
            this.l = wt8Var;
            for (int i3 = i; i3 < list.size() + i; i3++) {
                h88 h88Var = (h88) list.get(i3 - i);
                if (i3 > 0) {
                    h88 h88Var2 = (h88) this.b.get(i3 - 1);
                    i2 = h88Var2.d + h88Var2.a.I().c();
                } else {
                    i2 = 0;
                }
                h88Var.a(i2);
                p(i3, h88Var.a.I().c());
                this.b.add(i3, h88Var);
                this.d.put(h88Var.b, h88Var);
                if (this.j) {
                    t(h88Var);
                    if (this.c.isEmpty()) {
                        this.i.add(h88Var);
                    } else {
                        q(h88Var);
                    }
                }
            }
        }
        return b();
    }

    public final l64 k(int i, int i2, int i3, wt8 wt8Var) {
        uo4.d(a() >= 0);
        this.l = null;
        return b();
    }

    public final l64 l(int i, int i2, wt8 wt8Var) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= a()) {
            z = true;
        }
        uo4.d(z);
        this.l = wt8Var;
        u(i, i2);
        return b();
    }

    public final l64 m(List list, wt8 wt8Var) {
        u(0, this.b.size());
        return j(this.b.size(), list, wt8Var);
    }

    public final l64 n(wt8 wt8Var) {
        int a = a();
        if (wt8Var.c() != a) {
            wt8Var = wt8Var.f().g(0, a);
        }
        this.l = wt8Var;
        return b();
    }

    public final nr8 o(pr8 pr8Var, nw8 nw8Var, long j) {
        Object obj = pr8Var.a;
        Object obj2 = ((Pair) obj).first;
        pr8 c = pr8Var.c(((Pair) obj).second);
        h88 h88Var = (h88) this.d.get(obj2);
        Objects.requireNonNull(h88Var);
        this.i.add(h88Var);
        e88 e88Var = (e88) this.h.get(h88Var);
        if (e88Var != null) {
            e88Var.a.j(e88Var.b);
        }
        h88Var.c.add(c);
        br8 k = h88Var.a.k(c, nw8Var, j);
        this.c.put(k, h88Var);
        r();
        return k;
    }

    public final void p(int i, int i2) {
        while (i < this.b.size()) {
            ((h88) this.b.get(i)).d += i2;
            i++;
        }
    }

    public final void q(h88 h88Var) {
        e88 e88Var = (e88) this.h.get(h88Var);
        if (e88Var != null) {
            e88Var.a.a(e88Var.b);
        }
    }

    public final void r() {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            h88 h88Var = (h88) it.next();
            if (h88Var.c.isEmpty()) {
                q(h88Var);
                it.remove();
            }
        }
    }

    public final void s(h88 h88Var) {
        if (h88Var.e && h88Var.c.isEmpty()) {
            e88 e88Var = (e88) this.h.remove(h88Var);
            Objects.requireNonNull(e88Var);
            e88Var.a.n(e88Var.b);
            e88Var.a.g(e88Var.c);
            e88Var.a.i(e88Var.c);
            this.i.remove(h88Var);
        }
    }

    public final void t(h88 h88Var) {
        kr8 kr8Var = h88Var.a;
        qr8 qr8Var = new qr8() { // from class: com.daaw.y78
            @Override // com.daaw.qr8
            public final void a(rr8 rr8Var, l64 l64Var) {
                n88.this.e(rr8Var, l64Var);
            }
        };
        b88 b88Var = new b88(this, h88Var);
        this.h.put(h88Var, new e88(kr8Var, qr8Var, b88Var));
        kr8Var.f(new Handler(it5.e(), null), b88Var);
        kr8Var.d(new Handler(it5.e(), null), b88Var);
        kr8Var.m(qr8Var, this.k, this.a);
    }

    public final void u(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            h88 h88Var = (h88) this.b.remove(i2);
            this.d.remove(h88Var.b);
            p(i2, -h88Var.a.I().c());
            h88Var.e = true;
            if (this.j) {
                s(h88Var);
            }
        }
    }
}
