package com.daaw;

import android.util.SparseArray;
/* loaded from: classes.dex */
public enum h01 {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    
    public static final SparseArray<h01> w;
    public final int p;

    static {
        h01 h01Var = DEFAULT;
        h01 h01Var2 = UNMETERED_ONLY;
        h01 h01Var3 = UNMETERED_OR_DAILY;
        h01 h01Var4 = FAST_IF_RADIO_AWAKE;
        h01 h01Var5 = NEVER;
        h01 h01Var6 = UNRECOGNIZED;
        SparseArray<h01> sparseArray = new SparseArray<>();
        w = sparseArray;
        sparseArray.put(0, h01Var);
        sparseArray.put(1, h01Var2);
        sparseArray.put(2, h01Var3);
        sparseArray.put(3, h01Var4);
        sparseArray.put(4, h01Var5);
        sparseArray.put(-1, h01Var6);
    }

    h01(int i) {
        this.p = i;
    }
}
