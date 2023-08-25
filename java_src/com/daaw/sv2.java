package com.daaw;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzatd;
import java.io.IOException;
/* loaded from: classes.dex */
public final class sv2 implements wv2, os2, uy2, gw2 {

    /* renamed from: D */
    public vv2 f26670D;

    /* renamed from: E */
    public us2 f26671E;

    /* renamed from: F */
    public boolean f26672F;

    /* renamed from: G */
    public boolean f26673G;

    /* renamed from: H */
    public boolean f26674H;

    /* renamed from: I */
    public boolean f26675I;

    /* renamed from: J */
    public int f26676J;

    /* renamed from: K */
    public rw2 f26677K;

    /* renamed from: L */
    public long f26678L;

    /* renamed from: M */
    public boolean[] f26679M;

    /* renamed from: N */
    public boolean[] f26680N;

    /* renamed from: O */
    public boolean f26681O;

    /* renamed from: Q */
    public long f26683Q;

    /* renamed from: S */
    public int f26685S;

    /* renamed from: T */
    public boolean f26686T;

    /* renamed from: U */
    public boolean f26687U;

    /* renamed from: V */
    public final nx2 f26688V;

    /* renamed from: p */
    public final Uri f26689p;

    /* renamed from: q */
    public final kx2 f26690q;

    /* renamed from: r */
    public final int f26691r;

    /* renamed from: s */
    public final Handler f26692s;

    /* renamed from: t */
    public final tv2 f26693t;

    /* renamed from: u */
    public final xv2 f26694u;

    /* renamed from: v */
    public final long f26695v;

    /* renamed from: x */
    public final qv2 f26697x;

    /* renamed from: w */
    public final yy2 f26696w = new yy2("Loader:ExtractorMediaPeriod");

    /* renamed from: y */
    public final cz2 f26698y = new cz2();

    /* renamed from: z */
    public final Runnable f26699z = new hv2(this);

    /* renamed from: A */
    public final Runnable f26667A = new iv2(this);

    /* renamed from: B */
    public final Handler f26668B = new Handler();

    /* renamed from: R */
    public long f26684R = -9223372036854775807L;

    /* renamed from: C */
    public final SparseArray f26669C = new SparseArray();

    /* renamed from: P */
    public long f26682P = -1;

    public sv2(Uri uri, kx2 kx2Var, ns2[] ns2VarArr, int i, Handler handler, tv2 tv2Var, xv2 xv2Var, nx2 nx2Var, String str, int i2, byte[] bArr) {
        this.f26689p = uri;
        this.f26690q = kx2Var;
        this.f26691r = i;
        this.f26692s = handler;
        this.f26693t = tv2Var;
        this.f26694u = xv2Var;
        this.f26688V = nx2Var;
        this.f26695v = i2;
        this.f26697x = new qv2(ns2VarArr, this);
    }

    /* renamed from: y */
    public static /* bridge */ /* synthetic */ void m9803y(sv2 sv2Var) {
        if (sv2Var.f26687U || sv2Var.f26673G || sv2Var.f26671E == null || !sv2Var.f26672F) {
            return;
        }
        int size = sv2Var.f26669C.size();
        for (int i = 0; i < size; i++) {
            if (((hw2) sv2Var.f26669C.valueAt(i)).m20357h() == null) {
                return;
            }
        }
        sv2Var.f26698y.m24859b();
        mw2[] mw2VarArr = new mw2[size];
        sv2Var.f26680N = new boolean[size];
        sv2Var.f26679M = new boolean[size];
        sv2Var.f26678L = sv2Var.f26671E.zza();
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= size) {
                sv2Var.f26677K = new rw2(mw2VarArr);
                sv2Var.f26673G = true;
                sv2Var.f26694u.mo4485d(new lw2(sv2Var.f26678L, sv2Var.f26671E.zzc()), null);
                sv2Var.f26670D.mo1842h(sv2Var);
                return;
            }
            zzatd m20357h = ((hw2) sv2Var.f26669C.valueAt(i2)).m20357h();
            mw2VarArr[i2] = new mw2(m20357h);
            String str = m20357h.f36794u;
            if (!fz2.m22127b(str) && !fz2.m22128a(str)) {
                z = false;
            }
            sv2Var.f26680N[i2] = z;
            sv2Var.f26681O = z | sv2Var.f26681O;
            i2++;
        }
    }

    /* renamed from: A */
    public final void m9822A() {
        this.f26696w.m3069h(new nv2(this, this.f26697x));
        this.f26668B.removeCallbacksAndMessages(null);
        this.f26687U = true;
    }

    /* renamed from: B */
    public final void m9821B(int i, long j) {
        hw2 hw2Var = (hw2) this.f26669C.valueAt(i);
        if (!this.f26686T || j <= hw2Var.m20358g()) {
            hw2Var.m20351n(j, true);
        } else {
            hw2Var.m20353l();
        }
    }

    @Override // com.daaw.wv2, com.daaw.kw2
    /* renamed from: a */
    public final boolean mo1848a(long j) {
        if (this.f26686T) {
            return false;
        }
        if (this.f26673G && this.f26676J == 0) {
            return false;
        }
        boolean m24858c = this.f26698y.m24858c();
        if (this.f26696w.m3068i()) {
            return m24858c;
        }
        m9812p();
        return true;
    }

    @Override // com.daaw.os2
    /* renamed from: b */
    public final void mo9819b(us2 us2Var) {
        this.f26671E = us2Var;
        this.f26668B.post(this.f26699z);
    }

    @Override // com.daaw.wv2
    /* renamed from: c */
    public final void mo1846c(long j) {
    }

    @Override // com.daaw.gw2
    /* renamed from: d */
    public final void mo9818d(zzatd zzatdVar) {
        this.f26668B.post(this.f26699z);
    }

    @Override // com.daaw.wv2
    /* renamed from: e */
    public final long mo1845e(long j) {
        if (true != this.f26671E.zzc()) {
            j = 0;
        }
        this.f26683Q = j;
        int size = this.f26669C.size();
        boolean m9811q = true ^ m9811q();
        int i = 0;
        while (true) {
            if (!m9811q) {
                this.f26684R = j;
                this.f26686T = false;
                yy2 yy2Var = this.f26696w;
                if (yy2Var.m3068i()) {
                    yy2Var.m3071f();
                } else {
                    for (int i2 = 0; i2 < size; i2++) {
                        ((hw2) this.f26669C.valueAt(i2)).m20355j(this.f26679M[i2]);
                    }
                }
            } else if (i >= size) {
                break;
            } else {
                if (this.f26679M[i]) {
                    m9811q = ((hw2) this.f26669C.valueAt(i)).m20351n(j, false);
                }
                i++;
            }
        }
        this.f26675I = false;
        return j;
    }

    @Override // com.daaw.wv2
    /* renamed from: f */
    public final void mo1844f(vv2 vv2Var, long j) {
        this.f26670D = vv2Var;
        this.f26698y.m24858c();
        m9812p();
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x00bc, code lost:
        if (r1 != false) goto L55;
     */
    @Override // com.daaw.wv2
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo1843g(vw2[] vw2VarArr, boolean[] zArr, iw2[] iw2VarArr, boolean[] zArr2, long j) {
        vw2 vw2Var;
        int i;
        az2.m26583e(this.f26673G);
        for (int i2 = 0; i2 < vw2VarArr.length; i2++) {
            iw2 iw2Var = iw2VarArr[i2];
            if (iw2Var != null && (vw2VarArr[i2] == null || !zArr[i2])) {
                i = ((rv2) iw2Var).f25648a;
                az2.m26583e(this.f26679M[i]);
                this.f26676J--;
                this.f26679M[i] = false;
                ((hw2) this.f26669C.valueAt(i)).m20356i();
                iw2VarArr[i2] = null;
            }
        }
        boolean z = false;
        for (int i3 = 0; i3 < vw2VarArr.length; i3++) {
            if (iw2VarArr[i3] == null && (vw2Var = vw2VarArr[i3]) != null) {
                vw2Var.m6689b();
                az2.m26583e(vw2Var.m6690a(0) == 0);
                int m10859a = this.f26677K.m10859a(vw2Var.m6687d());
                az2.m26583e(!this.f26679M[m10859a]);
                this.f26676J++;
                this.f26679M[m10859a] = true;
                iw2VarArr[i3] = new rv2(this, m10859a);
                zArr2[i3] = true;
                z = true;
            }
        }
        if (!this.f26674H) {
            int size = this.f26669C.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!this.f26679M[i4]) {
                    ((hw2) this.f26669C.valueAt(i4)).m20356i();
                }
            }
        }
        if (this.f26676J == 0) {
            this.f26675I = false;
            yy2 yy2Var = this.f26696w;
            if (yy2Var.m3068i()) {
                yy2Var.m3071f();
            }
        } else if (!this.f26674H) {
            if (j == 0) {
                j = 0;
            }
            j = mo1845e(j);
            for (int i5 = 0; i5 < iw2VarArr.length; i5++) {
                if (iw2VarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.f26674H = true;
        return j;
    }

    @Override // com.daaw.os2
    /* renamed from: h */
    public final ws2 mo9817h(int i, int i2) {
        hw2 hw2Var = (hw2) this.f26669C.get(i);
        if (hw2Var == null) {
            hw2 hw2Var2 = new hw2(this.f26688V, null);
            hw2Var2.m20354k(this);
            this.f26669C.put(i, hw2Var2);
            return hw2Var2;
        }
        return hw2Var;
    }

    @Override // com.daaw.uy2
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ int mo7647i(wy2 wy2Var, long j, long j2, IOException iOException) {
        us2 us2Var;
        pv2 pv2Var = (pv2) wy2Var;
        m9813o(pv2Var);
        Handler handler = this.f26692s;
        if (handler != null) {
            handler.post(new ov2(this, iOException));
        }
        if (iOException instanceof sw2) {
            return 3;
        }
        int m9815m = m9815m();
        int i = this.f26685S;
        if (this.f26682P == -1 && ((us2Var = this.f26671E) == null || us2Var.zza() == -9223372036854775807L)) {
            this.f26683Q = 0L;
            this.f26675I = this.f26673G;
            int size = this.f26669C.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((hw2) this.f26669C.valueAt(i2)).m20355j(!this.f26673G || this.f26679M[i2]);
            }
            pv2Var.m13018b(0L, 0L);
        }
        this.f26685S = m9815m();
        return m9815m <= i ? 0 : 1;
    }

    @Override // com.daaw.uy2
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo7646j(wy2 wy2Var, long j, long j2, boolean z) {
        m9813o((pv2) wy2Var);
        if (z || this.f26676J <= 0) {
            return;
        }
        int size = this.f26669C.size();
        for (int i = 0; i < size; i++) {
            ((hw2) this.f26669C.valueAt(i)).m20355j(this.f26679M[i]);
        }
        this.f26670D.mo1847b(this);
    }

    @Override // com.daaw.uy2
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo7645k(wy2 wy2Var, long j, long j2) {
        m9813o((pv2) wy2Var);
        this.f26686T = true;
        if (this.f26678L == -9223372036854775807L) {
            long m9814n = m9814n();
            long j3 = m9814n == Long.MIN_VALUE ? 0L : m9814n + 10000;
            this.f26678L = j3;
            this.f26694u.mo4485d(new lw2(j3, this.f26671E.zzc()), null);
        }
        this.f26670D.mo1847b(this);
    }

    /* renamed from: l */
    public final boolean m9816l(int i) {
        return this.f26686T || (!m9811q() && ((hw2) this.f26669C.valueAt(i)).m20352m());
    }

    /* renamed from: m */
    public final int m9815m() {
        int size = this.f26669C.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((hw2) this.f26669C.valueAt(i2)).m20360e();
        }
        return i;
    }

    /* renamed from: n */
    public final long m9814n() {
        int size = this.f26669C.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((hw2) this.f26669C.valueAt(i)).m20358g());
        }
        return j;
    }

    /* renamed from: o */
    public final void m9813o(pv2 pv2Var) {
        long j;
        if (this.f26682P == -1) {
            j = pv2Var.f23409i;
            this.f26682P = j;
        }
    }

    /* renamed from: p */
    public final void m9812p() {
        us2 us2Var;
        pv2 pv2Var = new pv2(this, this.f26689p, this.f26690q, this.f26697x, this.f26698y);
        if (this.f26673G) {
            az2.m26583e(m9811q());
            long j = this.f26678L;
            if (j != -9223372036854775807L && this.f26684R >= j) {
                this.f26686T = true;
                this.f26684R = -9223372036854775807L;
                return;
            }
            pv2Var.m13018b(this.f26671E.mo7742a(this.f26684R), this.f26684R);
            this.f26684R = -9223372036854775807L;
        }
        this.f26685S = m9815m();
        int i = this.f26691r;
        if (i == -1) {
            i = (this.f26673G && this.f26682P == -1 && ((us2Var = this.f26671E) == null || us2Var.zza() == -9223372036854775807L)) ? 6 : 3;
        }
        this.f26696w.m3076a(pv2Var, this, i);
    }

    /* renamed from: q */
    public final boolean m9811q() {
        return this.f26684R != -9223372036854775807L;
    }

    /* renamed from: r */
    public final int m9810r(int i, cq2 cq2Var, bs2 bs2Var, boolean z) {
        if (this.f26675I || m9811q()) {
            return -3;
        }
        return ((hw2) this.f26669C.valueAt(i)).m20359f(cq2Var, bs2Var, z, this.f26686T, this.f26683Q);
    }

    /* renamed from: z */
    public final void m9802z() {
        this.f26696w.m3070g(Integer.MIN_VALUE);
    }

    @Override // com.daaw.wv2, com.daaw.kw2
    public final long zza() {
        if (this.f26676J == 0) {
            return Long.MIN_VALUE;
        }
        return zzg();
    }

    @Override // com.daaw.os2
    public final void zzb() {
        this.f26672F = true;
        this.f26668B.post(this.f26699z);
    }

    @Override // com.daaw.wv2
    public final long zzg() {
        long m9814n;
        if (this.f26686T) {
            return Long.MIN_VALUE;
        }
        if (m9811q()) {
            return this.f26684R;
        }
        if (this.f26681O) {
            int size = this.f26669C.size();
            m9814n = Long.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                if (this.f26680N[i]) {
                    m9814n = Math.min(m9814n, ((hw2) this.f26669C.valueAt(i)).m20358g());
                }
            }
        } else {
            m9814n = m9814n();
        }
        return m9814n == Long.MIN_VALUE ? this.f26683Q : m9814n;
    }

    @Override // com.daaw.wv2
    public final long zzh() {
        if (this.f26675I) {
            this.f26675I = false;
            return this.f26683Q;
        }
        return -9223372036854775807L;
    }

    @Override // com.daaw.wv2
    public final rw2 zzn() {
        return this.f26677K;
    }

    @Override // com.daaw.wv2
    public final void zzs() {
        this.f26696w.m3070g(Integer.MIN_VALUE);
    }
}
