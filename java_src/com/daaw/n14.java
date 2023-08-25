package com.daaw;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class n14 extends p14 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: q */
    public final WeakReference f19341q;

    public n14(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f19341q = new WeakReference(onGlobalLayoutListener);
    }

    @Override // com.daaw.p14
    /* renamed from: a */
    public final void mo13768a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    @Override // com.daaw.p14
    /* renamed from: b */
    public final void mo13767b(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.f19341q.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            m13764e();
        }
    }
}
