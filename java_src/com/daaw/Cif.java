package com.daaw;

import com.daaw.cp0;
import com.daaw.gb1;
import com.daaw.jf;
import com.daaw.jk0;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: com.daaw.if  reason: invalid class name */
/* loaded from: classes.dex */
public class Cif<T extends jf> implements d81, gb1, jk0.a<ef>, jk0.d {
    public final List<sa> A;
    public final b81 B;
    public final b81[] C;
    public final ta D;
    public Format E;
    public b<T> F;
    public long G;
    public long H;
    public long I;
    public boolean J;
    public final int p;
    public final int[] q;
    public final Format[] r;
    public final boolean[] s;
    public final T t;
    public final gb1.a<Cif<T>> u;
    public final cp0.a v;
    public final int w;
    public final jk0 x = new jk0("Loader:ChunkSampleStream");
    public final gf y = new gf();
    public final ArrayList<sa> z;

    /* renamed from: com.daaw.if$a */
    /* loaded from: classes.dex */
    public final class a implements d81 {
        public final Cif<T> p;
        public final b81 q;
        public final int r;
        public boolean s;

        public a(Cif<T> cif, b81 b81Var, int i) {
            this.p = cif;
            this.q = b81Var;
            this.r = i;
        }

        @Override // com.daaw.d81
        public void a() {
        }

        public final void b() {
            if (this.s) {
                return;
            }
            Cif.this.v.c(Cif.this.q[this.r], Cif.this.r[this.r], 0, null, Cif.this.H);
            this.s = true;
        }

        public void c() {
            s6.f(Cif.this.s[this.r]);
            Cif.this.s[this.r] = false;
        }

        @Override // com.daaw.d81
        public boolean d() {
            Cif cif = Cif.this;
            return cif.J || (!cif.F() && this.q.u());
        }

        @Override // com.daaw.d81
        public int j(k30 k30Var, gq gqVar, boolean z) {
            if (Cif.this.F()) {
                return -3;
            }
            b81 b81Var = this.q;
            Cif cif = Cif.this;
            int y = b81Var.y(k30Var, gqVar, z, cif.J, cif.I);
            if (y == -4) {
                b();
            }
            return y;
        }

        @Override // com.daaw.d81
        public int n(long j) {
            int f;
            if (!Cif.this.J || j <= this.q.q()) {
                f = this.q.f(j, true, true);
                if (f == -1) {
                    f = 0;
                }
            } else {
                f = this.q.g();
            }
            if (f > 0) {
                b();
            }
            return f;
        }
    }

    /* renamed from: com.daaw.if$b */
    /* loaded from: classes.dex */
    public interface b<T extends jf> {
        void d(Cif<T> cif);
    }

    public Cif(int i, int[] iArr, Format[] formatArr, T t, gb1.a<Cif<T>> aVar, l2 l2Var, long j, int i2, cp0.a aVar2) {
        this.p = i;
        this.q = iArr;
        this.r = formatArr;
        this.t = t;
        this.u = aVar;
        this.v = aVar2;
        this.w = i2;
        ArrayList<sa> arrayList = new ArrayList<>();
        this.z = arrayList;
        this.A = Collections.unmodifiableList(arrayList);
        int i3 = 0;
        int length = iArr == null ? 0 : iArr.length;
        this.C = new b81[length];
        this.s = new boolean[length];
        int i4 = length + 1;
        int[] iArr2 = new int[i4];
        b81[] b81VarArr = new b81[i4];
        b81 b81Var = new b81(l2Var);
        this.B = b81Var;
        iArr2[0] = i;
        b81VarArr[0] = b81Var;
        while (i3 < length) {
            b81 b81Var2 = new b81(l2Var);
            this.C[i3] = b81Var2;
            int i5 = i3 + 1;
            b81VarArr[i5] = b81Var2;
            iArr2[i5] = iArr[i3];
            i3 = i5;
        }
        this.D = new ta(iArr2, b81VarArr);
        this.G = j;
        this.H = j;
    }

    public final sa A(int i) {
        sa saVar = this.z.get(i);
        ArrayList<sa> arrayList = this.z;
        sq1.R(arrayList, i, arrayList.size());
        b81 b81Var = this.B;
        int i2 = 0;
        while (true) {
            b81Var.m(saVar.g(i2));
            b81[] b81VarArr = this.C;
            if (i2 >= b81VarArr.length) {
                return saVar;
            }
            b81Var = b81VarArr[i2];
            i2++;
        }
    }

    public T B() {
        return this.t;
    }

    public final sa C() {
        ArrayList<sa> arrayList = this.z;
        return arrayList.get(arrayList.size() - 1);
    }

    public final boolean D(int i) {
        int r;
        sa saVar = this.z.get(i);
        if (this.B.r() > saVar.g(0)) {
            return true;
        }
        int i2 = 0;
        do {
            b81[] b81VarArr = this.C;
            if (i2 >= b81VarArr.length) {
                return false;
            }
            r = b81VarArr[i2].r();
            i2++;
        } while (r <= saVar.g(i2));
        return true;
    }

    public final boolean E(ef efVar) {
        return efVar instanceof sa;
    }

    public boolean F() {
        return this.G != -9223372036854775807L;
    }

    public final void G(int i) {
        sa saVar = this.z.get(i);
        Format format = saVar.c;
        if (!format.equals(this.E)) {
            this.v.c(this.p, format, saVar.d, saVar.e, saVar.f);
        }
        this.E = format;
    }

    public final void H(int i, int i2) {
        int L = L(i - i2, 0);
        int L2 = i2 == 1 ? L : L(i - 1, L);
        while (L <= L2) {
            G(L);
            L++;
        }
    }

    @Override // com.daaw.jk0.a
    /* renamed from: I */
    public void k(ef efVar, long j, long j2, boolean z) {
        this.v.e(efVar.a, efVar.b, this.p, efVar.c, efVar.d, efVar.e, efVar.f, efVar.g, j, j2, efVar.c());
        if (z) {
            return;
        }
        this.B.C();
        for (b81 b81Var : this.C) {
            b81Var.C();
        }
        this.u.n(this);
    }

    @Override // com.daaw.jk0.a
    /* renamed from: J */
    public void o(ef efVar, long j, long j2) {
        this.t.f(efVar);
        this.v.h(efVar.a, efVar.b, this.p, efVar.c, efVar.d, efVar.e, efVar.f, efVar.g, j, j2, efVar.c());
        this.u.n(this);
    }

    @Override // com.daaw.jk0.a
    /* renamed from: K */
    public int r(ef efVar, long j, long j2, IOException iOException) {
        boolean z;
        long c = efVar.c();
        boolean E = E(efVar);
        int size = this.z.size() - 1;
        boolean z2 = (c != 0 && E && D(size)) ? false : true;
        if (this.t.g(efVar, z2, iOException) && z2) {
            if (E) {
                s6.f(A(size) == efVar);
                if (this.z.isEmpty()) {
                    this.G = this.H;
                }
            }
            z = true;
        } else {
            z = false;
        }
        this.v.k(efVar.a, efVar.b, this.p, efVar.c, efVar.d, efVar.e, efVar.f, efVar.g, j, j2, c, iOException, z);
        if (z) {
            this.u.n(this);
            return 2;
        }
        return 0;
    }

    public final int L(int i, int i2) {
        do {
            i2++;
            if (i2 >= this.z.size()) {
                return this.z.size() - 1;
            }
        } while (this.z.get(i2).g(0) <= i);
        return i2 - 1;
    }

    public void M() {
        N(null);
    }

    public void N(b<T> bVar) {
        this.F = bVar;
        this.B.k();
        for (b81 b81Var : this.C) {
            b81Var.k();
        }
        this.x.j(this);
    }

    public void O(long j) {
        boolean z;
        long j2;
        b81[] b81VarArr;
        this.H = j;
        this.B.E();
        if (F()) {
            z = false;
        } else {
            sa saVar = null;
            int i = 0;
            while (true) {
                if (i >= this.z.size()) {
                    break;
                }
                sa saVar2 = this.z.get(i);
                long j3 = saVar2.f;
                if (j3 == j && saVar2.j == -9223372036854775807L) {
                    saVar = saVar2;
                    break;
                } else if (j3 > j) {
                    break;
                } else {
                    i++;
                }
            }
            if (saVar != null) {
                z = this.B.F(saVar.g(0));
                j2 = Long.MIN_VALUE;
            } else {
                z = this.B.f(j, true, (j > b() ? 1 : (j == b() ? 0 : -1)) < 0) != -1;
                j2 = this.H;
            }
            this.I = j2;
        }
        if (z) {
            for (b81 b81Var : this.C) {
                b81Var.E();
                b81Var.f(j, true, false);
            }
            return;
        }
        this.G = j;
        this.J = false;
        this.z.clear();
        if (this.x.g()) {
            this.x.f();
            return;
        }
        this.B.C();
        for (b81 b81Var2 : this.C) {
            b81Var2.C();
        }
    }

    public Cif<T>.a P(long j, int i) {
        for (int i2 = 0; i2 < this.C.length; i2++) {
            if (this.q[i2] == i) {
                s6.f(!this.s[i2]);
                this.s[i2] = true;
                this.C[i2].E();
                this.C[i2].f(j, true, true);
                return new a(this, this.C[i2], i2);
            }
        }
        throw new IllegalStateException();
    }

    @Override // com.daaw.d81
    public void a() {
        this.x.a();
        if (this.x.g()) {
            return;
        }
        this.t.a();
    }

    @Override // com.daaw.gb1
    public long b() {
        if (F()) {
            return this.G;
        }
        if (this.J) {
            return Long.MIN_VALUE;
        }
        return C().g;
    }

    @Override // com.daaw.gb1
    public boolean c(long j) {
        sa C;
        long j2;
        if (this.J || this.x.g()) {
            return false;
        }
        boolean F = F();
        if (F) {
            C = null;
            j2 = this.G;
        } else {
            C = C();
            j2 = C.g;
        }
        this.t.i(C, j, j2, this.y);
        gf gfVar = this.y;
        boolean z = gfVar.b;
        ef efVar = gfVar.a;
        gfVar.a();
        if (z) {
            this.G = -9223372036854775807L;
            this.J = true;
            return true;
        } else if (efVar == null) {
            return false;
        } else {
            if (E(efVar)) {
                sa saVar = (sa) efVar;
                if (F) {
                    long j3 = saVar.f;
                    long j4 = this.G;
                    if (j3 == j4) {
                        j4 = Long.MIN_VALUE;
                    }
                    this.I = j4;
                    this.G = -9223372036854775807L;
                }
                saVar.i(this.D);
                this.z.add(saVar);
            }
            this.v.n(efVar.a, efVar.b, this.p, efVar.c, efVar.d, efVar.e, efVar.f, efVar.g, this.x.k(efVar, this, this.w));
            return true;
        }
    }

    @Override // com.daaw.d81
    public boolean d() {
        return this.J || (!F() && this.B.u());
    }

    public long e(long j, ea1 ea1Var) {
        return this.t.e(j, ea1Var);
    }

    @Override // com.daaw.gb1
    public long f() {
        if (this.J) {
            return Long.MIN_VALUE;
        }
        if (F()) {
            return this.G;
        }
        long j = this.H;
        sa C = C();
        if (!C.f()) {
            if (this.z.size() > 1) {
                ArrayList<sa> arrayList = this.z;
                C = arrayList.get(arrayList.size() - 2);
            } else {
                C = null;
            }
        }
        if (C != null) {
            j = Math.max(j, C.g);
        }
        return Math.max(j, this.B.q());
    }

    @Override // com.daaw.gb1
    public void g(long j) {
        int size;
        int h;
        if (this.x.g() || F() || (size = this.z.size()) <= (h = this.t.h(j, this.A))) {
            return;
        }
        while (true) {
            if (h >= size) {
                h = size;
                break;
            } else if (!D(h)) {
                break;
            } else {
                h++;
            }
        }
        if (h == size) {
            return;
        }
        long j2 = C().g;
        sa A = A(h);
        if (this.z.isEmpty()) {
            this.G = this.H;
        }
        this.J = false;
        this.v.v(this.p, A.f, j2);
    }

    @Override // com.daaw.jk0.d
    public void h() {
        this.B.C();
        for (b81 b81Var : this.C) {
            b81Var.C();
        }
        b<T> bVar = this.F;
        if (bVar != null) {
            bVar.d(this);
        }
    }

    @Override // com.daaw.d81
    public int j(k30 k30Var, gq gqVar, boolean z) {
        if (F()) {
            return -3;
        }
        int y = this.B.y(k30Var, gqVar, z, this.J, this.I);
        if (y == -4) {
            H(this.B.r(), 1);
        }
        return y;
    }

    @Override // com.daaw.d81
    public int n(long j) {
        int i = 0;
        if (F()) {
            return 0;
        }
        if (!this.J || j <= this.B.q()) {
            int f = this.B.f(j, true, true);
            if (f != -1) {
                i = f;
            }
        } else {
            i = this.B.g();
        }
        if (i > 0) {
            H(this.B.r(), i);
        }
        return i;
    }

    public void t(long j, boolean z) {
        int o = this.B.o();
        this.B.j(j, z, true);
        int o2 = this.B.o();
        if (o2 <= o) {
            return;
        }
        long p = this.B.p();
        int i = 0;
        while (true) {
            b81[] b81VarArr = this.C;
            if (i >= b81VarArr.length) {
                z(o2);
                return;
            } else {
                b81VarArr[i].j(p, z, this.s[i]);
                i++;
            }
        }
    }

    public final void z(int i) {
        int L = L(i, 0);
        if (L > 0) {
            sq1.R(this.z, 0, L);
        }
    }
}
