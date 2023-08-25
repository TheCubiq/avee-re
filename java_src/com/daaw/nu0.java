package com.daaw;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;
/* loaded from: classes.dex */
public final class nu0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View p;
    public ViewTreeObserver q;
    public final Runnable r;

    public nu0(View view, Runnable runnable) {
        this.p = view;
        this.q = view.getViewTreeObserver();
        this.r = runnable;
    }

    public static nu0 a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        nu0 nu0Var = new nu0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(nu0Var);
        view.addOnAttachStateChangeListener(nu0Var);
        return nu0Var;
    }

    public void b() {
        (this.q.isAlive() ? this.q : this.p.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.p.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.r.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.q = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
