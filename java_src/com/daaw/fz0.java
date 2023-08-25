package com.daaw;

import android.util.SparseArray;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class fz0 {

    /* renamed from: a */
    public static SparseArray<cz0> f10104a = new SparseArray<>();

    /* renamed from: b */
    public static HashMap<cz0, Integer> f10105b;

    static {
        HashMap<cz0, Integer> hashMap = new HashMap<>();
        f10105b = hashMap;
        hashMap.put(cz0.DEFAULT, 0);
        f10105b.put(cz0.VERY_LOW, 1);
        f10105b.put(cz0.HIGHEST, 2);
        for (cz0 cz0Var : f10105b.keySet()) {
            f10104a.append(f10105b.get(cz0Var).intValue(), cz0Var);
        }
    }

    /* renamed from: a */
    public static int m22132a(cz0 cz0Var) {
        Integer num = f10105b.get(cz0Var);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + cz0Var);
    }

    /* renamed from: b */
    public static cz0 m22131b(int i) {
        cz0 cz0Var = f10104a.get(i);
        if (cz0Var != null) {
            return cz0Var;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
