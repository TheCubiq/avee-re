package com.daaw;

import java.util.HashSet;
/* loaded from: classes.dex */
public final class k63 {
    public static final HashSet a = new HashSet();
    public static String b = "media3.common";

    public static synchronized String a() {
        String str;
        synchronized (k63.class) {
            str = b;
        }
        return str;
    }

    public static synchronized void b(String str) {
        synchronized (k63.class) {
            if (a.add(str)) {
                String str2 = b;
                b = str2 + ", " + str;
            }
        }
    }
}
