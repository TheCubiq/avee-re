package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.daaw.dn1;
import com.daaw.f11;
import com.daaw.fu1;
import com.daaw.k21;
import com.daaw.mc;
import com.daaw.nn0;
import com.daaw.nu;
import com.daaw.on0;
import com.daaw.xs1;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    public static final int B0 = k21.Widget_MaterialComponents_BottomAppBar;
    public dn1<FloatingActionButton> A0;
    public final int j0;
    public final nn0 k0;
    public Animator l0;
    public Animator m0;
    public int n0;
    public int o0;
    public boolean p0;
    public int q0;
    public ArrayList<g> r0;
    public int s0;
    public boolean t0;
    public boolean u0;
    public Behavior v0;
    public int w0;
    public int x0;
    public int y0;
    public AnimatorListenerAdapter z0;

    /* loaded from: classes2.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        public final Rect e;
        public WeakReference<BottomAppBar> f;
        public int g;
        public final View.OnLayoutChangeListener h;

        /* loaded from: classes2.dex */
        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.j(Behavior.this.e);
                int height = Behavior.this.e.height();
                bottomAppBar.A0(height);
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (Behavior.this.g == 0) {
                    ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(f11.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                    ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                    if (fu1.d(floatingActionButton)) {
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin += bottomAppBar.j0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin += bottomAppBar.j0;
                    }
                }
            }
        }

        public Behavior() {
            this.h = new a();
            this.e = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.h = new a();
            this.e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: M */
        public boolean l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f = new WeakReference<>(bottomAppBar);
            View q0 = bottomAppBar.q0();
            if (q0 != null && !xs1.V(q0)) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) q0.getLayoutParams();
                fVar.d = 49;
                this.g = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                if (q0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) q0;
                    floatingActionButton.addOnLayoutChangeListener(this.h);
                    bottomAppBar.i0(floatingActionButton);
                }
                bottomAppBar.y0();
            }
            coordinatorLayout.I(bottomAppBar, i);
            return super.l(coordinatorLayout, bottomAppBar, i);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: N */
        public boolean A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.A(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int r;
        public boolean s;

        /* loaded from: classes2.dex */
        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.r = parcel.readInt();
            this.s = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.r);
            parcel.writeInt(this.s ? 1 : 0);
        }
    }

    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.n0();
            BottomAppBar.this.l0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.o0();
        }
    }

    /* loaded from: classes2.dex */
    public class b extends FloatingActionButton.b {
        public final /* synthetic */ int a;

        /* loaded from: classes2.dex */
        public class a extends FloatingActionButton.b {
            public a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.n0();
            }
        }

        public b(int i) {
            this.a = i;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.s0(this.a));
            floatingActionButton.s(new a());
        }
    }

    /* loaded from: classes2.dex */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.n0();
            BottomAppBar.this.t0 = false;
            BottomAppBar.this.m0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.o0();
        }
    }

    /* loaded from: classes2.dex */
    public class d extends AnimatorListenerAdapter {
        public boolean a;
        public final /* synthetic */ ActionMenuView b;
        public final /* synthetic */ int c;
        public final /* synthetic */ boolean d;

        public d(ActionMenuView actionMenuView, int i, boolean z) {
            this.b = actionMenuView;
            this.c = i;
            this.d = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                return;
            }
            boolean z = BottomAppBar.this.s0 != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.w0(bottomAppBar.s0);
            BottomAppBar.this.C0(this.b, this.c, this.d, z);
        }
    }

    /* loaded from: classes2.dex */
    public class e implements Runnable {
        public final /* synthetic */ ActionMenuView p;
        public final /* synthetic */ int q;
        public final /* synthetic */ boolean r;

        public e(ActionMenuView actionMenuView, int i, boolean z) {
            this.p = actionMenuView;
            this.q = i;
            this.r = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuView actionMenuView = this.p;
            actionMenuView.setTranslationX(BottomAppBar.this.r0(actionMenuView, this.q, this.r));
        }
    }

    /* loaded from: classes2.dex */
    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.z0.onAnimationStart(animator);
            FloatingActionButton p0 = BottomAppBar.this.p0();
            if (p0 != null) {
                p0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface g {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.w0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return s0(this.n0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.y0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.x0;
    }

    private mc getTopEdgeTreatment() {
        return (mc) this.k0.C().p();
    }

    public boolean A0(int i) {
        float f2 = i;
        if (f2 != getTopEdgeTreatment().f()) {
            getTopEdgeTreatment().m(f2);
            this.k0.invalidateSelf();
            return true;
        }
        return false;
    }

    public final void B0(ActionMenuView actionMenuView, int i, boolean z) {
        C0(actionMenuView, i, z, false);
    }

    public final void C0(ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        e eVar = new e(actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(eVar);
        } else {
            eVar.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.k0.E();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.v0 == null) {
            this.v0 = new Behavior();
        }
        return this.v0;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().c();
    }

    public int getFabAlignmentMode() {
        return this.n0;
    }

    public int getFabAnimationMode() {
        return this.o0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().d();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().e();
    }

    public boolean getHideOnScroll() {
        return this.p0;
    }

    public final void i0(FloatingActionButton floatingActionButton) {
        floatingActionButton.e(this.z0);
        floatingActionButton.f(new f());
        floatingActionButton.g(this.A0);
    }

    public final void j0() {
        Animator animator = this.m0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.l0;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    public void k0(int i, List<Animator> list) {
        FloatingActionButton p0 = p0();
        if (p0 == null || p0.n()) {
            return;
        }
        o0();
        p0.l(new b(i));
    }

    public final void l0(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(p0(), "translationX", s0(i));
        ofFloat.setDuration(300L);
        list.add(ofFloat);
    }

    public final void m0(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        if (Math.abs(actionMenuView.getTranslationX() - r0(actionMenuView, i, z)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
                return;
            }
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
        ofFloat2.addListener(new d(actionMenuView, i, z));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(150L);
        animatorSet.playSequentially(ofFloat2, ofFloat);
        list.add(animatorSet);
    }

    public final void n0() {
        ArrayList<g> arrayList;
        int i = this.q0 - 1;
        this.q0 = i;
        if (i != 0 || (arrayList = this.r0) == null) {
            return;
        }
        Iterator<g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    public final void o0() {
        ArrayList<g> arrayList;
        int i = this.q0;
        this.q0 = i + 1;
        if (i != 0 || (arrayList = this.r0) == null) {
            return;
        }
        Iterator<g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        on0.f(this, this.k0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            j0();
            y0();
        }
        x0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.n0 = savedState.r;
        this.u0 = savedState.s;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.r = this.n0;
        savedState.s = this.u0;
        return savedState;
    }

    public final FloatingActionButton p0() {
        View q0 = q0();
        if (q0 instanceof FloatingActionButton) {
            return (FloatingActionButton) q0;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View q0() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.s(r4)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L2c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L18
        L2c:
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.q0():android.view.View");
    }

    public int r0(ActionMenuView actionMenuView, int i, boolean z) {
        if (i == 1 && z) {
            boolean d2 = fu1.d(this);
            int measuredWidth = d2 ? getMeasuredWidth() : 0;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).a & 8388615) == 8388611) {
                    measuredWidth = d2 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
                }
            }
            return measuredWidth - ((d2 ? actionMenuView.getRight() : actionMenuView.getLeft()) + (d2 ? this.x0 : -this.y0));
        }
        return 0;
    }

    public final float s0(int i) {
        boolean d2 = fu1.d(this);
        if (i == 1) {
            return ((getMeasuredWidth() / 2) - (this.j0 + (d2 ? this.y0 : this.x0))) * (d2 ? -1 : 1);
        }
        return 0.0f;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        nu.o(this.k0, colorStateList);
    }

    public void setCradleVerticalOffset(float f2) {
        if (f2 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().i(f2);
            this.k0.invalidateSelf();
            y0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        this.k0.V(f2);
        getBehavior().G(this, this.k0.B() - this.k0.A());
    }

    public void setFabAlignmentMode(int i) {
        z0(i, 0);
    }

    public void setFabAnimationMode(int i) {
        this.o0 = i;
    }

    public void setFabCradleMargin(float f2) {
        if (f2 != getFabCradleMargin()) {
            getTopEdgeTreatment().j(f2);
            this.k0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f2) {
        if (f2 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().k(f2);
            this.k0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.p0 = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public final boolean t0() {
        FloatingActionButton p0 = p0();
        return p0 != null && p0.o();
    }

    public final void u0(int i, boolean z) {
        if (!xs1.V(this)) {
            this.t0 = false;
            w0(this.s0);
            return;
        }
        Animator animator = this.m0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!t0()) {
            i = 0;
            z = false;
        }
        m0(i, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.m0 = animatorSet;
        animatorSet.addListener(new c());
        this.m0.start();
    }

    public final void v0(int i) {
        if (this.n0 == i || !xs1.V(this)) {
            return;
        }
        Animator animator = this.l0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.o0 == 1) {
            l0(i, arrayList);
        } else {
            k0(i, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.l0 = animatorSet;
        animatorSet.addListener(new a());
        this.l0.start();
    }

    public void w0(int i) {
        if (i != 0) {
            this.s0 = 0;
            getMenu().clear();
            x(i);
        }
    }

    public final void x0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.m0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (t0()) {
            B0(actionMenuView, this.n0, this.u0);
        } else {
            B0(actionMenuView, 0, false);
        }
    }

    public final void y0() {
        getTopEdgeTreatment().n(getFabTranslationX());
        View q0 = q0();
        this.k0.X((this.u0 && t0()) ? 1.0f : 0.0f);
        if (q0 != null) {
            q0.setTranslationY(getFabTranslationY());
            q0.setTranslationX(getFabTranslationX());
        }
    }

    public void z0(int i, int i2) {
        this.s0 = i2;
        this.t0 = true;
        u0(i, this.u0);
        v0(i);
        this.n0 = i;
    }
}
