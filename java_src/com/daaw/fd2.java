package com.daaw;

import android.net.Uri;
import android.util.SparseArray;
import java.util.Map;
/* loaded from: classes.dex */
public final class fd2 implements j09 {
    public static final q09 l = new q09() { // from class: com.daaw.wc2
        @Override // com.daaw.q09
        public final /* synthetic */ j09[] a(Uri uri, Map map) {
            return p09.a(this, uri, map);
        }

        @Override // com.daaw.q09
        public final j09[] zza() {
            q09 q09Var = fd2.l;
            return new j09[]{new fd2()};
        }
    };
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public uc2 i;
    public m09 j;
    public boolean k;
    public final cr5 a = new cr5(0);
    public final ik5 c = new ik5(4096);
    public final SparseArray b = new SparseArray();
    public final vc2 d = new vc2();

    @Override // com.daaw.j09
    public final boolean a(k09 k09Var) {
        byte[] bArr = new byte[14];
        rz8 rz8Var = (rz8) k09Var;
        rz8Var.h(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            rz8Var.k(bArr[13] & 7, false);
            rz8Var.h(bArr, 0, 3, false);
            return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
        }
        return false;
    }

    @Override // com.daaw.j09
    public final void c(m09 m09Var) {
        this.j = m09Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0139  */
    @Override // com.daaw.j09
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(com.daaw.k09 r14, com.daaw.f42 r15) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.fd2.d(com.daaw.k09, com.daaw.f42):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0 != r7) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034 A[LOOP:0: B:14:0x002c->B:16:0x0034, LOOP_END] */
    @Override // com.daaw.j09
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(long r5, long r7) {
        /*
            r4 = this;
            com.daaw.cr5 r5 = r4.a
            long r0 = r5.e()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L21
            long r0 = r5.c()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L24
        L21:
            r5.f(r7)
        L24:
            com.daaw.uc2 r5 = r4.i
            r6 = 0
            if (r5 == 0) goto L2c
            r5.d(r7)
        L2c:
            android.util.SparseArray r5 = r4.b
            int r5 = r5.size()
            if (r6 >= r5) goto L42
            android.util.SparseArray r5 = r4.b
            java.lang.Object r5 = r5.valueAt(r6)
            com.daaw.ed2 r5 = (com.daaw.ed2) r5
            r5.b()
            int r6 = r6 + 1
            goto L2c
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.fd2.f(long, long):void");
    }
}
