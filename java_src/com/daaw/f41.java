package com.daaw;
/* loaded from: classes.dex */
public final class f41 implements Comparable<f41> {

    /* renamed from: p */
    public final int f9091p;

    /* renamed from: q */
    public final int f9092q;

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(f41 f41Var) {
        int i = this.f9091p - f41Var.f9091p;
        return i == 0 ? this.f9092q - f41Var.f9092q : i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f41.class != obj.getClass()) {
            return false;
        }
        f41 f41Var = (f41) obj;
        return this.f9091p == f41Var.f9091p && this.f9092q == f41Var.f9092q;
    }

    public int hashCode() {
        return (this.f9091p * 31) + this.f9092q;
    }

    public String toString() {
        return this.f9091p + "." + this.f9092q;
    }
}
