package com.daaw;

import android.util.Pair;
import com.daaw.eo1;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class m80 implements wv {
    public static final double[] n = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public sm1 b;
    public boolean c;
    public long d;
    public final boolean[] e = new boolean[4];
    public final a f = new a(128);
    public long g;
    public boolean h;
    public long i;
    public long j;
    public long k;
    public boolean l;
    public boolean m;

    /* loaded from: classes.dex */
    public static final class a {
        public static final byte[] e = {0, 0, 1};
        public boolean a;
        public int b;
        public int c;
        public byte[] d;

        public a(int i) {
            this.d = new byte[i];
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.d;
                int length = bArr2.length;
                int i4 = this.b;
                if (length < i4 + i3) {
                    this.d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.d, this.b, i3);
                this.b += i3;
            }
        }

        public boolean b(int i, int i2) {
            if (this.a) {
                int i3 = this.b - i2;
                this.b = i3;
                if (this.c != 0 || i != 181) {
                    this.a = false;
                    return true;
                }
                this.c = i3;
            } else if (i == 179) {
                this.a = true;
            }
            byte[] bArr = e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.a = false;
            this.b = 0;
            this.c = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<com.google.android.exoplayer2.Format, java.lang.Long> f(com.daaw.m80.a r20, java.lang.String r21) {
        /*
            r0 = r20
            byte[] r1 = r0.d
            int r2 = r0.b
            byte[] r1 = java.util.Arrays.copyOf(r1, r2)
            r2 = 4
            r3 = r1[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 5
            r5 = r1[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = 6
            r6 = r1[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r3 = r3 << r2
            int r7 = r5 >> 4
            r13 = r3 | r7
            r3 = r5 & 15
            int r3 = r3 << 8
            r14 = r3 | r6
            r3 = 7
            r5 = r1[r3]
            r5 = r5 & 240(0xf0, float:3.36E-43)
            int r5 = r5 >> r2
            r6 = 2
            if (r5 == r6) goto L43
            r6 = 3
            if (r5 == r6) goto L3d
            if (r5 == r2) goto L37
            r2 = 1065353216(0x3f800000, float:1.0)
            r18 = 1065353216(0x3f800000, float:1.0)
            goto L4c
        L37:
            int r2 = r14 * 121
            float r2 = (float) r2
            int r5 = r13 * 100
            goto L48
        L3d:
            int r2 = r14 * 16
            float r2 = (float) r2
            int r5 = r13 * 9
            goto L48
        L43:
            int r2 = r14 * 4
            float r2 = (float) r2
            int r5 = r13 * 3
        L48:
            float r5 = (float) r5
            float r2 = r2 / r5
            r18 = r2
        L4c:
            r10 = 0
            r11 = -1
            r12 = -1
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.util.List r16 = java.util.Collections.singletonList(r1)
            r17 = -1
            r19 = 0
            java.lang.String r9 = "video/mpeg2"
            r8 = r21
            com.google.android.exoplayer2.Format r2 = com.google.android.exoplayer2.Format.H(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r5 = 0
            r3 = r1[r3]
            r3 = r3 & 15
            int r3 = r3 + (-1)
            if (r3 < 0) goto L98
            double[] r7 = com.daaw.m80.n
            int r8 = r7.length
            if (r3 >= r8) goto L98
            r5 = r7[r3]
            int r0 = r0.c
            int r0 = r0 + 9
            r3 = r1[r0]
            r3 = r3 & 96
            int r3 = r3 >> r4
            r0 = r1[r0]
            r0 = r0 & 31
            if (r3 == r0) goto L91
            double r3 = (double) r3
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double.isNaN(r3)
            double r3 = r3 + r7
            int r0 = r0 + 1
            double r0 = (double) r0
            java.lang.Double.isNaN(r0)
            double r3 = r3 / r0
            double r5 = r5 * r3
        L91:
            r0 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r0 = r0 / r5
            long r5 = (long) r0
        L98:
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            android.util.Pair r0 = android.util.Pair.create(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.m80.f(com.daaw.m80$a, java.lang.String):android.util.Pair");
    }

    @Override // com.daaw.wv
    public void a(rv0 rv0Var) {
        int c = rv0Var.c();
        int d = rv0Var.d();
        byte[] bArr = rv0Var.a;
        this.g += rv0Var.a();
        this.b.c(rv0Var, rv0Var.a());
        while (true) {
            int c2 = sr0.c(bArr, c, d, this.e);
            if (c2 == d) {
                break;
            }
            int i = c2 + 3;
            int i2 = rv0Var.a[i] & 255;
            if (!this.c) {
                int i3 = c2 - c;
                if (i3 > 0) {
                    this.f.a(bArr, c, c2);
                }
                if (this.f.b(i2, i3 < 0 ? -i3 : 0)) {
                    Pair<Format, Long> f = f(this.f, this.a);
                    this.b.d((Format) f.first);
                    this.d = ((Long) f.second).longValue();
                    this.c = true;
                }
            }
            if (i2 == 0 || i2 == 179) {
                int i4 = d - c2;
                if (this.h && this.m && this.c) {
                    this.b.a(this.k, this.l ? 1 : 0, ((int) (this.g - this.j)) - i4, i4, null);
                }
                boolean z = this.h;
                if (!z || this.m) {
                    this.j = this.g - i4;
                    long j = this.i;
                    if (j == -9223372036854775807L) {
                        j = z ? this.k + this.d : 0L;
                    }
                    this.k = j;
                    this.l = false;
                    this.i = -9223372036854775807L;
                    this.h = true;
                }
                this.m = i2 == 0;
            } else if (i2 == 184) {
                this.l = true;
            }
            c = i;
        }
        if (this.c) {
            return;
        }
        this.f.a(bArr, c, d);
    }

    @Override // com.daaw.wv
    public void b() {
        sr0.a(this.e);
        this.f.c();
        this.g = 0L;
        this.h = false;
    }

    @Override // com.daaw.wv
    public void c() {
    }

    @Override // com.daaw.wv
    public void d(d00 d00Var, eo1.d dVar) {
        dVar.a();
        this.a = dVar.b();
        this.b = d00Var.a(dVar.c(), 2);
    }

    @Override // com.daaw.wv
    public void e(long j, boolean z) {
        this.i = j;
    }
}
