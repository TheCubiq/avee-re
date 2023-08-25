package com.daaw;

import com.daaw.eo1;
import com.google.android.exoplayer2.Format;
import java.util.Collections;
/* loaded from: classes.dex */
public final class o80 implements wv {
    public final cb1 a;
    public String b;
    public sm1 c;
    public a d;
    public boolean e;
    public long l;
    public long m;
    public final boolean[] f = new boolean[3];
    public final rr0 g = new rr0(32, 128);
    public final rr0 h = new rr0(33, 128);
    public final rr0 i = new rr0(34, 128);
    public final rr0 j = new rr0(39, 128);
    public final rr0 k = new rr0(40, 128);
    public final rv0 n = new rv0();

    /* loaded from: classes.dex */
    public static final class a {
        public final sm1 a;
        public long b;
        public boolean c;
        public int d;
        public long e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public long k;
        public long l;
        public boolean m;

        public a(sm1 sm1Var) {
            this.a = sm1Var;
        }

        public void a(long j, int i) {
            if (this.j && this.g) {
                this.m = this.c;
                this.j = false;
            } else if (this.h || this.g) {
                if (this.i) {
                    b(i + ((int) (j - this.b)));
                }
                this.k = this.b;
                this.l = this.e;
                this.i = true;
                this.m = this.c;
            }
        }

        public final void b(int i) {
            boolean z = this.m;
            this.a.a(this.l, z ? 1 : 0, (int) (this.b - this.k), i, null);
        }

        public void c(byte[] bArr, int i, int i2) {
            if (this.f) {
                int i3 = this.d;
                int i4 = (i + 2) - i3;
                if (i4 >= i2) {
                    this.d = i3 + (i2 - i);
                    return;
                }
                this.g = (bArr[i4] & 128) != 0;
                this.f = false;
            }
        }

        public void d() {
            this.f = false;
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public void e(long j, int i, int i2, long j2) {
            boolean z = false;
            this.g = false;
            this.h = false;
            this.e = j2;
            this.d = 0;
            this.b = j;
            if (i2 >= 32) {
                if (!this.j && this.i) {
                    b(i);
                    this.i = false;
                }
                if (i2 <= 34) {
                    this.h = !this.j;
                    this.j = true;
                }
            }
            boolean z2 = i2 >= 16 && i2 <= 21;
            this.c = z2;
            this.f = (z2 || i2 <= 9) ? true : true;
        }
    }

    public o80(cb1 cb1Var) {
        this.a = cb1Var;
    }

    public static Format h(String str, rr0 rr0Var, rr0 rr0Var2, rr0 rr0Var3) {
        float f;
        int i = rr0Var.e;
        byte[] bArr = new byte[rr0Var2.e + i + rr0Var3.e];
        System.arraycopy(rr0Var.d, 0, bArr, 0, i);
        System.arraycopy(rr0Var2.d, 0, bArr, rr0Var.e, rr0Var2.e);
        System.arraycopy(rr0Var3.d, 0, bArr, rr0Var.e + rr0Var2.e, rr0Var3.e);
        sv0 sv0Var = new sv0(rr0Var2.d, 0, rr0Var2.e);
        sv0Var.l(44);
        int e = sv0Var.e(3);
        sv0Var.k();
        sv0Var.l(88);
        sv0Var.l(8);
        int i2 = 0;
        for (int i3 = 0; i3 < e; i3++) {
            if (sv0Var.d()) {
                i2 += 89;
            }
            if (sv0Var.d()) {
                i2 += 8;
            }
        }
        sv0Var.l(i2);
        if (e > 0) {
            sv0Var.l((8 - e) * 2);
        }
        sv0Var.h();
        int h = sv0Var.h();
        if (h == 3) {
            sv0Var.k();
        }
        int h2 = sv0Var.h();
        int h3 = sv0Var.h();
        if (sv0Var.d()) {
            int h4 = sv0Var.h();
            int h5 = sv0Var.h();
            int h6 = sv0Var.h();
            int h7 = sv0Var.h();
            h2 -= ((h == 1 || h == 2) ? 2 : 1) * (h4 + h5);
            h3 -= (h == 1 ? 2 : 1) * (h6 + h7);
        }
        int i4 = h2;
        int i5 = h3;
        sv0Var.h();
        sv0Var.h();
        int h8 = sv0Var.h();
        int i6 = sv0Var.d() ? 0 : e;
        while (true) {
            sv0Var.h();
            sv0Var.h();
            sv0Var.h();
            if (i6 > e) {
                break;
            }
            i6++;
        }
        sv0Var.h();
        sv0Var.h();
        sv0Var.h();
        if (sv0Var.d() && sv0Var.d()) {
            i(sv0Var);
        }
        sv0Var.l(2);
        if (sv0Var.d()) {
            sv0Var.l(8);
            sv0Var.h();
            sv0Var.h();
            sv0Var.k();
        }
        j(sv0Var);
        if (sv0Var.d()) {
            for (int i7 = 0; i7 < sv0Var.h(); i7++) {
                sv0Var.l(h8 + 4 + 1);
            }
        }
        sv0Var.l(2);
        float f2 = 1.0f;
        if (sv0Var.d() && sv0Var.d()) {
            int e2 = sv0Var.e(8);
            if (e2 == 255) {
                int e3 = sv0Var.e(16);
                int e4 = sv0Var.e(16);
                if (e3 != 0 && e4 != 0) {
                    f2 = e3 / e4;
                }
                f = f2;
            } else {
                float[] fArr = sr0.b;
                if (e2 < fArr.length) {
                    f = fArr[e2];
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected aspect_ratio_idc value: ");
                    sb.append(e2);
                }
            }
            return Format.H(str, "video/hevc", null, -1, -1, i4, i5, -1.0f, Collections.singletonList(bArr), -1, f, null);
        }
        f = 1.0f;
        return Format.H(str, "video/hevc", null, -1, -1, i4, i5, -1.0f, Collections.singletonList(bArr), -1, f, null);
    }

    public static void i(sv0 sv0Var) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (sv0Var.d()) {
                    int min = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        sv0Var.g();
                    }
                    for (int i4 = 0; i4 < min; i4++) {
                        sv0Var.g();
                    }
                } else {
                    sv0Var.h();
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    public static void j(sv0 sv0Var) {
        int h = sv0Var.h();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < h; i2++) {
            if (i2 != 0) {
                z = sv0Var.d();
            }
            if (z) {
                sv0Var.k();
                sv0Var.h();
                for (int i3 = 0; i3 <= i; i3++) {
                    if (sv0Var.d()) {
                        sv0Var.k();
                    }
                }
            } else {
                int h2 = sv0Var.h();
                int h3 = sv0Var.h();
                int i4 = h2 + h3;
                for (int i5 = 0; i5 < h2; i5++) {
                    sv0Var.h();
                    sv0Var.k();
                }
                for (int i6 = 0; i6 < h3; i6++) {
                    sv0Var.h();
                    sv0Var.k();
                }
                i = i4;
            }
        }
    }

    @Override // com.daaw.wv
    public void a(rv0 rv0Var) {
        while (rv0Var.a() > 0) {
            int c = rv0Var.c();
            int d = rv0Var.d();
            byte[] bArr = rv0Var.a;
            this.l += rv0Var.a();
            this.c.c(rv0Var, rv0Var.a());
            while (c < d) {
                int c2 = sr0.c(bArr, c, d, this.f);
                if (c2 == d) {
                    g(bArr, c, d);
                    return;
                }
                int e = sr0.e(bArr, c2);
                int i = c2 - c;
                if (i > 0) {
                    g(bArr, c, c2);
                }
                int i2 = d - c2;
                long j = this.l - i2;
                f(j, i2, i < 0 ? -i : 0, this.m);
                k(j, i2, e, this.m);
                c = c2 + 3;
            }
        }
    }

    @Override // com.daaw.wv
    public void b() {
        sr0.a(this.f);
        this.g.d();
        this.h.d();
        this.i.d();
        this.j.d();
        this.k.d();
        this.d.d();
        this.l = 0L;
    }

    @Override // com.daaw.wv
    public void c() {
    }

    @Override // com.daaw.wv
    public void d(d00 d00Var, eo1.d dVar) {
        dVar.a();
        this.b = dVar.b();
        sm1 a2 = d00Var.a(dVar.c(), 2);
        this.c = a2;
        this.d = new a(a2);
        this.a.b(d00Var, dVar);
    }

    @Override // com.daaw.wv
    public void e(long j, boolean z) {
        this.m = j;
    }

    public final void f(long j, int i, int i2, long j2) {
        if (this.e) {
            this.d.a(j, i);
        } else {
            this.g.b(i2);
            this.h.b(i2);
            this.i.b(i2);
            if (this.g.c() && this.h.c() && this.i.c()) {
                this.c.d(h(this.b, this.g, this.h, this.i));
                this.e = true;
            }
        }
        if (this.j.b(i2)) {
            rr0 rr0Var = this.j;
            this.n.H(this.j.d, sr0.k(rr0Var.d, rr0Var.e));
            this.n.K(5);
            this.a.a(j2, this.n);
        }
        if (this.k.b(i2)) {
            rr0 rr0Var2 = this.k;
            this.n.H(this.k.d, sr0.k(rr0Var2.d, rr0Var2.e));
            this.n.K(5);
            this.a.a(j2, this.n);
        }
    }

    public final void g(byte[] bArr, int i, int i2) {
        if (this.e) {
            this.d.c(bArr, i, i2);
        } else {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    public final void k(long j, int i, int i2, long j2) {
        if (this.e) {
            this.d.e(j, i, i2, j2);
        } else {
            this.g.e(i2);
            this.h.e(i2);
            this.i.e(i2);
        }
        this.j.e(i2);
        this.k.e(i2);
    }
}
