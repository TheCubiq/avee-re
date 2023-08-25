package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b */
    public AnimatorSet f37878b;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    /* loaded from: classes2.dex */
    public class C4172a extends AnimatorListenerAdapter {
        public C4172a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f37878b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: H */
    public boolean mo98H(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.f37878b;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet mo101J = mo101J(view, view2, z, z3);
        this.f37878b = mo101J;
        mo101J.addListener(new C4172a());
        this.f37878b.start();
        if (!z2) {
            this.f37878b.end();
        }
        return true;
    }

    /* renamed from: J */
    public abstract AnimatorSet mo101J(View view, View view2, boolean z, boolean z2);
}
