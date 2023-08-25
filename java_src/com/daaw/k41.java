package com.daaw;
/* loaded from: classes.dex */
public final class k41 implements Comparable<k41> {
    public final int p;
    public final int q;
    public final int r;

    public k41(int i, int i2, int i3) {
        this.p = i;
        this.q = i2;
        this.r = i3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(k41 k41Var) {
        int i = this.p - k41Var.p;
        if (i == 0) {
            int i2 = this.q - k41Var.q;
            return i2 == 0 ? this.r - k41Var.r : i2;
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k41.class != obj.getClass()) {
            return false;
        }
        k41 k41Var = (k41) obj;
        return this.p == k41Var.p && this.q == k41Var.q && this.r == k41Var.r;
    }

    public int hashCode() {
        return (((this.p * 31) + this.q) * 31) + this.r;
    }

    public String toString() {
        return this.p + "." + this.q + "." + this.r;
    }
}
