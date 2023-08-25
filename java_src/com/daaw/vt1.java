package com.daaw;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class vt1 {
    public Interpolator c;
    public wt1 d;
    public boolean e;
    public long b = -1;
    public final xt1 f = new a();
    public final ArrayList<ut1> a = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a extends xt1 {
        public boolean a = false;
        public int b = 0;

        public a() {
        }

        @Override // com.daaw.wt1
        public void b(View view) {
            int i = this.b + 1;
            this.b = i;
            if (i == vt1.this.a.size()) {
                wt1 wt1Var = vt1.this.d;
                if (wt1Var != null) {
                    wt1Var.b(null);
                }
                d();
            }
        }

        @Override // com.daaw.xt1, com.daaw.wt1
        public void c(View view) {
            if (this.a) {
                return;
            }
            this.a = true;
            wt1 wt1Var = vt1.this.d;
            if (wt1Var != null) {
                wt1Var.c(null);
            }
        }

        public void d() {
            this.b = 0;
            this.a = false;
            vt1.this.b();
        }
    }

    public void a() {
        if (this.e) {
            Iterator<ut1> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            this.e = false;
        }
    }

    public void b() {
        this.e = false;
    }

    public vt1 c(ut1 ut1Var) {
        if (!this.e) {
            this.a.add(ut1Var);
        }
        return this;
    }

    public vt1 d(ut1 ut1Var, ut1 ut1Var2) {
        this.a.add(ut1Var);
        ut1Var2.j(ut1Var.d());
        this.a.add(ut1Var2);
        return this;
    }

    public vt1 e(long j) {
        if (!this.e) {
            this.b = j;
        }
        return this;
    }

    public vt1 f(Interpolator interpolator) {
        if (!this.e) {
            this.c = interpolator;
        }
        return this;
    }

    public vt1 g(wt1 wt1Var) {
        if (!this.e) {
            this.d = wt1Var;
        }
        return this;
    }

    public void h() {
        if (this.e) {
            return;
        }
        Iterator<ut1> it = this.a.iterator();
        while (it.hasNext()) {
            ut1 next = it.next();
            long j = this.b;
            if (j >= 0) {
                next.f(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null) {
                next.g(interpolator);
            }
            if (this.d != null) {
                next.h(this.f);
            }
            next.l();
        }
        this.e = true;
    }
}
