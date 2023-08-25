package com.daaw;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
/* loaded from: classes.dex */
public final class mv0 {

    /* renamed from: a */
    public static final ThreadLocal<ov0<Rect, Rect>> f19161a = new ThreadLocal<>();

    /* renamed from: com.daaw.mv0$a */
    /* loaded from: classes.dex */
    public static class C2214a {
        /* renamed from: a */
        public static boolean m15756a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    /* renamed from: a */
    public static boolean m15758a(Paint paint, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C2214a.m15756a(paint, str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float measureText = paint.measureText("\udfffd");
        float measureText2 = paint.measureText("m");
        float measureText3 = paint.measureText(str);
        float f = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int i = 0;
            while (i < length) {
                int charCount = Character.charCount(str.codePointAt(i)) + i;
                f += paint.measureText(str, i, charCount);
                i = charCount;
            }
            if (measureText3 >= f) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        ov0<Rect, Rect> m15757b = m15757b();
        paint.getTextBounds("\udfffd", 0, 2, m15757b.f22030a);
        paint.getTextBounds(str, 0, length, m15757b.f22031b);
        return !m15757b.f22030a.equals(m15757b.f22031b);
    }

    /* renamed from: b */
    public static ov0<Rect, Rect> m15757b() {
        ThreadLocal<ov0<Rect, Rect>> threadLocal = f19161a;
        ov0<Rect, Rect> ov0Var = threadLocal.get();
        if (ov0Var == null) {
            ov0<Rect, Rect> ov0Var2 = new ov0<>(new Rect(), new Rect());
            threadLocal.set(ov0Var2);
            return ov0Var2;
        }
        ov0Var.f22030a.setEmpty();
        ov0Var.f22031b.setEmpty();
        return ov0Var;
    }
}
