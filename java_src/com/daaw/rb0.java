package com.daaw;

import android.os.Handler;
import com.daaw.b81;
import com.daaw.cp0;
import com.daaw.eb0;
import com.daaw.gb1;
import com.daaw.ib0;
import com.daaw.jk0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class rb0 implements jk0.a<ef>, jk0.d, gb1, d00, b81.b {
    public boolean F;
    public boolean H;
    public boolean J;
    public boolean K;
    public int L;
    public Format M;
    public boolean N;
    public TrackGroupArray O;
    public TrackGroupArray P;
    public int[] Q;
    public int R;
    public boolean S;
    public long V;
    public long W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public long b0;
    public final int p;
    public final c q;
    public final eb0 r;
    public final l2 s;
    public final Format t;
    public final int u;
    public final cp0.a w;
    public final jk0 v = new jk0("Loader:HlsSampleStreamWrapper");
    public final eb0.b x = new eb0.b();
    public int[] E = new int[0];
    public int G = -1;
    public int I = -1;
    public b81[] D = new b81[0];
    public boolean[] U = new boolean[0];
    public boolean[] T = new boolean[0];
    public final ArrayList<jb0> y = new ArrayList<>();
    public final ArrayList<qb0> C = new ArrayList<>();
    public final Runnable z = new a();
    public final Runnable A = new b();
    public final Handler B = new Handler();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            rb0.this.J();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            rb0.this.P();
        }
    }

    /* loaded from: classes.dex */
    public interface c extends gb1.a<rb0> {
        void a();

        void k(ib0.a aVar);
    }

    public rb0(int i, c cVar, eb0 eb0Var, l2 l2Var, long j, Format format, int i2, cp0.a aVar) {
        this.p = i;
        this.q = cVar;
        this.r = eb0Var;
        this.s = l2Var;
        this.t = format;
        this.u = i2;
        this.w = aVar;
        this.V = j;
        this.W = j;
    }

    public static Format A(Format format, Format format2, boolean z) {
        if (format == null) {
            return format2;
        }
        int i = z ? format.q : -1;
        String s = sq1.s(format.r, hq0.g(format2.u));
        String d = hq0.d(s);
        if (d == null) {
            d = format2.u;
        }
        return format2.a(format.p, d, s, i, format.y, format.z, format.M, format.N);
    }

    public static boolean C(Format format, Format format2) {
        String str = format.u;
        String str2 = format2.u;
        int g = hq0.g(str);
        if (g != 3) {
            return g == hq0.g(str2);
        } else if (sq1.b(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || format.O == format2.O;
        } else {
            return false;
        }
    }

    public static boolean F(ef efVar) {
        return efVar instanceof jb0;
    }

    public static ev z(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Unmapped track with id ");
        sb.append(i);
        sb.append(" of type ");
        sb.append(i2);
        return new ev();
    }

    public final boolean B(jb0 jb0Var) {
        int i = jb0Var.j;
        int length = this.D.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.T[i2] && this.D[i2].v() == i) {
                return false;
            }
        }
        return true;
    }

    public final jb0 D() {
        ArrayList<jb0> arrayList = this.y;
        return arrayList.get(arrayList.size() - 1);
    }

    public void E(int i, boolean z, boolean z2) {
        if (!z2) {
            this.F = false;
            this.H = false;
        }
        for (b81 b81Var : this.D) {
            b81Var.I(i);
        }
        if (z) {
            for (b81 b81Var2 : this.D) {
                b81Var2.J();
            }
        }
    }

    public final boolean G() {
        return this.W != -9223372036854775807L;
    }

    public boolean H(int i) {
        return this.Z || (!G() && this.D[i].u());
    }

    public final void I() {
        int i = this.O.p;
        int[] iArr = new int[i];
        this.Q = iArr;
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = 0;
            while (true) {
                b81[] b81VarArr = this.D;
                if (i3 >= b81VarArr.length) {
                    break;
                } else if (C(b81VarArr[i3].s(), this.O.a(i2).a(0))) {
                    this.Q[i2] = i3;
                    break;
                } else {
                    i3++;
                }
            }
        }
        Iterator<qb0> it = this.C.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public final void J() {
        if (!this.N && this.Q == null && this.J) {
            for (b81 b81Var : this.D) {
                if (b81Var.s() == null) {
                    return;
                }
            }
            if (this.O != null) {
                I();
                return;
            }
            x();
            this.K = true;
            this.q.a();
        }
    }

    public void K() {
        this.v.a();
        this.r.e();
    }

    @Override // com.daaw.jk0.a
    /* renamed from: L */
    public void k(ef efVar, long j, long j2, boolean z) {
        this.w.e(efVar.a, efVar.b, this.p, efVar.c, efVar.d, efVar.e, efVar.f, efVar.g, j, j2, efVar.c());
        if (z) {
            return;
        }
        T();
        if (this.L > 0) {
            this.q.n(this);
        }
    }

    @Override // com.daaw.jk0.a
    /* renamed from: M */
    public void o(ef efVar, long j, long j2) {
        this.r.g(efVar);
        this.w.h(efVar.a, efVar.b, this.p, efVar.c, efVar.d, efVar.e, efVar.f, efVar.g, j, j2, efVar.c());
        if (this.K) {
            this.q.n(this);
        } else {
            c(this.V);
        }
    }

    @Override // com.daaw.jk0.a
    /* renamed from: N */
    public int r(ef efVar, long j, long j2, IOException iOException) {
        boolean z;
        long c2 = efVar.c();
        boolean F = F(efVar);
        if (this.r.h(efVar, !F || c2 == 0, iOException)) {
            if (F) {
                ArrayList<jb0> arrayList = this.y;
                s6.f(arrayList.remove(arrayList.size() - 1) == efVar);
                if (this.y.isEmpty()) {
                    this.W = this.V;
                }
            }
            z = true;
        } else {
            z = false;
        }
        this.w.k(efVar.a, efVar.b, this.p, efVar.c, efVar.d, efVar.e, efVar.f, efVar.g, j, j2, efVar.c(), iOException, z);
        if (!z) {
            return iOException instanceof tv0 ? 3 : 0;
        } else if (this.K) {
            this.q.n(this);
            return 2;
        } else {
            c(this.V);
            return 2;
        }
    }

    public boolean O(ib0.a aVar, boolean z) {
        return this.r.i(aVar, z);
    }

    public final void P() {
        this.J = true;
        J();
    }

    public void Q(TrackGroupArray trackGroupArray, int i, TrackGroupArray trackGroupArray2) {
        this.K = true;
        this.O = trackGroupArray;
        this.P = trackGroupArray2;
        this.R = i;
        this.q.a();
    }

    public int R(int i, k30 k30Var, gq gqVar, boolean z) {
        if (G()) {
            return -3;
        }
        if (!this.y.isEmpty()) {
            int i2 = 0;
            while (i2 < this.y.size() - 1 && B(this.y.get(i2))) {
                i2++;
            }
            if (i2 > 0) {
                sq1.R(this.y, 0, i2);
            }
            jb0 jb0Var = this.y.get(0);
            Format format = jb0Var.c;
            if (!format.equals(this.M)) {
                this.w.c(this.p, format, jb0Var.d, jb0Var.e, jb0Var.f);
            }
            this.M = format;
        }
        return this.D[i].y(k30Var, gqVar, z, this.Z, this.V);
    }

    public void S() {
        if (this.K) {
            for (b81 b81Var : this.D) {
                b81Var.k();
            }
        }
        this.v.j(this);
        this.B.removeCallbacksAndMessages(null);
        this.N = true;
        this.C.clear();
    }

    public final void T() {
        for (b81 b81Var : this.D) {
            b81Var.D(this.X);
        }
        this.X = false;
    }

    public final boolean U(long j) {
        int i;
        int length = this.D.length;
        while (true) {
            if (i >= length) {
                return true;
            }
            b81 b81Var = this.D[i];
            b81Var.E();
            i = ((b81Var.f(j, true, false) != -1) || (!this.U[i] && this.S)) ? i + 1 : 0;
        }
        return false;
    }

    public boolean V(long j, boolean z) {
        this.V = j;
        if (!this.J || z || G() || !U(j)) {
            this.W = j;
            this.Z = false;
            this.y.clear();
            if (this.v.g()) {
                this.v.f();
                return true;
            }
            T();
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean W(com.google.android.exoplayer2.trackselection.c[] r17, boolean[] r18, com.daaw.d81[] r19, boolean[] r20, long r21, boolean r23) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.rb0.W(com.google.android.exoplayer2.trackselection.c[], boolean[], com.daaw.d81[], boolean[], long, boolean):boolean");
    }

    public void X(boolean z) {
        this.r.n(z);
    }

    public void Y(long j) {
        this.b0 = j;
        for (b81 b81Var : this.D) {
            b81Var.G(j);
        }
    }

    public int Z(int i, long j) {
        if (G()) {
            return 0;
        }
        b81 b81Var = this.D[i];
        if (!this.Z || j <= b81Var.q()) {
            int f = b81Var.f(j, true, true);
            if (f == -1) {
                return 0;
            }
            return f;
        }
        return b81Var.g();
    }

    @Override // com.daaw.d00
    public sm1 a(int i, int i2) {
        b81[] b81VarArr = this.D;
        int length = b81VarArr.length;
        boolean z = false;
        if (i2 == 1) {
            int i3 = this.G;
            if (i3 != -1) {
                if (this.F) {
                    return this.E[i3] == i ? b81VarArr[i3] : z(i, i2);
                }
                this.F = true;
                this.E[i3] = i;
                return b81VarArr[i3];
            } else if (this.a0) {
                return z(i, i2);
            }
        } else if (i2 == 2) {
            int i4 = this.I;
            if (i4 != -1) {
                if (this.H) {
                    return this.E[i4] == i ? b81VarArr[i4] : z(i, i2);
                }
                this.H = true;
                this.E[i4] = i;
                return b81VarArr[i4];
            } else if (this.a0) {
                return z(i, i2);
            }
        } else {
            for (int i5 = 0; i5 < length; i5++) {
                if (this.E[i5] == i) {
                    return this.D[i5];
                }
            }
            if (this.a0) {
                return z(i, i2);
            }
        }
        b81 b81Var = new b81(this.s);
        b81Var.G(this.b0);
        b81Var.H(this);
        int i6 = length + 1;
        int[] copyOf = Arrays.copyOf(this.E, i6);
        this.E = copyOf;
        copyOf[length] = i;
        b81[] b81VarArr2 = (b81[]) Arrays.copyOf(this.D, i6);
        this.D = b81VarArr2;
        b81VarArr2[length] = b81Var;
        boolean[] copyOf2 = Arrays.copyOf(this.U, i6);
        this.U = copyOf2;
        copyOf2[length] = (i2 == 1 || i2 == 2) ? true : true;
        this.S = copyOf2[length] | this.S;
        if (i2 == 1) {
            this.F = true;
            this.G = length;
        } else if (i2 == 2) {
            this.H = true;
            this.I = length;
        }
        this.T = Arrays.copyOf(this.T, i6);
        return b81Var;
    }

    public void a0(int i) {
        int i2 = this.Q[i];
        s6.f(this.T[i2]);
        this.T[i2] = false;
    }

    @Override // com.daaw.gb1
    public long b() {
        if (G()) {
            return this.W;
        }
        if (this.Z) {
            return Long.MIN_VALUE;
        }
        return D().g;
    }

    public final void b0(d81[] d81VarArr) {
        this.C.clear();
        for (d81 d81Var : d81VarArr) {
            if (d81Var != null) {
                this.C.add((qb0) d81Var);
            }
        }
    }

    @Override // com.daaw.gb1
    public boolean c(long j) {
        jb0 D;
        long j2;
        if (this.Z || this.v.g()) {
            return false;
        }
        if (G()) {
            D = null;
            j2 = this.W;
        } else {
            D = D();
            j2 = D.g;
        }
        this.r.b(D, j, j2, this.x);
        eb0.b bVar = this.x;
        boolean z = bVar.b;
        ef efVar = bVar.a;
        ib0.a aVar = bVar.c;
        bVar.a();
        if (z) {
            this.W = -9223372036854775807L;
            this.Z = true;
            return true;
        } else if (efVar == null) {
            if (aVar != null) {
                this.q.k(aVar);
            }
            return false;
        } else {
            if (F(efVar)) {
                this.W = -9223372036854775807L;
                jb0 jb0Var = (jb0) efVar;
                jb0Var.h(this);
                this.y.add(jb0Var);
            }
            this.w.n(efVar.a, efVar.b, this.p, efVar.c, efVar.d, efVar.e, efVar.f, efVar.g, this.v.k(efVar, this, this.u));
            return true;
        }
    }

    @Override // com.daaw.d00
    public void d(da1 da1Var) {
    }

    @Override // com.daaw.gb1
    public long f() {
        ArrayList<jb0> arrayList;
        if (this.Z) {
            return Long.MIN_VALUE;
        }
        if (G()) {
            return this.W;
        }
        long j = this.V;
        jb0 D = D();
        if (!D.f()) {
            D = this.y.size() > 1 ? this.y.get(arrayList.size() - 2) : null;
        }
        if (D != null) {
            j = Math.max(j, D.g);
        }
        if (this.J) {
            for (b81 b81Var : this.D) {
                j = Math.max(j, b81Var.q());
            }
        }
        return j;
    }

    @Override // com.daaw.gb1
    public void g(long j) {
    }

    @Override // com.daaw.jk0.d
    public void h() {
        T();
    }

    @Override // com.daaw.b81.b
    public void j(Format format) {
        this.B.post(this.z);
    }

    public void l() {
        K();
    }

    @Override // com.daaw.d00
    public void n() {
        this.a0 = true;
        this.B.post(this.A);
    }

    public TrackGroupArray s() {
        return this.O;
    }

    public void t(long j, boolean z) {
        if (this.J) {
            int length = this.D.length;
            for (int i = 0; i < length; i++) {
                this.D[i].j(j, z, this.T[i]);
            }
        }
    }

    public int w(int i) {
        int i2 = this.Q[i];
        if (i2 == -1) {
            return this.P.b(this.O.a(i)) == -1 ? -2 : -3;
        }
        boolean[] zArr = this.T;
        if (zArr[i2]) {
            return -2;
        }
        zArr[i2] = true;
        return i2;
    }

    public final void x() {
        int length = this.D.length;
        int i = 0;
        char c2 = 0;
        int i2 = -1;
        while (true) {
            if (i >= length) {
                break;
            }
            String str = this.D[i].s().u;
            char c3 = hq0.m(str) ? (char) 3 : hq0.k(str) ? (char) 2 : hq0.l(str) ? (char) 1 : (char) 0;
            if (c3 > c2) {
                i2 = i;
                c2 = c3;
            } else if (c3 == c2 && i2 != -1) {
                i2 = -1;
            }
            i++;
        }
        TrackGroup c4 = this.r.c();
        int i3 = c4.p;
        this.R = -1;
        this.Q = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            this.Q[i4] = i4;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        for (int i5 = 0; i5 < length; i5++) {
            Format s = this.D[i5].s();
            if (i5 == i2) {
                Format[] formatArr = new Format[i3];
                for (int i6 = 0; i6 < i3; i6++) {
                    formatArr[i6] = A(c4.a(i6), s, true);
                }
                trackGroupArr[i5] = new TrackGroup(formatArr);
                this.R = i5;
            } else {
                trackGroupArr[i5] = new TrackGroup(A((c2 == 3 && hq0.k(s.u)) ? this.t : null, s, false));
            }
        }
        this.O = new TrackGroupArray(trackGroupArr);
        s6.f(this.P == null);
        this.P = TrackGroupArray.s;
    }

    public void y() {
        if (this.K) {
            return;
        }
        c(this.V);
    }
}
