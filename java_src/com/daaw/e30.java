package com.daaw;
/* loaded from: classes.dex */
public class e30 {
    public static final String[] a = {"None", "Vortex"};

    public static qd0 a(String str, qd0 qd0Var) {
        if (b(qd0Var).equals(str)) {
            return qd0Var;
        }
        str.hashCode();
        if (str.equals("Vortex")) {
            return new aw1();
        }
        if (str.equals("None")) {
            return null;
        }
        lz1.c("unknown typeName: " + str);
        return qd0Var;
    }

    public static String b(qd0 qd0Var) {
        if (qd0Var == null) {
            return "None";
        }
        if (qd0Var instanceof aw1) {
            return "Vortex";
        }
        lz1.c("unknown instance type");
        return "unk";
    }
}
