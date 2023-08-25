package com.daaw;

import android.util.SparseArray;
import java.util.Objects;
/* loaded from: classes.dex */
public final class lb8 {

    /* renamed from: a */
    public final r32 f17234a;

    /* renamed from: b */
    public final SparseArray f17235b;

    public lb8(r32 r32Var, SparseArray sparseArray) {
        this.f17234a = r32Var;
        SparseArray sparseArray2 = new SparseArray(r32Var.m11806b());
        for (int i = 0; i < r32Var.m11806b(); i++) {
            int m11807a = r32Var.m11807a(i);
            ib8 ib8Var = (ib8) sparseArray.get(m11807a);
            Objects.requireNonNull(ib8Var);
            sparseArray2.append(m11807a, ib8Var);
        }
        this.f17235b = sparseArray2;
    }

    /* renamed from: a */
    public final int m17062a(int i) {
        return this.f17234a.m11807a(i);
    }

    /* renamed from: b */
    public final int m17061b() {
        return this.f17234a.m11806b();
    }

    /* renamed from: c */
    public final ib8 m17060c(int i) {
        ib8 ib8Var = (ib8) this.f17235b.get(i);
        Objects.requireNonNull(ib8Var);
        return ib8Var;
    }

    /* renamed from: d */
    public final boolean m17059d(int i) {
        return this.f17234a.m11805c(i);
    }
}
