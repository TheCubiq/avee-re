package com.daaw;
/* loaded from: classes2.dex */
public class r6 extends AssertionError {
    public r6() {
    }

    public r6(String str) {
        super(a(str));
    }

    public static String a(String str) {
        return str == null ? "" : str;
    }
}
