package com.daaw;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
/* renamed from: com.daaw.f3 */
/* loaded from: classes2.dex */
public class C1247f3 {

    /* renamed from: a */
    public static final TimeInterpolator f9051a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f9052b = new l00();

    /* renamed from: c */
    public static final TimeInterpolator f9053c = new k00();

    /* renamed from: d */
    public static final TimeInterpolator f9054d = new zj0();

    /* renamed from: e */
    public static final TimeInterpolator f9055e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m22951a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }
}
