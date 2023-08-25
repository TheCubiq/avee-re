package com.daaw;

import android.view.View;
/* loaded from: classes.dex */
public final class e74 implements View.OnAttachStateChangeListener {

    /* renamed from: p */
    public final /* synthetic */ cx3 f8222p;

    /* renamed from: q */
    public final /* synthetic */ h74 f8223q;

    public e74(h74 h74Var, cx3 cx3Var) {
        this.f8223q = h74Var;
        this.f8222p = cx3Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f8223q.m20973F(view, this.f8222p, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
