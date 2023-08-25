package com.daaw;
/* loaded from: classes.dex */
public class ch1 {
    public static final String[] a = new String[0];

    public static void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    public static StringBuilder b() {
        return new StringBuilder();
    }
}
