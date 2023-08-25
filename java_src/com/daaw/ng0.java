package com.daaw;
/* loaded from: classes2.dex */
public class ng0 implements Iterable<Integer> {
    public static final a s = new a(null);
    public final int p;
    public final int q;
    public final int r;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(pq pqVar) {
            this();
        }

        public final ng0 a(int i, int i2, int i3) {
            return new ng0(i, i2, i3);
        }
    }

    public ng0(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.p = i;
        this.q = nz0.b(i, i2, i3);
        this.r = i3;
    }

    public final int d() {
        return this.p;
    }

    public final int e() {
        return this.q;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ng0) {
            if (!isEmpty() || !((ng0) obj).isEmpty()) {
                ng0 ng0Var = (ng0) obj;
                if (this.p != ng0Var.p || this.q != ng0Var.q || this.r != ng0Var.r) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        return this.r;
    }

    @Override // java.lang.Iterable
    /* renamed from: h */
    public mg0 iterator() {
        return new og0(this.p, this.q, this.r);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.p * 31) + this.q) * 31) + this.r;
    }

    public boolean isEmpty() {
        if (this.r > 0) {
            if (this.p > this.q) {
                return true;
            }
        } else if (this.p < this.q) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.r > 0) {
            sb = new StringBuilder();
            sb.append(this.p);
            sb.append("..");
            sb.append(this.q);
            sb.append(" step ");
            i = this.r;
        } else {
            sb = new StringBuilder();
            sb.append(this.p);
            sb.append(" downTo ");
            sb.append(this.q);
            sb.append(" step ");
            i = -this.r;
        }
        sb.append(i);
        return sb.toString();
    }
}
