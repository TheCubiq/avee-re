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

    /* renamed from: a */
    public final WeakReference<View> f29511a;

    /* renamed from: b */
    public Runnable f29512b = null;

    /* renamed from: c */
    public Runnable f29513c = null;

    /* renamed from: d */
    public int f29514d = -1;

    /* renamed from: com.daaw.ut1$a */
    /* loaded from: classes.dex */
    public class C3258a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ wt1 f29515a;

        /* renamed from: b */
        public final /* synthetic */ View f29516b;

        public C3258a(wt1 wt1Var, View view) {
            this.f29515a = wt1Var;
            this.f29516b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f29515a.mo4527a(this.f29516b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f29515a.mo5810b(this.f29516b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f29515a.mo4526c(this.f29516b);
        }
    }

    /* renamed from: com.daaw.ut1$b */
    /* loaded from: classes.dex */
    public static class C3259b {
        /* renamed from: a */
        public static ViewPropertyAnimator m7722a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    public ut1(View view) {
        this.f29511a = new WeakReference<>(view);
    }

    /* renamed from: b */
    public ut1 m7734b(float f) {
        View view = this.f29511a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: c */
    public void m7733c() {
        View view = this.f29511a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: d */
    public long m7732d() {
        View view = this.f29511a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* renamed from: f */
    public ut1 m7730f(long j) {
        View view = this.f29511a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: g */
    public ut1 m7729g(Interpolator interpolator) {
        View view = this.f29511a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: h */
    public ut1 m7728h(wt1 wt1Var) {
        View view = this.f29511a.get();
        if (view != null) {
            m7727i(view, wt1Var);
        }
        return this;
    }

    /* renamed from: i */
    public final void m7727i(View view, wt1 wt1Var) {
        if (wt1Var != null) {
            view.animate().setListener(new C3258a(wt1Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: j */
    public ut1 m7726j(long j) {
        View view = this.f29511a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: k */
    public ut1 m7725k(final yt1 yt1Var) {
        final View view = this.f29511a.get();
        if (view != null) {
            C3259b.m7722a(view.animate(), yt1Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: com.daaw.tt1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    yt1.this.mo3232a(view);
                }
            } : null);
        }
        return this;
    }

    /* renamed from: l */
    public void m7724l() {
        View view = this.f29511a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: m */
    public ut1 m7723m(float f) {
        View view = this.f29511a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
