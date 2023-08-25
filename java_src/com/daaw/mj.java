package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class mj<T> implements oj<T> {
    public final List<String> a = new ArrayList();
    public T b;
    public pj<T> c;
    public a d;

    /* loaded from: classes.dex */
    public interface a {
        void a(List<String> list);

        void b(List<String> list);
    }

    public mj(pj<T> pjVar) {
        this.c = pjVar;
    }

    @Override // com.daaw.oj
    public void a(T t) {
        this.b = t;
        h(this.d, t);
    }

    public abstract boolean b(qy1 qy1Var);

    public abstract boolean c(T t);

    public boolean d(String str) {
        T t = this.b;
        return t != null && c(t) && this.a.contains(str);
    }

    public void e(Iterable<qy1> iterable) {
        this.a.clear();
        for (qy1 qy1Var : iterable) {
            if (b(qy1Var)) {
                this.a.add(qy1Var.a);
            }
        }
        if (this.a.isEmpty()) {
            this.c.c(this);
        } else {
            this.c.a(this);
        }
        h(this.d, this.b);
    }

    public void f() {
        if (this.a.isEmpty()) {
            return;
        }
        this.a.clear();
        this.c.c(this);
    }

    public void g(a aVar) {
        if (this.d != aVar) {
            this.d = aVar;
            h(aVar, this.b);
        }
    }

    public final void h(a aVar, T t) {
        if (this.a.isEmpty() || aVar == null) {
            return;
        }
        if (t == null || c(t)) {
            aVar.b(this.a);
        } else {
            aVar.a(this.a);
        }
    }
}
