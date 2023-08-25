package com.daaw;
/* loaded from: classes2.dex */
public final class pg0 extends ng0 {
    public static final a t = new a(null);
    public static final pg0 u = new pg0(1, 0);

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(pq pqVar) {
            this();
        }

        public final pg0 a() {
            return pg0.u;
        }
    }

    public pg0(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // com.daaw.ng0
    public boolean equals(Object obj) {
        if (obj instanceof pg0) {
            if (!isEmpty() || !((pg0) obj).isEmpty()) {
                pg0 pg0Var = (pg0) obj;
                if (d() != pg0Var.d() || e() != pg0Var.e()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.daaw.ng0
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (d() * 31) + e();
    }

    @Override // com.daaw.ng0
    public boolean isEmpty() {
        return d() > e();
    }

    public boolean k(int i) {
        return d() <= i && i <= e();
    }

    @Override // com.daaw.ng0
    public String toString() {
        return d() + ".." + e();
    }
}
