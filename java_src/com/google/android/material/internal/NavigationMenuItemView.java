package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.C0086g;
import androidx.appcompat.view.menu.InterfaceC0093j;
import androidx.appcompat.widget.C0164b;
import com.daaw.C2366nu;
import com.daaw.C3388w;
import com.daaw.C3654y;
import com.daaw.a21;
import com.daaw.em1;
import com.daaw.f11;
import com.daaw.h30;
import com.daaw.j11;
import com.daaw.j51;
import com.daaw.m11;
import com.daaw.sk1;
import com.daaw.x01;
import com.daaw.xs1;
/* loaded from: classes2.dex */
public class NavigationMenuItemView extends h30 implements InterfaceC0093j.InterfaceC0094a {

    /* renamed from: U */
    public static final int[] f37631U = {16842912};

    /* renamed from: K */
    public int f37632K;

    /* renamed from: L */
    public boolean f37633L;

    /* renamed from: M */
    public boolean f37634M;

    /* renamed from: N */
    public final CheckedTextView f37635N;

    /* renamed from: O */
    public FrameLayout f37636O;

    /* renamed from: P */
    public C0086g f37637P;

    /* renamed from: Q */
    public ColorStateList f37638Q;

    /* renamed from: R */
    public boolean f37639R;

    /* renamed from: S */
    public Drawable f37640S;

    /* renamed from: T */
    public final C3388w f37641T;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    /* loaded from: classes2.dex */
    public class C4110a extends C3388w {
        public C4110a() {
        }

        @Override // com.daaw.C3388w
        /* renamed from: g */
        public void mo161g(View view, C3654y c3654y) {
            super.mo161g(view, c3654y);
            c3654y.m4339Z(NavigationMenuItemView.this.f37634M);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C4110a c4110a = new C4110a();
        this.f37641T = c4110a;
        setOrientation(0);
        LayoutInflater.from(context).inflate(a21.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(f11.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(m11.design_menu_item_text);
        this.f37635N = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        xs1.m4702r0(checkedTextView, c4110a);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f37636O == null) {
                this.f37636O = (FrameLayout) ((ViewStub) findViewById(m11.design_menu_item_action_area_stub)).inflate();
            }
            this.f37636O.removeAllViews();
            this.f37636O.addView(view);
        }
    }

    /* renamed from: B */
    public final void m353B() {
        C0164b.C0165a c0165a;
        int i;
        if (m350E()) {
            this.f37635N.setVisibility(8);
            FrameLayout frameLayout = this.f37636O;
            if (frameLayout == null) {
                return;
            }
            c0165a = (C0164b.C0165a) frameLayout.getLayoutParams();
            i = -1;
        } else {
            this.f37635N.setVisibility(0);
            FrameLayout frameLayout2 = this.f37636O;
            if (frameLayout2 == null) {
                return;
            }
            c0165a = (C0164b.C0165a) frameLayout2.getLayoutParams();
            i = -2;
        }
        ((LinearLayout.LayoutParams) c0165a).width = i;
        this.f37636O.setLayoutParams(c0165a);
    }

    /* renamed from: C */
    public final StateListDrawable m352C() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(x01.f31709w, typedValue, true)) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(f37631U, new ColorDrawable(typedValue.data));
            stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            return stateListDrawable;
        }
        return null;
    }

    /* renamed from: D */
    public void m351D() {
        FrameLayout frameLayout = this.f37636O;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f37635N.setCompoundDrawables(null, null, null, null);
    }

    /* renamed from: E */
    public final boolean m350E() {
        return this.f37637P.getTitle() == null && this.f37637P.getIcon() == null && this.f37637P.getActionView() != null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093j.InterfaceC0094a
    /* renamed from: d */
    public boolean mo349d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093j.InterfaceC0094a
    /* renamed from: e */
    public void mo348e(C0086g c0086g, int i) {
        this.f37637P = c0086g;
        if (c0086g.getItemId() > 0) {
            setId(c0086g.getItemId());
        }
        setVisibility(c0086g.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            xs1.m4694v0(this, m352C());
        }
        setCheckable(c0086g.isCheckable());
        setChecked(c0086g.isChecked());
        setEnabled(c0086g.isEnabled());
        setTitle(c0086g.getTitle());
        setIcon(c0086g.getIcon());
        setActionView(c0086g.getActionView());
        setContentDescription(c0086g.getContentDescription());
        em1.m23375a(this, c0086g.getTooltipText());
        m353B();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093j.InterfaceC0094a
    public C0086g getItemData() {
        return this.f37637P;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0086g c0086g = this.f37637P;
        if (c0086g != null && c0086g.isCheckable() && this.f37637P.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f37631U);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f37634M != z) {
            this.f37634M = z;
            this.f37641T.mo6627l(this.f37635N, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f37635N.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f37639R) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C2366nu.m14809r(drawable).mutate();
                C2366nu.m14812o(drawable, this.f37638Q);
            }
            int i = this.f37632K;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f37633L) {
            if (this.f37640S == null) {
                Drawable m18896d = j51.m18896d(getResources(), j11.navigation_empty_icon, getContext().getTheme());
                this.f37640S = m18896d;
                if (m18896d != null) {
                    int i2 = this.f37632K;
                    m18896d.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f37640S;
        }
        sk1.m10265i(this.f37635N, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f37635N.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f37632K = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f37638Q = colorStateList;
        this.f37639R = colorStateList != null;
        C0086g c0086g = this.f37637P;
        if (c0086g != null) {
            setIcon(c0086g.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f37635N.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f37633L = z;
    }

    public void setTextAppearance(int i) {
        sk1.m10260n(this.f37635N, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f37635N.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f37635N.setText(charSequence);
    }
}
