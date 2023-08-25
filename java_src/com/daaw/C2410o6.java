package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
/* renamed from: com.daaw.o6 */
/* loaded from: classes2.dex */
public class C2410o6 extends C2248n6 {
    /* renamed from: d */
    public static final <T> boolean m14540d(T[] tArr, T t) {
        ug0.m8268f(tArr, "<this>");
        return m14537g(tArr, t) >= 0;
    }

    /* renamed from: e */
    public static final <T> List<T> m14539e(T[] tArr) {
        ug0.m8268f(tArr, "<this>");
        return (List) m14538f(tArr, new ArrayList());
    }

    /* renamed from: f */
    public static final <C extends Collection<? super T>, T> C m14538f(T[] tArr, C c) {
        ug0.m8268f(tArr, "<this>");
        ug0.m8268f(c, "destination");
        for (T t : tArr) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    /* renamed from: g */
    public static final <T> int m14537g(T[] tArr, T t) {
        ug0.m8268f(tArr, "<this>");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (ug0.m8273a(t, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: h */
    public static final char m14536h(char[] cArr) {
        ug0.m8268f(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: i */
    public static final <T> T m14535i(T[] tArr) {
        ug0.m8268f(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }
}
