package com.daaw;
/* loaded from: classes.dex */
public class y2 {
    public static final String[] a = {"unset", "start", "center", "end"};

    public static String a(int i, int i2) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i2 != 0) {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    if (i2 != 3) {
                                        lz1.c("unknown instance type");
                                        return "unset";
                                    }
                                    return "end";
                                }
                                return "center";
                            }
                            return "start";
                        }
                        return "unset";
                    }
                    return "end";
                }
                return "center";
            }
            return "start";
        }
        return "unset";
    }
}
