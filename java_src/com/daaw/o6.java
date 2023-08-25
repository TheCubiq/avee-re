package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
public class o6 extends n6 {
    public static final <T> boolean d(T[] tArr, T t) {
        ug0.f(tArr, "<this>");
        return g(tArr, t) >= 0;
    }

    public static final <T> List<T> e(T[] tArr) {
        ug0.f(tArr, "<this>");
        return (List) f(tArr, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C f(T[] tArr, C c) {
        ug0.f(tArr, "<this>");
        ug0.f(c, "destination");
        for (T t : tArr) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    public static final <T> int g(T[] tArr, T t) {
        ug0.f(tArr, "<this>");
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
            if (ug0.a(t, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final char h(char[] cArr) {
        ug0.f(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <T> T i(T[] tArr) {
        ug0.f(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }
}
