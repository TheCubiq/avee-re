package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public class pt0 {

    /* renamed from: com.daaw.pt0$a */
    /* loaded from: classes.dex */
    public static class C2588a {
        /* renamed from: a */
        public static boolean m13156a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        /* renamed from: b */
        public static int m13155b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    /* renamed from: a */
    public static boolean m13160a(Object obj, Object obj2) {
        return C2588a.m13156a(obj, obj2);
    }

    /* renamed from: b */
    public static int m13159b(Object... objArr) {
        return C2588a.m13155b(objArr);
    }

    /* renamed from: c */
    public static <T> T m13158c(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: d */
    public static <T> T m13157d(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }
}
