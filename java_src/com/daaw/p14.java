package com.daaw;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public abstract class p14 {

    /* renamed from: p */
    public final WeakReference f22200p;

    public p14(View view) {
        this.f22200p = new WeakReference(view);
    }

    /* renamed from: a */
    public abstract void mo13768a(ViewTreeObserver viewTreeObserver);

    /* renamed from: b */
    public abstract void mo13767b(ViewTreeObserver viewTreeObserver);

    /* renamed from: c */
    public final ViewTreeObserver m13766c() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.f22200p.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    /* renamed from: d */
    public final void m13765d() {
        ViewTreeObserver m13766c = m13766c();
        if (m13766c != null) {
            mo13768a(m13766c);
        }
    }

    /* renamed from: e */
    public final void m13764e() {
        ViewTreeObserver m13766c = m13766c();
        if (m13766c != null) {
            mo13767b(m13766c);
        }
    }
}
