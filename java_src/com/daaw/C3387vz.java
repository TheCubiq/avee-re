package com.daaw;

import java.util.HashSet;
/* renamed from: com.daaw.vz */
/* loaded from: classes.dex */
public final class C3387vz {

    /* renamed from: a */
    public static final HashSet<String> f30721a = new HashSet<>();

    /* renamed from: b */
    public static String f30722b = "goog.exo.core";

    /* renamed from: a */
    public static synchronized void m6643a(String str) {
        synchronized (C3387vz.class) {
            if (f30721a.add(str)) {
                f30722b += ", " + str;
            }
        }
    }

    /* renamed from: b */
    public static synchronized String m6642b() {
        String str;
        synchronized (C3387vz.class) {
            str = f30722b;
        }
        return str;
    }
}
