package com.daaw;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
/* renamed from: com.daaw.qv */
/* loaded from: classes.dex */
public final class C2759qv {

    /* renamed from: com.daaw.qv$a */
    /* loaded from: classes.dex */
    public static class C2760a {
        /* renamed from: a */
        public static void m12136a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    /* renamed from: com.daaw.qv$b */
    /* loaded from: classes.dex */
    public static class C2761b {
        /* renamed from: a */
        public static EdgeEffect m12135a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        /* renamed from: b */
        public static float m12134b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        /* renamed from: c */
        public static float m12133c(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }
    }

    /* renamed from: a */
    public static EdgeEffect m12140a(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? C2761b.m12135a(context, attributeSet) : new EdgeEffect(context);
    }

    /* renamed from: b */
    public static float m12139b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C2761b.m12134b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: c */
    public static void m12138c(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            C2760a.m12136a(edgeEffect, f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }

    /* renamed from: d */
    public static float m12137d(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C2761b.m12133c(edgeEffect, f, f2);
        }
        m12138c(edgeEffect, f, f2);
        return f;
    }
}
