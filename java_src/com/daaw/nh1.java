package com.daaw;
/* loaded from: classes2.dex */
public class nh1 extends mh1 {
    public static final boolean c(String str, int i, String str2, int i2, int i3, boolean z) {
        ug0.f(str, "<this>");
        ug0.f(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static final boolean d(String str, String str2, boolean z) {
        ug0.f(str, "<this>");
        ug0.f(str2, "prefix");
        return !z ? str.startsWith(str2) : c(str, 0, str2, 0, str2.length(), z);
    }

    public static /* synthetic */ boolean e(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return d(str, str2, z);
    }
}
