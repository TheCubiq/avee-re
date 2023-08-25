package com.daaw;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzatd;
import java.io.IOException;
/* loaded from: classes.dex */
public final class sv2 implements wv2, os2, uy2, gw2 {
    public vv2 D;
    public us2 E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public rw2 K;
    public long L;
    public boolean[] M;
    public boolean[] N;
    public boolean O;
    public long Q;
    public int S;
    public boolean T;
    public boolean U;
    public final nx2 V;
    public final Uri p;
    public final kx2 q;
    public final int r;
    public final Handler s;
    public final tv2 t;
    public final xv2 u;
    public final long v;
    public final qv2 x;
    public final yy2 w = new yy2("Loader:ExtractorMediaPeriod");
    public final cz2 y = new cz2();
    public final Runnable z = new hv2(this);
    public final Runnable A = new iv2(this);
    public final Handler B = new Handler();
    public long R = -9223372036854775807L;
    public final SparseArray C = new SparseArray();
    public long P = -1;

    public sv2(Uri uri, kx2 kx2Var, ns2[] ns2VarArr, int i, Handler handler, tv2 tv2Var, xv2 xv2Var, nx2 nx2Var, String str, int i2, byte[] bArr) {
        this.p = uri;
        this.q = kx2Var;
        this.r = i;
        this.s = handler;
        this.t = tv2Var;
        this.u = xv2Var;
        this.V = nx2Var;
        this.v = i2;
        this.x = new qv2(ns2VarArr, this);
    }

    public static /* bridge */ /* synthetic */ void y(sv2 sv2Var) {
        if (sv2Var.U || sv2Var.G || sv2Var.E == null || !sv2Var.F) {
            return;
        }
        int size = sv2Var.C.size();
        for (int i = 0; i < size; i++) {
            if (((hw2) sv2Var.C.valueAt(i)).h() == null) {
                return;
            }
        }
        sv2Var.y.b();
        mw2[] mw2VarArr = new mw2[size];
        sv2Var.N = new boolean[size];
        sv2Var.M = new boolean[size];
        sv2Var.L = sv2Var.E.zza();
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= size) {
                sv2Var.K = new rw2(mw2VarArr);
                sv2Var.G = true;
                sv2Var.u.d(new lw2(sv2Var.L, sv2Var.E.zzc()), null);
                sv2Var.D.h(sv2Var);
                return;
            }
            zzatd h = ((hw2) sv2Var.C.valueAt(i2)).h();
            mw2VarArr[i2] = new mw2(h);
            String str = h.u;
            if (!fz2.b(str) && !fz2.a(str)) {
                z = false;
            }
            sv2Var.N[i2] = z;
            sv2Var.O = z | sv2Var.O;
            i2++;
        }
    }

    public final void A() {
        this.w.h(new nv2(this, this.x));
        this.B.removeCallbacksAndMessages(null);
        this.U = true;
    }

    public final void B(int i, long j) {
        hw2 hw2Var = (hw2) this.C.valueAt(i);
        if (!this.T || j <= hw2Var.g()) {
            hw2Var.n(j, true);
        } else {
            hw2Var.l();
        }
    }

    @Override // com.daaw.wv2, com.daaw.kw2
    public final boolean a(long j) {
        if (this.T) {
            return false;
        }
        if (this.G && this.J == 0) {
            return false;
        }
        boolean c = this.y.c();
        if (this.w.i()) {
            return c;
        }
        p();
        return true;
    }

    @Override // com.daaw.os2
    public final void b(us2 us2Var) {
        this.E = us2Var;
        this.B.post(this.z);
    }

    @Override // com.daaw.wv2
    public final void c(long j) {
    }

    @Override // com.daaw.gw2
    public final void d(zzatd zzatdVar) {
        this.B.post(this.z);
    }

    @Override // com.daaw.wv2
    public final long e(long j) {
        if (true != this.E.zzc()) {
            j = 0;
        }
        this.Q = j;
        int size = this.C.size();
        boolean q = true ^ q();
        int i = 0;
        while (true) {
            if (!q) {
                this.R = j;
                this.T = false;
                yy2 yy2Var = this.w;
                if (yy2Var.i()) {
                    yy2Var.f();
                } else {
                    for (int i2 = 0; i2 < size; i2++) {
                        ((hw2) this.C.valueAt(i2)).j(this.M[i2]);
                    }
                }
            } else if (i >= size) {
                break;
            } else {
                if (this.M[i]) {
                    q = ((hw2) this.C.valueAt(i)).n(j, false);
                }
                i++;
            }
        }
        this.I = false;
        return j;
    }

    @Override // com.daaw.wv2
    public final void f(vv2 vv2Var, long j) {
        this.D = vv2Var;
        this.y.c();
        p();
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x00bc, code lost:
        if (r1 != false) goto L55;
     */
    @Override // com.daaw.wv2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long g(com.daaw.vw2[] r7, boolean[] r8, com.daaw.iw2[] r9, boolean[] r10, long r11) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.sv2.g(com.daaw.vw2[], boolean[], com.daaw.iw2[], boolean[], long):long");
    }

    @Override // com.daaw.os2
    public final ws2 h(int i, int i2) {
        hw2 hw2Var = (hw2) this.C.get(i);
        if (hw2Var == null) {
            hw2 hw2Var2 = new hw2(this.V, null);
            hw2Var2.k(this);
            this.C.put(i, hw2Var2);
            return hw2Var2;
        }
        return hw2Var;
    }

    @Override // com.daaw.uy2
    public final /* bridge */ /* synthetic */ int i(wy2 wy2Var, long j, long j2, IOException iOException) {
        us2 us2Var;
        pv2 pv2Var = (pv2) wy2Var;
        o(pv2Var);
        Handler handler = this.s;
        if (handler != null) {
            handler.post(new ov2(this, iOException));
        }
        if (iOException instanceof sw2) {
            return 3;
        }
        int m = m();
        int i = this.S;
        if (this.P == -1 && ((us2Var = this.E) == null || us2Var.zza() == -9223372036854775807L)) {
            this.Q = 0L;
            this.I = this.G;
            int size = this.C.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((hw2) this.C.valueAt(i2)).j(!this.G || this.M[i2]);
            }
            pv2Var.b(0L, 0L);
        }
        this.S = m();
        return m <= i ? 0 : 1;
    }

    @Override // com.daaw.uy2
    public final /* bridge */ /* synthetic */ void j(wy2 wy2Var, long j, long j2, boolean z) {
        o((pv2) wy2Var);
        if (z || this.J <= 0) {
            return;
        }
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            ((hw2) this.C.valueAt(i)).j(this.M[i]);
        }
        this.D.b(this);
    }

    @Override // com.daaw.uy2
    public final /* bridge */ /* synthetic */ void k(wy2 wy2Var, long j, long j2) {
        o((pv2) wy2Var);
        this.T = true;
        if (this.L == -9223372036854775807L) {
            long n = n();
            long j3 = n == Long.MIN_VALUE ? 0L : n + 10000;
            this.L = j3;
            this.u.d(new lw2(j3, this.E.zzc()), null);
        }
        this.D.b(this);
    }

    public final boolean l(int i) {
        return this.T || (!q() && ((hw2) this.C.valueAt(i)).m());
    }

    public final int m() {
        int size = this.C.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((hw2) this.C.valueAt(i2)).e();
        }
        return i;
    }

    public final long n() {
        int size = this.C.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((hw2) this.C.valueAt(i)).g());
        }
        return j;
    }

    public final void o(pv2 pv2Var) {
        long j;
        if (this.P == -1) {
            j = pv2Var.i;
            this.P = j;
        }
    }

    public final void p() {
        us2 us2Var;
        pv2 pv2Var = new pv2(this, this.p, this.q, this.x, this.y);
        if (this.G) {
            az2.e(q());
            long j = this.L;
            if (j != -9223372036854775807L && this.R >= j) {
                this.T = true;
                this.R = -9223372036854775807L;
                return;
            }
            pv2Var.b(this.E.a(this.R), this.R);
            this.R = -9223372036854775807L;
        }
        this.S = m();
        int i = this.r;
        if (i == -1) {
            i = (this.G && this.P == -1 && ((us2Var = this.E) == null || us2Var.zza() == -9223372036854775807L)) ? 6 : 3;
        }
        this.w.a(pv2Var, this, i);
    }

    public final boolean q() {
        return this.R != -9223372036854775807L;
    }

    public final int r(int i, cq2 cq2Var, bs2 bs2Var, boolean z) {
        if (this.I || q()) {
            return -3;
        }
        return ((hw2) this.C.valueAt(i)).f(cq2Var, bs2Var, z, this.T, this.Q);
    }

    public final void z() {
        this.w.g(Integer.MIN_VALUE);
    }

    @Override // com.daaw.wv2, com.daaw.kw2
    public final long zza() {
        if (this.J == 0) {
            return Long.MIN_VALUE;
        }
        return zzg();
    }

    @Override // com.daaw.os2
    public final void zzb() {
        this.F = true;
        this.B.post(this.z);
    }

    @Override // com.daaw.wv2
    public final long zzg() {
        long n;
        if (this.T) {
            return Long.MIN_VALUE;
        }
        if (q()) {
            return this.R;
        }
        if (this.O) {
            int size = this.C.size();
            n = Long.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                if (this.N[i]) {
                    n = Math.min(n, ((hw2) this.C.valueAt(i)).g());
                }
            }
        } else {
            n = n();
        }
        return n == Long.MIN_VALUE ? this.Q : n;
    }

    @Override // com.daaw.wv2
    public final long zzh() {
        if (this.I) {
            this.I = false;
            return this.Q;
        }
        return -9223372036854775807L;
    }

    @Override // com.daaw.wv2
    public final rw2 zzn() {
        return this.K;
    }

    @Override // com.daaw.wv2
    public final void zzs() {
        this.w.g(Integer.MIN_VALUE);
    }
}
