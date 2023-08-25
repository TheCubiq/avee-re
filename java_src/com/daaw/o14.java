package com.daaw;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class o14 extends p14 implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: q */
    public final WeakReference f20918q;

    public o14(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.f20918q = new WeakReference(onScrollChangedListener);
    }

    @Override // com.daaw.p14
    /* renamed from: a */
    public final void mo13768a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    @Override // com.daaw.p14
    /* renamed from: b */
    public final void mo13767b(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) this.f20918q.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
        } else {
            m13764e();
        }
    }
}
