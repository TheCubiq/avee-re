package com.daaw;
/* loaded from: classes.dex */
public final class f09 {

    /* renamed from: a */
    public final String f8987a;

    public f09(int i, int i2, String str) {
        this.f8987a = str;
    }

    /* renamed from: a */
    public static f09 m22974a(ik5 ik5Var) {
        String str;
        ik5Var.m19715g(2);
        int m19703s = ik5Var.m19703s();
        int i = m19703s >> 1;
        int m19703s2 = (ik5Var.m19703s() >> 3) | ((m19703s & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        String str2 = m19703s2 < 10 ? ".0" : ".";
        return new f09(i, m19703s2, str + ".0" + i + str2 + m19703s2);
    }
}
