package com.daaw;
/* loaded from: classes2.dex */
public class n31 {
    public di0 a(Class cls) {
        return new rf(cls);
    }

    public ei0 b(Class cls, String str) {
        return new jv0(cls, str);
    }

    public fi0 c(oz0 oz0Var) {
        return oz0Var;
    }

    public String d(w50 w50Var) {
        String obj = w50Var.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String e(si0 si0Var) {
        return d(si0Var);
    }
}
