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
import com.daaw.C1753it;
import com.daaw.k21;
import com.daaw.m21;
import com.daaw.rq0;
import com.daaw.xs1;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;
/* loaded from: classes2.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.InterfaceC0193b {

    /* renamed from: V */
    public static final int f37521V = k21.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* renamed from: W */
    public static final Property<View, Float> f37522W = new C4085b(Float.class, "width");

    /* renamed from: a0 */
    public static final Property<View, Float> f37523a0 = new C4086c(Float.class, "height");

    /* renamed from: b0 */
    public static final Property<View, Float> f37524b0 = new C4087d(Float.class, "paddingStart");

    /* renamed from: c0 */
    public static final Property<View, Float> f37525c0 = new C4088e(Float.class, "paddingEnd");

    /* renamed from: I */
    public int f37526I;

    /* renamed from: J */
    public final InterfaceC4107b f37527J;

    /* renamed from: K */
    public final InterfaceC4107b f37528K;

    /* renamed from: L */
    public final InterfaceC4107b f37529L;

    /* renamed from: M */
    public final InterfaceC4107b f37530M;

    /* renamed from: N */
    public final int f37531N;

    /* renamed from: O */
    public int f37532O;

    /* renamed from: P */
    public int f37533P;

    /* renamed from: Q */
    public final CoordinatorLayout.AbstractC0194c<ExtendedFloatingActionButton> f37534Q;

    /* renamed from: R */
    public boolean f37535R;

    /* renamed from: S */
    public boolean f37536S;

    /* renamed from: T */
    public boolean f37537T;

    /* renamed from: U */
    public ColorStateList f37538U;

    /* loaded from: classes2.dex */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.AbstractC0194c<T> {

        /* renamed from: a */
        public Rect f37539a;

        /* renamed from: b */
        public boolean f37540b;

        /* renamed from: c */
        public boolean f37541c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f37540b = false;
            this.f37541c = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m21.f18239g1);
            this.f37540b = obtainStyledAttributes.getBoolean(m21.f18247h1, false);
            this.f37541c = obtainStyledAttributes.getBoolean(m21.f18255i1, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: G */
        public static boolean m480G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0197f) {
                return ((CoordinatorLayout.C0197f) layoutParams).m29760f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: E */
        public void m482E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.m485r(this.f37541c ? extendedFloatingActionButton.f37528K : extendedFloatingActionButton.f37529L, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
        /* renamed from: F */
        public boolean mo440b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.mo440b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
        /* renamed from: H */
        public boolean mo127h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m475L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (m480G(view)) {
                m474M(view, extendedFloatingActionButton);
                return false;
            } else {
                return false;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
        /* renamed from: I */
        public boolean mo126l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> m29789r = coordinatorLayout.m29789r(extendedFloatingActionButton);
            int size = m29789r.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = m29789r.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m480G(view) && m474M(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (m475L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.m29816I(extendedFloatingActionButton, i);
            return true;
        }

        /* renamed from: J */
        public final boolean m477J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f37540b || this.f37541c) && ((CoordinatorLayout.C0197f) extendedFloatingActionButton.getLayoutParams()).m29761e() == view.getId();
        }

        /* renamed from: K */
        public void m476K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.m485r(this.f37541c ? extendedFloatingActionButton.f37527J : extendedFloatingActionButton.f37530M, null);
        }

        /* renamed from: L */
        public final boolean m475L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (m477J(appBarLayout, extendedFloatingActionButton)) {
                if (this.f37539a == null) {
                    this.f37539a = new Rect();
                }
                Rect rect = this.f37539a;
                C1753it.m19438a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    m476K(extendedFloatingActionButton);
                    return true;
                }
                m482E(extendedFloatingActionButton);
                return true;
            }
            return false;
        }

        /* renamed from: M */
        public final boolean m474M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (m477J(view, extendedFloatingActionButton)) {
                if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0197f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                    m476K(extendedFloatingActionButton);
                    return true;
                }
                m482E(extendedFloatingActionButton);
                return true;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
        /* renamed from: g */
        public void mo103g(CoordinatorLayout.C0197f c0197f) {
            if (c0197f.f1143h == 0) {
                c0197f.f1143h = 80;
            }
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    /* loaded from: classes2.dex */
    public class C4084a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f37542a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC4107b f37543b;

        public C4084a(InterfaceC4107b interfaceC4107b, AbstractC4089f abstractC4089f) {
            this.f37543b = interfaceC4107b;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f37542a = true;
            this.f37543b.m368a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f37543b.m364e();
            if (this.f37542a) {
                return;
            }
            this.f37543b.m360i(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f37543b.onAnimationStart(animator);
            this.f37542a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    /* loaded from: classes2.dex */
    public static class C4085b extends Property<View, Float> {
        public C4085b(Class cls, String str) {
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

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    /* loaded from: classes2.dex */
    public static class C4086c extends Property<View, Float> {
        public C4086c(Class cls, String str) {
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

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    /* loaded from: classes2.dex */
    public static class C4087d extends Property<View, Float> {
        public C4087d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(xs1.m4758J(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            xs1.m4767E0(view, f.intValue(), view.getPaddingTop(), xs1.m4760I(view), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$e */
    /* loaded from: classes2.dex */
    public static class C4088e extends Property<View, Float> {
        public C4088e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(xs1.m4760I(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            xs1.m4767E0(view, xs1.m4758J(view), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC4089f {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0193b
    public CoordinatorLayout.AbstractC0194c<ExtendedFloatingActionButton> getBehavior() {
        return this.f37534Q;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        int i = this.f37531N;
        return i < 0 ? (Math.min(xs1.m4758J(this), xs1.m4760I(this)) * 2) + getIconSize() : i;
    }

    public rq0 getExtendMotionSpec() {
        return this.f37528K.m366c();
    }

    public rq0 getHideMotionSpec() {
        return this.f37530M.m366c();
    }

    public rq0 getShowMotionSpec() {
        return this.f37529L.m366c();
    }

    public rq0 getShrinkMotionSpec() {
        return this.f37527J.m366c();
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f37535R && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f37535R = false;
            this.f37527J.m367b();
        }
    }

    /* renamed from: q */
    public final boolean m486q() {
        return getVisibility() != 0 ? this.f37526I == 2 : this.f37526I != 1;
    }

    /* renamed from: r */
    public final void m485r(InterfaceC4107b interfaceC4107b, AbstractC4089f abstractC4089f) {
        if (interfaceC4107b.m365d()) {
            return;
        }
        if (!m483t()) {
            interfaceC4107b.m367b();
            interfaceC4107b.m360i(abstractC4089f);
            return;
        }
        measure(0, 0);
        AnimatorSet m362g = interfaceC4107b.m362g();
        m362g.addListener(new C4084a(interfaceC4107b, abstractC4089f));
        for (Animator.AnimatorListener animatorListener : interfaceC4107b.m361h()) {
            m362g.addListener(animatorListener);
        }
        m362g.start();
    }

    /* renamed from: s */
    public final void m484s() {
        this.f37538U = getTextColors();
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.f37537T = z;
    }

    public void setExtendMotionSpec(rq0 rq0Var) {
        this.f37528K.m363f(rq0Var);
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(rq0.m11069c(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.f37535R == z) {
            return;
        }
        InterfaceC4107b interfaceC4107b = z ? this.f37528K : this.f37527J;
        if (interfaceC4107b.m365d()) {
            return;
        }
        interfaceC4107b.m367b();
    }

    public void setHideMotionSpec(rq0 rq0Var) {
        this.f37530M.m363f(rq0Var);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(rq0.m11069c(getContext(), i));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.f37535R || this.f37536S) {
            return;
        }
        this.f37532O = xs1.m4758J(this);
        this.f37533P = xs1.m4760I(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (!this.f37535R || this.f37536S) {
            return;
        }
        this.f37532O = i;
        this.f37533P = i3;
    }

    public void setShowMotionSpec(rq0 rq0Var) {
        this.f37529L.m363f(rq0Var);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(rq0.m11069c(getContext(), i));
    }

    public void setShrinkMotionSpec(rq0 rq0Var) {
        this.f37527J.m363f(rq0Var);
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(rq0.m11069c(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        m484s();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        m484s();
    }

    /* renamed from: t */
    public final boolean m483t() {
        return (xs1.m4742V(this) || (!m486q() && this.f37537T)) && !isInEditMode();
    }
}
