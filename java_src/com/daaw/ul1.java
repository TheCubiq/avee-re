package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.daaw.j51;
/* loaded from: classes.dex */
public class ul1 {

    /* renamed from: a */
    public final Context f29169a;

    /* renamed from: b */
    public final TypedArray f29170b;

    /* renamed from: c */
    public TypedValue f29171c;

    public ul1(Context context, TypedArray typedArray) {
        this.f29169a = context;
        this.f29170b = typedArray;
    }

    /* renamed from: t */
    public static ul1 m8039t(Context context, int i, int[] iArr) {
        return new ul1(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: u */
    public static ul1 m8038u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new ul1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: v */
    public static ul1 m8037v(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new ul1(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public boolean m8058a(int i, boolean z) {
        return this.f29170b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int m8057b(int i, int i2) {
        return this.f29170b.getColor(i, i2);
    }

    /* renamed from: c */
    public ColorStateList m8056c(int i) {
        int resourceId;
        ColorStateList m11784a;
        return (!this.f29170b.hasValue(i) || (resourceId = this.f29170b.getResourceId(i, 0)) == 0 || (m11784a = C2818r4.m11784a(this.f29169a, resourceId)) == null) ? this.f29170b.getColorStateList(i) : m11784a;
    }

    /* renamed from: d */
    public float m8055d(int i, float f) {
        return this.f29170b.getDimension(i, f);
    }

    /* renamed from: e */
    public int m8054e(int i, int i2) {
        return this.f29170b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: f */
    public int m8053f(int i, int i2) {
        return this.f29170b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: g */
    public Drawable m8052g(int i) {
        int resourceId;
        return (!this.f29170b.hasValue(i) || (resourceId = this.f29170b.getResourceId(i, 0)) == 0) ? this.f29170b.getDrawable(i) : C2818r4.m11783b(this.f29169a, resourceId);
    }

    /* renamed from: h */
    public Drawable m8051h(int i) {
        int resourceId;
        if (!this.f29170b.hasValue(i) || (resourceId = this.f29170b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C1046d4.m24713b().m24711d(this.f29169a, resourceId, true);
    }

    /* renamed from: i */
    public float m8050i(int i, float f) {
        return this.f29170b.getFloat(i, f);
    }

    /* renamed from: j */
    public Typeface m8049j(int i, int i2, j51.AbstractC1794f abstractC1794f) {
        int resourceId = this.f29170b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f29171c == null) {
            this.f29171c = new TypedValue();
        }
        return j51.m18893g(this.f29169a, resourceId, this.f29171c, i2, abstractC1794f);
    }

    /* renamed from: k */
    public int m8048k(int i, int i2) {
        return this.f29170b.getInt(i, i2);
    }

    /* renamed from: l */
    public int m8047l(int i, int i2) {
        return this.f29170b.getInteger(i, i2);
    }

    /* renamed from: m */
    public int m8046m(int i, int i2) {
        return this.f29170b.getLayoutDimension(i, i2);
    }

    /* renamed from: n */
    public int m8045n(int i, int i2) {
        return this.f29170b.getResourceId(i, i2);
    }

    /* renamed from: o */
    public String m8044o(int i) {
        return this.f29170b.getString(i);
    }

    /* renamed from: p */
    public CharSequence m8043p(int i) {
        return this.f29170b.getText(i);
    }

    /* renamed from: q */
    public CharSequence[] m8042q(int i) {
        return this.f29170b.getTextArray(i);
    }

    /* renamed from: r */
    public TypedArray m8041r() {
        return this.f29170b;
    }

    /* renamed from: s */
    public boolean m8040s(int i) {
        return this.f29170b.hasValue(i);
    }

    /* renamed from: w */
    public void m8036w() {
        this.f29170b.recycle();
    }
}
