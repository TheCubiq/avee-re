package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class v41 {

    /* renamed from: a */
    public final Set<l41> f29859a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public final List<l41> f29860b = new ArrayList();

    /* renamed from: c */
    public boolean f29861c;

    /* renamed from: a */
    public void m7464a() {
        for (l41 l41Var : tq1.m8863h(this.f29859a)) {
            l41Var.clear();
        }
        this.f29860b.clear();
    }

    /* renamed from: b */
    public void m7463b() {
        this.f29861c = true;
        for (l41 l41Var : tq1.m8863h(this.f29859a)) {
            if (l41Var.isRunning()) {
                l41Var.mo17163b();
                this.f29860b.add(l41Var);
            }
        }
    }

    /* renamed from: c */
    public void m7462c(l41 l41Var) {
        this.f29859a.remove(l41Var);
        this.f29860b.remove(l41Var);
    }

    /* renamed from: d */
    public void m7461d() {
        for (l41 l41Var : tq1.m8863h(this.f29859a)) {
            if (!l41Var.mo17159i() && !l41Var.isCancelled()) {
                l41Var.mo17163b();
                if (this.f29861c) {
                    this.f29860b.add(l41Var);
                } else {
                    l41Var.mo17160g();
                }
            }
        }
    }

    /* renamed from: e */
    public void m7460e() {
        this.f29861c = false;
        for (l41 l41Var : tq1.m8863h(this.f29859a)) {
            if (!l41Var.mo17159i() && !l41Var.isCancelled() && !l41Var.isRunning()) {
                l41Var.mo17160g();
            }
        }
        this.f29860b.clear();
    }

    /* renamed from: f */
    public void m7459f(l41 l41Var) {
        this.f29859a.add(l41Var);
        if (this.f29861c) {
            this.f29860b.add(l41Var);
        } else {
            l41Var.mo17160g();
        }
    }
}
