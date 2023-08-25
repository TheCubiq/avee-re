package com.daaw;

import android.util.SparseArray;
/* loaded from: classes.dex */
public final class nv2 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ qv2 f20753p;

    /* renamed from: q */
    public final /* synthetic */ sv2 f20754q;

    public nv2(sv2 sv2Var, qv2 qv2Var) {
        this.f20754q = sv2Var;
        this.f20753p = qv2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        this.f20753p.m12033a();
        sparseArray = this.f20754q.f26669C;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray2 = this.f20754q.f26669C;
            ((hw2) sparseArray2.valueAt(i)).m20356i();
        }
    }
}
