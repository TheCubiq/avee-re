package com.daaw;

import android.util.SparseArray;
/* loaded from: classes.dex */
public final class pl1 {

    /* renamed from: a */
    public final SparseArray<ol1> f23020a = new SparseArray<>();

    /* renamed from: a */
    public ol1 m13301a(int i) {
        ol1 ol1Var = this.f23020a.get(i);
        if (ol1Var == null) {
            ol1 ol1Var2 = new ol1(Long.MAX_VALUE);
            this.f23020a.put(i, ol1Var2);
            return ol1Var2;
        }
        return ol1Var;
    }

    /* renamed from: b */
    public void m13300b() {
        this.f23020a.clear();
    }
}
