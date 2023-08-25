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
public abstract class au1<T extends View, Z> extends ya<Z> {
    public static boolean s;
    public static Integer t;
    public final T q;
    public final a r;

    /* loaded from: classes.dex */
    public static class a {
        public final View a;
        public final List<sd1> b = new ArrayList();
        public ViewTreeObserver$OnPreDrawListenerC0037a c;
        public Point d;

        /* renamed from: com.daaw.au1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class ViewTreeObserver$OnPreDrawListenerC0037a implements ViewTreeObserver.OnPreDrawListener {
            public final WeakReference<a> p;

            public ViewTreeObserver$OnPreDrawListenerC0037a(a aVar) {
                this.p = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnGlobalLayoutListener called listener=");
                    sb.append(this);
                }
                a aVar = this.p.get();
                if (aVar != null) {
                    aVar.b();
                    return true;
                }
                return true;
            }
        }

        public a(View view) {
            this.a = view;
        }

        public final void b() {
            if (this.b.isEmpty()) {
                return;
            }
            int g = g();
            int f = f();
            if (h(g) && h(f)) {
                i(g, f);
                ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this.c);
                }
                this.c = null;
            }
        }

        @TargetApi(13)
        public final Point c() {
            Point point = this.d;
            if (point != null) {
                return point;
            }
            Display defaultDisplay = ((WindowManager) this.a.getContext().getSystemService("window")).getDefaultDisplay();
            Point point2 = new Point();
            this.d = point2;
            defaultDisplay.getSize(point2);
            return this.d;
        }

        public void d(sd1 sd1Var) {
            int g = g();
            int f = f();
            if (h(g) && h(f)) {
                sd1Var.f(g, f);
                return;
            }
            if (!this.b.contains(sd1Var)) {
                this.b.add(sd1Var);
            }
            if (this.c == null) {
                ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
                ViewTreeObserver$OnPreDrawListenerC0037a viewTreeObserver$OnPreDrawListenerC0037a = new ViewTreeObserver$OnPreDrawListenerC0037a(this);
                this.c = viewTreeObserver$OnPreDrawListenerC0037a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC0037a);
            }
        }

        public final int e(int i, boolean z) {
            if (i == -2) {
                Point c = c();
                return z ? c.y : c.x;
            }
            return i;
        }

        public final int f() {
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            if (h(this.a.getHeight())) {
                return this.a.getHeight();
            }
            if (layoutParams != null) {
                return e(layoutParams.height, true);
            }
            return 0;
        }

        public final int g() {
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            if (h(this.a.getWidth())) {
                return this.a.getWidth();
            }
            if (layoutParams != null) {
                return e(layoutParams.width, false);
            }
            return 0;
        }

        public final boolean h(int i) {
            return i > 0 || i == -2;
        }

        public final void i(int i, int i2) {
            for (sd1 sd1Var : this.b) {
                sd1Var.f(i, i2);
            }
            this.b.clear();
        }
    }

    public au1(T t2) {
        Objects.requireNonNull(t2, "View must not be null!");
        this.q = t2;
        this.r = new a(t2);
    }

    @Override // com.daaw.ya, com.daaw.pj1
    public void b(l41 l41Var) {
        m(l41Var);
    }

    @Override // com.daaw.pj1
    public void e(sd1 sd1Var) {
        this.r.d(sd1Var);
    }

    public T getView() {
        return this.q;
    }

    @Override // com.daaw.ya, com.daaw.pj1
    public l41 j() {
        Object l = l();
        if (l != null) {
            if (l instanceof l41) {
                return (l41) l;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    public final Object l() {
        Integer num = t;
        return num == null ? this.q.getTag() : this.q.getTag(num.intValue());
    }

    public final void m(Object obj) {
        Integer num = t;
        if (num != null) {
            this.q.setTag(num.intValue(), obj);
            return;
        }
        s = true;
        this.q.setTag(obj);
    }

    public String toString() {
        return "Target for: " + this.q;
    }
}
