package com.daaw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class h00 extends gv1 {

    /* renamed from: com.daaw.h00$a */
    /* loaded from: classes.dex */
    public class C1493a extends jn1 {

        /* renamed from: a */
        public final /* synthetic */ View f11907a;

        public C1493a(View view) {
            this.f11907a = view;
        }

        @Override // com.daaw.in1.InterfaceC1729f
        /* renamed from: a */
        public void mo9244a(in1 in1Var) {
            gu1.m21223g(this.f11907a, 1.0f);
            gu1.m21229a(this.f11907a);
            in1Var.mo15921T(this);
        }
    }

    /* renamed from: com.daaw.h00$b */
    /* loaded from: classes.dex */
    public static class C1494b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final View f11909a;

        /* renamed from: b */
        public boolean f11910b = false;

        public C1494b(View view) {
            this.f11909a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            gu1.m21223g(this.f11909a, 1.0f);
            if (this.f11910b) {
                this.f11909a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (xs1.m4746R(this.f11909a) && this.f11909a.getLayerType() == 0) {
                this.f11910b = true;
                this.f11909a.setLayerType(2, null);
            }
        }
    }

    public h00(int i) {
        m21203m0(i);
    }

    /* renamed from: o0 */
    public static float m21120o0(on1 on1Var, float f) {
        Float f2;
        return (on1Var == null || (f2 = (Float) on1Var.f21675a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // com.daaw.gv1
    /* renamed from: i0 */
    public Animator mo21123i0(ViewGroup viewGroup, View view, on1 on1Var, on1 on1Var2) {
        float m21120o0 = m21120o0(on1Var, 0.0f);
        return m21121n0(view, m21120o0 != 1.0f ? m21120o0 : 0.0f, 1.0f);
    }

    @Override // com.daaw.gv1
    /* renamed from: k0 */
    public Animator mo21122k0(ViewGroup viewGroup, View view, on1 on1Var, on1 on1Var2) {
        gu1.m21225e(view);
        return m21121n0(view, m21120o0(on1Var, 1.0f), 0.0f);
    }

    @Override // com.daaw.gv1, com.daaw.in1
    /* renamed from: m */
    public void mo9258m(on1 on1Var) {
        super.mo9258m(on1Var);
        on1Var.f21675a.put("android:fade:transitionAlpha", Float.valueOf(gu1.m21227c(on1Var.f21676b)));
    }

    /* renamed from: n0 */
    public final Animator m21121n0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        gu1.m21223g(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, gu1.f11732b, f2);
        ofFloat.addListener(new C1494b(view));
        mo15915a(new C1493a(view));
        return ofFloat;
    }
}
