package com.daaw;

import android.util.SparseArray;
/* loaded from: classes.dex */
public final class pl1 {
    public final SparseArray<ol1> a = new SparseArray<>();

    public ol1 a(int i) {
        ol1 ol1Var = this.a.get(i);
        if (ol1Var == null) {
            ol1 ol1Var2 = new ol1(Long.MAX_VALUE);
            this.a.put(i, ol1Var2);
            return ol1Var2;
        }
        return ol1Var;
    }

    public void b() {
        this.a.clear();
    }
}
