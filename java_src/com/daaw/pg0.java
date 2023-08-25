package com.daaw;
/* loaded from: classes2.dex */
public final class pg0 extends ng0 {

    /* renamed from: t */
    public static final C2551a f22904t = new C2551a(null);

    /* renamed from: u */
    public static final pg0 f22905u = new pg0(1, 0);

    /* renamed from: com.daaw.pg0$a */
    /* loaded from: classes2.dex */
    public static final class C2551a {
        public C2551a() {
        }

        public /* synthetic */ C2551a(C2575pq c2575pq) {
            this();
        }

        /* renamed from: a */
        public final pg0 m13401a() {
            return pg0.f22905u;
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
                if (m15187d() != pg0Var.m15187d() || m15186e() != pg0Var.m15186e()) {
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
        return (m15187d() * 31) + m15186e();
    }

    @Override // com.daaw.ng0
    public boolean isEmpty() {
        return m15187d() > m15186e();
    }

    /* renamed from: k */
    public boolean m13402k(int i) {
        return m15187d() <= i && i <= m15186e();
    }

    @Override // com.daaw.ng0
    public String toString() {
        return m15187d() + ".." + m15186e();
    }
}
