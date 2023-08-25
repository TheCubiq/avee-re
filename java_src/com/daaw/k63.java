package com.daaw;

import java.util.HashSet;
/* loaded from: classes.dex */
public final class k63 {

    /* renamed from: a */
    public static final HashSet f15705a = new HashSet();

    /* renamed from: b */
    public static String f15706b = "media3.common";

    /* renamed from: a */
    public static synchronized String m18025a() {
        String str;
        synchronized (k63.class) {
            str = f15706b;
        }
        return str;
    }

    /* renamed from: b */
    public static synchronized void m18024b(String str) {
        synchronized (k63.class) {
            if (f15705a.add(str)) {
                String str2 = f15706b;
                f15706b = str2 + ", " + str;
            }
        }
    }
}
