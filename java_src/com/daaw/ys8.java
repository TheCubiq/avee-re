package com.daaw;

import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.internal.ads.zzacn;
import com.google.android.gms.internal.ads.zzbq;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* loaded from: classes.dex */
public final class ys8 implements nr8, m09, tw8, yw8, kt8 {
    public static final Map a0;
    public static final f92 b0;
    public mr8 C;
    public zzacn D;
    public boolean G;
    public boolean H;
    public boolean I;
    public xs8 J;
    public i42 K;
    public boolean M;
    public boolean O;
    public boolean P;
    public int Q;
    public boolean R;
    public long S;
    public boolean U;
    public int V;
    public boolean W;
    public boolean X;
    public final rw8 Y;
    public final nw8 Z;
    public final Uri p;
    public final p46 q;
    public final vn8 r;
    public final yr8 s;
    public final jn8 t;
    public final us8 u;
    public final long v;
    public final os8 x;
    public final bx8 w = new bx8("ProgressiveMediaPeriod");
    public final ds4 y = new ds4(xp4.a);
    public final Runnable z = new Runnable() { // from class: com.daaw.ps8
        @Override // java.lang.Runnable
        public final void run() {
            ys8.this.B();
        }
    };
    public final Runnable A = new Runnable() { // from class: com.daaw.qs8
        @Override // java.lang.Runnable
        public final void run() {
            ys8.this.q();
        }
    };
    public final Handler B = it5.d(null);
    public ws8[] F = new ws8[0];
    public lt8[] E = new lt8[0];
    public long T = -9223372036854775807L;
    public long L = -9223372036854775807L;
    public int N = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        a0 = Collections.unmodifiableMap(hashMap);
        b72 b72Var = new b72();
        b72Var.h("icy");
        b72Var.s("application/x-icy");
        b0 = b72Var.y();
    }

    public ys8(Uri uri, p46 p46Var, os8 os8Var, vn8 vn8Var, jn8 jn8Var, rw8 rw8Var, yr8 yr8Var, us8 us8Var, nw8 nw8Var, String str, int i, byte[] bArr) {
        this.p = uri;
        this.q = p46Var;
        this.r = vn8Var;
        this.t = jn8Var;
        this.Y = rw8Var;
        this.s = yr8Var;
        this.u = us8Var;
        this.Z = nw8Var;
        this.v = i;
        this.x = os8Var;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    public final void A() {
        uo4.f(this.H);
        Objects.requireNonNull(this.J);
        Objects.requireNonNull(this.K);
    }

    public final void B() {
        int i;
        if (this.X || this.H || !this.G || this.K == null) {
            return;
        }
        for (lt8 lt8Var : this.E) {
            if (lt8Var.x() == null) {
                return;
            }
        }
        this.y.c();
        int length = this.E.length;
        r84[] r84VarArr = new r84[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            f92 x = this.E[i2].x();
            Objects.requireNonNull(x);
            String str = x.l;
            boolean g = ak3.g(str);
            boolean z = g || ak3.h(str);
            zArr[i2] = z;
            this.I = z | this.I;
            zzacn zzacnVar = this.D;
            if (zzacnVar != null) {
                if (g || this.F[i2].b) {
                    zzbq zzbqVar = x.j;
                    zzbq zzbqVar2 = zzbqVar == null ? new zzbq(-9223372036854775807L, zzacnVar) : zzbqVar.c(zzacnVar);
                    b72 b = x.b();
                    b.m(zzbqVar2);
                    x = b.y();
                }
                if (g && x.f == -1 && x.g == -1 && (i = zzacnVar.p) != -1) {
                    b72 b2 = x.b();
                    b2.d0(i);
                    x = b2.y();
                }
            }
            r84VarArr[i2] = new r84(Integer.toString(i2), x.c(this.r.a(x)));
        }
        this.J = new xs8(new au8(r84VarArr), zArr);
        this.H = true;
        mr8 mr8Var = this.C;
        Objects.requireNonNull(mr8Var);
        mr8Var.d(this);
    }

    public final void C(int i) {
        A();
        xs8 xs8Var = this.J;
        boolean[] zArr = xs8Var.d;
        if (zArr[i]) {
            return;
        }
        f92 b = xs8Var.a.b(i).b(0);
        this.s.d(ak3.b(b.l), b, 0, null, this.S);
        zArr[i] = true;
    }

    public final void D(int i) {
        A();
        boolean[] zArr = this.J.b;
        if (this.U && zArr[i] && !this.E[i].J(false)) {
            this.T = 0L;
            this.U = false;
            this.P = true;
            this.S = 0L;
            this.V = 0;
            for (lt8 lt8Var : this.E) {
                lt8Var.E(false);
            }
            mr8 mr8Var = this.C;
            Objects.requireNonNull(mr8Var);
            mr8Var.a(this);
        }
    }

    public final void E() {
        ts8 ts8Var = new ts8(this, this.p, this.q, this.x, this, this.y);
        if (this.H) {
            uo4.f(F());
            long j = this.L;
            if (j != -9223372036854775807L && this.T > j) {
                this.W = true;
                this.T = -9223372036854775807L;
                return;
            }
            i42 i42Var = this.K;
            Objects.requireNonNull(i42Var);
            ts8.f(ts8Var, i42Var.b(this.T).a.b, this.T);
            for (lt8 lt8Var : this.E) {
                lt8Var.F(this.T);
            }
            this.T = -9223372036854775807L;
        }
        this.V = x();
        long a = this.w.a(ts8Var, this, rw8.a(this.N));
        pa6 d = ts8.d(ts8Var);
        this.s.l(new ar8(ts8.b(ts8Var), d, d.a, Collections.emptyMap(), a, 0L, 0L), 1, -1, null, 0, null, ts8.c(ts8Var), this.L);
    }

    public final boolean F() {
        return this.T != -9223372036854775807L;
    }

    public final boolean G() {
        return this.P || F();
    }

    public final int H(int i, a78 a78Var, ma7 ma7Var, int i2) {
        if (G()) {
            return -3;
        }
        C(i);
        int v = this.E[i].v(a78Var, ma7Var, i2, this.W);
        if (v == -3) {
            D(i);
        }
        return v;
    }

    public final int I(int i, long j) {
        if (G()) {
            return 0;
        }
        C(i);
        lt8 lt8Var = this.E[i];
        int t = lt8Var.t(j, this.W);
        lt8Var.H(t);
        if (t == 0) {
            D(i);
            return 0;
        }
        return t;
    }

    public final m42 N() {
        return z(new ws8(0, true));
    }

    @Override // com.daaw.yw8
    public final void a() {
        for (lt8 lt8Var : this.E) {
            lt8Var.D();
        }
        this.x.zze();
    }

    @Override // com.daaw.nr8
    public final long b(long j) {
        int i;
        A();
        boolean[] zArr = this.J.b;
        if (true != this.K.zzh()) {
            j = 0;
        }
        this.P = false;
        this.S = j;
        if (F()) {
            this.T = j;
            return j;
        }
        if (this.N != 7) {
            int length = this.E.length;
            while (i < length) {
                i = (this.E[i].K(j, false) || (!zArr[i] && this.I)) ? i + 1 : 0;
            }
            return j;
        }
        this.U = false;
        this.T = j;
        this.W = false;
        bx8 bx8Var = this.w;
        if (bx8Var.l()) {
            for (lt8 lt8Var : this.E) {
                lt8Var.z();
            }
            this.w.g();
        } else {
            bx8Var.h();
            for (lt8 lt8Var2 : this.E) {
                lt8Var2.E(false);
            }
        }
        return j;
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final boolean c(long j) {
        if (this.W || this.w.k() || this.U) {
            return false;
        }
        if (this.H && this.Q == 0) {
            return false;
        }
        boolean e = this.y.e();
        if (this.w.l()) {
            return e;
        }
        E();
        return true;
    }

    @Override // com.daaw.tw8
    public final /* bridge */ /* synthetic */ void d(xw8 xw8Var, long j, long j2) {
        i42 i42Var;
        if (this.L == -9223372036854775807L && (i42Var = this.K) != null) {
            boolean zzh = i42Var.zzh();
            long y = y(true);
            long j3 = y == Long.MIN_VALUE ? 0L : y + 10000;
            this.L = j3;
            this.u.c(j3, zzh, this.M);
        }
        ts8 ts8Var = (ts8) xw8Var;
        ny6 e = ts8.e(ts8Var);
        ar8 ar8Var = new ar8(ts8.b(ts8Var), ts8.d(ts8Var), e.l(), e.m(), j, j2, e.k());
        ts8.b(ts8Var);
        this.s.h(ar8Var, 1, -1, null, 0, null, ts8.c(ts8Var), this.L);
        this.W = true;
        mr8 mr8Var = this.C;
        Objects.requireNonNull(mr8Var);
        mr8Var.a(this);
    }

    @Override // com.daaw.nr8
    public final void e(long j, boolean z) {
        A();
        if (F()) {
            return;
        }
        boolean[] zArr = this.J.c;
        int length = this.E.length;
        for (int i = 0; i < length; i++) {
            this.E[i].y(j, false, zArr[i]);
        }
    }

    @Override // com.daaw.tw8
    public final /* bridge */ /* synthetic */ void f(xw8 xw8Var, long j, long j2, boolean z) {
        ts8 ts8Var = (ts8) xw8Var;
        ny6 e = ts8.e(ts8Var);
        ar8 ar8Var = new ar8(ts8.b(ts8Var), ts8.d(ts8Var), e.l(), e.m(), j, j2, e.k());
        ts8.b(ts8Var);
        this.s.f(ar8Var, 1, -1, null, 0, null, ts8.c(ts8Var), this.L);
        if (z) {
            return;
        }
        for (lt8 lt8Var : this.E) {
            lt8Var.E(false);
        }
        if (this.Q > 0) {
            mr8 mr8Var = this.C;
            Objects.requireNonNull(mr8Var);
            mr8Var.a(this);
        }
    }

    @Override // com.daaw.nr8
    public final void g(mr8 mr8Var, long j) {
        this.C = mr8Var;
        this.y.e();
        E();
    }

    @Override // com.daaw.nr8
    public final long h(long j, aa8 aa8Var) {
        long j2;
        A();
        if (this.K.zzh()) {
            g42 b = this.K.b(j);
            long j3 = b.a.a;
            long j4 = b.b.a;
            long j5 = aa8Var.a;
            if (j5 != 0) {
                j2 = j5;
            } else if (aa8Var.b == 0) {
                return j;
            } else {
                j2 = 0;
            }
            long h0 = it5.h0(j, j2, Long.MIN_VALUE);
            long a02 = it5.a0(j, aa8Var.b, Long.MAX_VALUE);
            boolean z = true;
            boolean z2 = h0 <= j3 && j3 <= a02;
            z = (h0 > j4 || j4 > a02) ? false : false;
            if (z2 && z) {
                if (Math.abs(j3 - j) > Math.abs(j4 - j)) {
                    return j4;
                }
            } else if (!z2) {
                return z ? j4 : h0;
            }
            return j3;
        }
        return 0L;
    }

    @Override // com.daaw.m09
    public final void i(final i42 i42Var) {
        this.B.post(new Runnable() { // from class: com.daaw.ss8
            @Override // java.lang.Runnable
            public final void run() {
                ys8.this.s(i42Var);
            }
        });
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final void j(long j) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r2 == 0) goto L77;
     */
    @Override // com.daaw.nr8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long k(com.daaw.tv8[] r8, boolean[] r9, com.daaw.mt8[] r10, boolean[] r11, long r12) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ys8.k(com.daaw.tv8[], boolean[], com.daaw.mt8[], boolean[], long):long");
    }

    @Override // com.daaw.kt8
    public final void l(f92 f92Var) {
        this.B.post(this.z);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc  */
    @Override // com.daaw.tw8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ com.daaw.vw8 m(com.daaw.xw8 r27, long r28, long r30, java.io.IOException r32, int r33) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ys8.m(com.daaw.xw8, long, long, java.io.IOException, int):com.daaw.vw8");
    }

    @Override // com.daaw.m09
    public final m42 n(int i, int i2) {
        return z(new ws8(i, false));
    }

    public final /* synthetic */ void q() {
        if (this.X) {
            return;
        }
        mr8 mr8Var = this.C;
        Objects.requireNonNull(mr8Var);
        mr8Var.a(this);
    }

    public final /* synthetic */ void r() {
        this.R = true;
    }

    public final /* synthetic */ void s(i42 i42Var) {
        this.K = this.D == null ? i42Var : new h42(-9223372036854775807L, 0L);
        this.L = i42Var.zze();
        boolean z = false;
        if (!this.R && i42Var.zze() == -9223372036854775807L) {
            z = true;
        }
        this.M = z;
        this.N = true == z ? 7 : 1;
        this.u.c(this.L, i42Var.zzh(), this.M);
        if (this.H) {
            return;
        }
        B();
    }

    public final void t() {
        this.w.i(rw8.a(this.N));
    }

    public final void u(int i) {
        this.E[i].B();
        t();
    }

    public final void v() {
        if (this.H) {
            for (lt8 lt8Var : this.E) {
                lt8Var.C();
            }
        }
        this.w.j(this);
        this.B.removeCallbacksAndMessages(null);
        this.C = null;
        this.X = true;
    }

    public final boolean w(int i) {
        return !G() && this.E[i].J(this.W);
    }

    public final int x() {
        int i = 0;
        for (lt8 lt8Var : this.E) {
            i += lt8Var.u();
        }
        return i;
    }

    public final long y(boolean z) {
        int i;
        long j = Long.MIN_VALUE;
        while (true) {
            lt8[] lt8VarArr = this.E;
            if (i >= lt8VarArr.length) {
                return j;
            }
            if (!z) {
                xs8 xs8Var = this.J;
                Objects.requireNonNull(xs8Var);
                i = xs8Var.c[i] ? 0 : i + 1;
            }
            j = Math.max(j, lt8VarArr[i].w());
        }
    }

    public final m42 z(ws8 ws8Var) {
        int length = this.E.length;
        for (int i = 0; i < length; i++) {
            if (ws8Var.equals(this.F[i])) {
                return this.E[i];
            }
        }
        nw8 nw8Var = this.Z;
        vn8 vn8Var = this.r;
        jn8 jn8Var = this.t;
        Objects.requireNonNull(vn8Var);
        lt8 lt8Var = new lt8(nw8Var, vn8Var, jn8Var, null);
        lt8Var.G(this);
        int i2 = length + 1;
        ws8[] ws8VarArr = (ws8[]) Arrays.copyOf(this.F, i2);
        ws8VarArr[length] = ws8Var;
        this.F = (ws8[]) it5.D(ws8VarArr);
        lt8[] lt8VarArr = (lt8[]) Arrays.copyOf(this.E, i2);
        lt8VarArr[length] = lt8Var;
        this.E = (lt8[]) it5.D(lt8VarArr);
        return lt8Var;
    }

    @Override // com.daaw.m09
    public final void zzC() {
        this.G = true;
        this.B.post(this.z);
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final long zzb() {
        long j;
        A();
        if (this.W || this.Q == 0) {
            return Long.MIN_VALUE;
        }
        if (F()) {
            return this.T;
        }
        if (this.I) {
            int length = this.E.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                xs8 xs8Var = this.J;
                if (xs8Var.b[i] && xs8Var.c[i] && !this.E[i].I()) {
                    j = Math.min(j, this.E[i].w());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = y(false);
        }
        return j == Long.MIN_VALUE ? this.S : j;
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final long zzc() {
        return zzb();
    }

    @Override // com.daaw.nr8
    public final long zzd() {
        if (this.P) {
            if (this.W || x() > this.V) {
                this.P = false;
                return this.S;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // com.daaw.nr8
    public final au8 zzh() {
        A();
        return this.J.a;
    }

    @Override // com.daaw.nr8
    public final void zzk() {
        t();
        if (this.W && !this.H) {
            throw dl3.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final boolean zzp() {
        return this.w.l() && this.y.d();
    }
}
