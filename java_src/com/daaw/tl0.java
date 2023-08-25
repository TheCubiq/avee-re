package com.daaw;

import android.view.animation.Interpolator;
/* loaded from: classes.dex */
public abstract class tl0 implements Interpolator {

    /* renamed from: a */
    public final float[] f27843a;

    /* renamed from: b */
    public final float f27844b;

    public tl0(float[] fArr) {
        this.f27843a = fArr;
        this.f27844b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f27843a;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f27844b;
        float f3 = (f - (min * f2)) / f2;
        float[] fArr2 = this.f27843a;
        return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
    }
}
