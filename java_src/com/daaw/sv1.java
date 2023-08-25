package com.daaw;
/* loaded from: classes.dex */
public class sv1 {
    public final int a;
    public final boolean b;

    public sv1(int i) {
        this.a = i;
        this.b = true;
    }

    public sv1(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public static boolean a(tv tvVar, String str, String str2) {
        return tvVar.h().equals(str) && b(tvVar.i(), str2);
    }

    public static boolean b(String str, String str2) {
        if (str.length() == 0 && str2.equals("10")) {
            return true;
        }
        if (str.equals("10") && str2.length() == 0) {
            return true;
        }
        return str.equals(str2);
    }
}
