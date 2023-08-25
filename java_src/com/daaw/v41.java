package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class v41 {
    public final Set<l41> a = Collections.newSetFromMap(new WeakHashMap());
    public final List<l41> b = new ArrayList();
    public boolean c;

    public void a() {
        for (l41 l41Var : tq1.h(this.a)) {
            l41Var.clear();
        }
        this.b.clear();
    }

    public void b() {
        this.c = true;
        for (l41 l41Var : tq1.h(this.a)) {
            if (l41Var.isRunning()) {
                l41Var.b();
                this.b.add(l41Var);
            }
        }
    }

    public void c(l41 l41Var) {
        this.a.remove(l41Var);
        this.b.remove(l41Var);
    }

    public void d() {
        for (l41 l41Var : tq1.h(this.a)) {
            if (!l41Var.i() && !l41Var.isCancelled()) {
                l41Var.b();
                if (this.c) {
                    this.b.add(l41Var);
                } else {
                    l41Var.g();
                }
            }
        }
    }

    public void e() {
        this.c = false;
        for (l41 l41Var : tq1.h(this.a)) {
            if (!l41Var.i() && !l41Var.isCancelled() && !l41Var.isRunning()) {
                l41Var.g();
            }
        }
        this.b.clear();
    }

    public void f(l41 l41Var) {
        this.a.add(l41Var);
        if (this.c) {
            this.b.add(l41Var);
        } else {
            l41Var.g();
        }
    }
}
