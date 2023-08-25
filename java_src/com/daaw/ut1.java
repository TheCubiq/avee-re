package com.daaw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class ut1 {
    public final WeakReference<View> a;
    public Runnable b = null;
    public Runnable c = null;
    public int d = -1;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ wt1 a;
        public final /* synthetic */ View b;

        public a(wt1 wt1Var, View view) {
            this.a = wt1Var;
            this.b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a.a(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.b(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.c(this.b);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    public ut1(View view) {
        this.a = new WeakReference<>(view);
    }

    public ut1 b(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public void c() {
        View view = this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = this.a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public ut1 f(long j) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public ut1 g(Interpolator interpolator) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public ut1 h(wt1 wt1Var) {
        View view = this.a.get();
        if (view != null) {
            i(view, wt1Var);
        }
        return this;
    }

    public final void i(View view, wt1 wt1Var) {
        if (wt1Var != null) {
            view.animate().setListener(new a(wt1Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public ut1 j(long j) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public ut1 k(final yt1 yt1Var) {
        final View view = this.a.get();
        if (view != null) {
            b.a(view.animate(), yt1Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: com.daaw.tt1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    yt1.this.a(view);
                }
            } : null);
        }
        return this;
    }

    public void l() {
        View view = this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public ut1 m(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
