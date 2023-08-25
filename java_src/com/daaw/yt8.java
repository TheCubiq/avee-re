package com.daaw;

import android.util.SparseArray;
/* loaded from: classes.dex */
public final class yt8 {
    public final gt4 c;
    public final SparseArray b = new SparseArray();
    public int a = -1;

    public yt8(gt4 gt4Var) {
        this.c = gt4Var;
    }

    public final Object a(int i) {
        if (this.a == -1) {
            this.a = 0;
        }
        while (true) {
            int i2 = this.a;
            if (i2 > 0 && i < this.b.keyAt(i2)) {
                this.a--;
            }
        }
        while (this.a < this.b.size() - 1 && i >= this.b.keyAt(this.a + 1)) {
            this.a++;
        }
        return this.b.valueAt(this.a);
    }

    public final Object b() {
        SparseArray sparseArray = this.b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public final void c(int i, Object obj) {
        if (this.a == -1) {
            uo4.f(this.b.size() == 0);
            this.a = 0;
        }
        if (this.b.size() > 0) {
            SparseArray sparseArray = this.b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            uo4.d(i >= keyAt);
            if (keyAt == i) {
                SparseArray sparseArray2 = this.b;
                lt8.A((jt8) sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.b.append(i, obj);
    }

    public final void d() {
        for (int i = 0; i < this.b.size(); i++) {
            lt8.A((jt8) this.b.valueAt(i));
        }
        this.a = -1;
        this.b.clear();
    }

    public final void e(int i) {
        int i2 = 0;
        while (i2 < this.b.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.b.keyAt(i3)) {
                return;
            }
            lt8.A((jt8) this.b.valueAt(i2));
            this.b.removeAt(i2);
            int i4 = this.a;
            if (i4 > 0) {
                this.a = i4 - 1;
            }
            i2 = i3;
        }
    }

    public final boolean f() {
        return this.b.size() == 0;
    }
}
