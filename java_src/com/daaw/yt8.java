package com.daaw;

import android.util.SparseArray;
/* loaded from: classes.dex */
public final class yt8 {

    /* renamed from: c */
    public final gt4 f34099c;

    /* renamed from: b */
    public final SparseArray f34098b = new SparseArray();

    /* renamed from: a */
    public int f34097a = -1;

    public yt8(gt4 gt4Var) {
        this.f34099c = gt4Var;
    }

    /* renamed from: a */
    public final Object m3228a(int i) {
        if (this.f34097a == -1) {
            this.f34097a = 0;
        }
        while (true) {
            int i2 = this.f34097a;
            if (i2 > 0 && i < this.f34098b.keyAt(i2)) {
                this.f34097a--;
            }
        }
        while (this.f34097a < this.f34098b.size() - 1 && i >= this.f34098b.keyAt(this.f34097a + 1)) {
            this.f34097a++;
        }
        return this.f34098b.valueAt(this.f34097a);
    }

    /* renamed from: b */
    public final Object m3227b() {
        SparseArray sparseArray = this.f34098b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    /* renamed from: c */
    public final void m3226c(int i, Object obj) {
        if (this.f34097a == -1) {
            uo4.m7872f(this.f34098b.size() == 0);
            this.f34097a = 0;
        }
        if (this.f34098b.size() > 0) {
            SparseArray sparseArray = this.f34098b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            uo4.m7874d(i >= keyAt);
            if (keyAt == i) {
                SparseArray sparseArray2 = this.f34098b;
                lt8.m16556A((jt8) sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f34098b.append(i, obj);
    }

    /* renamed from: d */
    public final void m3225d() {
        for (int i = 0; i < this.f34098b.size(); i++) {
            lt8.m16556A((jt8) this.f34098b.valueAt(i));
        }
        this.f34097a = -1;
        this.f34098b.clear();
    }

    /* renamed from: e */
    public final void m3224e(int i) {
        int i2 = 0;
        while (i2 < this.f34098b.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.f34098b.keyAt(i3)) {
                return;
            }
            lt8.m16556A((jt8) this.f34098b.valueAt(i2));
            this.f34098b.removeAt(i2);
            int i4 = this.f34097a;
            if (i4 > 0) {
                this.f34097a = i4 - 1;
            }
            i2 = i3;
        }
    }

    /* renamed from: f */
    public final boolean m3223f() {
        return this.f34098b.size() == 0;
    }
}
