package com.daaw;

import android.graphics.Bitmap;
import android.text.Layout;
/* loaded from: classes.dex */
public class ln {
    public final int A;
    public final int B;
    public final float C;
    public final CharSequence p;
    public final Layout.Alignment q;
    public final Bitmap r;
    public final float s;
    public final int t;
    public final int u;
    public final float v;
    public final int w;
    public final float x;
    public final float y;
    public final boolean z;

    public ln(Bitmap bitmap, float f, int i, float f2, int i2, float f3, float f4) {
        this(null, null, bitmap, f2, 0, i2, f, i, Integer.MIN_VALUE, Float.MIN_VALUE, f3, f4, false, -16777216);
    }

    public ln(CharSequence charSequence) {
        this(charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public ln(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        this(charSequence, alignment, f, i, i2, f2, i3, f3, false, -16777216);
    }

    public ln(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, int i4, float f4) {
        this(charSequence, alignment, null, f, i, i2, f2, i3, i4, f4, f3, Float.MIN_VALUE, false, -16777216);
    }

    public ln(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4) {
        this(charSequence, alignment, null, f, i, i2, f2, i3, Integer.MIN_VALUE, Float.MIN_VALUE, f3, Float.MIN_VALUE, z, i4);
    }

    public ln(CharSequence charSequence, Layout.Alignment alignment, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5) {
        this.p = charSequence;
        this.q = alignment;
        this.r = bitmap;
        this.s = f;
        this.t = i;
        this.u = i2;
        this.v = f2;
        this.w = i3;
        this.x = f4;
        this.y = f5;
        this.z = z;
        this.A = i5;
        this.B = i4;
        this.C = f3;
    }
}
