package com.daaw;
/* loaded from: classes.dex */
public class pa1 {
    public static final String[] a = {"HorizontalLine", "Circle", "SidedPolygon", "Letter"};
    public static final String[] b = {"HorizontalLine", "Circle", "SidedPolygon", "Letter", "Year"};
    public static final String[] c = {"None", "Circle", "SidedPolygon"};

    public static ge0 a(String str, ge0 ge0Var) {
        if (b(ge0Var).equals(str)) {
            return ge0Var;
        }
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -2022305722:
                if (str.equals("Letter")) {
                    c2 = 0;
                    break;
                }
                break;
            case 2433880:
                if (str.equals("None")) {
                    c2 = 1;
                    break;
                }
                break;
            case 2751581:
                if (str.equals("Year")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1536319149:
                if (str.equals("SidedPolygon")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1802881624:
                if (str.equals("HorizontalLine")) {
                    c2 = 4;
                    break;
                }
                break;
            case 2018617584:
                if (str.equals("Circle")) {
                    c2 = 5;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return new sa1();
            case 1:
                return null;
            case 2:
                return new va1();
            case 3:
                return new ta1();
            case 4:
                return new ra1();
            case 5:
                return new oa1();
            default:
                lz1.c("unknown typeName: " + str);
                return ge0Var;
        }
    }

    public static String b(ge0 ge0Var) {
        if (ge0Var == null) {
            return "None";
        }
        if (ge0Var instanceof ra1) {
            return "HorizontalLine";
        }
        if (ge0Var instanceof oa1) {
            return "Circle";
        }
        if (ge0Var instanceof ta1) {
            return "SidedPolygon";
        }
        if (ge0Var instanceof sa1) {
            return "Letter";
        }
        if (ge0Var instanceof va1) {
            return "Year";
        }
        lz1.c("unknown instance type");
        return "unk";
    }
}
