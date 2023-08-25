package com.daaw;
/* loaded from: classes.dex */
public class ya1 {
    public static final String[] a = {"None", "Bars", "Line", "SharpBars", "RoundBars"};

    public static he0 a(String str, he0 he0Var) {
        if (b(he0Var).equals(str)) {
            return he0Var;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 2063072:
                if (str.equals("Bars")) {
                    c = 0;
                    break;
                }
                break;
            case 2368532:
                if (str.equals("Line")) {
                    c = 1;
                    break;
                }
                break;
            case 2433880:
                if (str.equals("None")) {
                    c = 2;
                    break;
                }
                break;
            case 431547818:
                if (str.equals("SharpBars")) {
                    c = 3;
                    break;
                }
                break;
            case 1998378318:
                if (str.equals("RoundBars")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new wa1();
            case 1:
                return new za1();
            case 2:
                return null;
            case 3:
                return new bb1();
            case 4:
                return new ab1();
            default:
                lz1.c("unknown typeName: " + str);
                return he0Var;
        }
    }

    public static String b(he0 he0Var) {
        if (he0Var == null) {
            return "None";
        }
        if (he0Var instanceof wa1) {
            return "Bars";
        }
        if (he0Var instanceof za1) {
            return "Line";
        }
        if (he0Var instanceof bb1) {
            return "SharpBars";
        }
        if (he0Var instanceof ab1) {
            return "RoundBars";
        }
        lz1.c("unknown instance type");
        return "unk";
    }
}
