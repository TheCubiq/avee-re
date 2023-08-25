package com.daaw;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class au1<T extends View, Z> extends AbstractC3683ya<Z> {

    /* renamed from: s */
    public static boolean f3601s;

    /* renamed from: t */
    public static Integer f3602t;

    /* renamed from: q */
    public final T f3603q;

    /* renamed from: r */
    public final C0675a f3604r;

    /* renamed from: com.daaw.au1$a */
    /* loaded from: classes.dex */
    public static class C0675a {

        /* renamed from: a */
        public final View f3605a;

        /* renamed from: b */
        public final List<sd1> f3606b = new ArrayList();

        /* renamed from: c */
        public ViewTreeObserver$OnPreDrawListenerC0676a f3607c;

        /* renamed from: d */
        public Point f3608d;

        /* renamed from: com.daaw.au1$a$a */
        /* loaded from: classes.dex */
        public static class ViewTreeObserver$OnPreDrawListenerC0676a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: p */
            public final WeakReference<C0675a> f3609p;

            public ViewTreeObserver$OnPreDrawListenerC0676a(C0675a c0675a) {
                this.f3609p = new WeakReference<>(c0675a);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnGlobalLayoutListener called listener=");
                    sb.append(this);
                }
                C0675a c0675a = this.f3609p.get();
                if (c0675a != null) {
                    c0675a.m27025b();
                    return true;
                }
                return true;
            }
        }

        public C0675a(View view) {
            this.f3605a = view;
        }

        /* renamed from: b */
        public final void m27025b() {
            if (this.f3606b.isEmpty()) {
                return;
            }
            int m27020g = m27020g();
            int m27021f = m27021f();
            if (m27019h(m27020g) && m27019h(m27021f)) {
                m27018i(m27020g, m27021f);
                ViewTreeObserver viewTreeObserver = this.f3605a.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this.f3607c);
                }
                this.f3607c = null;
            }
        }

        @TargetApi(13)
        /* renamed from: c */
        public final Point m27024c() {
            Point point = this.f3608d;
            if (point != null) {
                return point;
            }
            Display defaultDisplay = ((WindowManager) this.f3605a.getContext().getSystemService("window")).getDefaultDisplay();
            Point point2 = new Point();
            this.f3608d = point2;
            defaultDisplay.getSize(point2);
            return this.f3608d;
        }

        /* renamed from: d */
        public void m27023d(sd1 sd1Var) {
            int m27020g = m27020g();
            int m27021f = m27021f();
            if (m27019h(m27020g) && m27019h(m27021f)) {
                sd1Var.mo10453f(m27020g, m27021f);
                return;
            }
            if (!this.f3606b.contains(sd1Var)) {
                this.f3606b.add(sd1Var);
            }
            if (this.f3607c == null) {
                ViewTreeObserver viewTreeObserver = this.f3605a.getViewTreeObserver();
                ViewTreeObserver$OnPreDrawListenerC0676a viewTreeObserver$OnPreDrawListenerC0676a = new ViewTreeObserver$OnPreDrawListenerC0676a(this);
                this.f3607c = viewTreeObserver$OnPreDrawListenerC0676a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC0676a);
            }
        }

        /* renamed from: e */
        public final int m27022e(int i, boolean z) {
            if (i == -2) {
                Point m27024c = m27024c();
                return z ? m27024c.y : m27024c.x;
            }
            return i;
        }

        /* renamed from: f */
        public final int m27021f() {
            ViewGroup.LayoutParams layoutParams = this.f3605a.getLayoutParams();
            if (m27019h(this.f3605a.getHeight())) {
                return this.f3605a.getHeight();
            }
            if (layoutParams != null) {
                return m27022e(layoutParams.height, true);
            }
            return 0;
        }

        /* renamed from: g */
        public final int m27020g() {
            ViewGroup.LayoutParams layoutParams = this.f3605a.getLayoutParams();
            if (m27019h(this.f3605a.getWidth())) {
                return this.f3605a.getWidth();
            }
            if (layoutParams != null) {
                return m27022e(layoutParams.width, false);
            }
            return 0;
        }

        /* renamed from: h */
        public final boolean m27019h(int i) {
            return i > 0 || i == -2;
        }

        /* renamed from: i */
        public final void m27018i(int i, int i2) {
            for (sd1 sd1Var : this.f3606b) {
                sd1Var.mo10453f(i, i2);
            }
            this.f3606b.clear();
        }
    }

    public au1(T t) {
        Objects.requireNonNull(t, "View must not be null!");
        this.f3603q = t;
        this.f3604r = new C0675a(t);
    }

    @Override // com.daaw.AbstractC3683ya, com.daaw.pj1
    /* renamed from: b */
    public void mo3968b(l41 l41Var) {
        m27027m(l41Var);
    }

    @Override // com.daaw.pj1
    /* renamed from: e */
    public void mo13330e(sd1 sd1Var) {
        this.f3604r.m27023d(sd1Var);
    }

    public T getView() {
        return this.f3603q;
    }

    @Override // com.daaw.AbstractC3683ya, com.daaw.pj1
    /* renamed from: j */
    public l41 mo3964j() {
        Object m27028l = m27028l();
        if (m27028l != null) {
            if (m27028l instanceof l41) {
                return (l41) m27028l;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    /* renamed from: l */
    public final Object m27028l() {
        Integer num = f3602t;
        return num == null ? this.f3603q.getTag() : this.f3603q.getTag(num.intValue());
    }

    /* renamed from: m */
    public final void m27027m(Object obj) {
        Integer num = f3602t;
        if (num != null) {
            this.f3603q.setTag(num.intValue(), obj);
            return;
        }
        f3601s = true;
        this.f3603q.setTag(obj);
    }

    public String toString() {
        return "Target for: " + this.f3603q;
    }
}
