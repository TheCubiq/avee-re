package com.daaw;
/* loaded from: classes.dex */
public final class gw1 {

    /* renamed from: com.daaw.gw1$a */
    /* loaded from: classes.dex */
    public static final class C1478a {

        /* renamed from: a */
        public final int f11776a;

        /* renamed from: b */
        public final long f11777b;

        public C1478a(int i, long j) {
            this.f11776a = i;
            this.f11777b = j;
        }

        /* renamed from: a */
        public static C1478a m21194a(a00 a00Var, rv0 rv0Var) {
            a00Var.mo5856k(rv0Var.f25637a, 0, 8);
            rv0Var.m10921J(0);
            return new C1478a(rv0Var.m10911i(), rv0Var.m10906n());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static fw1 m21196a(a00 a00Var) {
        C1478a m21194a;
        int i;
        C2914s6.m10686e(a00Var);
        rv0 rv0Var = new rv0(16);
        if (C1478a.m21194a(a00Var, rv0Var).f11776a != sq1.m9994v("RIFF")) {
            return null;
        }
        int i2 = 0;
        a00Var.mo5856k(rv0Var.f25637a, 0, 4);
        rv0Var.m10921J(0);
        int m10911i = rv0Var.m10911i();
        if (m10911i != sq1.m9994v("WAVE")) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported RIFF format: ");
            sb.append(m10911i);
            return null;
        }
        while (true) {
            m21194a = C1478a.m21194a(a00Var, rv0Var);
            if (m21194a.f11776a == sq1.m9994v("fmt ")) {
                break;
            }
            a00Var.mo5860g((int) m21194a.f11777b);
        }
        C2914s6.m10685f(m21194a.f11777b >= 16);
        a00Var.mo5856k(rv0Var.f25637a, 0, 16);
        rv0Var.m10921J(0);
        int m10904p = rv0Var.m10904p();
        int m10904p2 = rv0Var.m10904p();
        int m10905o = rv0Var.m10905o();
        int m10905o2 = rv0Var.m10905o();
        int m10904p3 = rv0Var.m10904p();
        int m10904p4 = rv0Var.m10904p();
        int i3 = (m10904p2 * m10904p4) / 8;
        if (m10904p3 != i3) {
            throw new tv0("Expected block alignment: " + i3 + "; got: " + m10904p3);
        }
        if (m10904p != 1) {
            if (m10904p == 3) {
                if (m10904p4 == 32) {
                    i2 = 4;
                }
                i = i2;
                if (i == 0) {
                    a00Var.mo5860g(((int) m21194a.f11777b) - 16);
                    return new fw1(m10904p2, m10905o, m10905o2, m10904p3, m10904p4, i);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unsupported WAV bit depth ");
                sb2.append(m10904p4);
                sb2.append(" for type ");
                sb2.append(m10904p);
                return null;
            } else if (m10904p != 65534) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unsupported WAV format type: ");
                sb3.append(m10904p);
                return null;
            }
        }
        i2 = sq1.m9992x(m10904p4);
        i = i2;
        if (i == 0) {
        }
    }

    /* renamed from: b */
    public static void m21195b(a00 a00Var, fw1 fw1Var) {
        C2914s6.m10686e(a00Var);
        C2914s6.m10686e(fw1Var);
        a00Var.mo5858i();
        rv0 rv0Var = new rv0(8);
        while (true) {
            C1478a m21194a = C1478a.m21194a(a00Var, rv0Var);
            if (m21194a.f11776a == sq1.m9994v("data")) {
                a00Var.mo5857j(8);
                fw1Var.m22214k(a00Var.getPosition(), m21194a.f11777b);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring unknown WAV chunk: ");
            sb.append(m21194a.f11776a);
            long j = m21194a.f11777b + 8;
            if (m21194a.f11776a == sq1.m9994v("RIFF")) {
                j = 12;
            }
            if (j > 2147483647L) {
                throw new tv0("Chunk is too large (~2GB+) to skip; id: " + m21194a.f11776a);
            }
            a00Var.mo5857j((int) j);
        }
    }
}
