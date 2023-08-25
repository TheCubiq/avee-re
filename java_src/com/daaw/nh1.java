package com.daaw;
/* loaded from: classes2.dex */
public class nh1 extends mh1 {
    /* renamed from: c */
    public static final boolean m15179c(String str, int i, String str2, int i2, int i3, boolean z) {
        ug0.m8268f(str, "<this>");
        ug0.m8268f(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    /* renamed from: d */
    public static final boolean m15178d(String str, String str2, boolean z) {
        ug0.m8268f(str, "<this>");
        ug0.m8268f(str2, "prefix");
        return !z ? str.startsWith(str2) : m15179c(str, 0, str2, 0, str2.length(), z);
    }

    /* renamed from: e */
    public static /* synthetic */ boolean m15177e(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m15178d(str, str2, z);
    }
}
