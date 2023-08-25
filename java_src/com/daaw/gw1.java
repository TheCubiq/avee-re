package com.daaw;
/* loaded from: classes.dex */
public final class gw1 {

    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final long b;

        public a(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public static a a(a00 a00Var, rv0 rv0Var) {
            a00Var.k(rv0Var.a, 0, 8);
            rv0Var.J(0);
            return new a(rv0Var.i(), rv0Var.n());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.daaw.fw1 a(com.daaw.a00 r19) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.gw1.a(com.daaw.a00):com.daaw.fw1");
    }

    public static void b(a00 a00Var, fw1 fw1Var) {
        s6.e(a00Var);
        s6.e(fw1Var);
        a00Var.i();
        rv0 rv0Var = new rv0(8);
        while (true) {
            a a2 = a.a(a00Var, rv0Var);
            if (a2.a == sq1.v("data")) {
                a00Var.j(8);
                fw1Var.k(a00Var.getPosition(), a2.b);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring unknown WAV chunk: ");
            sb.append(a2.a);
            long j = a2.b + 8;
            if (a2.a == sq1.v("RIFF")) {
                j = 12;
            }
            if (j > 2147483647L) {
                throw new tv0("Chunk is too large (~2GB+) to skip; id: " + a2.a);
            }
            a00Var.j((int) j);
        }
    }
}
