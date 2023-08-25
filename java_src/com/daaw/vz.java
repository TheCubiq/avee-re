package com.daaw;

import java.util.HashSet;
/* loaded from: classes.dex */
public final class vz {
    public static final HashSet<String> a = new HashSet<>();
    public static String b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (vz.class) {
            if (a.add(str)) {
                b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (vz.class) {
            str = b;
        }
        return str;
    }
}
