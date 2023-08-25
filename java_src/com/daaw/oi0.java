package com.daaw;
/* loaded from: classes2.dex */
public final class oi0 implements Comparable<oi0> {

    /* renamed from: t */
    public static final C2442a f21569t = new C2442a(null);

    /* renamed from: u */
    public static final oi0 f21570u = pi0.m13382a();

    /* renamed from: p */
    public final int f21571p;

    /* renamed from: q */
    public final int f21572q;

    /* renamed from: r */
    public final int f21573r;

    /* renamed from: s */
    public final int f21574s;

    /* renamed from: com.daaw.oi0$a */
    /* loaded from: classes2.dex */
    public static final class C2442a {
        public C2442a() {
        }

        public /* synthetic */ C2442a(C2575pq c2575pq) {
            this();
        }
    }

    public oi0(int i, int i2, int i3) {
        this.f21571p = i;
        this.f21572q = i2;
        this.f21573r = i3;
        this.f21574s = m14268b(i, i2, i3);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(oi0 oi0Var) {
        ug0.m8268f(oi0Var, "other");
        return this.f21574s - oi0Var.f21574s;
    }

    /* renamed from: b */
    public final int m14268b(int i, int i2, int i3) {
        boolean z = false;
        if (new pg0(0, 255).m13402k(i) && new pg0(0, 255).m13402k(i2) && new pg0(0, 255).m13402k(i3)) {
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
        return oi0Var != null && this.f21574s == oi0Var.f21574s;
    }

    public int hashCode() {
        return this.f21574s;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f21571p);
        sb.append('.');
        sb.append(this.f21572q);
        sb.append('.');
        sb.append(this.f21573r);
        return sb.toString();
    }
}
