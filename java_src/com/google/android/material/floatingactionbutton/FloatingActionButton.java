package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.daaw.C1046d4;
import com.daaw.C1655i4;
import com.daaw.C1753it;
import com.daaw.C2366nu;
import com.daaw.InterfaceC3653xz;
import com.daaw.dn1;
import com.daaw.f11;
import com.daaw.fc1;
import com.daaw.gc1;
import com.daaw.hv1;
import com.daaw.jc1;
import com.daaw.k21;
import com.daaw.m21;
import com.daaw.q20;
import com.daaw.rq0;
import com.daaw.ty0;
import com.daaw.vl1;
import com.daaw.xs1;
import com.daaw.zl1;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.C4094a;
import com.google.android.material.stateful.ExtendableSavedState;
import java.util.List;
/* loaded from: classes2.dex */
public class FloatingActionButton extends hv1 implements vl1, zl1, InterfaceC3653xz, jc1, CoordinatorLayout.InterfaceC0193b {

    /* renamed from: E */
    public static final int f37545E = k21.Widget_Design_FloatingActionButton;

    /* renamed from: A */
    public final Rect f37546A;

    /* renamed from: B */
    public final Rect f37547B;

    /* renamed from: C */
    public final C1655i4 f37548C;

    /* renamed from: D */
    public C4094a f37549D;

    /* renamed from: q */
    public ColorStateList f37550q;

    /* renamed from: r */
    public PorterDuff.Mode f37551r;

    /* renamed from: s */
    public ColorStateList f37552s;

    /* renamed from: t */
    public PorterDuff.Mode f37553t;

    /* renamed from: u */
    public ColorStateList f37554u;

    /* renamed from: v */
    public int f37555v;

    /* renamed from: w */
    public int f37556w;

    /* renamed from: x */
    public int f37557x;

    /* renamed from: y */
    public int f37558y;

    /* renamed from: z */
    public boolean f37559z;

    /* loaded from: classes2.dex */
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.AbstractC0194c<T> {

        /* renamed from: a */
        public Rect f37560a;

        /* renamed from: b */
        public AbstractC4091b f37561b;

        /* renamed from: c */
        public boolean f37562c;

        public BaseBehavior() {
            this.f37562c = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m21.f18271k1);
            this.f37562c = obtainStyledAttributes.getBoolean(m21.f18279l1, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: F */
        public static boolean m445F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0197f) {
                return ((CoordinatorLayout.C0197f) layoutParams).m29760f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
        /* renamed from: E */
        public boolean mo440b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f37546A;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: G */
        public final void m444G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f37546A;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.C0197f c0197f = (CoordinatorLayout.C0197f) floatingActionButton.getLayoutParams();
            int i = 0;
            int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) c0197f).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) c0197f).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) c0197f).bottomMargin) {
                i = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) c0197f).topMargin) {
                i = -rect.top;
            }
            if (i != 0) {
                xs1.m4732c0(floatingActionButton, i);
            }
            if (i2 != 0) {
                xs1.m4734b0(floatingActionButton, i2);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
        /* renamed from: H */
        public boolean mo127h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m442K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (m445F(view)) {
                m441L(view, floatingActionButton);
                return false;
            } else {
                return false;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
        /* renamed from: I */
        public boolean mo126l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> m29789r = coordinatorLayout.m29789r(floatingActionButton);
            int size = m29789r.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = m29789r.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m445F(view) && m441L(view, floatingActionButton)) {
                        break;
                    }
                } else if (m442K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.m29816I(floatingActionButton, i);
            m444G(coordinatorLayout, floatingActionButton);
            return true;
        }

        /* renamed from: J */
        public final boolean m443J(View view, FloatingActionButton floatingActionButton) {
            return this.f37562c && ((CoordinatorLayout.C0197f) floatingActionButton.getLayoutParams()).m29761e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        /* renamed from: K */
        public final boolean m442K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (m443J(appBarLayout, floatingActionButton)) {
                if (this.f37560a == null) {
                    this.f37560a = new Rect();
                }
                Rect rect = this.f37560a;
                C1753it.m19438a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    floatingActionButton.m454m(this.f37561b, false);
                    return true;
                }
                floatingActionButton.m447t(this.f37561b, false);
                return true;
            }
            return false;
        }

        /* renamed from: L */
        public final boolean m441L(View view, FloatingActionButton floatingActionButton) {
            if (m443J(view, floatingActionButton)) {
                if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0197f) floatingActionButton.getLayoutParams())).topMargin) {
                    floatingActionButton.m454m(this.f37561b, false);
                    return true;
                }
                floatingActionButton.m447t(this.f37561b, false);
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

    /* loaded from: classes2.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: E */
        public /* bridge */ /* synthetic */ boolean mo439E(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.mo440b(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: H */
        public /* bridge */ /* synthetic */ boolean mo438H(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.mo127h(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: I */
        public /* bridge */ /* synthetic */ boolean mo437I(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return super.mo126l(coordinatorLayout, floatingActionButton, i);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
        /* renamed from: g */
        public /* bridge */ /* synthetic */ void mo103g(CoordinatorLayout.C0197f c0197f) {
            super.mo103g(c0197f);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    /* loaded from: classes2.dex */
    public class C4090a implements C4094a.InterfaceC4104j {

        /* renamed from: a */
        public final /* synthetic */ AbstractC4091b f37563a;

        public C4090a(AbstractC4091b abstractC4091b) {
            this.f37563a = abstractC4091b;
        }

        @Override // com.google.android.material.floatingactionbutton.C4094a.InterfaceC4104j
        /* renamed from: a */
        public void mo371a() {
            this.f37563a.mo435b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.C4094a.InterfaceC4104j
        /* renamed from: b */
        public void mo370b() {
            this.f37563a.mo436a(FloatingActionButton.this);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC4091b {
        /* renamed from: a */
        public void mo436a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo435b(FloatingActionButton floatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    /* loaded from: classes2.dex */
    public class C4092c implements fc1 {
        public C4092c() {
        }

        @Override // com.daaw.fc1
        /* renamed from: a */
        public void mo434a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f37546A.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f37557x, i2 + FloatingActionButton.this.f37557x, i3 + FloatingActionButton.this.f37557x, i4 + FloatingActionButton.this.f37557x);
        }

        @Override // com.daaw.fc1
        /* renamed from: b */
        public void mo433b(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // com.daaw.fc1
        /* renamed from: c */
        public boolean mo432c() {
            return FloatingActionButton.this.f37559z;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$d */
    /* loaded from: classes2.dex */
    public class C4093d<T extends FloatingActionButton> implements C4094a.InterfaceC4103i {

        /* renamed from: a */
        public final dn1<T> f37566a;

        public C4093d(dn1<T> dn1Var) {
            this.f37566a = dn1Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.floatingactionbutton.C4094a.InterfaceC4103i
        /* renamed from: a */
        public void mo373a() {
            this.f37566a.m24208b(FloatingActionButton.this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.floatingactionbutton.C4094a.InterfaceC4103i
        /* renamed from: b */
        public void mo372b() {
            this.f37566a.m24209a(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C4093d) && ((C4093d) obj).f37566a.equals(this.f37566a);
        }

        public int hashCode() {
            return this.f37566a.hashCode();
        }
    }

    private C4094a getImpl() {
        if (this.f37549D == null) {
            this.f37549D = m459h();
        }
        return this.f37549D;
    }

    /* renamed from: r */
    public static int m449r(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return size;
                }
                throw new IllegalArgumentException();
            }
            return i;
        }
        return Math.min(i, size);
    }

    @Override // com.daaw.InterfaceC3653xz
    /* renamed from: a */
    public boolean mo465a() {
        throw null;
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo429C(getDrawableState());
    }

    /* renamed from: e */
    public void m462e(Animator.AnimatorListener animatorListener) {
        getImpl().m399d(animatorListener);
    }

    /* renamed from: f */
    public void m461f(Animator.AnimatorListener animatorListener) {
        getImpl().m397e(animatorListener);
    }

    /* renamed from: g */
    public void m460g(dn1<? extends FloatingActionButton> dn1Var) {
        getImpl().m396f(new C4093d(dn1Var));
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f37550q;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f37551r;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0193b
    public CoordinatorLayout.AbstractC0194c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo389m();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().m386p();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().m383s();
    }

    public Drawable getContentBackground() {
        return getImpl().m392j();
    }

    public int getCustomSize() {
        return this.f37556w;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public rq0 getHideMotionSpec() {
        return getImpl().m387o();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f37554u;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f37554u;
    }

    public gc1 getShapeAppearanceModel() {
        return (gc1) ty0.m8699f(getImpl().m382t());
    }

    public rq0 getShowMotionSpec() {
        return getImpl().m381u();
    }

    public int getSize() {
        return this.f37555v;
    }

    public int getSizeDimension() {
        return m456k(this.f37555v);
    }

    @Override // com.daaw.vl1
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // com.daaw.vl1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // com.daaw.zl1
    public ColorStateList getSupportImageTintList() {
        return this.f37552s;
    }

    @Override // com.daaw.zl1
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f37553t;
    }

    public boolean getUseCompatPadding() {
        return this.f37559z;
    }

    /* renamed from: h */
    public final C4094a m459h() {
        return Build.VERSION.SDK_INT >= 21 ? new q20(this, new C4092c()) : new C4094a(this, new C4092c());
    }

    @Deprecated
    /* renamed from: i */
    public boolean m458i(Rect rect) {
        if (xs1.m4742V(this)) {
            rect.set(0, 0, getWidth(), getHeight());
            m451p(rect);
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public void m457j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m451p(rect);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo377y();
    }

    /* renamed from: k */
    public final int m456k(int i) {
        int i2 = this.f37556w;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            return resources.getDimensionPixelSize(i != 1 ? f11.design_fab_size_normal : f11.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m456k(1) : m456k(0);
    }

    /* renamed from: l */
    public void m455l(AbstractC4091b abstractC4091b) {
        m454m(abstractC4091b, true);
    }

    /* renamed from: m */
    public void m454m(AbstractC4091b abstractC4091b, boolean z) {
        getImpl().m380v(m446u(abstractC4091b), z);
    }

    /* renamed from: n */
    public boolean m453n() {
        return getImpl().m379w();
    }

    /* renamed from: o */
    public boolean m452o() {
        return getImpl().m378x();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().m376z();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().m430B();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f37557x = (sizeDimension - this.f37558y) / 2;
        getImpl().m402b0();
        int min = Math.min(m449r(sizeDimension, i), m449r(sizeDimension, i2));
        Rect rect = this.f37546A;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.m29657a());
        Bundle bundle = (Bundle) ty0.m8699f(extendableSavedState.f37661r.get("expandableWidgetHelper"));
        throw null;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        new ExtendableSavedState(onSaveInstanceState);
        throw null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && m458i(this.f37547B) && !this.f37547B.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public final void m451p(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f37546A;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* renamed from: q */
    public final void m450q() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f37552s;
        if (colorStateList == null) {
            C2366nu.m14824c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f37553t;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C1046d4.m24710e(colorForState, mode));
    }

    /* renamed from: s */
    public void m448s(AbstractC4091b abstractC4091b) {
        m447t(abstractC4091b, true);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f37550q != colorStateList) {
            this.f37550q = colorStateList;
            getImpl().m422J(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f37551r != mode) {
            this.f37551r = mode;
            getImpl().m421K(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().m420L(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().m417O(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().m415Q(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.f37556w) {
            this.f37556w = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().m400c0(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().m388n()) {
            getImpl().m419M(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        throw null;
    }

    public void setHideMotionSpec(rq0 rq0Var) {
        getImpl().m418N(rq0Var);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(rq0.m11069c(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().m404a0();
            if (this.f37552s != null) {
                m450q();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f37548C.m20149i(i);
        m450q();
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f37554u != colorStateList) {
            this.f37554u = colorStateList;
            getImpl().mo414R(this.f37554u);
        }
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().m425G();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().m425G();
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().m413S(z);
    }

    @Override // com.daaw.jc1
    public void setShapeAppearanceModel(gc1 gc1Var) {
        getImpl().m412T(gc1Var);
    }

    public void setShowMotionSpec(rq0 rq0Var) {
        getImpl().m411U(rq0Var);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(rq0.m11069c(getContext(), i));
    }

    public void setSize(int i) {
        this.f37556w = 0;
        if (i != this.f37555v) {
            this.f37555v = i;
            requestLayout();
        }
    }

    @Override // com.daaw.vl1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // com.daaw.vl1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // com.daaw.zl1
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f37552s != colorStateList) {
            this.f37552s = colorStateList;
            m450q();
        }
    }

    @Override // com.daaw.zl1
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f37553t != mode) {
            this.f37553t = mode;
            m450q();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().m424H();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().m424H();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().m424H();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f37559z != z) {
            this.f37559z = z;
            getImpl().mo431A();
        }
    }

    @Override // com.daaw.hv1, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* renamed from: t */
    public void m447t(AbstractC4091b abstractC4091b, boolean z) {
        getImpl().m407Y(m446u(abstractC4091b), z);
    }

    /* renamed from: u */
    public final C4094a.InterfaceC4104j m446u(AbstractC4091b abstractC4091b) {
        if (abstractC4091b == null) {
            return null;
        }
        return new C4090a(abstractC4091b);
    }
}
