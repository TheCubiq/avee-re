package com.daaw;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class dv8 extends bd4 {
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final SparseArray w;
    public final SparseBooleanArray x;

    @Deprecated
    public dv8() {
        this.w = new SparseArray();
        this.x = new SparseBooleanArray();
        v();
    }

    public dv8(Context context) {
        super.d(context);
        Point b = it5.b(context);
        e(b.x, b.y, true);
        this.w = new SparseArray();
        this.x = new SparseBooleanArray();
        v();
    }

    public /* synthetic */ dv8(fv8 fv8Var, cv8 cv8Var) {
        super(fv8Var);
        this.q = fv8Var.D;
        this.r = fv8Var.F;
        this.s = fv8Var.H;
        this.t = fv8Var.M;
        this.u = fv8Var.N;
        this.v = fv8Var.P;
        SparseArray a = fv8.a(fv8Var);
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < a.size(); i++) {
            sparseArray.put(a.keyAt(i), new HashMap((Map) a.valueAt(i)));
        }
        this.w = sparseArray;
        this.x = fv8.b(fv8Var).clone();
    }

    @Override // com.daaw.bd4
    public final /* synthetic */ bd4 e(int i, int i2, boolean z) {
        super.e(i, i2, true);
        return this;
    }

    public final dv8 o(int i, boolean z) {
        if (this.x.get(i) == z) {
            return this;
        }
        if (z) {
            this.x.put(i, true);
        } else {
            this.x.delete(i);
        }
        return this;
    }

    public final void v() {
        this.q = true;
        this.r = true;
        this.s = true;
        this.t = true;
        this.u = true;
        this.v = true;
    }
}
