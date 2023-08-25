package com.daaw;
/* loaded from: classes.dex */
public class s5 {
    public static final String[] a = {"HorizontalLine", "Rectangle"};
    public static final String[] b = {"None", "HorizontalLine", "Rectangle"};

    public static pc0 a(String str, pc0 pc0Var) {
        if (b(pc0Var).equals(str)) {
            return pc0Var;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1424852677:
                if (str.equals("HorizontalLineRandom")) {
                    c = 0;
                    break;
                }
                break;
            case -1169699505:
                if (str.equals("Rectangle")) {
                    c = 1;
                    break;
                }
                break;
            case 2368532:
                if (str.equals("Line")) {
                    c = 2;
                    break;
                }
                break;
            case 2433880:
                if (str.equals("None")) {
                    c = 3;
                    break;
                }
                break;
            case 127874218:
                if (str.equals("VerticalLine")) {
                    c = 4;
                    break;
                }
                break;
            case 1200208896:
                if (str.equals("Rectangle3D")) {
                    c = 5;
                    break;
                }
                break;
            case 1802881624:
                if (str.equals("HorizontalLine")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new u5();
            case 1:
                return new w5();
            case 2:
                return new x5();
            case 3:
                return null;
            case 4:
                return new x5();
            case 5:
                return new v5();
            case 6:
                return new t5();
            default:
                lz1.c("unknown typeName: " + str);
                return pc0Var;
        }
    }

    public static String b(pc0 pc0Var) {
        if (pc0Var == null) {
            return "None";
        }
        if (pc0Var instanceof t5) {
            return "HorizontalLine";
        }
        if (pc0Var instanceof u5) {
            return "HorizontalLineRandom";
        }
        if (pc0Var instanceof x5) {
            return "Line";
        }
        if (pc0Var instanceof w5) {
            return "Rectangle";
        }
        if (pc0Var instanceof v5) {
            return "Rectangle3D";
        }
        lz1.c("unknown instance type");
        return "unk";
    }
}
