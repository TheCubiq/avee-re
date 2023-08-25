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
import com.daaw.InterfaceC2544pf;
/* renamed from: com.daaw.mf */
/* loaded from: classes2.dex */
public final class C2172mf {

    /* renamed from: com.daaw.mf$a */
    /* loaded from: classes2.dex */
    public static class C2173a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC2544pf f18848a;

        public C2173a(InterfaceC2544pf interfaceC2544pf) {
            this.f18848a = interfaceC2544pf;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f18848a.mo13415b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f18848a.mo13416a();
        }
    }

    /* renamed from: a */
    public static Animator m16047a(InterfaceC2544pf interfaceC2544pf, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(interfaceC2544pf, (Property<InterfaceC2544pf, V>) InterfaceC2544pf.C2547c.f22883a, (TypeEvaluator) InterfaceC2544pf.C2546b.f22881b, (Object[]) new InterfaceC2544pf.C2549e[]{new InterfaceC2544pf.C2549e(f, f2, f3)});
        if (Build.VERSION.SDK_INT >= 21) {
            InterfaceC2544pf.C2549e revealInfo = interfaceC2544pf.getRevealInfo();
            if (revealInfo != null) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) interfaceC2544pf, (int) f, (int) f2, revealInfo.f22887c, f3);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofObject, createCircularReveal);
                return animatorSet;
            }
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        return ofObject;
    }

    /* renamed from: b */
    public static Animator.AnimatorListener m16046b(InterfaceC2544pf interfaceC2544pf) {
        return new C2173a(interfaceC2544pf);
    }
}
