package com.daaw;
/* loaded from: classes2.dex */
public final class oi0 implements Comparable<oi0> {
    public static final a t = new a(null);
    public static final oi0 u = pi0.a();
    public final int p;
    public final int q;
    public final int r;
    public final int s;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(pq pqVar) {
            this();
        }
    }

    public oi0(int i, int i2, int i3) {
        this.p = i;
        this.q = i2;
        this.r = i3;
        this.s = b(i, i2, i3);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(oi0 oi0Var) {
        ug0.f(oi0Var, "other");
        return this.s - oi0Var.s;
    }

    public final int b(int i, int i2, int i3) {
        boolean z = false;
        if (new pg0(0, 255).k(i) && new pg0(0, 255).k(i2) && new pg0(0, 255).k(i3)) {
            z = true;
        }
        if (z) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        oi0 oi0Var = obj instanceof oi0 ? (oi0) obj : null;
        return oi0Var != null && this.s == oi0Var.s;
    }

    public int hashCode() {
        return this.s;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.p);
        sb.append('.');
        sb.append(this.q);
        sb.append('.');
        sb.append(this.r);
        return sb.toString();
    }
}
