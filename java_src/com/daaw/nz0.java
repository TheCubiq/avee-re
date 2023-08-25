package com.daaw;
/* loaded from: classes2.dex */
public final class nz0 {
    /* renamed from: a */
    public static final int m14713a(int i, int i2, int i3) {
        return m14711c(m14711c(i, i3) - m14711c(i2, i3), i3);
    }

    /* renamed from: b */
    public static final int m14712b(int i, int i2, int i3) {
        if (i3 > 0) {
            return i >= i2 ? i2 : i2 - m14713a(i2, i, i3);
        } else if (i3 < 0) {
            return i <= i2 ? i2 : i2 + m14713a(i, i2, -i3);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    /* renamed from: c */
    public static final int m14711c(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }
}
