package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.customview.view.AbsSavedState;
import com.daaw.C2366nu;
import com.daaw.C2818r4;
import com.daaw.C2908s3;
import com.daaw.fu1;
import com.daaw.gc1;
import com.daaw.gn0;
import com.daaw.jc1;
import com.daaw.k21;
import com.daaw.m21;
import com.daaw.mn0;
import com.daaw.on0;
import com.daaw.qn0;
import com.daaw.sk1;
import com.daaw.w01;
import com.daaw.xk1;
import com.daaw.xs1;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* loaded from: classes2.dex */
public class MaterialButton extends C2908s3 implements Checkable, jc1 {

    /* renamed from: F */
    public static final int[] f37282F = {16842911};

    /* renamed from: G */
    public static final int[] f37283G = {16842912};

    /* renamed from: H */
    public static final int f37284H = k21.Widget_MaterialComponents_Button;

    /* renamed from: A */
    public int f37285A;

    /* renamed from: B */
    public int f37286B;

    /* renamed from: C */
    public boolean f37287C;

    /* renamed from: D */
    public boolean f37288D;

    /* renamed from: E */
    public int f37289E;

    /* renamed from: s */
    public final gn0 f37290s;

    /* renamed from: t */
    public final LinkedHashSet<InterfaceC4036a> f37291t;

    /* renamed from: u */
    public InterfaceC4037b f37292u;

    /* renamed from: v */
    public PorterDuff.Mode f37293v;

    /* renamed from: w */
    public ColorStateList f37294w;

    /* renamed from: x */
    public Drawable f37295x;

    /* renamed from: y */
    public int f37296y;

    /* renamed from: z */
    public int f37297z;

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4035a();

        /* renamed from: r */
        public boolean f37298r;

        /* renamed from: com.google.android.material.button.MaterialButton$SavedState$a */
        /* loaded from: classes2.dex */
        public static class C4035a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            m848b(parcel);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        public final void m848b(Parcel parcel) {
            this.f37298r = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f37298r ? 1 : 0);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC4036a {
        /* renamed from: a */
        void mo820a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC4037b {
        /* renamed from: a */
        void mo813a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w01.materialButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(qn0.m12324c(context, attributeSet, i, r6), attributeSet, i);
        int i2 = f37284H;
        this.f37291t = new LinkedHashSet<>();
        this.f37287C = false;
        this.f37288D = false;
        Context context2 = getContext();
        TypedArray m5026h = xk1.m5026h(context2, attributeSet, m21.f18100N1, i, i2, new int[0]);
        this.f37286B = m5026h.getDimensionPixelSize(m21.f18192a2, 0);
        this.f37293v = fu1.m22258e(m5026h.getInt(m21.f18216d2, -1), PorterDuff.Mode.SRC_IN);
        this.f37294w = mn0.m15930a(getContext(), m5026h, m21.f18208c2);
        this.f37295x = mn0.m15927d(getContext(), m5026h, m21.f18177Y1);
        this.f37289E = m5026h.getInteger(m21.f18184Z1, 1);
        this.f37296y = m5026h.getDimensionPixelSize(m21.f18200b2, 0);
        gn0 gn0Var = new gn0(this, gc1.m21808e(context2, attributeSet, i, i2).m21769m());
        this.f37290s = gn0Var;
        gn0Var.m21457q(m5026h);
        m5026h.recycle();
        setCompoundDrawablePadding(this.f37286B);
        m850j(this.f37295x != null);
    }

    private String getA11yClassName() {
        return (m858b() ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    /* renamed from: a */
    public void m859a(InterfaceC4036a interfaceC4036a) {
        this.f37291t.add(interfaceC4036a);
    }

    /* renamed from: b */
    public boolean m858b() {
        gn0 gn0Var = this.f37290s;
        return gn0Var != null && gn0Var.m21458p();
    }

    /* renamed from: c */
    public final boolean m857c() {
        int i = this.f37289E;
        return i == 3 || i == 4;
    }

    /* renamed from: d */
    public final boolean m856d() {
        int i = this.f37289E;
        return i == 1 || i == 2;
    }

    /* renamed from: e */
    public final boolean m855e() {
        int i = this.f37289E;
        return i == 16 || i == 32;
    }

    /* renamed from: f */
    public final boolean m854f() {
        return xs1.m4768E(this) == 1;
    }

    /* renamed from: g */
    public final boolean m853g() {
        gn0 gn0Var = this.f37290s;
        return (gn0Var == null || gn0Var.m21459o()) ? false : true;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m853g()) {
            return this.f37290s.m21472b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f37295x;
    }

    public int getIconGravity() {
        return this.f37289E;
    }

    public int getIconPadding() {
        return this.f37286B;
    }

    public int getIconSize() {
        return this.f37296y;
    }

    public ColorStateList getIconTint() {
        return this.f37294w;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f37293v;
    }

    public int getInsetBottom() {
        return this.f37290s.m21471c();
    }

    public int getInsetTop() {
        return this.f37290s.m21470d();
    }

    public ColorStateList getRippleColor() {
        if (m853g()) {
            return this.f37290s.m21466h();
        }
        return null;
    }

    public gc1 getShapeAppearanceModel() {
        if (m853g()) {
            return this.f37290s.m21465i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m853g()) {
            return this.f37290s.m21464j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m853g()) {
            return this.f37290s.m21463k();
        }
        return 0;
    }

    @Override // com.daaw.C2908s3, com.daaw.vl1
    public ColorStateList getSupportBackgroundTintList() {
        return m853g() ? this.f37290s.m21462l() : super.getSupportBackgroundTintList();
    }

    @Override // com.daaw.C2908s3, com.daaw.vl1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m853g() ? this.f37290s.m21461m() : super.getSupportBackgroundTintMode();
    }

    /* renamed from: h */
    public void m852h(InterfaceC4036a interfaceC4036a) {
        this.f37291t.remove(interfaceC4036a);
    }

    /* renamed from: i */
    public final void m851i() {
        if (m856d()) {
            sk1.m10265i(this, this.f37295x, null, null, null);
        } else if (m857c()) {
            sk1.m10265i(this, null, null, this.f37295x, null);
        } else if (m855e()) {
            sk1.m10265i(this, null, this.f37295x, null, null);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f37287C;
    }

    /* renamed from: j */
    public final void m850j(boolean z) {
        Drawable drawable = this.f37295x;
        if (drawable != null) {
            Drawable mutate = C2366nu.m14809r(drawable).mutate();
            this.f37295x = mutate;
            C2366nu.m14812o(mutate, this.f37294w);
            PorterDuff.Mode mode = this.f37293v;
            if (mode != null) {
                C2366nu.m14811p(this.f37295x, mode);
            }
            int i = this.f37296y;
            if (i == 0) {
                i = this.f37295x.getIntrinsicWidth();
            }
            int i2 = this.f37296y;
            if (i2 == 0) {
                i2 = this.f37295x.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f37295x;
            int i3 = this.f37297z;
            int i4 = this.f37285A;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
        }
        if (z) {
            m851i();
            return;
        }
        Drawable[] m10273a = sk1.m10273a(this);
        boolean z2 = false;
        Drawable drawable3 = m10273a[0];
        Drawable drawable4 = m10273a[1];
        Drawable drawable5 = m10273a[2];
        if ((m856d() && drawable3 != this.f37295x) || ((m857c() && drawable5 != this.f37295x) || (m855e() && drawable4 != this.f37295x))) {
            z2 = true;
        }
        if (z2) {
            m851i();
        }
    }

    /* renamed from: k */
    public final void m849k(int i, int i2) {
        if (this.f37295x == null || getLayout() == null) {
            return;
        }
        if (!m856d() && !m857c()) {
            if (m855e()) {
                this.f37297z = 0;
                if (this.f37289E == 16) {
                    this.f37285A = 0;
                    m850j(false);
                    return;
                }
                int i3 = this.f37296y;
                if (i3 == 0) {
                    i3 = this.f37295x.getIntrinsicHeight();
                }
                int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - i3) - this.f37286B) - getPaddingBottom()) / 2;
                if (this.f37285A != textHeight) {
                    this.f37285A = textHeight;
                    m850j(false);
                }
                return;
            }
            return;
        }
        this.f37285A = 0;
        int i4 = this.f37289E;
        if (i4 == 1 || i4 == 3) {
            this.f37297z = 0;
            m850j(false);
            return;
        }
        int i5 = this.f37296y;
        if (i5 == 0) {
            i5 = this.f37295x.getIntrinsicWidth();
        }
        int textWidth = (((((i - getTextWidth()) - xs1.m4760I(this)) - i5) - this.f37286B) - xs1.m4758J(this)) / 2;
        if (m854f() != (this.f37289E == 4)) {
            textWidth = -textWidth;
        }
        if (this.f37297z != textWidth) {
            this.f37297z = textWidth;
            m850j(false);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m853g()) {
            on0.m14140f(this, this.f37290s.m21468f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (m858b()) {
            Button.mergeDrawableStates(onCreateDrawableState, f37282F);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f37283G);
        }
        return onCreateDrawableState;
    }

    @Override // com.daaw.C2908s3, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // com.daaw.C2908s3, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m858b());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // com.daaw.C2908s3, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        gn0 gn0Var;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT != 21 || (gn0Var = this.f37290s) == null) {
            return;
        }
        gn0Var.m21476H(i4 - i2, i3 - i);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m29657a());
        setChecked(savedState.f37298r);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f37298r = this.f37287C;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m849k(i, i2);
    }

    @Override // com.daaw.C2908s3, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m849k(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (m853g()) {
            this.f37290s.m21456r(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // com.daaw.C2908s3, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (m853g()) {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            this.f37290s.m21455s();
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // com.daaw.C2908s3, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C2818r4.m11783b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m853g()) {
            this.f37290s.m21454t(z);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (m858b() && isEnabled() && this.f37287C != z) {
            this.f37287C = z;
            refreshDrawableState();
            if (this.f37288D) {
                return;
            }
            this.f37288D = true;
            Iterator<InterfaceC4036a> it = this.f37291t.iterator();
            while (it.hasNext()) {
                it.next().mo820a(this, this.f37287C);
            }
            this.f37288D = false;
        }
    }

    public void setCornerRadius(int i) {
        if (m853g()) {
            this.f37290s.m21453u(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m853g()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m853g()) {
            this.f37290s.m21468f().m14998V(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f37295x != drawable) {
            this.f37295x = drawable;
            m850j(true);
            m849k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f37289E != i) {
            this.f37289E = i;
            m849k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f37286B != i) {
            this.f37286B = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C2818r4.m11783b(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f37296y != i) {
            this.f37296y = i;
            m850j(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f37294w != colorStateList) {
            this.f37294w = colorStateList;
            m850j(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f37293v != mode) {
            this.f37293v = mode;
            m850j(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C2818r4.m11784a(getContext(), i));
    }

    public void setInsetBottom(int i) {
        this.f37290s.m21452v(i);
    }

    public void setInsetTop(int i) {
        this.f37290s.m21451w(i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC4037b interfaceC4037b) {
        this.f37292u = interfaceC4037b;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC4037b interfaceC4037b = this.f37292u;
        if (interfaceC4037b != null) {
            interfaceC4037b.mo813a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m853g()) {
            this.f37290s.m21450x(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (m853g()) {
            setRippleColor(C2818r4.m11784a(getContext(), i));
        }
    }

    @Override // com.daaw.jc1
    public void setShapeAppearanceModel(gc1 gc1Var) {
        if (!m853g()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f37290s.m21449y(gc1Var);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m853g()) {
            this.f37290s.m21448z(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m853g()) {
            this.f37290s.m21483A(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (m853g()) {
            setStrokeColor(C2818r4.m11784a(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m853g()) {
            this.f37290s.m21482B(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m853g()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // com.daaw.C2908s3, com.daaw.vl1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m853g()) {
            this.f37290s.m21481C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // com.daaw.C2908s3, com.daaw.vl1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m853g()) {
            this.f37290s.m21480D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f37287C);
    }
}
