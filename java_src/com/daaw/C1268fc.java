package com.daaw;
/* renamed from: com.daaw.fc */
/* loaded from: classes.dex */
public class C1268fc {

    /* renamed from: a */
    public static final String[] f9420a = {"Alpha", "PreMulAlpha", "Screen", "Add", "AddAlpha"};

    /* renamed from: a */
    public static int m22807a(String str, int i) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1823822708:
                if (str.equals("Screen")) {
                    c = 0;
                    break;
                }
                break;
            case -1199117987:
                if (str.equals("AddAlpha")) {
                    c = 1;
                    break;
                }
                break;
            case -147734627:
                if (str.equals("PreMulAlpha")) {
                    c = 2;
                    break;
                }
                break;
            case 65665:
                if (str.equals("Add")) {
                    c = 3;
                    break;
                }
                break;
            case 2470132:
                if (str.equals("Over")) {
                    c = 4;
                    break;
                }
                break;
            case 63357246:
                if (str.equals("Alpha")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 5;
            case 2:
                return 4;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 0;
            default:
                lz1.m16363c("unknown typeName: " + str);
                return i;
        }
    }

    /* renamed from: b */
    public static String m22806b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                lz1.m16363c("unknown instance type");
                                return "Alpha";
                            }
                            return "AddAlpha";
                        }
                        return "PreMulAlpha";
                    }
                    return "Over";
                }
                return "Add";
            }
            return "Screen";
        }
        return "Alpha";
    }
}
