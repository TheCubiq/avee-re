package com.daaw;

import android.view.View;
/* loaded from: classes.dex */
public final class e74 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ cx3 p;
    public final /* synthetic */ h74 q;

    public e74(h74 h74Var, cx3 cx3Var) {
        this.q = h74Var;
        this.p = cx3Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.q.F(view, this.p, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
