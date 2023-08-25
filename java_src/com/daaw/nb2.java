package com.daaw;

import android.net.Uri;
import java.util.Map;
/* loaded from: classes.dex */
public final class nb2 implements j09 {
    public static final q09 d = new q09() { // from class: com.daaw.mb2
        @Override // com.daaw.q09
        public final /* synthetic */ j09[] a(Uri uri, Map map) {
            return p09.a(this, uri, map);
        }

        @Override // com.daaw.q09
        public final j09[] zza() {
            q09 q09Var = nb2.d;
            return new j09[]{new nb2()};
        }
    };
    public final ob2 a = new ob2(null);
    public final ik5 b = new ik5(16384);
    public boolean c;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
        r16.zzj();
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
        if ((r5 - r3) >= 8192) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
        return false;
     */
    @Override // com.daaw.j09
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.daaw.k09 r16) {
        /*
            r15 = this;
            com.daaw.ik5 r0 = new com.daaw.ik5
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.h()
            r5 = r16
            com.daaw.rz8 r5 = (com.daaw.rz8) r5
            r5.h(r4, r2, r1, r2)
            r0.f(r2)
            int r4 = r0.u()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L9e
            r16.zzj()
            r4 = r16
            com.daaw.rz8 r4 = (com.daaw.rz8) r4
            r4.k(r3, r2)
            r5 = r3
        L2c:
            r1 = 0
        L2d:
            byte[] r6 = r0.h()
            r8 = 7
            r4.h(r6, r2, r8, r2)
            r0.f(r2)
            int r6 = r0.w()
            r9 = 44096(0xac40, float:6.1792E-41)
            r10 = 44097(0xac41, float:6.1793E-41)
            if (r6 == r9) goto L56
            if (r6 == r10) goto L56
            r16.zzj()
            int r5 = r5 + 1
            int r1 = r5 - r3
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r6) goto L55
            r4.k(r5, r2)
            goto L2c
        L55:
            return r2
        L56:
            r9 = 1
            int r1 = r1 + r9
            r11 = 4
            if (r1 < r11) goto L5c
            return r9
        L5c:
            byte[] r9 = r0.h()
            int r12 = com.daaw.fz8.b
            int r12 = r9.length
            r13 = -1
            if (r12 >= r8) goto L68
            r12 = -1
            goto L95
        L68:
            r12 = 2
            r12 = r9[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 8
            r14 = r9[r7]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r12 = r12 | r14
            r14 = 65535(0xffff, float:9.1834E-41)
            if (r12 != r14) goto L8f
            r11 = r9[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 16
            r12 = 5
            r12 = r9[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 8
            r11 = r11 | r12
            r12 = 6
            r9 = r9[r12]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r12 = r11 | r9
            goto L90
        L8f:
            r8 = 4
        L90:
            if (r6 != r10) goto L94
            int r8 = r8 + 2
        L94:
            int r12 = r12 + r8
        L95:
            if (r12 != r13) goto L98
            return r2
        L98:
            int r12 = r12 + (-7)
            r4.k(r12, r2)
            goto L2d
        L9e:
            r0.g(r7)
            int r4 = r0.r()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.k(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.nb2.a(com.daaw.k09):boolean");
    }

    @Override // com.daaw.j09
    public final void c(m09 m09Var) {
        this.a.b(m09Var, new td2(Integer.MIN_VALUE, 0, 1));
        m09Var.zzC();
        m09Var.i(new h42(-9223372036854775807L, 0L));
    }

    @Override // com.daaw.j09
    public final int d(k09 k09Var, f42 f42Var) {
        int a = k09Var.a(this.b.h(), 0, 16384);
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
