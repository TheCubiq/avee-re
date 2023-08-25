package com.daaw;
/* loaded from: classes.dex */
public final class pg1 implements Comparable<pg1> {

    /* renamed from: p */
    public final int f22906p;

    /* renamed from: q */
    public final int f22907q;

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(pg1 pg1Var) {
        int i = this.f22906p - pg1Var.f22906p;
        return i == 0 ? this.f22907q - pg1Var.f22907q : i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pg1.class != obj.getClass()) {
            return false;
        }
        pg1 pg1Var = (pg1) obj;
        return this.f22906p == pg1Var.f22906p && this.f22907q == pg1Var.f22907q;
    }

    public int hashCode() {
        return (this.f22906p * 31) + this.f22907q;
    }

    public String toString() {
        return this.f22906p + "." + this.f22907q;
    }
}
