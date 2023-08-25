package com.daaw;
/* loaded from: classes.dex */
public abstract class s17 {
    /* renamed from: b */
    public static int m10754b(int i, int i2) {
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int highestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = highestOneBit + highestOneBit;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    /* renamed from: a */
    public abstract s17 mo7549a(Object obj);
}
