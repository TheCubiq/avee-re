package com.google.android.material.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
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
import androidx.appcompat.view.menu.C0082e;
import androidx.appcompat.view.menu.C0086g;
import androidx.customview.view.AbsSavedState;
import com.daaw.C0967cl;
import com.daaw.C2818r4;
import com.daaw.C3866zk;
import com.daaw.bs0;
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
import com.daaw.qn0;
import com.daaw.ul1;
import com.daaw.w01;
import com.daaw.x01;
import com.daaw.xk1;
import com.daaw.xs1;
/* loaded from: classes2.dex */
public class NavigationView extends i91 {

    /* renamed from: B */
    public static final int[] f37643B = {16842912};

    /* renamed from: C */
    public static final int[] f37644C = {-16842910};

    /* renamed from: D */
    public static final int f37645D = k21.Widget_Design_NavigationView;

    /* renamed from: A */
    public ViewTreeObserver.OnGlobalLayoutListener f37646A;

    /* renamed from: u */
    public final bs0 f37647u;

    /* renamed from: v */
    public final cs0 f37648v;

    /* renamed from: w */
    public InterfaceC4115c f37649w;

    /* renamed from: x */
    public final int f37650x;

    /* renamed from: y */
    public final int[] f37651y;

    /* renamed from: z */
    public MenuInflater f37652z;

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4112a();

        /* renamed from: r */
        public Bundle f37653r;

        /* renamed from: com.google.android.material.navigation.NavigationView$SavedState$a */
        /* loaded from: classes2.dex */
        public static class C4112a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.f37653r = parcel.readBundle(classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f37653r);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$a */
    /* loaded from: classes2.dex */
    public class C4113a implements C0082e.InterfaceC0083a {
        public C4113a() {
        }

        @Override // androidx.appcompat.view.menu.C0082e.InterfaceC0083a
        /* renamed from: a */
        public boolean mo330a(C0082e c0082e, MenuItem menuItem) {
            InterfaceC4115c interfaceC4115c = NavigationView.this.f37649w;
            return interfaceC4115c != null && interfaceC4115c.mo328a(menuItem);
        }

        @Override // androidx.appcompat.view.menu.C0082e.InterfaceC0083a
        /* renamed from: b */
        public void mo329b(C0082e c0082e) {
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$b */
    /* loaded from: classes2.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC4114b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserver$OnGlobalLayoutListenerC4114b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.f37651y);
            boolean z = true;
            boolean z2 = NavigationView.this.f37651y[1] == 0;
            NavigationView.this.f37648v.m25006y(z2);
            NavigationView.this.setDrawTopInsetForeground(z2);
            Activity m25255a = C0967cl.m25255a(NavigationView.this.getContext());
            if (m25255a == null || Build.VERSION.SDK_INT < 21) {
                return;
            }
            NavigationView.this.setDrawBottomInsetForeground(((m25255a.findViewById(16908290).getHeight() == NavigationView.this.getHeight()) && (Color.alpha(m25255a.getWindow().getNavigationBarColor()) != 0)) ? false : false);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC4115c {
        /* renamed from: a */
        boolean mo328a(MenuItem menuItem);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w01.navigationViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        super(qn0.m12324c(context, attributeSet, i, r6), attributeSet, i);
        int i2;
        boolean z;
        int i3 = f37645D;
        cs0 cs0Var = new cs0();
        this.f37648v = cs0Var;
        this.f37651y = new int[2];
        Context context2 = getContext();
        bs0 bs0Var = new bs0(context2);
        this.f37647u = bs0Var;
        ul1 m5025i = xk1.m5025i(context2, attributeSet, m21.f18265j3, i, i3, new int[0]);
        int i4 = m21.f18273k3;
        if (m5025i.m8040s(i4)) {
            xs1.m4694v0(this, m5025i.m8052g(i4));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            gc1 m21769m = gc1.m21808e(context2, attributeSet, i, i3).m21769m();
            Drawable background = getBackground();
            nn0 nn0Var = new nn0(m21769m);
            if (background instanceof ColorDrawable) {
                nn0Var.m14997W(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            nn0Var.m15007M(context2);
            xs1.m4694v0(this, nn0Var);
        }
        int i5 = m21.f18297n3;
        if (m5025i.m8040s(i5)) {
            setElevation(m5025i.m8053f(i5, 0));
        }
        setFitsSystemWindows(m5025i.m8058a(m21.f18281l3, false));
        this.f37650x = m5025i.m8053f(m21.f18289m3, 0);
        int i6 = m21.f18339t3;
        ColorStateList m8056c = m5025i.m8040s(i6) ? m5025i.m8056c(i6) : m340d(16842808);
        int i7 = m21.f18025C3;
        if (m5025i.m8040s(i7)) {
            i2 = m5025i.m8045n(i7, 0);
            z = true;
        } else {
            i2 = 0;
            z = false;
        }
        int i8 = m21.f18332s3;
        if (m5025i.m8040s(i8)) {
            setItemIconSize(m5025i.m8053f(i8, 0));
        }
        int i9 = m21.f18032D3;
        ColorStateList m8056c2 = m5025i.m8040s(i9) ? m5025i.m8056c(i9) : null;
        if (!z && m8056c2 == null) {
            m8056c2 = m340d(16842806);
        }
        Drawable m8052g = m5025i.m8052g(m21.f18311p3);
        if (m8052g == null && m337g(m5025i)) {
            m8052g = m339e(m5025i);
        }
        int i10 = m21.f18318q3;
        if (m5025i.m8040s(i10)) {
            cs0Var.m25036C(m5025i.m8053f(i10, 0));
        }
        int m8053f = m5025i.m8053f(m21.f18325r3, 0);
        setItemMaxLines(m5025i.m8048k(m21.f18346u3, 1));
        bs0Var.mo30169V(new C4113a());
        cs0Var.m25038A(1);
        cs0Var.mo17562i(context2, bs0Var);
        cs0Var.m25033F(m8056c);
        cs0Var.m25029J(getOverScrollMode());
        if (z) {
            cs0Var.m25031H(i2);
        }
        cs0Var.m25030I(m8056c2);
        cs0Var.m25037B(m8052g);
        cs0Var.m25035D(m8053f);
        bs0Var.m30245b(cs0Var);
        addView((View) cs0Var.m25008w(this));
        int i11 = m21.f18039E3;
        if (m5025i.m8040s(i11)) {
            m335i(m5025i.m8045n(i11, 0));
        }
        int i12 = m21.f18304o3;
        if (m5025i.m8040s(i12)) {
            m336h(m5025i.m8045n(i12, 0));
        }
        m5025i.m8036w();
        m334j();
    }

    private MenuInflater getMenuInflater() {
        if (this.f37652z == null) {
            this.f37652z = new gi1(getContext());
        }
        return this.f37652z;
    }

    @Override // com.daaw.i91
    /* renamed from: a */
    public void mo343a(px1 px1Var) {
        this.f37648v.m25020k(px1Var);
    }

    /* renamed from: d */
    public final ColorStateList m340d(int i) {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            ColorStateList m11784a = C2818r4.m11784a(getContext(), typedValue.resourceId);
            if (getContext().getTheme().resolveAttribute(x01.f31710y, typedValue, true)) {
                int i2 = typedValue.data;
                int defaultColor = m11784a.getDefaultColor();
                int[] iArr = f37644C;
                return new ColorStateList(new int[][]{iArr, f37643B, FrameLayout.EMPTY_STATE_SET}, new int[]{m11784a.getColorForState(iArr, defaultColor), i2, defaultColor});
            }
            return null;
        }
        return null;
    }

    /* renamed from: e */
    public final Drawable m339e(ul1 ul1Var) {
        nn0 nn0Var = new nn0(gc1.m21811b(getContext(), ul1Var.m8045n(m21.f18353v3, 0), ul1Var.m8045n(m21.f18360w3, 0)).m21769m());
        nn0Var.m14997W(mn0.m15929b(getContext(), ul1Var, m21.f18367x3));
        return new InsetDrawable((Drawable) nn0Var, ul1Var.m8053f(m21.f18011A3, 0), ul1Var.m8053f(m21.f18018B3, 0), ul1Var.m8053f(m21.f18381z3, 0), ul1Var.m8053f(m21.f18374y3, 0));
    }

    /* renamed from: f */
    public View m338f(int i) {
        return this.f37648v.m25015p(i);
    }

    /* renamed from: g */
    public final boolean m337g(ul1 ul1Var) {
        return ul1Var.m8040s(m21.f18353v3) || ul1Var.m8040s(m21.f18360w3);
    }

    public MenuItem getCheckedItem() {
        return this.f37648v.m25017n();
    }

    public int getHeaderCount() {
        return this.f37648v.m25016o();
    }

    public Drawable getItemBackground() {
        return this.f37648v.m25014q();
    }

    public int getItemHorizontalPadding() {
        return this.f37648v.m25013r();
    }

    public int getItemIconPadding() {
        return this.f37648v.m25012s();
    }

    public ColorStateList getItemIconTintList() {
        return this.f37648v.m25009v();
    }

    public int getItemMaxLines() {
        return this.f37648v.m25011t();
    }

    public ColorStateList getItemTextColor() {
        return this.f37648v.m25010u();
    }

    public Menu getMenu() {
        return this.f37647u;
    }

    /* renamed from: h */
    public View m336h(int i) {
        return this.f37648v.m25007x(i);
    }

    /* renamed from: i */
    public void m335i(int i) {
        this.f37648v.m25028K(true);
        getMenuInflater().inflate(i, this.f37647u);
        this.f37648v.m25028K(false);
        this.f37648v.mo25024c(false);
    }

    /* renamed from: j */
    public final void m334j() {
        this.f37646A = new ViewTreeObserver$OnGlobalLayoutListenerC4114b();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f37646A);
    }

    @Override // com.daaw.i91, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        on0.m14141e(this);
    }

    @Override // com.daaw.i91, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f37646A);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int min;
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                min = this.f37650x;
            }
            super.onMeasure(i, i2);
        }
        min = Math.min(View.MeasureSpec.getSize(i), this.f37650x);
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
        super.onRestoreInstanceState(savedState.m29657a());
        this.f37647u.m30254S(savedState.f37653r);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f37653r = bundle;
        this.f37647u.m30252U(bundle);
        return savedState;
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.f37647u.findItem(i);
        if (findItem != null) {
            this.f37648v.m25005z((C0086g) findItem);
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f37647u.findItem(menuItem.getItemId());
        if (findItem == null) {
            throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
        }
        this.f37648v.m25005z((C0086g) findItem);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.setElevation(f);
        }
        on0.m14142d(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        this.f37648v.m25037B(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(C3866zk.m2178e(getContext(), i));
    }

    public void setItemHorizontalPadding(int i) {
        this.f37648v.m25036C(i);
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.f37648v.m25036C(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(int i) {
        this.f37648v.m25035D(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.f37648v.m25035D(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(int i) {
        this.f37648v.m25034E(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f37648v.m25033F(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.f37648v.m25032G(i);
    }

    public void setItemTextAppearance(int i) {
        this.f37648v.m25031H(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f37648v.m25030I(colorStateList);
    }

    public void setNavigationItemSelectedListener(InterfaceC4115c interfaceC4115c) {
        this.f37649w = interfaceC4115c;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        cs0 cs0Var = this.f37648v;
        if (cs0Var != null) {
            cs0Var.m25029J(i);
        }
    }
}
