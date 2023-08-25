package com.daaw;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class vt1 {

    /* renamed from: c */
    public Interpolator f30567c;

    /* renamed from: d */
    public wt1 f30568d;

    /* renamed from: e */
    public boolean f30569e;

    /* renamed from: b */
    public long f30566b = -1;

    /* renamed from: f */
    public final xt1 f30570f = new C3372a();

    /* renamed from: a */
    public final ArrayList<ut1> f30565a = new ArrayList<>();

    /* renamed from: com.daaw.vt1$a */
    /* loaded from: classes.dex */
    public class C3372a extends xt1 {

        /* renamed from: a */
        public boolean f30571a = false;

        /* renamed from: b */
        public int f30572b = 0;

        public C3372a() {
        }

        @Override // com.daaw.wt1
        /* renamed from: b */
        public void mo5810b(View view) {
            int i = this.f30572b + 1;
            this.f30572b = i;
            if (i == vt1.this.f30565a.size()) {
                wt1 wt1Var = vt1.this.f30568d;
                if (wt1Var != null) {
                    wt1Var.mo5810b(null);
                }
                m6797d();
            }
        }

        @Override // com.daaw.xt1, com.daaw.wt1
        /* renamed from: c */
        public void mo4526c(View view) {
            if (this.f30571a) {
                return;
            }
            this.f30571a = true;
            wt1 wt1Var = vt1.this.f30568d;
            if (wt1Var != null) {
                wt1Var.mo4526c(null);
            }
        }

        /* renamed from: d */
        public void m6797d() {
            this.f30572b = 0;
            this.f30571a = false;
            vt1.this.m6804b();
        }
    }

    /* renamed from: a */
    public void m6805a() {
        if (this.f30569e) {
            Iterator<ut1> it = this.f30565a.iterator();
            while (it.hasNext()) {
                it.next().m7733c();
            }
            this.f30569e = false;
        }
    }

    /* renamed from: b */
    public void m6804b() {
        this.f30569e = false;
    }

    /* renamed from: c */
    public vt1 m6803c(ut1 ut1Var) {
        if (!this.f30569e) {
            this.f30565a.add(ut1Var);
        }
        return this;
    }

    /* renamed from: d */
    public vt1 m6802d(ut1 ut1Var, ut1 ut1Var2) {
        this.f30565a.add(ut1Var);
        ut1Var2.m7726j(ut1Var.m7732d());
        this.f30565a.add(ut1Var2);
        return this;
    }

    /* renamed from: e */
    public vt1 m6801e(long j) {
        if (!this.f30569e) {
            this.f30566b = j;
        }
        return this;
    }

    /* renamed from: f */
    public vt1 m6800f(Interpolator interpolator) {
        if (!this.f30569e) {
            this.f30567c = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public vt1 m6799g(wt1 wt1Var) {
        if (!this.f30569e) {
            this.f30568d = wt1Var;
        }
        return this;
    }

    /* renamed from: h */
    public void m6798h() {
        if (this.f30569e) {
            return;
        }
        Iterator<ut1> it = this.f30565a.iterator();
        while (it.hasNext()) {
            ut1 next = it.next();
            long j = this.f30566b;
            if (j >= 0) {
                next.m7730f(j);
            }
            Interpolator interpolator = this.f30567c;
            if (interpolator != null) {
                next.m7729g(interpolator);
            }
            if (this.f30568d != null) {
                next.m7728h(this.f30570f);
            }
            next.m7724l();
        }
        this.f30569e = true;
    }
}
