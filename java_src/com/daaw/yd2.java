package com.daaw;

import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public final class yd2 implements zd2 {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, p21.Y0, x21.E0, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, NativeConstants.EVP_PKEY_EC, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final m09 a;
    public final m42 b;
    public final ce2 c;
    public final int d;
    public final byte[] e;
    public final ik5 f;
    public final int g;
    public final f92 h;
    public int i;
    public long j;
    public int k;
    public long l;

    public yd2(m09 m09Var, m42 m42Var, ce2 ce2Var) {
        this.a = m09Var;
        this.b = m42Var;
        this.c = ce2Var;
        int max = Math.max(1, ce2Var.c / 10);
        this.g = max;
        ik5 ik5Var = new ik5(ce2Var.f);
        ik5Var.q();
        int q = ik5Var.q();
        this.d = q;
        int i = ce2Var.b;
        int i2 = (((ce2Var.d - (i * 4)) * 8) / (ce2Var.e * i)) + 1;
        if (q != i2) {
            throw dl3.a("Expected frames per block: " + i2 + "; got: " + q, null);
        }
        int O = it5.O(max, q);
        this.e = new byte[ce2Var.d * O];
        this.f = new ik5(O * (q + q) * i);
        int i3 = ((ce2Var.c * ce2Var.d) * 8) / q;
        b72 b72Var = new b72();
        b72Var.s("audio/raw");
        b72Var.d0(i3);
        b72Var.o(i3);
        b72Var.l((max + max) * i);
        b72Var.e0(ce2Var.b);
        b72Var.t(ce2Var.c);
        b72Var.n(2);
        this.h = b72Var.y();
    }

    @Override // com.daaw.zd2
    public final void a(long j) {
        this.i = 0;
        this.j = j;
        this.k = 0;
        this.l = 0L;
    }

    @Override // com.daaw.zd2
    public final void b(int i, long j) {
        this.a.i(new je2(this.c, this.d, i, j));
        this.b.f(this.h);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003b -> B:4:0x001f). Please submit an issue!!! */
    @Override // com.daaw.zd2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(com.daaw.k09 r20, long r21) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.yd2.c(com.daaw.k09, long):boolean");
    }

    public final int d(int i) {
        int i2 = this.c.b;
        return i / (i2 + i2);
    }

    public final int e(int i) {
        return (i + i) * this.c.b;
    }

    public final void f(int i) {
        long j = this.j;
        long g0 = it5.g0(this.l, 1000000L, this.c.c);
        int e = e(i);
        this.b.b(j + g0, 1, e, this.k - e, null);
        this.l += i;
        this.k -= e;
    }
}
