package com.daaw;
/* renamed from: com.daaw.we */
/* loaded from: classes2.dex */
public class C3433we {
    /* renamed from: a */
    public static final int m6135a(int i) {
        if (new pg0(2, 36).m13402k(i)) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new pg0(2, 36));
    }

    /* renamed from: b */
    public static final int m6134b(char c, int i) {
        return Character.digit((int) c, i);
    }

    /* renamed from: c */
    public static final boolean m6133c(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}
