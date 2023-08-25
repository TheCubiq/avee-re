package com.daaw;
/* loaded from: classes.dex */
public final class f09 {
    public final String a;

    public f09(int i, int i2, String str) {
        this.a = str;
    }

    public static f09 a(ik5 ik5Var) {
        String str;
        ik5Var.g(2);
        int s = ik5Var.s();
        int i = s >> 1;
        int s2 = (ik5Var.s() >> 3) | ((s & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        String str2 = s2 < 10 ? ".0" : ".";
        return new f09(i, s2, str + ".0" + i + str2 + s2);
    }
}
