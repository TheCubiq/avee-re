package com.daaw;
/* loaded from: classes2.dex */
public class ng0 implements Iterable<Integer> {

    /* renamed from: s */
    public static final C2289a f20099s = new C2289a(null);

    /* renamed from: p */
    public final int f20100p;

    /* renamed from: q */
    public final int f20101q;

    /* renamed from: r */
    public final int f20102r;

    /* renamed from: com.daaw.ng0$a */
    /* loaded from: classes2.dex */
    public static final class C2289a {
        public C2289a() {
        }

        public /* synthetic */ C2289a(C2575pq c2575pq) {
            this();
        }

        /* renamed from: a */
        public final ng0 m15183a(int i, int i2, int i3) {
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
        this.f20100p = i;
        this.f20101q = nz0.m14712b(i, i2, i3);
        this.f20102r = i3;
    }

    /* renamed from: d */
    public final int m15187d() {
        return this.f20100p;
    }

    /* renamed from: e */
    public final int m15186e() {
        return this.f20101q;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ng0) {
            if (!isEmpty() || !((ng0) obj).isEmpty()) {
                ng0 ng0Var = (ng0) obj;
                if (this.f20100p != ng0Var.f20100p || this.f20101q != ng0Var.f20101q || this.f20102r != ng0Var.f20102r) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int m15185f() {
        return this.f20102r;
    }

    @Override // java.lang.Iterable
    /* renamed from: h */
    public mg0 iterator() {
        return new og0(this.f20100p, this.f20101q, this.f20102r);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f20100p * 31) + this.f20101q) * 31) + this.f20102r;
    }

    public boolean isEmpty() {
        if (this.f20102r > 0) {
            if (this.f20100p > this.f20101q) {
                return true;
            }
        } else if (this.f20100p < this.f20101q) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f20102r > 0) {
            sb = new StringBuilder();
            sb.append(this.f20100p);
            sb.append("..");
            sb.append(this.f20101q);
            sb.append(" step ");
            i = this.f20102r;
        } else {
            sb = new StringBuilder();
            sb.append(this.f20100p);
            sb.append(" downTo ");
            sb.append(this.f20101q);
            sb.append(" step ");
            i = -this.f20102r;
        }
        sb.append(i);
        return sb.toString();
    }
}
