package com.daaw;

import android.util.SparseArray;
import com.daaw.eo1;
import com.daaw.sr0;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class n80 implements wv {
    public final cb1 a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public sm1 j;
    public b k;
    public boolean l;
    public long m;
    public final boolean[] h = new boolean[3];
    public final rr0 d = new rr0(7, 128);
    public final rr0 e = new rr0(8, 128);
    public final rr0 f = new rr0(6, 128);
    public final rv0 n = new rv0();

    /* loaded from: classes.dex */
    public static final class b {
        public final sm1 a;
        public final boolean b;
        public final boolean c;
        public final sv0 f;
        public byte[] g;
        public int h;
        public int i;
        public long j;
        public boolean k;
        public long l;
        public boolean o;
        public long p;
        public long q;
        public boolean r;
        public final SparseArray<sr0.b> d = new SparseArray<>();
        public final SparseArray<sr0.a> e = new SparseArray<>();
        public a m = new a();
        public a n = new a();

        /* loaded from: classes.dex */
        public static final class a {
            public boolean a;
            public boolean b;
            public sr0.b c;
            public int d;
            public int e;
            public int f;
            public int g;
            public boolean h;
            public boolean i;
            public boolean j;
            public boolean k;
            public int l;
            public int m;
            public int n;
            public int o;
            public int p;

            public a() {
            }

            public void b() {
                this.b = false;
                this.a = false;
            }

            public final boolean c(a aVar) {
                boolean z;
                boolean z2;
                if (this.a) {
                    if (!aVar.a || this.f != aVar.f || this.g != aVar.g || this.h != aVar.h) {
                        return true;
                    }
                    if (this.i && aVar.i && this.j != aVar.j) {
                        return true;
                    }
                    int i = this.d;
                    int i2 = aVar.d;
                    if (i != i2 && (i == 0 || i2 == 0)) {
                        return true;
                    }
                    int i3 = this.c.h;
                    if (i3 == 0 && aVar.c.h == 0 && (this.m != aVar.m || this.n != aVar.n)) {
                        return true;
                    }
                    if ((i3 == 1 && aVar.c.h == 1 && (this.o != aVar.o || this.p != aVar.p)) || (z = this.k) != (z2 = aVar.k)) {
                        return true;
                    }
                    if (z && z2 && this.l != aVar.l) {
                        return true;
                    }
                }
                return false;
            }

            public boolean d() {
                int i;
                return this.b && ((i = this.e) == 7 || i == 2);
            }

            public void e(sr0.b bVar, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.c = bVar;
                this.d = i;
                this.e = i2;
                this.f = i3;
                this.g = i4;
                this.h = z;
                this.i = z2;
                this.j = z3;
                this.k = z4;
                this.l = i5;
                this.m = i6;
                this.n = i7;
                this.o = i8;
                this.p = i9;
                this.a = true;
                this.b = true;
            }

            public void f(int i) {
                this.e = i;
                this.b = true;
            }
        }

        public b(sm1 sm1Var, boolean z, boolean z2) {
            this.a = sm1Var;
            this.b = z;
            this.c = z2;
            byte[] bArr = new byte[128];
            this.g = bArr;
            this.f = new sv0(bArr, 0, 0);
            g();
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x014e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instructions count: 408
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.n80.b.a(byte[], int, int):void");
        }

        public void b(long j, int i) {
            boolean z = false;
            if (this.i == 9 || (this.c && this.n.c(this.m))) {
                if (this.o) {
                    d(i + ((int) (j - this.j)));
                }
                this.p = this.j;
                this.q = this.l;
                this.r = false;
                this.o = true;
            }
            boolean z2 = this.r;
            int i2 = this.i;
            if (i2 == 5 || (this.b && i2 == 1 && this.n.d())) {
                z = true;
            }
            this.r = z2 | z;
        }

        public boolean c() {
            return this.c;
        }

        public final void d(int i) {
            boolean z = this.r;
            this.a.a(this.q, z ? 1 : 0, (int) (this.j - this.p), i, null);
        }

        public void e(sr0.a aVar) {
            this.e.append(aVar.a, aVar);
        }

        public void f(sr0.b bVar) {
            this.d.append(bVar.a, bVar);
        }

        public void g() {
            this.k = false;
            this.o = false;
            this.n.b();
        }

        public void h(long j, int i, long j2) {
            this.i = i;
            this.l = j2;
            this.j = j;
            if (!this.b || i != 1) {
                if (!this.c) {
                    return;
                }
                if (i != 5 && i != 1 && i != 2) {
                    return;
                }
            }
            a aVar = this.m;
            this.m = this.n;
            this.n = aVar;
            aVar.b();
            this.h = 0;
            this.k = true;
        }
    }

    public n80(cb1 cb1Var, boolean z, boolean z2) {
        this.a = cb1Var;
        this.b = z;
        this.c = z2;
    }

    @Override // com.daaw.wv
    public void a(rv0 rv0Var) {
        int c = rv0Var.c();
        int d = rv0Var.d();
        byte[] bArr = rv0Var.a;
        this.g += rv0Var.a();
        this.j.c(rv0Var, rv0Var.a());
        while (true) {
            int c2 = sr0.c(bArr, c, d, this.h);
            if (c2 == d) {
                g(bArr, c, d);
                return;
            }
            int f = sr0.f(bArr, c2);
            int i = c2 - c;
            if (i > 0) {
                g(bArr, c, c2);
            }
            int i2 = d - c2;
            long j = this.g - i2;
            f(j, i2, i < 0 ? -i : 0, this.m);
            h(j, f, this.m);
            c = c2 + 3;
        }
    }

    @Override // com.daaw.wv
    public void b() {
        sr0.a(this.h);
        this.d.d();
        this.e.d();
        this.f.d();
        this.k.g();
        this.g = 0L;
    }

    @Override // com.daaw.wv
    public void c() {
    }

    @Override // com.daaw.wv
    public void d(d00 d00Var, eo1.d dVar) {
        dVar.a();
        this.i = dVar.b();
        sm1 a2 = d00Var.a(dVar.c(), 2);
        this.j = a2;
        this.k = new b(a2, this.b, this.c);
        this.a.b(d00Var, dVar);
    }

    @Override // com.daaw.wv
    public void e(long j, boolean z) {
        this.m = j;
    }

    public final void f(long j, int i, int i2, long j2) {
        rr0 rr0Var;
        if (!this.l || this.k.c()) {
            this.d.b(i2);
            this.e.b(i2);
            if (this.l) {
                if (this.d.c()) {
                    rr0 rr0Var2 = this.d;
                    this.k.f(sr0.i(rr0Var2.d, 3, rr0Var2.e));
                    rr0Var = this.d;
                } else if (this.e.c()) {
                    rr0 rr0Var3 = this.e;
                    this.k.e(sr0.h(rr0Var3.d, 3, rr0Var3.e));
                    rr0Var = this.e;
                }
            } else if (this.d.c() && this.e.c()) {
                ArrayList arrayList = new ArrayList();
                rr0 rr0Var4 = this.d;
                arrayList.add(Arrays.copyOf(rr0Var4.d, rr0Var4.e));
                rr0 rr0Var5 = this.e;
                arrayList.add(Arrays.copyOf(rr0Var5.d, rr0Var5.e));
                rr0 rr0Var6 = this.d;
                sr0.b i3 = sr0.i(rr0Var6.d, 3, rr0Var6.e);
                rr0 rr0Var7 = this.e;
                sr0.a h = sr0.h(rr0Var7.d, 3, rr0Var7.e);
                this.j.d(Format.H(this.i, "video/avc", null, -1, -1, i3.b, i3.c, -1.0f, arrayList, -1, i3.d, null));
                this.l = true;
                this.k.f(i3);
                this.k.e(h);
                this.d.d();
                rr0Var = this.e;
            }
            rr0Var.d();
        }
        if (this.f.b(i2)) {
            rr0 rr0Var8 = this.f;
            this.n.H(this.f.d, sr0.k(rr0Var8.d, rr0Var8.e));
            this.n.J(4);
            this.a.a(j2, this.n);
        }
        this.k.b(j, i);
    }

    public final void g(byte[] bArr, int i, int i2) {
        if (!this.l || this.k.c()) {
            this.d.a(bArr, i, i2);
            this.e.a(bArr, i, i2);
        }
        this.f.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    public final void h(long j, int i, long j2) {
        if (!this.l || this.k.c()) {
            this.d.e(i);
            this.e.e(i);
        }
        this.f.e(i);
        this.k.h(j, i, j2);
    }
}
