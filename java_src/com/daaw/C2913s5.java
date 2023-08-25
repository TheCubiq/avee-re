package com.daaw;
/* renamed from: com.daaw.s5 */
/* loaded from: classes.dex */
public class C2913s5 {

    /* renamed from: a */
    public static final String[] f25863a = {"HorizontalLine", "Rectangle"};

    /* renamed from: b */
    public static final String[] f25864b = {"None", "HorizontalLine", "Rectangle"};

    /* renamed from: a */
    public static pc0 m10710a(String str, pc0 pc0Var) {
        if (m10709b(pc0Var).equals(str)) {
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
                return new C3162u5();
            case 1:
                return new C3398w5();
            case 2:
                return new C3504x5();
            case 3:
                return null;
            case 4:
                return new C3504x5();
            case 5:
                return new C3290v5();
            case 6:
                return new C3013t5();
            default:
                lz1.m16363c("unknown typeName: " + str);
                return pc0Var;
        }
    }

    /* renamed from: b */
    public static String m10709b(pc0 pc0Var) {
        if (pc0Var == null) {
            return "None";
        }
        if (pc0Var instanceof C3013t5) {
            return "HorizontalLine";
        }
        if (pc0Var instanceof C3162u5) {
            return "HorizontalLineRandom";
        }
        if (pc0Var instanceof C3504x5) {
            return "Line";
        }
        if (pc0Var instanceof C3398w5) {
            return "Rectangle";
        }
        if (pc0Var instanceof C3290v5) {
            return "Rectangle3D";
        }
        lz1.m16363c("unknown instance type");
        return "unk";
    }
}
