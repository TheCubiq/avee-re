package com.daaw;

import android.net.Uri;
import java.util.Map;
/* loaded from: classes.dex */
public final class kb2 implements j09 {
    public static final q09 d = new q09() { // from class: com.daaw.jb2
        @Override // com.daaw.q09
        public final /* synthetic */ j09[] a(Uri uri, Map map) {
            return p09.a(this, uri, map);
        }

        @Override // com.daaw.q09
        public final j09[] zza() {
            q09 q09Var = kb2.d;
            return new j09[]{new kb2()};
        }
    };
    public final lb2 a = new lb2(null);
    public final ik5 b = new ik5(2786);
    public boolean c;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
        if ((r5 - r3) >= 8192) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
        r9.zzj();
        r5 = r5 + 1;
     */
    @Override // com.daaw.j09
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.daaw.k09 r9) {
        /*
            r8 = this;
            com.daaw.ik5 r0 = new com.daaw.ik5
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.h()
            r5 = r9
            com.daaw.rz8 r5 = (com.daaw.rz8) r5
            r5.h(r4, r2, r1, r2)
            r0.f(r2)
            int r4 = r0.u()
            r6 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r6) goto L65
            r9.zzj()
            r4 = r9
            com.daaw.rz8 r4 = (com.daaw.rz8) r4
            r4.k(r3, r2)
            r5 = r3
        L29:
            r1 = 0
        L2a:
            byte[] r6 = r0.h()
            r7 = 6
            r4.h(r6, r2, r7, r2)
            r0.f(r2)
            int r6 = r0.w()
            r7 = 2935(0xb77, float:4.113E-42)
            if (r6 == r7) goto L4d
            r9.zzj()
            int r5 = r5 + 1
            int r1 = r5 - r3
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r6) goto L4c
            r4.k(r5, r2)
            goto L29
        L4c:
            return r2
        L4d:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L53
            return r6
        L53:
            byte[] r6 = r0.h()
            int r6 = com.daaw.cz8.b(r6)
            r7 = -1
            if (r6 != r7) goto L5f
            return r2
        L5f:
            int r6 = r6 + (-6)
            r4.k(r6, r2)
            goto L2a
        L65:
            r4 = 3
            r0.g(r4)
            int r4 = r0.r()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.k(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.kb2.a(com.daaw.k09):boolean");
    }

    @Override // com.daaw.j09
    public final void c(m09 m09Var) {
        this.a.b(m09Var, new td2(Integer.MIN_VALUE, 0, 1));
        m09Var.zzC();
        m09Var.i(new h42(-9223372036854775807L, 0L));
    }

    @Override // com.daaw.j09
    public final int d(k09 k09Var, f42 f42Var) {
        int a = k09Var.a(this.b.h(), 0, 2786);
        if (a == -1) {
            return -1;
        }
        this.b.f(0);
        this.b.e(a);
        if (!this.c) {
            this.a.c(0L, 4);
            this.c = true;
        }
        this.a.a(this.b);
        return 0;
    }

    @Override // com.daaw.j09
    public final void f(long j, long j2) {
        this.c = false;
        this.a.zze();
    }
}
