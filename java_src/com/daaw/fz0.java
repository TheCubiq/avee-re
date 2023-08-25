package com.daaw;

import android.util.SparseArray;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class fz0 {
    public static SparseArray<cz0> a = new SparseArray<>();
    public static HashMap<cz0, Integer> b;

    static {
        HashMap<cz0, Integer> hashMap = new HashMap<>();
        b = hashMap;
        hashMap.put(cz0.DEFAULT, 0);
        b.put(cz0.VERY_LOW, 1);
        b.put(cz0.HIGHEST, 2);
        for (cz0 cz0Var : b.keySet()) {
            a.append(b.get(cz0Var).intValue(), cz0Var);
        }
    }

    public static int a(cz0 cz0Var) {
        Integer num = b.get(cz0Var);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + cz0Var);
    }

    public static cz0 b(int i) {
        cz0 cz0Var = a.get(i);
        if (cz0Var != null) {
            return cz0Var;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
