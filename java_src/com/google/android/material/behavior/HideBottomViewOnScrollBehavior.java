package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.daaw.C1247f3;
/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.AbstractC0194c<V> {

    /* renamed from: a */
    public int f37158a;

    /* renamed from: b */
    public int f37159b;

    /* renamed from: c */
    public int f37160c;

    /* renamed from: d */
    public ViewPropertyAnimator f37161d;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    /* loaded from: classes2.dex */
    public class C4012a extends AnimatorListenerAdapter {
        public C4012a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f37161d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f37158a = 0;
        this.f37159b = 2;
        this.f37160c = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37158a = 0;
        this.f37159b = 2;
        this.f37160c = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
    /* renamed from: A */
    public boolean mo928A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    /* renamed from: F */
    public final void m993F(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f37161d = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C4012a());
    }

    /* renamed from: G */
    public void m992G(V v, int i) {
        this.f37160c = i;
        if (this.f37159b == 1) {
            v.setTranslationY(this.f37158a + i);
        }
    }

    /* renamed from: H */
    public void m991H(V v) {
        if (this.f37159b == 1) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f37161d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f37159b = 1;
        m993F(v, this.f37158a + this.f37160c, 175L, C1247f3.f9053c);
    }

    /* renamed from: I */
    public void m990I(V v) {
        if (this.f37159b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f37161d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f37159b = 2;
        m993F(v, 0, 225L, C1247f3.f9054d);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
    /* renamed from: l */
    public boolean mo126l(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f37158a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.mo126l(coordinatorLayout, v, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
    /* renamed from: t */
    public void mo882t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            m991H(v);
        } else if (i2 < 0) {
            m990I(v);
        }
    }
}
