package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
/* loaded from: classes2.dex */
public final class jd {
    public final id a;
    public final id b;
    public final id c;
    public final id d;
    public final id e;
    public final id f;
    public final id g;
    public final Paint h;

    public jd(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(en0.c(context, w01.materialCalendarStyle, com.google.android.material.datepicker.a.class.getCanonicalName()), m21.l2);
        this.a = id.a(context, obtainStyledAttributes.getResourceId(m21.o2, 0));
        this.g = id.a(context, obtainStyledAttributes.getResourceId(m21.m2, 0));
        this.b = id.a(context, obtainStyledAttributes.getResourceId(m21.n2, 0));
        this.c = id.a(context, obtainStyledAttributes.getResourceId(m21.p2, 0));
        ColorStateList a = mn0.a(context, obtainStyledAttributes, m21.q2);
        this.d = id.a(context, obtainStyledAttributes.getResourceId(m21.s2, 0));
        this.e = id.a(context, obtainStyledAttributes.getResourceId(m21.r2, 0));
        this.f = id.a(context, obtainStyledAttributes.getResourceId(m21.t2, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
