package com.daaw;

import android.graphics.Bitmap;
import android.text.Layout;
/* renamed from: com.daaw.ln */
/* loaded from: classes.dex */
public class C2099ln {

    /* renamed from: A */
    public final int f17544A;

    /* renamed from: B */
    public final int f17545B;

    /* renamed from: C */
    public final float f17546C;

    /* renamed from: p */
    public final CharSequence f17547p;

    /* renamed from: q */
    public final Layout.Alignment f17548q;

    /* renamed from: r */
    public final Bitmap f17549r;

    /* renamed from: s */
    public final float f17550s;

    /* renamed from: t */
    public final int f17551t;

    /* renamed from: u */
    public final int f17552u;

    /* renamed from: v */
    public final float f17553v;

    /* renamed from: w */
    public final int f17554w;

    /* renamed from: x */
    public final float f17555x;

    /* renamed from: y */
    public final float f17556y;

    /* renamed from: z */
    public final boolean f17557z;

    public C2099ln(Bitmap bitmap, float f, int i, float f2, int i2, float f3, float f4) {
        this(null, null, bitmap, f2, 0, i2, f, i, Integer.MIN_VALUE, Float.MIN_VALUE, f3, f4, false, -16777216);
    }

    public C2099ln(CharSequence charSequence) {
        this(charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public C2099ln(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        this(charSequence, alignment, f, i, i2, f2, i3, f3, false, -16777216);
    }

    public C2099ln(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, int i4, float f4) {
        this(charSequence, alignment, null, f, i, i2, f2, i3, i4, f4, f3, Float.MIN_VALUE, false, -16777216);
    }

    public C2099ln(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4) {
        this(charSequence, alignment, null, f, i, i2, f2, i3, Integer.MIN_VALUE, Float.MIN_VALUE, f3, Float.MIN_VALUE, z, i4);
    }

    public C2099ln(CharSequence charSequence, Layout.Alignment alignment, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5) {
        this.f17547p = charSequence;
        this.f17548q = alignment;
        this.f17549r = bitmap;
        this.f17550s = f;
        this.f17551t = i;
        this.f17552u = i2;
        this.f17553v = f2;
        this.f17554w = i3;
        this.f17555x = f4;
        this.f17556y = f5;
        this.f17557z = z;
        this.f17544A = i5;
        this.f17545B = i4;
        this.f17546C = f3;
    }
}
