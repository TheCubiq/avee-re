package com.daaw;
/* loaded from: classes.dex */
public class e30 {

    /* renamed from: a */
    public static final String[] f8073a = {"None", "Vortex"};

    /* renamed from: a */
    public static qd0 m23780a(String str, qd0 qd0Var) {
        if (m23779b(qd0Var).equals(str)) {
            return qd0Var;
        }
        str.hashCode();
        if (str.equals("Vortex")) {
            return new aw1();
        }
        if (str.equals("None")) {
            return null;
        }
        lz1.m16363c("unknown typeName: " + str);
        return qd0Var;
    }

    /* renamed from: b */
    public static String m23779b(qd0 qd0Var) {
        if (qd0Var == null) {
            return "None";
        }
        if (qd0Var instanceof aw1) {
            return "Vortex";
        }
        lz1.m16363c("unknown instance type");
        return "unk";
    }
}
