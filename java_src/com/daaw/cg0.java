package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public abstract class cg0 {
    public static final String a = ll0.f("InputMerger");

    public static cg0 a(String str) {
        try {
            return (cg0) Class.forName(str).newInstance();
        } catch (Exception e) {
            ll0 c = ll0.c();
            String str2 = a;
            c.b(str2, "Trouble instantiating + " + str, e);
            return null;
        }
    }

    public abstract androidx.work.b b(List<androidx.work.b> list);
}
