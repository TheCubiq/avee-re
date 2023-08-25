package com.daaw;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
/* loaded from: classes2.dex */
public class f3 {
    public static final TimeInterpolator a = new LinearInterpolator();
    public static final TimeInterpolator b = new l00();
    public static final TimeInterpolator c = new k00();
    public static final TimeInterpolator d = new zj0();
    public static final TimeInterpolator e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }
}
