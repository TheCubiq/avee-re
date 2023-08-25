package com.daaw;

import android.content.Context;
import android.graphics.Color;
/* renamed from: com.daaw.yv */
/* loaded from: classes2.dex */
public class C3747yv {

    /* renamed from: a */
    public final boolean f34108a;

    /* renamed from: b */
    public final int f34109b;

    /* renamed from: c */
    public final int f34110c;

    /* renamed from: d */
    public final float f34111d;

    public C3747yv(Context context) {
        this.f34108a = en0.m23357b(context, w01.elevationOverlayEnabled, false);
        this.f34109b = jn0.m18398a(context, w01.elevationOverlayColor, 0);
        this.f34110c = jn0.m18398a(context, w01.colorSurface, 0);
        this.f34111d = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    public float m3214a(float f) {
        float f2 = this.f34111d;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* renamed from: b */
    public int m3213b(int i, float f) {
        float m3214a = m3214a(f);
        return C3838zg.m2344j(jn0.m18393f(C3838zg.m2344j(i, 255), this.f34109b, m3214a), Color.alpha(i));
    }

    /* renamed from: c */
    public int m3212c(int i, float f) {
        return (this.f34108a && m3210e(i)) ? m3213b(i, f) : i;
    }

    /* renamed from: d */
    public boolean m3211d() {
        return this.f34108a;
    }

    /* renamed from: e */
    public final boolean m3210e(int i) {
        return C3838zg.m2344j(i, 255) == this.f34110c;
    }
}
