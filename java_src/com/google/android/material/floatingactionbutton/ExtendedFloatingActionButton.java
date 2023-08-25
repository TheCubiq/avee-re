package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.daaw.it;
import com.daaw.k21;
import com.daaw.m21;
import com.daaw.rq0;
import com.daaw.xs1;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;
/* loaded from: classes2.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    public static final int V = k21.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;
    public static final Property<View, Float> W = new b(Float.class, "width");
    public static final Property<View, Float> a0 = new c(Float.class, "height");
    public static final Property<View, Float> b0 = new d(Float.class, "paddingStart");
    public static final Property<View, Float> c0 = new e(Float.class, "paddingEnd");
    public int I;
    public final com.google.android.material.floatingactionbutton.b J;
    public final com.google.android.material.floatingactionbutton.b K;
    public final com.google.android.material.floatingactionbutton.b L;
    public final com.google.android.material.floatingactionbutton.b M;
    public final int N;
    public int O;
    public int P;
    public final CoordinatorLayout.c<ExtendedFloatingActionButton> Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public ColorStateList U;

    /* loaded from: classes2.dex */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {
        public Rect a;
        public boolean b;
        public boolean c;

        public ExtendedFloatingActionButtonBehavior() {
            this.b = false;
            this.c = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m21.g1);
            this.b = obtainStyledAttributes.getBoolean(m21.h1, false);
            this.c = obtainStyledAttributes.getBoolean(m21.i1, true);
            obtainStyledAttributes.recycle();
        }

        public static boolean G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        public void E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.r(this.c ? extendedFloatingActionButton.K : extendedFloatingActionButton.L, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: F */
        public boolean b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: H */
        public boolean h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (G(view)) {
                M(view, extendedFloatingActionButton);
                return false;
            } else {
                return false;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: I */
        public boolean l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> r = coordinatorLayout.r(extendedFloatingActionButton);
            int size = r.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = r.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (G(view) && M(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.I(extendedFloatingActionButton, i);
            return true;
        }

        public final boolean J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.b || this.c) && ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).e() == view.getId();
        }

        public void K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.r(this.c ? extendedFloatingActionButton.J : extendedFloatingActionButton.M, null);
        }

        public final boolean L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (J(appBarLayout, extendedFloatingActionButton)) {
                if (this.a == null) {
                    this.a = new Rect();
                }
                Rect rect = this.a;
                it.a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    K(extendedFloatingActionButton);
                    return true;
                }
                E(extendedFloatingActionButton);
                return true;
            }
            return false;
        }

        public final boolean M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (J(view, extendedFloatingActionButton)) {
                if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                    K(extendedFloatingActionButton);
                    return true;
                }
                E(extendedFloatingActionButton);
                return true;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void g(CoordinatorLayout.f fVar) {
            if (fVar.h == 0) {
                fVar.h = 80;
            }
        }
    }

    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        public boolean a;
        public final /* synthetic */ com.google.android.material.floatingactionbutton.b b;

        public a(com.google.android.material.floatingactionbutton.b bVar, f fVar) {
            this.b = bVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
            this.b.a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.b.e();
            if (this.a) {
                return;
            }
            this.b.i(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.b.onAnimationStart(animator);
            this.a = false;
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends Property<View, Float> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends Property<View, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    /* loaded from: classes2.dex */
    public static class d extends Property<View, Float> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(xs1.J(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            xs1.E0(view, f.intValue(), view.getPaddingTop(), xs1.I(view), view.getPaddingBottom());
        }
    }

    /* loaded from: classes2.dex */
    public static class e extends Property<View, Float> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(xs1.I(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            xs1.E0(view, xs1.J(view), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class f {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.Q;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        int i = this.N;
        return i < 0 ? (Math.min(xs1.J(this), xs1.I(this)) * 2) + getIconSize() : i;
    }

    public rq0 getExtendMotionSpec() {
        return this.K.c();
    }

    public rq0 getHideMotionSpec() {
        return this.M.c();
    }

    public rq0 getShowMotionSpec() {
        return this.L.c();
    }

    public rq0 getShrinkMotionSpec() {
        return this.J.c();
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.R && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.R = false;
            this.J.b();
        }
    }

    public final boolean q() {
        return getVisibility() != 0 ? this.I == 2 : this.I != 1;
    }

    public final void r(com.google.android.material.floatingactionbutton.b bVar, f fVar) {
        if (bVar.d()) {
            return;
        }
        if (!t()) {
            bVar.b();
            bVar.i(fVar);
            return;
        }
        measure(0, 0);
        AnimatorSet g = bVar.g();
        g.addListener(new a(bVar, fVar));
        for (Animator.AnimatorListener animatorListener : bVar.h()) {
            g.addListener(animatorListener);
        }
        g.start();
    }

    public final void s() {
        this.U = getTextColors();
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.T = z;
    }

    public void setExtendMotionSpec(rq0 rq0Var) {
        this.K.f(rq0Var);
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(rq0.c(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.R == z) {
            return;
        }
        com.google.android.material.floatingactionbutton.b bVar = z ? this.K : this.J;
        if (bVar.d()) {
            return;
        }
        bVar.b();
    }

    public void setHideMotionSpec(rq0 rq0Var) {
        this.M.f(rq0Var);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(rq0.c(getContext(), i));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.R || this.S) {
            return;
        }
        this.O = xs1.J(this);
        this.P = xs1.I(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (!this.R || this.S) {
            return;
        }
        this.O = i;
        this.P = i3;
    }

    public void setShowMotionSpec(rq0 rq0Var) {
        this.L.f(rq0Var);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(rq0.c(getContext(), i));
    }

    public void setShrinkMotionSpec(rq0 rq0Var) {
        this.J.f(rq0Var);
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(rq0.c(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        s();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        s();
    }

    public final boolean t() {
        return (xs1.V(this) || (!q() && this.T)) && !isInEditMode();
    }
}
