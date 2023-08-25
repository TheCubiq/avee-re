package com.daaw;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.daaw.da1;
import com.daaw.eo1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class do1 implements zz {
    public static final e00 m = new a();
    public static final long n = sq1.v("AC-3");
    public static final long o = sq1.v("EAC3");
    public static final long p = sq1.v("HEVC");
    public final int a;
    public final List<ol1> b;
    public final rv0 c;
    public final SparseIntArray d;
    public final eo1.c e;
    public final SparseArray<eo1> f;
    public final SparseBooleanArray g;
    public d00 h;
    public int i;
    public boolean j;
    public eo1 k;
    public int l;

    /* loaded from: classes.dex */
    public static class a implements e00 {
        @Override // com.daaw.e00
        public zz[] a() {
            return new zz[]{new do1()};
        }
    }

    /* loaded from: classes.dex */
    public class b implements z91 {
        public final qv0 a = new qv0(new byte[4]);

        public b() {
        }

        @Override // com.daaw.z91
        public void a(rv0 rv0Var) {
            if (rv0Var.x() != 0) {
                return;
            }
            rv0Var.K(7);
            int a = rv0Var.a() / 4;
            for (int i = 0; i < a; i++) {
                rv0Var.f(this.a, 4);
                int h = this.a.h(16);
                this.a.o(3);
                if (h == 0) {
                    this.a.o(13);
                } else {
                    int h2 = this.a.h(13);
                    do1.this.f.put(h2, new aa1(new c(h2)));
                    do1.j(do1.this);
                }
            }
            if (do1.this.a != 2) {
                do1.this.f.remove(0);
            }
        }

        @Override // com.daaw.z91
        public void c(ol1 ol1Var, d00 d00Var, eo1.d dVar) {
        }
    }

    /* loaded from: classes.dex */
    public class c implements z91 {
        public final qv0 a = new qv0(new byte[5]);
        public final SparseArray<eo1> b = new SparseArray<>();
        public final SparseIntArray c = new SparseIntArray();
        public final int d;

        public c(int i) {
            this.d = i;
        }

        @Override // com.daaw.z91
        public void a(rv0 rv0Var) {
            ol1 ol1Var;
            if (rv0Var.x() != 2) {
                return;
            }
            if (do1.this.a == 1 || do1.this.a == 2 || do1.this.i == 1) {
                ol1Var = (ol1) do1.this.b.get(0);
            } else {
                ol1Var = new ol1(((ol1) do1.this.b.get(0)).c());
                do1.this.b.add(ol1Var);
            }
            rv0Var.K(2);
            int D = rv0Var.D();
            int i = 5;
            rv0Var.K(5);
            rv0Var.f(this.a, 2);
            int i2 = 4;
            this.a.o(4);
            rv0Var.K(this.a.h(12));
            if (do1.this.a == 2 && do1.this.k == null) {
                eo1.b bVar = new eo1.b(21, null, null, new byte[0]);
                do1 do1Var = do1.this;
                do1Var.k = do1Var.e.a(21, bVar);
                do1.this.k.c(ol1Var, do1.this.h, new eo1.d(D, 21, 8192));
            }
            this.b.clear();
            this.c.clear();
            int a = rv0Var.a();
            while (a > 0) {
                rv0Var.f(this.a, i);
                int h = this.a.h(8);
                this.a.o(3);
                int h2 = this.a.h(13);
                this.a.o(i2);
                int h3 = this.a.h(12);
                eo1.b b = b(rv0Var, h3);
                if (h == 6) {
                    h = b.a;
                }
                a -= h3 + 5;
                int i3 = do1.this.a == 2 ? h : h2;
                if (!do1.this.g.get(i3)) {
                    eo1 a2 = (do1.this.a == 2 && h == 21) ? do1.this.k : do1.this.e.a(h, b);
                    if (do1.this.a != 2 || h2 < this.c.get(i3, 8192)) {
                        this.c.put(i3, h2);
                        this.b.put(i3, a2);
                    }
                }
                i = 5;
                i2 = 4;
            }
            int size = this.c.size();
            for (int i4 = 0; i4 < size; i4++) {
                int keyAt = this.c.keyAt(i4);
                do1.this.g.put(keyAt, true);
                eo1 valueAt = this.b.valueAt(i4);
                if (valueAt != null) {
                    if (valueAt != do1.this.k) {
                        valueAt.c(ol1Var, do1.this.h, new eo1.d(D, keyAt, 8192));
                    }
                    do1.this.f.put(this.c.valueAt(i4), valueAt);
                }
            }
            if (do1.this.a != 2) {
                do1.this.f.remove(this.d);
                do1 do1Var2 = do1.this;
                do1Var2.i = do1Var2.a != 1 ? do1.this.i - 1 : 0;
                if (do1.this.i != 0) {
                    return;
                }
                do1.this.h.n();
            } else if (do1.this.j) {
                return;
            } else {
                do1.this.h.n();
                do1.this.i = 0;
            }
            do1.this.j = true;
        }

        public final eo1.b b(rv0 rv0Var, int i) {
            int c = rv0Var.c();
            int i2 = i + c;
            String str = null;
            ArrayList arrayList = null;
            int i3 = -1;
            while (rv0Var.c() < i2) {
                int x = rv0Var.x();
                int c2 = rv0Var.c() + rv0Var.x();
                if (x == 5) {
                    long z = rv0Var.z();
                    if (z != do1.n) {
                        if (z != do1.o) {
                            if (z == do1.p) {
                                i3 = 36;
                            }
                        }
                        i3 = 135;
                    }
                    i3 = 129;
                } else {
                    if (x != 106) {
                        if (x != 122) {
                            if (x == 123) {
                                i3 = 138;
                            } else if (x == 10) {
                                str = rv0Var.u(3).trim();
                            } else if (x == 89) {
                                arrayList = new ArrayList();
                                while (rv0Var.c() < c2) {
                                    String trim = rv0Var.u(3).trim();
                                    int x2 = rv0Var.x();
                                    byte[] bArr = new byte[4];
                                    rv0Var.g(bArr, 0, 4);
                                    arrayList.add(new eo1.a(trim, x2, bArr));
                                }
                                i3 = 89;
                            }
                        }
                        i3 = 135;
                    }
                    i3 = 129;
                }
                rv0Var.K(c2 - rv0Var.c());
            }
            rv0Var.J(i2);
            return new eo1.b(i3, str, arrayList, Arrays.copyOfRange(rv0Var.a, c, i2));
        }

        @Override // com.daaw.z91
        public void c(ol1 ol1Var, d00 d00Var, eo1.d dVar) {
        }
    }

    public do1() {
        this(0);
    }

    public do1(int i) {
        this(1, i);
    }

    public do1(int i, int i2) {
        this(i, new ol1(0L), new bs(i2));
    }

    public do1(int i, ol1 ol1Var, eo1.c cVar) {
        this.e = (eo1.c) s6.e(cVar);
        this.a = i;
        if (i == 1 || i == 2) {
            this.b = Collections.singletonList(ol1Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            arrayList.add(ol1Var);
        }
        this.c = new rv0(new byte[9400], 0);
        this.g = new SparseBooleanArray();
        this.f = new SparseArray<>();
        this.d = new SparseIntArray();
        v();
    }

    public static /* synthetic */ int j(do1 do1Var) {
        int i = do1Var.i;
        do1Var.i = i + 1;
        return i;
    }

    @Override // com.daaw.zz
    public void a() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        r2 = r2 + 1;
     */
    @Override // com.daaw.zz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(com.daaw.a00 r7) {
        /*
            r6 = this;
            com.daaw.rv0 r0 = r6.c
            byte[] r0 = r0.a
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.k(r0, r1, r2)
            r2 = 0
        Lb:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L27
            r3 = 0
        L10:
            r4 = 5
            if (r3 != r4) goto L18
            r7.j(r2)
            r7 = 1
            return r7
        L18:
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L24
            int r2 = r2 + 1
            goto Lb
        L24:
            int r3 = r3 + 1
            goto L10
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.do1.c(com.daaw.a00):boolean");
    }

    @Override // com.daaw.zz
    public int d(a00 a00Var, iy0 iy0Var) {
        rv0 rv0Var = this.c;
        byte[] bArr = rv0Var.a;
        if (9400 - rv0Var.c() < 188) {
            int a2 = this.c.a();
            if (a2 > 0) {
                System.arraycopy(bArr, this.c.c(), bArr, 0, a2);
            }
            this.c.H(bArr, a2);
        }
        while (this.c.a() < 188) {
            int d = this.c.d();
            int b2 = a00Var.b(bArr, d, 9400 - d);
            if (b2 == -1) {
                return -1;
            }
            this.c.I(d + b2);
        }
        int d2 = this.c.d();
        int c2 = this.c.c();
        int i = c2;
        while (i < d2 && bArr[i] != 71) {
            i++;
        }
        this.c.J(i);
        int i2 = i + 188;
        if (i2 > d2) {
            int i3 = this.l + (i - c2);
            this.l = i3;
            if (this.a != 2 || i3 <= 376) {
                return 0;
            }
            throw new tv0("Cannot find sync byte. Most likely not a Transport Stream.");
        }
        this.l = 0;
        int i4 = this.c.i();
        if ((8388608 & i4) == 0) {
            boolean z = (4194304 & i4) != 0;
            int i5 = (2096896 & i4) >> 8;
            boolean z2 = (i4 & 32) != 0;
            eo1 eo1Var = (i4 & 16) != 0 ? this.f.get(i5) : null;
            if (eo1Var != null) {
                if (this.a != 2) {
                    int i6 = i4 & 15;
                    int i7 = this.d.get(i5, i6 - 1);
                    this.d.put(i5, i6);
                    if (i7 != i6) {
                        if (i6 != ((i7 + 1) & 15)) {
                            eo1Var.b();
                        }
                    }
                }
                if (z2) {
                    this.c.K(this.c.x());
                }
                this.c.I(i2);
                eo1Var.a(this.c, z);
                this.c.I(d2);
            }
        }
        this.c.J(i2);
        return 0;
    }

    @Override // com.daaw.zz
    public void f(long j, long j2) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.b.get(i).g();
        }
        this.c.F();
        this.d.clear();
        v();
        this.l = 0;
    }

    @Override // com.daaw.zz
    public void i(d00 d00Var) {
        this.h = d00Var;
        d00Var.d(new da1.b(-9223372036854775807L));
    }

    public final void v() {
        this.g.clear();
        this.f.clear();
        SparseArray<eo1> b2 = this.e.b();
        int size = b2.size();
        for (int i = 0; i < size; i++) {
            this.f.put(b2.keyAt(i), b2.valueAt(i));
        }
        this.f.put(0, new aa1(new b()));
        this.k = null;
    }
}
