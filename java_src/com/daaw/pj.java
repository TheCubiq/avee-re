package com.daaw;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class pj<T> {
    public static final String f = ll0.f("ConstraintTracker");
    public final wj1 a;
    public final Context b;
    public final Object c = new Object();
    public final Set<oj<T>> d = new LinkedHashSet();
    public T e;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ List p;

        public a(List list) {
            this.p = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (oj ojVar : this.p) {
                ojVar.a(pj.this.e);
            }
        }
    }

    public pj(Context context, wj1 wj1Var) {
        this.b = context.getApplicationContext();
        this.a = wj1Var;
    }

    public void a(oj<T> ojVar) {
        synchronized (this.c) {
            if (this.d.add(ojVar)) {
                if (this.d.size() == 1) {
                    this.e = b();
                    ll0.c().a(f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.e), new Throwable[0]);
                    e();
                }
                ojVar.a(this.e);
            }
        }
    }

    public abstract T b();

    public void c(oj<T> ojVar) {
        synchronized (this.c) {
            if (this.d.remove(ojVar) && this.d.isEmpty()) {
                f();
            }
        }
    }

    public void d(T t) {
        synchronized (this.c) {
            T t2 = this.e;
            if (t2 != t && (t2 == null || !t2.equals(t))) {
                this.e = t;
                this.a.a().execute(new a(new ArrayList(this.d)));
            }
        }
    }

    public abstract void e();

    public abstract void f();
}
