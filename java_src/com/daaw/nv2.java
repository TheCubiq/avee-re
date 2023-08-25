package com.daaw;

import android.util.SparseArray;
/* loaded from: classes.dex */
public final class nv2 implements Runnable {
    public final /* synthetic */ qv2 p;
    public final /* synthetic */ sv2 q;

    public nv2(sv2 sv2Var, qv2 qv2Var) {
        this.q = sv2Var;
        this.p = qv2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        this.p.a();
        sparseArray = this.q.C;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray2 = this.q.C;
            ((hw2) sparseArray2.valueAt(i)).i();
        }
    }
}
