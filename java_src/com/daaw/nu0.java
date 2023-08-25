package com.daaw;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;
/* loaded from: classes.dex */
public final class nu0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: p */
    public final View f20732p;

    /* renamed from: q */
    public ViewTreeObserver f20733q;

    /* renamed from: r */
    public final Runnable f20734r;

    public nu0(View view, Runnable runnable) {
        this.f20732p = view;
        this.f20733q = view.getViewTreeObserver();
        this.f20734r = runnable;
    }

    /* renamed from: a */
    public static nu0 m14792a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        nu0 nu0Var = new nu0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(nu0Var);
        view.addOnAttachStateChangeListener(nu0Var);
        return nu0Var;
    }

    /* renamed from: b */
    public void m14791b() {
        (this.f20733q.isAlive() ? this.f20733q : this.f20732p.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f20732p.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m14791b();
        this.f20734r.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f20733q = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m14791b();
    }
}
