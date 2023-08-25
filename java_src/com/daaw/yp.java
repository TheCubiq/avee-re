package com.daaw;

import java.lang.reflect.Field;
/* loaded from: classes2.dex */
public final class yp {
    public static final void a(int i, int i2) {
        if (i2 <= i) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
    }

    public static final xp b(na naVar) {
        return (xp) naVar.getClass().getAnnotation(xp.class);
    }

    public static final int c(na naVar) {
        try {
            Field declaredField = naVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(naVar);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final StackTraceElement d(na naVar) {
        String str;
        ug0.f(naVar, "<this>");
        xp b = b(naVar);
        if (b == null) {
            return null;
        }
        a(1, b.v());
        int c = c(naVar);
        int i = c < 0 ? -1 : b.l()[c];
        String b2 = oq0.a.b(naVar);
        if (b2 == null) {
            str = b.c();
        } else {
            str = b2 + '/' + b.c();
        }
        return new StackTraceElement(str, b.m(), b.f(), i);
    }
}
