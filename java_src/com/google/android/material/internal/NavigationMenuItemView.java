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
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.b;
import com.daaw.a21;
import com.daaw.em1;
import com.daaw.f11;
import com.daaw.h30;
import com.daaw.j11;
import com.daaw.j51;
import com.daaw.m11;
import com.daaw.nu;
import com.daaw.sk1;
import com.daaw.w;
import com.daaw.x01;
import com.daaw.xs1;
import com.daaw.y;
/* loaded from: classes2.dex */
public class NavigationMenuItemView extends h30 implements j.a {
    public static final int[] U = {16842912};
    public int K;
    public boolean L;
    public boolean M;
    public final CheckedTextView N;
    public FrameLayout O;
    public g P;
    public ColorStateList Q;
    public boolean R;
    public Drawable S;
    public final w T;

    /* loaded from: classes2.dex */
    public class a extends w {
        public a() {
        }

        @Override // com.daaw.w
        public void g(View view, y yVar) {
            super.g(view, yVar);
            yVar.Z(NavigationMenuItemView.this.M);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a aVar = new a();
        this.T = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(a21.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(f11.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(m11.design_menu_item_text);
        this.N = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        xs1.r0(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.O == null) {
                this.O = (FrameLayout) ((ViewStub) findViewById(m11.design_menu_item_action_area_stub)).inflate();
            }
            this.O.removeAllViews();
            this.O.addView(view);
        }
    }

    public final void B() {
        b.a aVar;
        int i;
        if (E()) {
            this.N.setVisibility(8);
            FrameLayout frameLayout = this.O;
            if (frameLayout == null) {
                return;
            }
            aVar = (b.a) frameLayout.getLayoutParams();
            i = -1;
        } else {
            this.N.setVisibility(0);
            FrameLayout frameLayout2 = this.O;
            if (frameLayout2 == null) {
                return;
            }
            aVar = (b.a) frameLayout2.getLayoutParams();
            i = -2;
        }
        ((LinearLayout.LayoutParams) aVar).width = i;
        this.O.setLayoutParams(aVar);
    }

    public final StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(x01.w, typedValue, true)) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(U, new ColorDrawable(typedValue.data));
            stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            return stateListDrawable;
        }
        return null;
    }

    public void D() {
        FrameLayout frameLayout = this.O;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.N.setCompoundDrawables(null, null, null, null);
    }

    public final boolean E() {
        return this.P.getTitle() == null && this.P.getIcon() == null && this.P.getActionView() != null;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void e(g gVar, int i) {
        this.P = gVar;
        if (gVar.getItemId() > 0) {
            setId(gVar.getItemId());
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            xs1.v0(this, C());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        em1.a(this, gVar.getTooltipText());
        B();
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.P;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        g gVar = this.P;
        if (gVar != null && gVar.isCheckable() && this.P.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, U);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.M != z) {
            this.M = z;
            this.T.l(this.N, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.N.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.R) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = nu.r(drawable).mutate();
                nu.o(drawable, this.Q);
            }
            int i = this.K;
            drawable.setBounds(0, 0, i, i);
        } else if (this.L) {
            if (this.S == null) {
                Drawable d = j51.d(getResources(), j11.navigation_empty_icon, getContext().getTheme());
                this.S = d;
                if (d != null) {
                    int i2 = this.K;
                    d.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.S;
        }
        sk1.i(this.N, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.N.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.K = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.Q = colorStateList;
        this.R = colorStateList != null;
        g gVar = this.P;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.N.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.L = z;
    }

    public void setTextAppearance(int i) {
        sk1.n(this.N, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.N.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.N.setText(charSequence);
    }
}
