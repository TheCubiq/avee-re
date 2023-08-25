package com.daaw;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
/* loaded from: classes.dex */
public final class fv8 extends de4 {

    /* renamed from: S */
    public static final fv8 f9996S;
    @Deprecated

    /* renamed from: T */
    public static final fv8 f9997T;

    /* renamed from: U */
    public static final th8 f9998U;

    /* renamed from: D */
    public final boolean f9999D;

    /* renamed from: E */
    public final boolean f10000E;

    /* renamed from: F */
    public final boolean f10001F;

    /* renamed from: G */
    public final boolean f10002G;

    /* renamed from: H */
    public final boolean f10003H;

    /* renamed from: I */
    public final boolean f10004I;

    /* renamed from: J */
    public final boolean f10005J;

    /* renamed from: K */
    public final boolean f10006K;

    /* renamed from: L */
    public final boolean f10007L;

    /* renamed from: M */
    public final boolean f10008M;

    /* renamed from: N */
    public final boolean f10009N;

    /* renamed from: O */
    public final boolean f10010O;

    /* renamed from: P */
    public final boolean f10011P;

    /* renamed from: Q */
    public final SparseArray f10012Q;

    /* renamed from: R */
    public final SparseBooleanArray f10013R;

    static {
        fv8 fv8Var = new fv8(new dv8());
        f9996S = fv8Var;
        f9997T = fv8Var;
        f9998U = new th8() { // from class: com.daaw.bv8
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
        z = dv8Var.f7907q;
        this.f9999D = z;
        this.f10000E = false;
        z2 = dv8Var.f7908r;
        this.f10001F = z2;
        this.f10002G = false;
        z3 = dv8Var.f7909s;
        this.f10003H = z3;
        this.f10004I = false;
        this.f10005J = false;
        this.f10006K = false;
        this.f10007L = false;
        z4 = dv8Var.f7910t;
        this.f10008M = z4;
        z5 = dv8Var.f7911u;
        this.f10009N = z5;
        this.f10010O = false;
        z6 = dv8Var.f7912v;
        this.f10011P = z6;
        sparseArray = dv8Var.f7913w;
        this.f10012Q = sparseArray;
        sparseBooleanArray = dv8Var.f7914x;
        this.f10013R = sparseBooleanArray;
    }

    /* renamed from: d */
    public static fv8 m22237d(Context context) {
        return new fv8(new dv8(context));
    }

    /* renamed from: c */
    public final dv8 m22238c() {
        return new dv8(this, null);
    }

    @Deprecated
    /* renamed from: e */
    public final hv8 m22236e(int i, au8 au8Var) {
        Map map = (Map) this.f10012Q.get(i);
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
            if (super.equals(fv8Var) && this.f9999D == fv8Var.f9999D && this.f10001F == fv8Var.f10001F && this.f10003H == fv8Var.f10003H && this.f10008M == fv8Var.f10008M && this.f10009N == fv8Var.f10009N && this.f10011P == fv8Var.f10011P) {
                SparseBooleanArray sparseBooleanArray = this.f10013R;
                SparseBooleanArray sparseBooleanArray2 = fv8Var.f10013R;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.f10012Q;
                            SparseArray sparseArray2 = fv8Var.f10012Q;
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
                                                    if (!it5.m19376t(entry.getValue(), map2.get(au8Var))) {
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

    /* renamed from: f */
    public final boolean m22235f(int i) {
        return this.f10013R.get(i);
    }

    @Deprecated
    /* renamed from: g */
    public final boolean m22234g(int i, au8 au8Var) {
        Map map = (Map) this.f10012Q.get(i);
        return map != null && map.containsKey(au8Var);
    }

    @Override // com.daaw.de4
    public final int hashCode() {
        return ((((((((((((super.hashCode() + 31) * 31) + (this.f9999D ? 1 : 0)) * 961) + (this.f10001F ? 1 : 0)) * 961) + (this.f10003H ? 1 : 0)) * 28629151) + (this.f10008M ? 1 : 0)) * 31) + (this.f10009N ? 1 : 0)) * 961) + (this.f10011P ? 1 : 0);
    }
}
