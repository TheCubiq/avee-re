package com.daaw;

import android.content.Context;
import android.graphics.Color;
/* loaded from: classes2.dex */
public class yv {
    public final boolean a;
    public final int b;
    public final int c;
    public final float d;

    public yv(Context context) {
        this.a = en0.b(context, w01.elevationOverlayEnabled, false);
        this.b = jn0.a(context, w01.elevationOverlayColor, 0);
        this.c = jn0.a(context, w01.colorSurface, 0);
        this.d = context.getResources().getDisplayMetrics().density;
    }

    public float a(float f) {
        float f2 = this.d;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i, float f) {
        float a = a(f);
        return zg.j(jn0.f(zg.j(i, 255), this.b, a), Color.alpha(i));
    }

    public int c(int i, float f) {
        return (this.a && e(i)) ? b(i, f) : i;
    }

    public boolean d() {
        return this.a;
    }

    public final boolean e(int i) {
        return zg.j(i, 255) == this.c;
    }
}
