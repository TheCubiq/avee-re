package com.daaw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class h00 extends gv1 {

    /* loaded from: classes.dex */
    public class a extends jn1 {
        public final /* synthetic */ View a;

        public a(View view) {
            this.a = view;
        }

        @Override // com.daaw.in1.f
        public void a(in1 in1Var) {
            gu1.g(this.a, 1.0f);
            gu1.a(this.a);
            in1Var.T(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter {
        public final View a;
        public boolean b = false;

        public b(View view) {
            this.a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            gu1.g(this.a, 1.0f);
            if (this.b) {
                this.a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (xs1.R(this.a) && this.a.getLayerType() == 0) {
                this.b = true;
                this.a.setLayerType(2, null);
            }
        }
    }

    public h00(int i) {
        m0(i);
    }

    public static float o0(on1 on1Var, float f) {
        Float f2;
        return (on1Var == null || (f2 = (Float) on1Var.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // com.daaw.gv1
    public Animator i0(ViewGroup viewGroup, View view, on1 on1Var, on1 on1Var2) {
        float o0 = o0(on1Var, 0.0f);
        return n0(view, o0 != 1.0f ? o0 : 0.0f, 1.0f);
    }

    @Override // com.daaw.gv1
    public Animator k0(ViewGroup viewGroup, View view, on1 on1Var, on1 on1Var2) {
        gu1.e(view);
        return n0(view, o0(on1Var, 1.0f), 0.0f);
    }

    @Override // com.daaw.gv1, com.daaw.in1
    public void m(on1 on1Var) {
        super.m(on1Var);
        on1Var.a.put("android:fade:transitionAlpha", Float.valueOf(gu1.c(on1Var.b)));
    }

    public final Animator n0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        gu1.g(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, gu1.b, f2);
        ofFloat.addListener(new b(view));
        a(new a(view));
        return ofFloat;
    }
}
