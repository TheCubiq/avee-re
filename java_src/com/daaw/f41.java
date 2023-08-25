package com.daaw;
/* loaded from: classes.dex */
public final class f41 implements Comparable<f41> {
    public final int p;
    public final int q;

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(f41 f41Var) {
        int i = this.p - f41Var.p;
        return i == 0 ? this.q - f41Var.q : i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f41.class != obj.getClass()) {
            return false;
        }
        f41 f41Var = (f41) obj;
        return this.p == f41Var.p && this.q == f41Var.q;
    }

    public int hashCode() {
        return (this.p * 31) + this.q;
    }

    public String toString() {
        return this.p + "." + this.q;
    }
}
