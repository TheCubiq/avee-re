package com.daaw.avee.comp.Visualizer.Elements.Base;

import com.daaw.avee.Common.tlog;
/* loaded from: classes.dex */
public class AnchorMode {
    public static final int Anchor_Center = 2;
    public static final int Anchor_End = 3;
    public static final int Anchor_Na = 0;
    public static final int Anchor_Start = 1;
    public static final String typeName1 = "start";
    public static final String typeName2 = "center";
    public static final String typeName3 = "end";
    public static final String typeName0 = "unset";
    public static final String[] modes = {typeName0, "start", "center", "end"};

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int create(String str, int i) {
        char c;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 100571:
                if (str.equals("end")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 109757538:
                if (str.equals("start")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 111442729:
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
                        tlog.w("unknown typeName: " + str);
                        return i;
                    }
                    return 3;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static String getTypeName(int i, int i2) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i2 != 0) {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    if (i2 != 3) {
                                        tlog.w("unknown instance type");
                                        return typeName0;
                                    }
                                    return "end";
                                }
                                return "center";
                            }
                            return "start";
                        }
                        return typeName0;
                    }
                    return "end";
                }
                return "center";
            }
            return "start";
        }
        return typeName0;
    }
}
