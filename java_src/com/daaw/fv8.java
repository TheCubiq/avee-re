package com.daaw;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
/* loaded from: classes.dex */
public final class fv8 extends de4 {
    public static final fv8 S;
    @Deprecated
    public static final fv8 T;
    public static final th8 U;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final SparseArray Q;
    public final SparseBooleanArray R;

    static {
        fv8 fv8Var = new fv8(new dv8());
        S = fv8Var;
        T = fv8Var;
        U = new th8() { // from class: com.daaw.bv8
        };
    }

    public fv8(dv8 dv8Var) {
        super(dv8Var);
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        SparseArray sparseArray;
        SparseBooleanArray sparseBooleanArray;
        z = dv8Var.q;
        this.D = z;
        this.E = false;
        z2 = dv8Var.r;
        this.F = z2;
        this.G = false;
        z3 = dv8Var.s;
        this.H = z3;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        z4 = dv8Var.t;
        this.M = z4;
        z5 = dv8Var.u;
        this.N = z5;
        this.O = false;
        z6 = dv8Var.v;
        this.P = z6;
        sparseArray = dv8Var.w;
        this.Q = sparseArray;
        sparseBooleanArray = dv8Var.x;
        this.R = sparseBooleanArray;
    }

    public static fv8 d(Context context) {
        return new fv8(new dv8(context));
    }

    public final dv8 c() {
        return new dv8(this, null);
    }

    @Deprecated
    public final hv8 e(int i, au8 au8Var) {
        Map map = (Map) this.Q.get(i);
        if (map != null) {
            return (hv8) map.get(au8Var);
        }
        return null;
    }

    @Override // com.daaw.de4
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fv8.class == obj.getClass()) {
            fv8 fv8Var = (fv8) obj;
            if (super.equals(fv8Var) && this.D == fv8Var.D && this.F == fv8Var.F && this.H == fv8Var.H && this.M == fv8Var.M && this.N == fv8Var.N && this.P == fv8Var.P) {
                SparseBooleanArray sparseBooleanArray = this.R;
                SparseBooleanArray sparseBooleanArray2 = fv8Var.R;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.Q;
                            SparseArray sparseArray2 = fv8Var.Q;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                au8 au8Var = (au8) entry.getKey();
                                                if (map2.containsKey(au8Var)) {
                                                    if (!it5.t(entry.getValue(), map2.get(au8Var))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean f(int i) {
        return this.R.get(i);
    }

    @Deprecated
    public final boolean g(int i, au8 au8Var) {
        Map map = (Map) this.Q.get(i);
        return map != null && map.containsKey(au8Var);
    }

    @Override // com.daaw.de4
    public final int hashCode() {
        return ((((((((((((super.hashCode() + 31) * 31) + (this.D ? 1 : 0)) * 961) + (this.F ? 1 : 0)) * 961) + (this.H ? 1 : 0)) * 28629151) + (this.M ? 1 : 0)) * 31) + (this.N ? 1 : 0)) * 961) + (this.P ? 1 : 0);
    }
}
