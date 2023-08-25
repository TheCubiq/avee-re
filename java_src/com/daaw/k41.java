package com.daaw;
/* loaded from: classes.dex */
public final class k41 implements Comparable<k41> {

    /* renamed from: p */
    public final int f15657p;

    /* renamed from: q */
    public final int f15658q;

    /* renamed from: r */
    public final int f15659r;

    public k41(int i, int i2, int i3) {
        this.f15657p = i;
        this.f15658q = i2;
        this.f15659r = i3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(k41 k41Var) {
        int i = this.f15657p - k41Var.f15657p;
        if (i == 0) {
            int i2 = this.f15658q - k41Var.f15658q;
            return i2 == 0 ? this.f15659r - k41Var.f15659r : i2;
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
        return this.f15657p == k41Var.f15657p && this.f15658q == k41Var.f15658q && this.f15659r == k41Var.f15659r;
    }

    public int hashCode() {
        return (((this.f15657p * 31) + this.f15658q) * 31) + this.f15659r;
    }

    public String toString() {
        return this.f15657p + "." + this.f15658q + "." + this.f15659r;
    }
}
