package com.daaw;
/* loaded from: classes.dex */
public final class pg1 implements Comparable<pg1> {
    public final int p;
    public final int q;

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(pg1 pg1Var) {
        int i = this.p - pg1Var.p;
        return i == 0 ? this.q - pg1Var.q : i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pg1.class != obj.getClass()) {
            return false;
        }
        pg1 pg1Var = (pg1) obj;
        return this.p == pg1Var.p && this.q == pg1Var.q;
    }

    public int hashCode() {
        return (this.p * 31) + this.q;
    }

    public String toString() {
        return this.p + "." + this.q;
    }
}
