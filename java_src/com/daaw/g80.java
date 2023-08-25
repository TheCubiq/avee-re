package com.daaw;

import android.graphics.Rect;
import android.view.Gravity;
/* loaded from: classes.dex */
public final class g80 {

    /* renamed from: com.daaw.g80$a */
    /* loaded from: classes.dex */
    public static class C1376a {
        /* renamed from: a */
        public static void m21893a(int i, int i2, int i3, Rect rect, int i4, int i5, Rect rect2, int i6) {
            Gravity.apply(i, i2, i3, rect, i4, i5, rect2, i6);
        }

        /* renamed from: b */
        public static void m21892b(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        }

        /* renamed from: c */
        public static void m21891c(int i, Rect rect, Rect rect2, int i2) {
            Gravity.applyDisplay(i, rect, rect2, i2);
        }
    }

    /* renamed from: a */
    public static void m21895a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        C1376a.m21892b(i, i2, i3, rect, rect2, i4);
    }

    /* renamed from: b */
    public static int m21894b(int i, int i2) {
        return Gravity.getAbsoluteGravity(i, i2);
    }
}
