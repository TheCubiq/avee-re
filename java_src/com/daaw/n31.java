package com.daaw;
/* loaded from: classes2.dex */
public class n31 {
    /* renamed from: a */
    public di0 m15548a(Class cls) {
        return new C2855rf(cls);
    }

    /* renamed from: b */
    public ei0 m15547b(Class cls, String str) {
        return new jv0(cls, str);
    }

    /* renamed from: c */
    public fi0 m15546c(oz0 oz0Var) {
        return oz0Var;
    }

    /* renamed from: d */
    public String m15545d(w50 w50Var) {
        String obj = w50Var.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    /* renamed from: e */
    public String m15544e(si0 si0Var) {
        return m15545d(si0Var);
    }
}
