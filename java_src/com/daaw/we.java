package com.daaw;
/* loaded from: classes2.dex */
public class we {
    public static final int a(int i) {
        if (new pg0(2, 36).k(i)) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new pg0(2, 36));
    }

    public static final int b(char c, int i) {
        return Character.digit((int) c, i);
    }

    public static final boolean c(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}
