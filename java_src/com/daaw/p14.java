package com.daaw;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public abstract class p14 {
    public final WeakReference p;

    public p14(View view) {
        this.p = new WeakReference(view);
    }

    public abstract void a(ViewTreeObserver viewTreeObserver);

    public abstract void b(ViewTreeObserver viewTreeObserver);

    public final ViewTreeObserver c() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.p.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    public final void d() {
        ViewTreeObserver c = c();
        if (c != null) {
            a(c);
        }
    }

    public final void e() {
        ViewTreeObserver c = c();
        if (c != null) {
            b(c);
        }
    }
}
