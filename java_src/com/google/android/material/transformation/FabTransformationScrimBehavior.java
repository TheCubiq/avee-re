package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.daaw.C1653i3;
import com.daaw.sq0;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
@Deprecated
/* loaded from: classes2.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    public final sq0 f37899c;

    /* renamed from: d */
    public final sq0 f37900d;

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    /* loaded from: classes2.dex */
    public class C4178a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f37901a;

        /* renamed from: b */
        public final /* synthetic */ View f37902b;

        public C4178a(boolean z, View view) {
            this.f37901a = z;
            this.f37902b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f37901a) {
                return;
            }
            this.f37902b.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f37901a) {
                this.f37902b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f37899c = new sq0(75L, 150L);
        this.f37900d = new sq0(0L, 150L);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37899c = new sq0(75L, 150L);
        this.f37900d = new sq0(0L, 150L);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
    /* renamed from: D */
    public boolean mo102D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.mo102D(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: J */
    public AnimatorSet mo101J(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        m100K(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C1653i3.m20165a(animatorSet, arrayList);
        animatorSet.addListener(new C4178a(z, view2));
        return animatorSet;
    }

    /* renamed from: K */
    public final void m100K(View view, boolean z, boolean z2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        sq0 sq0Var = z ? this.f37899c : this.f37900d;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f);
        }
        sq0Var.m10052a(ofFloat);
        list.add(ofFloat);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
    /* renamed from: e */
    public boolean mo99e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }
}
