package com.daaw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class kf1 {

    /* renamed from: a */
    public final ArrayList<C1945b> f16334a = new ArrayList<>();

    /* renamed from: b */
    public C1945b f16335b = null;

    /* renamed from: c */
    public ValueAnimator f16336c = null;

    /* renamed from: d */
    public final Animator.AnimatorListener f16337d = new C1944a();

    /* renamed from: com.daaw.kf1$a */
    /* loaded from: classes2.dex */
    public class C1944a extends AnimatorListenerAdapter {
        public C1944a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            kf1 kf1Var = kf1.this;
            if (kf1Var.f16336c == animator) {
                kf1Var.f16336c = null;
            }
        }
    }

    /* renamed from: com.daaw.kf1$b */
    /* loaded from: classes2.dex */
    public static class C1945b {

        /* renamed from: a */
        public final int[] f16339a;

        /* renamed from: b */
        public final ValueAnimator f16340b;

        public C1945b(int[] iArr, ValueAnimator valueAnimator) {
            this.f16339a = iArr;
            this.f16340b = valueAnimator;
        }
    }

    /* renamed from: a */
    public void m17767a(int[] iArr, ValueAnimator valueAnimator) {
        C1945b c1945b = new C1945b(iArr, valueAnimator);
        valueAnimator.addListener(this.f16337d);
        this.f16334a.add(c1945b);
    }

    /* renamed from: b */
    public final void m17766b() {
        ValueAnimator valueAnimator = this.f16336c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f16336c = null;
        }
    }

    /* renamed from: c */
    public void m17765c() {
        ValueAnimator valueAnimator = this.f16336c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f16336c = null;
        }
    }

    /* renamed from: d */
    public void m17764d(int[] iArr) {
        C1945b c1945b;
        int size = this.f16334a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c1945b = null;
                break;
            }
            c1945b = this.f16334a.get(i);
            if (StateSet.stateSetMatches(c1945b.f16339a, iArr)) {
                break;
            }
            i++;
        }
        C1945b c1945b2 = this.f16335b;
        if (c1945b == c1945b2) {
            return;
        }
        if (c1945b2 != null) {
            m17766b();
        }
        this.f16335b = c1945b;
        if (c1945b != null) {
            m17763e(c1945b);
        }
    }

    /* renamed from: e */
    public final void m17763e(C1945b c1945b) {
        ValueAnimator valueAnimator = c1945b.f16340b;
        this.f16336c = valueAnimator;
        valueAnimator.start();
    }
}
