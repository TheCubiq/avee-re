package com.daaw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.daaw.pf;
/* loaded from: classes2.dex */
public final class mf {

    /* loaded from: classes2.dex */
    public static class a extends AnimatorListenerAdapter {
        public final /* synthetic */ pf a;

        public a(pf pfVar) {
            this.a = pfVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.a();
        }
    }

    public static Animator a(pf pfVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(pfVar, (Property<pf, V>) pf.c.a, (TypeEvaluator) pf.b.b, (Object[]) new pf.e[]{new pf.e(f, f2, f3)});
        if (Build.VERSION.SDK_INT >= 21) {
            pf.e revealInfo = pfVar.getRevealInfo();
            if (revealInfo != null) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) pfVar, (int) f, (int) f2, revealInfo.c, f3);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofObject, createCircularReveal);
                return animatorSet;
            }
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        return ofObject;
    }

    public static Animator.AnimatorListener b(pf pfVar) {
        return new a(pfVar);
    }
}
