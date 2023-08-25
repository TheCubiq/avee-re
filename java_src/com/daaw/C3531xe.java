package com.daaw;
/* renamed from: com.daaw.xe */
/* loaded from: classes2.dex */
public class C3531xe extends C3433we {
    /* renamed from: d */
    public static final boolean m5197d(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (z) {
            char upperCase = Character.toUpperCase(c);
            char upperCase2 = Character.toUpperCase(c2);
            return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
        }
        return false;
    }
}
