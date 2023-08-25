package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.datepicker.C4059a;
/* renamed from: com.daaw.jd */
/* loaded from: classes2.dex */
public final class C1820jd {

    /* renamed from: a */
    public final C1683id f14991a;

    /* renamed from: b */
    public final C1683id f14992b;

    /* renamed from: c */
    public final C1683id f14993c;

    /* renamed from: d */
    public final C1683id f14994d;

    /* renamed from: e */
    public final C1683id f14995e;

    /* renamed from: f */
    public final C1683id f14996f;

    /* renamed from: g */
    public final C1683id f14997g;

    /* renamed from: h */
    public final Paint f14998h;

    public C1820jd(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(en0.m23356c(context, w01.materialCalendarStyle, C4059a.class.getCanonicalName()), m21.f18280l2);
        this.f14991a = C1683id.m19926a(context, obtainStyledAttributes.getResourceId(m21.f18303o2, 0));
        this.f14997g = C1683id.m19926a(context, obtainStyledAttributes.getResourceId(m21.f18288m2, 0));
        this.f14992b = C1683id.m19926a(context, obtainStyledAttributes.getResourceId(m21.f18296n2, 0));
        this.f14993c = C1683id.m19926a(context, obtainStyledAttributes.getResourceId(m21.f18310p2, 0));
        ColorStateList m15930a = mn0.m15930a(context, obtainStyledAttributes, m21.f18317q2);
        this.f14994d = C1683id.m19926a(context, obtainStyledAttributes.getResourceId(m21.f18331s2, 0));
        this.f14995e = C1683id.m19926a(context, obtainStyledAttributes.getResourceId(m21.f18324r2, 0));
        this.f14996f = C1683id.m19926a(context, obtainStyledAttributes.getResourceId(m21.f18338t2, 0));
        Paint paint = new Paint();
        this.f14998h = paint;
        paint.setColor(m15930a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
