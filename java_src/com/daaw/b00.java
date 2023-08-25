package com.daaw;

import android.net.Uri;
import android.os.Handler;
import com.daaw.b81;
import com.daaw.cp0;
import com.daaw.da1;
import com.daaw.jk0;
import com.daaw.qo0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class b00 implements qo0, d00, jk0.a<c>, jk0.d, b81.b {
    public qo0.a D;
    public da1 E;
    public boolean H;
    public boolean I;
    public int J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public TrackGroupArray O;
    public boolean[] Q;
    public boolean[] R;
    public boolean[] S;
    public boolean T;
    public long V;
    public boolean X;
    public int Y;
    public boolean Z;
    public boolean a0;
    public final Uri p;
    public final mp q;
    public final int r;
    public final cp0.a s;
    public final e t;
    public final l2 u;
    public final String v;
    public final long w;
    public final d y;
    public final jk0 x = new jk0("Loader:ExtractorMediaPeriod");
    public final bj z = new bj();
    public final Runnable A = new a();
    public final Runnable B = new b();
    public final Handler C = new Handler();
    public int[] G = new int[0];
    public b81[] F = new b81[0];
    public long W = -9223372036854775807L;
    public long U = -1;
    public long P = -9223372036854775807L;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b00.this.I();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b00.this.a0) {
                return;
            }
            b00.this.D.n(b00.this);
        }
    }

    /* loaded from: classes.dex */
    public final class c implements jk0.c {
        public final Uri a;
        public final mp b;
        public final d c;
        public final bj d;
        public volatile boolean f;
        public long h;
        public pp i;
        public long k;
        public final iy0 e = new iy0();
        public boolean g = true;
        public long j = -1;

        public c(Uri uri, mp mpVar, d dVar, bj bjVar) {
            this.a = (Uri) s6.e(uri);
            this.b = (mp) s6.e(mpVar);
            this.c = (d) s6.e(dVar);
            this.d = bjVar;
        }

        @Override // com.daaw.jk0.c
        public void a() {
            int i = 0;
            while (i == 0 && !this.f) {
                wq wqVar = null;
                try {
                    long j = this.e.a;
                    pp ppVar = new pp(this.a, j, -1L, b00.this.v);
                    this.i = ppVar;
                    long c = this.b.c(ppVar);
                    this.j = c;
                    if (c != -1) {
                        this.j = c + j;
                    }
                    wq wqVar2 = new wq(this.b, j, this.j);
                    try {
                        zz b = this.c.b(wqVar2, this.b.d());
                        if (this.g) {
                            b.f(j, this.h);
                            this.g = false;
                        }
                        while (i == 0 && !this.f) {
                            this.d.a();
                            i = b.d(wqVar2, this.e);
                            if (wqVar2.getPosition() > b00.this.w + j) {
                                j = wqVar2.getPosition();
                                this.d.b();
                                b00.this.C.post(b00.this.B);
                            }
                        }
                        if (i == 1) {
                            i = 0;
                        } else {
                            this.e.a = wqVar2.getPosition();
                            this.k = this.e.a - this.i.c;
                        }
                        sq1.h(this.b);
                    } catch (Throwable th) {
                        th = th;
                        wqVar = wqVar2;
                        if (i != 1 && wqVar != null) {
                            this.e.a = wqVar.getPosition();
                            this.k = this.e.a - this.i.c;
                        }
                        sq1.h(this.b);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }

        @Override // com.daaw.jk0.c
        public void b() {
            this.f = true;
        }

        public void g(long j, long j2) {
            this.e.a = j;
            this.h = j2;
            this.g = true;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public final zz[] a;
        public final d00 b;
        public zz c;

        public d(zz[] zzVarArr, d00 d00Var) {
            this.a = zzVarArr;
            this.b = d00Var;
        }

        public void a() {
            zz zzVar = this.c;
            if (zzVar != null) {
                zzVar.a();
                this.c = null;
            }
        }

        public zz b(a00 a00Var, Uri uri) {
            zz zzVar = this.c;
            if (zzVar != null) {
                return zzVar;
            }
            zz[] zzVarArr = this.a;
            int length = zzVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                zz zzVar2 = zzVarArr[i];
                try {
                } catch (EOFException unused) {
                } catch (Throwable th) {
                    a00Var.i();
                    throw th;
                }
                if (zzVar2.c(a00Var)) {
                    this.c = zzVar2;
                    a00Var.i();
                    break;
                }
                continue;
                a00Var.i();
                i++;
            }
            zz zzVar3 = this.c;
            if (zzVar3 != null) {
                zzVar3.i(this.b);
                return this.c;
            }
            throw new qp1("None of the available extractors (" + sq1.t(this.a) + ") could read the stream.", uri);
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void b(long j, boolean z);
    }

    /* loaded from: classes.dex */
    public final class f implements d81 {
        public final int p;

        public f(int i) {
            this.p = i;
        }

        @Override // com.daaw.d81
        public void a() {
            b00.this.L();
        }

        @Override // com.daaw.d81
        public boolean d() {
            return b00.this.H(this.p);
        }

        @Override // com.daaw.d81
        public int j(k30 k30Var, gq gqVar, boolean z) {
            return b00.this.P(this.p, k30Var, gqVar, z);
        }

        @Override // com.daaw.d81
        public int n(long j) {
            return b00.this.S(this.p, j);
        }
    }

    public b00(Uri uri, mp mpVar, zz[] zzVarArr, int i, cp0.a aVar, e eVar, l2 l2Var, String str, int i2) {
        this.p = uri;
        this.q = mpVar;
        this.r = i;
        this.s = aVar;
        this.t = eVar;
        this.u = l2Var;
        this.v = str;
        this.w = i2;
        this.y = new d(zzVarArr, this);
        this.J = i == -1 ? 3 : i;
        aVar.q();
    }

    public static boolean F(IOException iOException) {
        return iOException instanceof qp1;
    }

    public final boolean B(c cVar, int i) {
        da1 da1Var;
        if (this.U != -1 || ((da1Var = this.E) != null && da1Var.h() != -9223372036854775807L)) {
            this.Y = i;
            return true;
        }
        if (this.I && !U()) {
            this.X = true;
            return false;
        }
        this.L = this.I;
        this.V = 0L;
        this.Y = 0;
        for (b81 b81Var : this.F) {
            b81Var.C();
        }
        cVar.g(0L, 0L);
        return true;
    }

    public final void C(c cVar) {
        if (this.U == -1) {
            this.U = cVar.j;
        }
    }

    public final int D() {
        int i = 0;
        for (b81 b81Var : this.F) {
            i += b81Var.t();
        }
        return i;
    }

    public final long E() {
        long j = Long.MIN_VALUE;
        for (b81 b81Var : this.F) {
            j = Math.max(j, b81Var.q());
        }
        return j;
    }

    public final boolean G() {
        return this.W != -9223372036854775807L;
    }

    public boolean H(int i) {
        return !U() && (this.Z || this.F[i].u());
    }

    public final void I() {
        if (this.a0 || this.I || this.E == null || !this.H) {
            return;
        }
        for (b81 b81Var : this.F) {
            if (b81Var.s() == null) {
                return;
            }
        }
        this.z.b();
        int length = this.F.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        this.R = new boolean[length];
        this.Q = new boolean[length];
        this.S = new boolean[length];
        this.P = this.E.h();
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                break;
            }
            Format s = this.F[i].s();
            trackGroupArr[i] = new TrackGroup(s);
            String str = s.u;
            if (!hq0.m(str) && !hq0.k(str)) {
                z = false;
            }
            this.R[i] = z;
            this.T = z | this.T;
            i++;
        }
        this.O = new TrackGroupArray(trackGroupArr);
        if (this.r == -1 && this.U == -1 && this.E.h() == -9223372036854775807L) {
            this.J = 6;
        }
        this.I = true;
        this.t.b(this.P, this.E.e());
        this.D.j(this);
    }

    public final void J(int i) {
        if (this.S[i]) {
            return;
        }
        Format a2 = this.O.a(i).a(0);
        this.s.c(hq0.g(a2.u), a2, 0, null, this.V);
        this.S[i] = true;
    }

    public final void K(int i) {
        if (this.X && this.R[i] && !this.F[i].u()) {
            this.W = 0L;
            this.X = false;
            this.L = true;
            this.V = 0L;
            this.Y = 0;
            for (b81 b81Var : this.F) {
                b81Var.C();
            }
            this.D.n(this);
        }
    }

    public void L() {
        this.x.h(this.J);
    }

    @Override // com.daaw.jk0.a
    /* renamed from: M */
    public void k(c cVar, long j, long j2, boolean z) {
        this.s.e(cVar.i, 1, -1, null, 0, null, cVar.h, this.P, j, j2, cVar.k);
        if (z) {
            return;
        }
        C(cVar);
        for (b81 b81Var : this.F) {
            b81Var.C();
        }
        if (this.N > 0) {
            this.D.n(this);
        }
    }

    @Override // com.daaw.jk0.a
    /* renamed from: N */
    public void o(c cVar, long j, long j2) {
        if (this.P == -9223372036854775807L) {
            long E = E();
            long j3 = E == Long.MIN_VALUE ? 0L : E + 10000;
            this.P = j3;
            this.t.b(j3, this.E.e());
        }
        this.s.h(cVar.i, 1, -1, null, 0, null, cVar.h, this.P, j, j2, cVar.k);
        C(cVar);
        this.Z = true;
        this.D.n(this);
    }

    @Override // com.daaw.jk0.a
    /* renamed from: O */
    public int r(c cVar, long j, long j2, IOException iOException) {
        c cVar2;
        boolean z;
        boolean F = F(iOException);
        this.s.k(cVar.i, 1, -1, null, 0, null, cVar.h, this.P, j, j2, cVar.k, iOException, F);
        C(cVar);
        if (F) {
            return 3;
        }
        int D = D();
        if (D > this.Y) {
            cVar2 = cVar;
            z = true;
        } else {
            cVar2 = cVar;
            z = false;
        }
        if (B(cVar2, D)) {
            return z ? 1 : 0;
        }
        return 2;
    }

    public int P(int i, k30 k30Var, gq gqVar, boolean z) {
        if (U()) {
            return -3;
        }
        int y = this.F[i].y(k30Var, gqVar, z, this.Z, this.V);
        if (y == -4) {
            J(i);
        } else if (y == -3) {
            K(i);
        }
        return y;
    }

    public void Q() {
        if (this.I) {
            for (b81 b81Var : this.F) {
                b81Var.k();
            }
        }
        this.x.j(this);
        this.C.removeCallbacksAndMessages(null);
        this.D = null;
        this.a0 = true;
        this.s.r();
    }

    public final boolean R(long j) {
        int i;
        int length = this.F.length;
        while (true) {
            if (i >= length) {
                return true;
            }
            b81 b81Var = this.F[i];
            b81Var.E();
            i = ((b81Var.f(j, true, false) != -1) || (!this.R[i] && this.T)) ? i + 1 : 0;
        }
        return false;
    }

    public int S(int i, long j) {
        int i2 = 0;
        if (U()) {
            return 0;
        }
        b81 b81Var = this.F[i];
        if (!this.Z || j <= b81Var.q()) {
            int f2 = b81Var.f(j, true, true);
            if (f2 != -1) {
                i2 = f2;
            }
        } else {
            i2 = b81Var.g();
        }
        if (i2 > 0) {
            J(i);
        } else {
            K(i);
        }
        return i2;
    }

    public final void T() {
        c cVar = new c(this.p, this.q, this.y, this.z);
        if (this.I) {
            s6.f(G());
            long j = this.P;
            if (j != -9223372036854775807L && this.W >= j) {
                this.Z = true;
                this.W = -9223372036854775807L;
                return;
            }
            cVar.g(this.E.g(this.W).a.b, this.W);
            this.W = -9223372036854775807L;
        }
        this.Y = D();
        this.s.n(cVar.i, 1, -1, null, 0, null, cVar.h, this.P, this.x.k(cVar, this, this.J));
    }

    public final boolean U() {
        return this.L || G();
    }

    @Override // com.daaw.d00
    public sm1 a(int i, int i2) {
        int length = this.F.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.G[i3] == i) {
                return this.F[i3];
            }
        }
        b81 b81Var = new b81(this.u);
        b81Var.H(this);
        int i4 = length + 1;
        int[] copyOf = Arrays.copyOf(this.G, i4);
        this.G = copyOf;
        copyOf[length] = i;
        b81[] b81VarArr = (b81[]) Arrays.copyOf(this.F, i4);
        this.F = b81VarArr;
        b81VarArr[length] = b81Var;
        return b81Var;
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    public long b() {
        if (this.N == 0) {
            return Long.MIN_VALUE;
        }
        return f();
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    public boolean c(long j) {
        if (this.Z || this.X) {
            return false;
        }
        if (this.I && this.N == 0) {
            return false;
        }
        boolean c2 = this.z.c();
        if (this.x.g()) {
            return c2;
        }
        T();
        return true;
    }

    @Override // com.daaw.d00
    public void d(da1 da1Var) {
        this.E = da1Var;
        this.C.post(this.A);
    }

    @Override // com.daaw.qo0
    public long e(long j, ea1 ea1Var) {
        if (this.E.e()) {
            da1.a g = this.E.g(j);
            return sq1.S(j, ea1Var, g.a.a, g.b.a);
        }
        return 0L;
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    public long f() {
        long E;
        if (this.Z) {
            return Long.MIN_VALUE;
        }
        if (G()) {
            return this.W;
        }
        if (this.T) {
            E = Long.MAX_VALUE;
            int length = this.F.length;
            for (int i = 0; i < length; i++) {
                if (this.R[i]) {
                    E = Math.min(E, this.F[i].q());
                }
            }
        } else {
            E = E();
        }
        return E == Long.MIN_VALUE ? this.V : E;
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    public void g(long j) {
    }

    @Override // com.daaw.jk0.d
    public void h() {
        for (b81 b81Var : this.F) {
            b81Var.C();
        }
        this.y.a();
    }

    @Override // com.daaw.qo0
    public long i(com.google.android.exoplayer2.trackselection.c[] cVarArr, boolean[] zArr, d81[] d81VarArr, boolean[] zArr2, long j) {
        s6.f(this.I);
        int i = this.N;
        int i2 = 0;
        for (int i3 = 0; i3 < cVarArr.length; i3++) {
            if (d81VarArr[i3] != null && (cVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((f) d81VarArr[i3]).p;
                s6.f(this.Q[i4]);
                this.N--;
                this.Q[i4] = false;
                d81VarArr[i3] = null;
            }
        }
        boolean z = !this.K ? j == 0 : i != 0;
        for (int i5 = 0; i5 < cVarArr.length; i5++) {
            if (d81VarArr[i5] == null && cVarArr[i5] != null) {
                com.google.android.exoplayer2.trackselection.c cVar = cVarArr[i5];
                s6.f(cVar.length() == 1);
                s6.f(cVar.f(0) == 0);
                int b2 = this.O.b(cVar.a());
                s6.f(!this.Q[b2]);
                this.N++;
                this.Q[b2] = true;
                d81VarArr[i5] = new f(b2);
                zArr2[i5] = true;
                if (!z) {
                    b81 b81Var = this.F[b2];
                    b81Var.E();
                    z = b81Var.f(j, true, true) == -1 && b81Var.r() != 0;
                }
            }
        }
        if (this.N == 0) {
            this.X = false;
            this.L = false;
            if (this.x.g()) {
                b81[] b81VarArr = this.F;
                int length = b81VarArr.length;
                while (i2 < length) {
                    b81VarArr[i2].k();
                    i2++;
                }
                this.x.f();
            } else {
                b81[] b81VarArr2 = this.F;
                int length2 = b81VarArr2.length;
                while (i2 < length2) {
                    b81VarArr2[i2].C();
                    i2++;
                }
            }
        } else if (z) {
            j = m(j);
            while (i2 < d81VarArr.length) {
                if (d81VarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.K = true;
        return j;
    }

    @Override // com.daaw.b81.b
    public void j(Format format) {
        this.C.post(this.A);
    }

    @Override // com.daaw.qo0
    public void l() {
        L();
    }

    @Override // com.daaw.qo0
    public long m(long j) {
        if (!this.E.e()) {
            j = 0;
        }
        this.V = j;
        this.L = false;
        if (G() || !R(j)) {
            this.X = false;
            this.W = j;
            this.Z = false;
            if (this.x.g()) {
                this.x.f();
            } else {
                for (b81 b81Var : this.F) {
                    b81Var.C();
                }
            }
            return j;
        }
        return j;
    }

    @Override // com.daaw.d00
    public void n() {
        this.H = true;
        this.C.post(this.A);
    }

    @Override // com.daaw.qo0
    public void p(qo0.a aVar, long j) {
        this.D = aVar;
        this.z.c();
        T();
    }

    @Override // com.daaw.qo0
    public long q() {
        if (!this.M) {
            this.s.t();
            this.M = true;
        }
        if (this.L) {
            if (this.Z || D() > this.Y) {
                this.L = false;
                return this.V;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // com.daaw.qo0
    public TrackGroupArray s() {
        return this.O;
    }

    @Override // com.daaw.qo0
    public void t(long j, boolean z) {
        int length = this.F.length;
        for (int i = 0; i < length; i++) {
            this.F[i].j(j, z, this.Q[i]);
        }
    }
}
