package com.daaw;
/* loaded from: classes.dex */
public class ma1 {

    /* renamed from: a */
    public static final String[] f18688a = {"Waveform", "Spectrum", "Spectrum2"};

    /* renamed from: a */
    public static fe0 m16145a(String str, fe0 fe0Var) {
        if (m16144b(fe0Var, "None").equals(str)) {
            return fe0Var;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2067891215:
                if (str.equals("Spectrum")) {
                    c = 0;
                    break;
                }
                break;
            case 2433880:
                if (str.equals("None")) {
                    c = 1;
                    break;
                }
                break;
            case 319881825:
                if (str.equals("Spectrum2")) {
                    c = 2;
                    break;
                }
                break;
            case 668852061:
                if (str.equals("Waveform")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new ga1();
            case 1:
                return null;
            case 2:
                return new ha1();
            case 3:
                return new ja1();
            default:
                lz1.m16363c("unknown typeName: " + str);
                return fe0Var == null ? new ha1() : fe0Var;
        }
    }

    /* renamed from: b */
    public static String m16144b(fe0 fe0Var, String str) {
        if (fe0Var == null) {
            return str;
        }
        if (fe0Var instanceof ja1) {
            return "Waveform";
        }
        if (fe0Var instanceof ga1) {
            return "Spectrum";
        }
        if (fe0Var instanceof ha1) {
            return "Spectrum2";
        }
        lz1.m16363c("unknown instance type");
        return str;
    }
}
