package com.daaw;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class dv8 extends bd4 {

    /* renamed from: q */
    public boolean f7907q;

    /* renamed from: r */
    public boolean f7908r;

    /* renamed from: s */
    public boolean f7909s;

    /* renamed from: t */
    public boolean f7910t;

    /* renamed from: u */
    public boolean f7911u;

    /* renamed from: v */
    public boolean f7912v;

    /* renamed from: w */
    public final SparseArray f7913w;

    /* renamed from: x */
    public final SparseBooleanArray f7914x;

    @Deprecated
    public dv8() {
        this.f7913w = new SparseArray();
        this.f7914x = new SparseBooleanArray();
        m23866v();
    }

    public dv8(Context context) {
        super.m26207d(context);
        Point m19403b = it5.m19403b(context);
        mo23876e(m19403b.x, m19403b.y, true);
        this.f7913w = new SparseArray();
        this.f7914x = new SparseBooleanArray();
        m23866v();
    }

    public /* synthetic */ dv8(fv8 fv8Var, cv8 cv8Var) {
        super(fv8Var);
        this.f7907q = fv8Var.f9999D;
        this.f7908r = fv8Var.f10001F;
        this.f7909s = fv8Var.f10003H;
        this.f7910t = fv8Var.f10008M;
        this.f7911u = fv8Var.f10009N;
        this.f7912v = fv8Var.f10011P;
        SparseArray m22240a = fv8.m22240a(fv8Var);
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < m22240a.size(); i++) {
            sparseArray.put(m22240a.keyAt(i), new HashMap((Map) m22240a.valueAt(i)));
        }
        this.f7913w = sparseArray;
        this.f7914x = fv8.m22239b(fv8Var).clone();
    }

    @Override // com.daaw.bd4
    /* renamed from: e */
    public final /* synthetic */ bd4 mo23876e(int i, int i2, boolean z) {
        super.mo23876e(i, i2, true);
        return this;
    }

    /* renamed from: o */
    public final dv8 m23873o(int i, boolean z) {
        if (this.f7914x.get(i) == z) {
            return this;
        }
        if (z) {
            this.f7914x.put(i, true);
        } else {
            this.f7914x.delete(i);
        }
        return this;
    }

    /* renamed from: v */
    public final void m23866v() {
        this.f7907q = true;
        this.f7908r = true;
        this.f7909s = true;
        this.f7910t = true;
        this.f7911u = true;
        this.f7912v = true;
    }
}
