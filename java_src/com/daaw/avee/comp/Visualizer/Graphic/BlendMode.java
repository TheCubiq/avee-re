package com.daaw.avee.comp.Visualizer.Graphic;

import com.daaw.avee.Common.tlog;
/* loaded from: classes.dex */
public class BlendMode {
    public static final int ADD_ALPHA_BLEND = 5;
    public static final int ADD_BLEND = 2;
    public static final int ALPHA_BLEND = 0;
    public static final int DRAW_OVER = 3;
    public static final int PRE_MUL_ALPHA = 4;
    public static final int SCREEN_BLEND = 1;
    public static final String typeName3 = "Over";
    public static final String typeName0 = "Alpha";
    public static final String typeName4 = "PreMulAlpha";
    public static final String typeName1 = "Screen";
    public static final String typeName2 = "Add";
    public static final String typeName5 = "AddAlpha";
    public static final String[] useableModes = {typeName0, typeName4, typeName1, typeName2, typeName5};

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int create(String str, int i) {
        char c;
        switch (str.hashCode()) {
            case -1823822708:
                if (str.equals(typeName1)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1199117987:
                if (str.equals(typeName5)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -147734627:
                if (str.equals(typeName4)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 65665:
                if (str.equals(typeName2)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 2470132:
                if (str.equals(typeName3)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 63357246:
                if (str.equals(typeName0)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                tlog.w("unknown typeName: " + str);
                                return i;
                            }
                            return 5;
                        }
                        return 4;
                    }
                    return 3;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static String getTypeName(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                tlog.w("unknown instance type");
                                return typeName0;
                            }
                            return typeName5;
                        }
                        return typeName4;
                    }
                    return typeName3;
                }
                return typeName2;
            }
            return typeName1;
        }
        return typeName0;
    }
}
