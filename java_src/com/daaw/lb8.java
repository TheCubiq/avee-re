package com.daaw;

import android.util.SparseArray;
import java.util.Objects;
/* loaded from: classes.dex */
public final class lb8 {
    public final r32 a;
    public final SparseArray b;

    public lb8(r32 r32Var, SparseArray sparseArray) {
        this.a = r32Var;
        SparseArray sparseArray2 = new SparseArray(r32Var.b());
        for (int i = 0; i < r32Var.b(); i++) {
            int a = r32Var.a(i);
            ib8 ib8Var = (ib8) sparseArray.get(a);
            Objects.requireNonNull(ib8Var);
            sparseArray2.append(a, ib8Var);
        }
        this.b = sparseArray2;
    }

    public final int a(int i) {
        return this.a.a(i);
    }

    public final int b() {
        return this.a.b();
    }

    public final ib8 c(int i) {
        ib8 ib8Var = (ib8) this.b.get(i);
        Objects.requireNonNull(ib8Var);
        return ib8Var;
    }

    public final boolean d(int i) {
        return this.a.c(i);
    }
}
