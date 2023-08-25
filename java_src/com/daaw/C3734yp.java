package com.daaw;

import java.lang.reflect.Field;
/* renamed from: com.daaw.yp */
/* loaded from: classes2.dex */
public final class C3734yp {
    /* renamed from: a */
    public static final void m3470a(int i, int i2) {
        if (i2 <= i) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
    }

    /* renamed from: b */
    public static final InterfaceC3563xp m3469b(AbstractC2271na abstractC2271na) {
        return (InterfaceC3563xp) abstractC2271na.getClass().getAnnotation(InterfaceC3563xp.class);
    }

    /* renamed from: c */
    public static final int m3468c(AbstractC2271na abstractC2271na) {
        try {
            Field declaredField = abstractC2271na.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(abstractC2271na);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static final StackTraceElement m3467d(AbstractC2271na abstractC2271na) {
        String str;
        ug0.m8268f(abstractC2271na, "<this>");
        InterfaceC3563xp m3469b = m3469b(abstractC2271na);
        if (m3469b == null) {
            return null;
        }
        m3470a(1, m3469b.m4857v());
        int m3468c = m3468c(abstractC2271na);
        int i = m3468c < 0 ? -1 : m3469b.m4859l()[m3468c];
        String m14087b = oq0.f21821a.m14087b(abstractC2271na);
        if (m14087b == null) {
            str = m3469b.m4861c();
        } else {
            str = m14087b + '/' + m3469b.m4861c();
        }
        return new StackTraceElement(str, m3469b.m4858m(), m3469b.m4860f(), i);
    }
}
