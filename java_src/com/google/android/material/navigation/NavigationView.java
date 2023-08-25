package com.google.android.material.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.customview.view.AbsSavedState;
import com.daaw.bs0;
import com.daaw.cl;
import com.daaw.cs0;
import com.daaw.gc1;
import com.daaw.gi1;
import com.daaw.i91;
import com.daaw.k21;
import com.daaw.m21;
import com.daaw.mn0;
import com.daaw.nn0;
import com.daaw.on0;
import com.daaw.px1;
import com.daaw.r4;
import com.daaw.ul1;
import com.daaw.w01;
import com.daaw.x01;
import com.daaw.zk;
/* loaded from: classes2.dex */
public class NavigationView extends i91 {
    public static final int[] B = {16842912};
    public static final int[] C = {-16842910};
    public static final int D = k21.Widget_Design_NavigationView;
    public ViewTreeObserver.OnGlobalLayoutListener A;
    public final bs0 u;
    public final cs0 v;
    public c w;
    public final int x;
    public final int[] y;
    public MenuInflater z;

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public Bundle r;

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
            this.r = parcel.readBundle(classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.r);
        }
    }

    /* loaded from: classes2.dex */
    public class a implements e.a {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(e eVar, MenuItem menuItem) {
            c cVar = NavigationView.this.w;
            return cVar != null && cVar.a(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(e eVar) {
        }
    }

    /* loaded from: classes2.dex */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.y);
            boolean z = true;
            boolean z2 = NavigationView.this.y[1] == 0;
            NavigationView.this.v.y(z2);
            NavigationView.this.setDrawTopInsetForeground(z2);
            Activity a = cl.a(NavigationView.this.getContext());
            if (a == null || Build.VERSION.SDK_INT < 21) {
                return;
            }
            NavigationView.this.setDrawBottomInsetForeground(((a.findViewById(16908290).getHeight() == NavigationView.this.getHeight()) && (Color.alpha(a.getWindow().getNavigationBarColor()) != 0)) ? false : false);
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        boolean a(MenuItem menuItem);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w01.navigationViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NavigationView(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private MenuInflater getMenuInflater() {
        if (this.z == null) {
            this.z = new gi1(getContext());
        }
        return this.z;
    }

    @Override // com.daaw.i91
    public void a(px1 px1Var) {
        this.v.k(px1Var);
    }

    public final ColorStateList d(int i) {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            ColorStateList a2 = r4.a(getContext(), typedValue.resourceId);
            if (getContext().getTheme().resolveAttribute(x01.y, typedValue, true)) {
                int i2 = typedValue.data;
                int defaultColor = a2.getDefaultColor();
                int[] iArr = C;
                return new ColorStateList(new int[][]{iArr, B, FrameLayout.EMPTY_STATE_SET}, new int[]{a2.getColorForState(iArr, defaultColor), i2, defaultColor});
            }
            return null;
        }
        return null;
    }

    public final Drawable e(ul1 ul1Var) {
        nn0 nn0Var = new nn0(gc1.b(getContext(), ul1Var.n(m21.v3, 0), ul1Var.n(m21.w3, 0)).m());
        nn0Var.W(mn0.b(getContext(), ul1Var, m21.x3));
        return new InsetDrawable((Drawable) nn0Var, ul1Var.f(m21.A3, 0), ul1Var.f(m21.B3, 0), ul1Var.f(m21.z3, 0), ul1Var.f(m21.y3, 0));
    }

    public View f(int i) {
        return this.v.p(i);
    }

    public final boolean g(ul1 ul1Var) {
        return ul1Var.s(m21.v3) || ul1Var.s(m21.w3);
    }

    public MenuItem getCheckedItem() {
        return this.v.n();
    }

    public int getHeaderCount() {
        return this.v.o();
    }

    public Drawable getItemBackground() {
        return this.v.q();
    }

    public int getItemHorizontalPadding() {
        return this.v.r();
    }

    public int getItemIconPadding() {
        return this.v.s();
    }

    public ColorStateList getItemIconTintList() {
        return this.v.v();
    }

    public int getItemMaxLines() {
        return this.v.t();
    }

    public ColorStateList getItemTextColor() {
        return this.v.u();
    }

    public Menu getMenu() {
        return this.u;
    }

    public View h(int i) {
        return this.v.x(i);
    }

    public void i(int i) {
        this.v.K(true);
        getMenuInflater().inflate(i, this.u);
        this.v.K(false);
        this.v.c(false);
    }

    public final void j() {
        this.A = new b();
        getViewTreeObserver().addOnGlobalLayoutListener(this.A);
    }

    @Override // com.daaw.i91, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        on0.e(this);
    }

    @Override // com.daaw.i91, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.A);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int min;
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                min = this.x;
            }
            super.onMeasure(i, i2);
        }
        min = Math.min(View.MeasureSpec.getSize(i), this.x);
        i = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.u.S(savedState.r);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.r = bundle;
        this.u.U(bundle);
        return savedState;
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.u.findItem(i);
        if (findItem != null) {
            this.v.z((g) findItem);
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.u.findItem(menuItem.getItemId());
        if (findItem == null) {
            throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
        }
        this.v.z((g) findItem);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.setElevation(f);
        }
        on0.d(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        this.v.B(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(zk.e(getContext(), i));
    }

    public void setItemHorizontalPadding(int i) {
        this.v.C(i);
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.v.C(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(int i) {
        this.v.D(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.v.D(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(int i) {
        this.v.E(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.v.F(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.v.G(i);
    }

    public void setItemTextAppearance(int i) {
        this.v.H(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.v.I(colorStateList);
    }

    public void setNavigationItemSelectedListener(c cVar) {
        this.w = cVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        cs0 cs0Var = this.v;
        if (cs0Var != null) {
            cs0Var.J(i);
        }
    }
}
