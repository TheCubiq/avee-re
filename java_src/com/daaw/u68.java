package com.daaw;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzbp;
import com.google.android.gms.internal.ads.zzbq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class u68 implements Handler.Callback, mr8, yv8, k88, fr7, t88 {

    /* renamed from: A */
    public final d34 f28594A;

    /* renamed from: B */
    public final long f28595B;

    /* renamed from: C */
    public final is7 f28596C;

    /* renamed from: D */
    public final ArrayList f28597D;

    /* renamed from: E */
    public final xp4 f28598E;

    /* renamed from: F */
    public final s78 f28599F;

    /* renamed from: G */
    public final n88 f28600G;

    /* renamed from: H */
    public final long f28601H;

    /* renamed from: I */
    public aa8 f28602I;

    /* renamed from: J */
    public q88 f28603J;

    /* renamed from: K */
    public o68 f28604K;

    /* renamed from: L */
    public boolean f28605L;

    /* renamed from: N */
    public boolean f28607N;

    /* renamed from: O */
    public boolean f28608O;

    /* renamed from: P */
    public boolean f28609P;

    /* renamed from: S */
    public boolean f28612S;

    /* renamed from: T */
    public boolean f28613T;

    /* renamed from: U */
    public boolean f28614U;

    /* renamed from: V */
    public int f28615V;

    /* renamed from: W */
    public r68 f28616W;

    /* renamed from: X */
    public long f28617X;

    /* renamed from: Y */
    public int f28618Y;

    /* renamed from: Z */
    public boolean f28619Z;

    /* renamed from: a0 */
    public vu7 f28620a0;

    /* renamed from: c0 */
    public final x38 f28622c0;

    /* renamed from: d0 */
    public final zo7 f28623d0;

    /* renamed from: p */
    public final i98[] f28624p;

    /* renamed from: q */
    public final Set f28625q;

    /* renamed from: r */
    public final l98[] f28626r;

    /* renamed from: s */
    public final zv8 f28627s;

    /* renamed from: t */
    public final fw8 f28628t;

    /* renamed from: u */
    public final d78 f28629u;

    /* renamed from: v */
    public final mw8 f28630v;

    /* renamed from: w */
    public final vz4 f28631w;

    /* renamed from: x */
    public final HandlerThread f28632x;

    /* renamed from: y */
    public final Looper f28633y;

    /* renamed from: z */
    public final i54 f28634z;

    /* renamed from: Q */
    public int f28610Q = 0;

    /* renamed from: R */
    public boolean f28611R = false;

    /* renamed from: M */
    public boolean f28606M = false;

    /* renamed from: b0 */
    public long f28621b0 = -9223372036854775807L;

    public u68(i98[] i98VarArr, zv8 zv8Var, fw8 fw8Var, d78 d78Var, mw8 mw8Var, int i, boolean z, fb8 fb8Var, aa8 aa8Var, zo7 zo7Var, long j, boolean z2, Looper looper, xp4 xp4Var, x38 x38Var, lh8 lh8Var, byte[] bArr) {
        this.f28622c0 = x38Var;
        this.f28624p = i98VarArr;
        this.f28627s = zv8Var;
        this.f28628t = fw8Var;
        this.f28629u = d78Var;
        this.f28630v = mw8Var;
        this.f28602I = aa8Var;
        this.f28623d0 = zo7Var;
        this.f28601H = j;
        this.f28598E = xp4Var;
        this.f28595B = d78Var.zza();
        d78Var.zzf();
        q88 m12701g = q88.m12701g(fw8Var);
        this.f28603J = m12701g;
        this.f28604K = new o68(m12701g);
        int length = i98VarArr.length;
        this.f28626r = new l98[2];
        for (int i2 = 0; i2 < 2; i2++) {
            i98VarArr[i2].mo15108k(i2, lh8Var);
            this.f28626r[i2] = i98VarArr[i2].zzj();
        }
        this.f28596C = new is7(this, xp4Var);
        this.f28597D = new ArrayList();
        this.f28625q = Collections.newSetFromMap(new IdentityHashMap());
        this.f28634z = new i54();
        this.f28594A = new d34();
        zv8Var.m1829g(this, mw8Var);
        this.f28619Z = true;
        Handler handler = new Handler(looper);
        this.f28599F = new s78(fb8Var, handler);
        this.f28600G = new n88(this, fb8Var, handler, lh8Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f28632x = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f28633y = looper2;
        this.f28631w = xp4Var.mo4854a(looper2, this);
    }

    /* renamed from: G */
    public static boolean m8538G(i98 i98Var) {
        return i98Var.mo15107m() != 0;
    }

    /* renamed from: I */
    public static boolean m8536I(q88 q88Var, d34 d34Var) {
        pr8 pr8Var = q88Var.f23760b;
        l64 l64Var = q88Var.f23759a;
        return l64Var.m17121o() || l64Var.mo13467n(pr8Var.f18805a, d34Var).f6453f;
    }

    /* renamed from: L */
    public static f92[] m8533L(tv8 tv8Var) {
        int zzc = tv8Var != null ? tv8Var.zzc() : 0;
        f92[] f92VarArr = new f92[zzc];
        for (int i = 0; i < zzc; i++) {
            f92VarArr[i] = tv8Var.mo4482b(i);
        }
        return f92VarArr;
    }

    /* renamed from: M */
    public static final void m8532M(z88 z88Var) {
        z88Var.m2600j();
        try {
            z88Var.m2607c().mo6337h(z88Var.m2609a(), z88Var.m2603g());
        } finally {
            z88Var.m2602h(true);
        }
    }

    /* renamed from: N */
    public static final void m8531N(i98 i98Var) {
        if (i98Var.mo15107m() == 2) {
            i98Var.mo15112d();
        }
    }

    /* renamed from: O */
    public static final void m8530O(i98 i98Var, long j) {
        i98Var.zzC();
        if (i98Var instanceof eu8) {
            eu8 eu8Var = (eu8) i98Var;
            throw null;
        }
    }

    /* renamed from: S */
    public static Object m8526S(i54 i54Var, d34 d34Var, int i, boolean z, Object obj, l64 l64Var, l64 l64Var2) {
        int mo4511a = l64Var.mo4511a(obj);
        int mo4510b = l64Var.mo4510b();
        int i2 = 0;
        int i3 = mo4511a;
        int i4 = -1;
        while (true) {
            if (i2 >= mo4510b || i4 != -1) {
                break;
            }
            i3 = l64Var.m17124i(i3, d34Var, i54Var, i, z);
            if (i3 == -1) {
                i4 = -1;
                break;
            }
            i4 = l64Var2.mo4511a(l64Var.mo4508f(i3));
            i2++;
        }
        if (i4 == -1) {
            return null;
        }
        return l64Var2.mo4508f(i4);
    }

    /* renamed from: a0 */
    public static final /* synthetic */ void m8517a0(z88 z88Var) {
        try {
            m8532M(z88Var);
        } catch (vu7 e) {
            s95.m10495c("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    /* renamed from: h0 */
    public static Pair m8503h0(l64 l64Var, r68 r68Var, boolean z, int i, boolean z2, i54 i54Var, d34 d34Var) {
        Pair m17123l;
        int i2;
        long j;
        l64 l64Var2 = r68Var.f24902a;
        if (l64Var.m17121o()) {
            return null;
        }
        l64 l64Var3 = true == l64Var2.m17121o() ? l64Var : l64Var2;
        try {
            m17123l = l64Var3.m17123l(i54Var, d34Var, r68Var.f24903b, r68Var.f24904c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (l64Var.equals(l64Var3)) {
            return m17123l;
        }
        if (l64Var.mo4511a(m17123l.first) == -1) {
            Object m8526S = m8526S(i54Var, d34Var, i, z2, m17123l.first, l64Var3, l64Var);
            if (m8526S != null) {
                i2 = l64Var.mo13467n(m8526S, d34Var).f6450c;
                j = -9223372036854775807L;
            }
            return null;
        } else if (!l64Var3.mo13467n(m17123l.first, d34Var).f6453f || l64Var3.mo1923e(d34Var.f6450c, i54Var, 0L).f13279m != l64Var3.mo4511a(m17123l.first)) {
            return m17123l;
        } else {
            i2 = l64Var.mo13467n(m17123l.first, d34Var).f6450c;
            j = r68Var.f24904c;
        }
        return l64Var.m17123l(i54Var, d34Var, i2, j);
    }

    /* renamed from: A */
    public final void m8544A() {
        j78 m10581f = this.f28599F.m10581f();
        boolean z = this.f28609P || (m10581f != null && m10581f.f14502a.zzp());
        q88 q88Var = this.f28603J;
        if (z != q88Var.f23765g) {
            this.f28603J = new q88(q88Var.f23759a, q88Var.f23760b, q88Var.f23761c, q88Var.f23762d, q88Var.f23763e, q88Var.f23764f, z, q88Var.f23766h, q88Var.f23767i, q88Var.f23768j, q88Var.f23769k, q88Var.f23770l, q88Var.f23771m, q88Var.f23772n, q88Var.f23774p, q88Var.f23775q, q88Var.f23776r, q88Var.f23773o);
        }
    }

    /* renamed from: B */
    public final void m8543B(au8 au8Var, fw8 fw8Var) {
        this.f28629u.mo7405b(this.f28624p, au8Var, fw8Var.f10042c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
        if (r5 > 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        r7 = (com.daaw.e68) r11.f28597D.get(r5 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
        if (r7 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
        if (r0 < 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a0, code lost:
        if (r0 != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a6, code lost:
        if (r3 >= 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00aa, code lost:
        if (r5 <= 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b3, code lost:
        if (r5 >= r11.f28597D.size()) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b5, code lost:
        r0 = (com.daaw.e68) r11.f28597D.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bd, code lost:
        r11.f28618Y = r5;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x009b -> B:30:0x009c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00aa -> B:28:0x0090). Please submit an issue!!! */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8542C() {
        j78 m10580g = this.f28599F.m10580g();
        if (m10580g == null) {
            return;
        }
        long zzd = m10580g.f14505d ? m10580g.f14502a.zzd() : -9223372036854775807L;
        if (zzd != -9223372036854775807L) {
            m8493q(zzd);
            if (zzd != this.f28603J.f23776r) {
                q88 q88Var = this.f28603J;
                this.f28603J = m8501i0(q88Var.f23760b, zzd, q88Var.f23761c, zzd, true, 5);
            }
        } else {
            long m19445a = this.f28596C.m19445a(m10580g != this.f28599F.m10579h());
            this.f28617X = m19445a;
            long m18755e = m19445a - m10580g.m18755e();
            long j = this.f28603J.f23776r;
            if (!this.f28597D.isEmpty() && !this.f28603J.f23760b.m16079b()) {
                if (this.f28619Z) {
                    j--;
                    this.f28619Z = false;
                }
                q88 q88Var2 = this.f28603J;
                int mo4511a = q88Var2.f23759a.mo4511a(q88Var2.f23760b.f18805a);
                int min = Math.min(this.f28618Y, this.f28597D.size());
            }
            this.f28603J.f23776r = m18755e;
        }
        this.f28603J.f23774p = this.f28599F.m10581f().m18757c();
        this.f28603J.f23775q = m8513c0();
        q88 q88Var3 = this.f28603J;
        if (q88Var3.f23770l && q88Var3.f23763e == 3 && m8534K(q88Var3.f23759a, q88Var3.f23760b)) {
            q88 q88Var4 = this.f28603J;
            if (q88Var4.f23772n.f23131a == 1.0f) {
                float m2029a = this.f28623d0.m2029a(m8515b0(q88Var4.f23759a, q88Var4.f23760b.f18805a, q88Var4.f23776r), m8513c0());
                if (this.f28596C.zzc().f23131a != m2029a) {
                    this.f28596C.mo19439l(new pp3(m2029a, this.f28603J.f23772n.f23132b));
                    m8498l(this.f28603J.f23772n, this.f28596C.zzc().f23131a, false, false);
                }
            }
        }
    }

    /* renamed from: D */
    public final void m8541D(l64 l64Var, pr8 pr8Var, l64 l64Var2, pr8 pr8Var2, long j) {
        if (!m8534K(l64Var, pr8Var)) {
            pp3 pp3Var = pr8Var.m16079b() ? pp3.f23129d : this.f28603J.f23772n;
            if (this.f28596C.zzc().equals(pp3Var)) {
                return;
            }
            this.f28596C.mo19439l(pp3Var);
            return;
        }
        l64Var.mo1923e(l64Var.mo13467n(pr8Var.f18805a, this.f28594A).f6450c, this.f28634z, 0L);
        zo7 zo7Var = this.f28623d0;
        ht2 ht2Var = this.f28634z.f13275i;
        int i = it5.f13991a;
        zo7Var.m2026d(ht2Var);
        if (j != -9223372036854775807L) {
            this.f28623d0.m2025e(m8515b0(l64Var, pr8Var.f18805a, j));
            return;
        }
        if (it5.m19376t(!l64Var2.m17121o() ? l64Var2.mo1923e(l64Var2.mo13467n(pr8Var2.f18805a, this.f28594A).f6450c, this.f28634z, 0L).f13267a : null, this.f28634z.f13267a)) {
            return;
        }
        this.f28623d0.m2025e(-9223372036854775807L);
    }

    /* renamed from: E */
    public final synchronized void m8540E(iz6 iz6Var, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!Boolean.valueOf(((m58) iz6Var).f18471p.f28605L).booleanValue() && j > 0) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: F */
    public final boolean m8539F() {
        j78 m10581f = this.f28599F.m10581f();
        return (m10581f == null || m10581f.m18756d() == Long.MIN_VALUE) ? false : true;
    }

    /* renamed from: H */
    public final boolean m8537H() {
        j78 m10580g = this.f28599F.m10580g();
        long j = m10580g.f14507f.f18577e;
        if (m10580g.f14505d) {
            return j == -9223372036854775807L || this.f28603J.f23776r < j || !m8535J();
        }
        return false;
    }

    /* renamed from: J */
    public final boolean m8535J() {
        q88 q88Var = this.f28603J;
        return q88Var.f23770l && q88Var.f23771m == 0;
    }

    /* renamed from: K */
    public final boolean m8534K(l64 l64Var, pr8 pr8Var) {
        if (!pr8Var.m16079b() && !l64Var.m17121o()) {
            l64Var.mo1923e(l64Var.mo13467n(pr8Var.f18805a, this.f28594A).f6450c, this.f28634z, 0L);
            if (this.f28634z.m20119b()) {
                i54 i54Var = this.f28634z;
                if (i54Var.f13273g && i54Var.f13270d != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: P */
    public final Looper m8529P() {
        return this.f28633y;
    }

    /* renamed from: R */
    public final /* synthetic */ Boolean m8527R() {
        return Boolean.valueOf(this.f28605L);
    }

    /* renamed from: U */
    public final void m8524U() {
        this.f28631w.mo5894a(0).zza();
    }

    /* renamed from: V */
    public final void m8523V(l64 l64Var, int i, long j) {
        this.f28631w.mo5892c(3, new r68(l64Var, i, j)).zza();
    }

    /* renamed from: W */
    public final void m8522W(boolean z, int i) {
        this.f28631w.mo5889f(1, z ? 1 : 0, i).zza();
    }

    /* renamed from: X */
    public final void m8521X() {
        this.f28631w.mo5894a(6).zza();
    }

    /* renamed from: Y */
    public final synchronized boolean m8520Y() {
        if (!this.f28605L && this.f28632x.isAlive()) {
            this.f28631w.mo5886i(7);
            m8540E(new m58(this), this.f28601H);
            return this.f28605L;
        }
        return true;
    }

    /* renamed from: Z */
    public final void m8519Z(List list, int i, long j, wt8 wt8Var) {
        this.f28631w.mo5892c(17, new y58(list, wt8Var, i, j, null, null)).zza();
    }

    @Override // com.daaw.nt8
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8518a(vt8 vt8Var) {
        this.f28631w.mo5892c(9, (nr8) vt8Var).zza();
    }

    @Override // com.daaw.fr7
    /* renamed from: b */
    public final void mo8516b(pp3 pp3Var) {
        this.f28631w.mo5892c(16, pp3Var).zza();
    }

    /* renamed from: b0 */
    public final long m8515b0(l64 l64Var, Object obj, long j) {
        l64Var.mo1923e(l64Var.mo13467n(obj, this.f28594A).f6450c, this.f28634z, 0L);
        i54 i54Var = this.f28634z;
        if (i54Var.f13270d != -9223372036854775807L && i54Var.m20119b()) {
            i54 i54Var2 = this.f28634z;
            if (i54Var2.f13273g) {
                return it5.m19394f0(it5.m19398d0(i54Var2.f13271e) - this.f28634z.f13270d) - j;
            }
        }
        return -9223372036854775807L;
    }

    @Override // com.daaw.t88
    /* renamed from: c */
    public final synchronized void mo8514c(z88 z88Var) {
        if (!this.f28605L && this.f28632x.isAlive()) {
            this.f28631w.mo5892c(14, z88Var).zza();
            return;
        }
        s95.m10493e("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        z88Var.m2602h(false);
    }

    /* renamed from: c0 */
    public final long m8513c0() {
        return m8511d0(this.f28603J.f23774p);
    }

    @Override // com.daaw.mr8
    /* renamed from: d */
    public final void mo8512d(nr8 nr8Var) {
        this.f28631w.mo5892c(8, nr8Var).zza();
    }

    /* renamed from: d0 */
    public final long m8511d0(long j) {
        j78 m10581f = this.f28599F.m10581f();
        if (m10581f == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.f28617X - m10581f.m18755e()));
    }

    /* renamed from: e */
    public final void m8510e(i98 i98Var) {
        if (m8538G(i98Var)) {
            this.f28596C.m19444b(i98Var);
            m8531N(i98Var);
            i98Var.zzn();
            this.f28615V--;
        }
    }

    /* renamed from: e0 */
    public final long m8509e0(pr8 pr8Var, long j, boolean z) {
        return m8507f0(pr8Var, j, this.f28599F.m10580g() != this.f28599F.m10579h(), z);
    }

    /* renamed from: f */
    public final void m8508f() {
        int length = this.f28624p.length;
        m8506g(new boolean[2]);
    }

    /* renamed from: f0 */
    public final long m8507f0(pr8 pr8Var, long j, boolean z, boolean z2) {
        m8484z();
        this.f28608O = false;
        if (z2 || this.f28603J.f23763e == 3) {
            m8487w(2);
        }
        j78 m10580g = this.f28599F.m10580g();
        j78 j78Var = m10580g;
        while (j78Var != null && !pr8Var.equals(j78Var.f14507f.f18573a)) {
            j78Var = j78Var.m18753g();
        }
        if (z || m10580g != j78Var || (j78Var != null && j78Var.m18755e() + j < 0)) {
            i98[] i98VarArr = this.f28624p;
            int length = i98VarArr.length;
            for (int i = 0; i < 2; i++) {
                m8510e(i98VarArr[i]);
            }
            if (j78Var != null) {
                while (this.f28599F.m10580g() != j78Var) {
                    this.f28599F.m10583d();
                }
                this.f28599F.m10571p(j78Var);
                j78Var.m18744p(1000000000000L);
                m8508f();
            }
        }
        s78 s78Var = this.f28599F;
        if (j78Var != null) {
            s78Var.m10571p(j78Var);
            if (!j78Var.f14505d) {
                j78Var.f14507f = j78Var.f14507f.m16184b(j);
            } else if (j78Var.f14506e) {
                j = j78Var.f14502a.mo3304b(j);
                j78Var.f14502a.mo3301e(j - this.f28595B, false);
            }
            m8493q(j);
            m8497m();
        } else {
            s78Var.m10575l();
            m8493q(j);
        }
        m8502i(false);
        this.f28631w.mo5886i(2);
        return j;
    }

    /* renamed from: g */
    public final void m8506g(boolean[] zArr) {
        j78 m10579h = this.f28599F.m10579h();
        fw8 m18751i = m10579h.m18751i();
        int i = 0;
        while (true) {
            int length = this.f28624p.length;
            if (i >= 2) {
                break;
            }
            if (!m18751i.m22181b(i) && this.f28625q.remove(this.f28624p[i])) {
                this.f28624p[i].zzA();
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            int length2 = this.f28624p.length;
            if (i2 >= 2) {
                m10579h.f14508g = true;
                return;
            }
            if (m18751i.m22181b(i2)) {
                boolean z = zArr[i2];
                i98 i98Var = this.f28624p[i2];
                if (!m8538G(i98Var)) {
                    j78 m10579h2 = this.f28599F.m10579h();
                    boolean z2 = m10579h2 == this.f28599F.m10580g();
                    fw8 m18751i2 = m10579h2.m18751i();
                    x98 x98Var = m18751i2.f10041b[i2];
                    f92[] m8533L = m8533L(m18751i2.f10042c[i2]);
                    boolean z3 = m8535J() && this.f28603J.f23763e == 3;
                    boolean z4 = !z && z3;
                    this.f28615V++;
                    this.f28625q.add(i98Var);
                    i98Var.mo15106n(x98Var, m8533L, m10579h2.f14504c[i2], this.f28617X, z4, z2, m10579h2.m18754f(), m10579h2.m18755e());
                    i98Var.mo6337h(11, new s58(this));
                    this.f28596C.m19443c(i98Var);
                    if (z3) {
                        i98Var.zzE();
                    }
                }
            }
            i2++;
        }
    }

    /* renamed from: g0 */
    public final Pair m8505g0(l64 l64Var) {
        long j = 0;
        if (l64Var.m17121o()) {
            return Pair.create(q88.m12700h(), 0L);
        }
        Pair m17123l = l64Var.m17123l(this.f28634z, this.f28594A, l64Var.mo4800g(this.f28611R), -9223372036854775807L);
        pr8 m10576k = this.f28599F.m10576k(l64Var, m17123l.first, 0L);
        long longValue = ((Long) m17123l.second).longValue();
        if (m10576k.m16079b()) {
            l64Var.mo13467n(m10576k.f18805a, this.f28594A);
            if (m10576k.f18807c == this.f28594A.m24724e(m10576k.f18806b)) {
                this.f28594A.m24720i();
            }
        } else {
            j = longValue;
        }
        return Pair.create(m10576k, Long.valueOf(j));
    }

    /* renamed from: h */
    public final void m8504h(IOException iOException, int i) {
        vu7 m6772c = vu7.m6772c(iOException, i);
        j78 m10580g = this.f28599F.m10580g();
        if (m10580g != null) {
            m6772c = m6772c.m6774a(m10580g.f14507f.f18573a);
        }
        s95.m10495c("ExoPlayerImplInternal", "Playback error", m6772c);
        m8485y(false, false);
        this.f28603J = this.f28603J.m12704d(m6772c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:465:0x08f9, code lost:
        if (r53.f28629u.mo7406a(m8513c0(), r53.f28596C.zzc().f23131a, r53.f28608O, r31) == false) goto L505;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x091c, code lost:
        if (r2 == false) goto L512;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:326:0x06c1 A[Catch: RuntimeException -> 0x0aaa, IOException -> 0x0ad5, s56 -> 0x0ada, dl3 -> 0x0adf, fn8 -> 0x0af6, vu7 -> 0x0aff, TryCatch #9 {dl3 -> 0x0adf, fn8 -> 0x0af6, s56 -> 0x0ada, vu7 -> 0x0aff, IOException -> 0x0ad5, RuntimeException -> 0x0aaa, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001b, B:12:0x0022, B:14:0x0026, B:16:0x002a, B:18:0x0030, B:19:0x0037, B:23:0x003e, B:25:0x0047, B:27:0x0055, B:28:0x0058, B:29:0x005d, B:30:0x0068, B:31:0x0077, B:32:0x007c, B:33:0x0090, B:34:0x00a2, B:36:0x00b1, B:37:0x00b5, B:38:0x00c2, B:40:0x00d1, B:41:0x00ed, B:42:0x00fd, B:43:0x0106, B:45:0x0118, B:46:0x0124, B:47:0x0134, B:48:0x013d, B:52:0x0144, B:54:0x014c, B:56:0x0150, B:58:0x0156, B:60:0x015e, B:62:0x0166, B:63:0x0169, B:65:0x016e, B:72:0x017b, B:73:0x017c, B:77:0x0183, B:79:0x0191, B:80:0x0196, B:82:0x01a6, B:83:0x01ab, B:85:0x01c2, B:87:0x01c6, B:89:0x01d4, B:93:0x01de, B:95:0x01e3, B:97:0x01e9, B:101:0x01f1, B:103:0x01f9, B:105:0x021f, B:109:0x0228, B:111:0x024a, B:112:0x024d, B:113:0x0253, B:115:0x0258, B:117:0x0268, B:119:0x026e, B:120:0x0272, B:122:0x0276, B:123:0x027b, B:124:0x0280, B:128:0x02a1, B:130:0x02ac, B:125:0x0284, B:127:0x028e, B:131:0x02b9, B:133:0x02c5, B:134:0x02cc, B:135:0x02d1, B:137:0x02dd, B:139:0x0305, B:140:0x0326, B:141:0x0338, B:148:0x0343, B:149:0x0344, B:150:0x034b, B:151:0x0353, B:152:0x0368, B:154:0x0394, B:219:0x04b6, B:204:0x0482, B:203:0x047e, B:228:0x04cd, B:229:0x04dd, B:155:0x03b7, B:159:0x03ca, B:161:0x03da, B:163:0x03f1, B:165:0x03fb, B:230:0x04de, B:232:0x04f3, B:235:0x04fd, B:237:0x050c, B:239:0x0518, B:241:0x0547, B:242:0x054c, B:243:0x0550, B:245:0x0554, B:247:0x0561, B:316:0x069a, B:318:0x06a2, B:320:0x06aa, B:323:0x06af, B:324:0x06bb, B:326:0x06c1, B:328:0x06c9, B:332:0x06da, B:334:0x06e0, B:335:0x06fa, B:337:0x0700, B:339:0x0705, B:341:0x070a, B:343:0x070e, B:345:0x0714, B:347:0x0718, B:349:0x0720, B:351:0x0726, B:353:0x0730, B:356:0x0736, B:357:0x0739, B:359:0x0742, B:361:0x0754, B:363:0x075c, B:365:0x0764, B:369:0x076d, B:372:0x0798, B:377:0x07a4, B:379:0x07b0, B:380:0x07b5, B:382:0x07c5, B:383:0x07db, B:385:0x07e1, B:418:0x0832, B:388:0x07ea, B:390:0x07f1, B:394:0x07fa, B:399:0x0809, B:405:0x0816, B:407:0x081c, B:417:0x082f, B:420:0x0841, B:422:0x0847, B:426:0x0854, B:428:0x085c, B:430:0x0860, B:431:0x086b, B:433:0x0871, B:434:0x0875, B:486:0x094f, B:489:0x0957, B:491:0x095c, B:493:0x0964, B:495:0x0972, B:496:0x0979, B:497:0x097d, B:499:0x0983, B:501:0x098c, B:503:0x0992, B:505:0x099d, B:506:0x09a1, B:513:0x09c0, B:515:0x09c6, B:519:0x09cf, B:521:0x09d3, B:526:0x09dc, B:528:0x09e2, B:530:0x0a3e, B:532:0x0a43, B:541:0x0a54, B:543:0x0a58, B:544:0x0a60, B:545:0x0a67, B:507:0x09a4, B:510:0x09b2, B:511:0x09b9, B:435:0x087a, B:437:0x0881, B:439:0x0885, B:466:0x08fb, B:468:0x0907, B:444:0x0891, B:446:0x0895, B:448:0x08a7, B:450:0x08b5, B:452:0x08c1, B:456:0x08ca, B:458:0x08d4, B:464:0x08df, B:469:0x090b, B:471:0x0911, B:473:0x0915, B:477:0x091e, B:479:0x092c, B:481:0x0934, B:483:0x093e, B:484:0x0943, B:485:0x0948, B:419:0x083a, B:250:0x056e, B:252:0x0574, B:255:0x057a, B:258:0x0585, B:260:0x058b, B:263:0x0599, B:265:0x059f, B:266:0x05a7, B:267:0x05aa, B:269:0x05b2, B:271:0x05c0, B:273:0x05f3, B:275:0x05fd, B:278:0x0608, B:280:0x0610, B:281:0x0613, B:283:0x0617, B:285:0x061d, B:287:0x0627, B:289:0x0631, B:291:0x0642, B:293:0x0648, B:294:0x0653, B:295:0x0656, B:297:0x065f, B:300:0x0664, B:302:0x066a, B:304:0x0672, B:306:0x0678, B:308:0x067e, B:312:0x068c, B:314:0x0694, B:315:0x0697, B:246:0x055e, B:546:0x0a6c, B:550:0x0a73, B:551:0x0a7b, B:555:0x0a99), top: B:615:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0736 A[Catch: RuntimeException -> 0x0aaa, IOException -> 0x0ad5, s56 -> 0x0ada, dl3 -> 0x0adf, fn8 -> 0x0af6, vu7 -> 0x0aff, TryCatch #9 {dl3 -> 0x0adf, fn8 -> 0x0af6, s56 -> 0x0ada, vu7 -> 0x0aff, IOException -> 0x0ad5, RuntimeException -> 0x0aaa, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001b, B:12:0x0022, B:14:0x0026, B:16:0x002a, B:18:0x0030, B:19:0x0037, B:23:0x003e, B:25:0x0047, B:27:0x0055, B:28:0x0058, B:29:0x005d, B:30:0x0068, B:31:0x0077, B:32:0x007c, B:33:0x0090, B:34:0x00a2, B:36:0x00b1, B:37:0x00b5, B:38:0x00c2, B:40:0x00d1, B:41:0x00ed, B:42:0x00fd, B:43:0x0106, B:45:0x0118, B:46:0x0124, B:47:0x0134, B:48:0x013d, B:52:0x0144, B:54:0x014c, B:56:0x0150, B:58:0x0156, B:60:0x015e, B:62:0x0166, B:63:0x0169, B:65:0x016e, B:72:0x017b, B:73:0x017c, B:77:0x0183, B:79:0x0191, B:80:0x0196, B:82:0x01a6, B:83:0x01ab, B:85:0x01c2, B:87:0x01c6, B:89:0x01d4, B:93:0x01de, B:95:0x01e3, B:97:0x01e9, B:101:0x01f1, B:103:0x01f9, B:105:0x021f, B:109:0x0228, B:111:0x024a, B:112:0x024d, B:113:0x0253, B:115:0x0258, B:117:0x0268, B:119:0x026e, B:120:0x0272, B:122:0x0276, B:123:0x027b, B:124:0x0280, B:128:0x02a1, B:130:0x02ac, B:125:0x0284, B:127:0x028e, B:131:0x02b9, B:133:0x02c5, B:134:0x02cc, B:135:0x02d1, B:137:0x02dd, B:139:0x0305, B:140:0x0326, B:141:0x0338, B:148:0x0343, B:149:0x0344, B:150:0x034b, B:151:0x0353, B:152:0x0368, B:154:0x0394, B:219:0x04b6, B:204:0x0482, B:203:0x047e, B:228:0x04cd, B:229:0x04dd, B:155:0x03b7, B:159:0x03ca, B:161:0x03da, B:163:0x03f1, B:165:0x03fb, B:230:0x04de, B:232:0x04f3, B:235:0x04fd, B:237:0x050c, B:239:0x0518, B:241:0x0547, B:242:0x054c, B:243:0x0550, B:245:0x0554, B:247:0x0561, B:316:0x069a, B:318:0x06a2, B:320:0x06aa, B:323:0x06af, B:324:0x06bb, B:326:0x06c1, B:328:0x06c9, B:332:0x06da, B:334:0x06e0, B:335:0x06fa, B:337:0x0700, B:339:0x0705, B:341:0x070a, B:343:0x070e, B:345:0x0714, B:347:0x0718, B:349:0x0720, B:351:0x0726, B:353:0x0730, B:356:0x0736, B:357:0x0739, B:359:0x0742, B:361:0x0754, B:363:0x075c, B:365:0x0764, B:369:0x076d, B:372:0x0798, B:377:0x07a4, B:379:0x07b0, B:380:0x07b5, B:382:0x07c5, B:383:0x07db, B:385:0x07e1, B:418:0x0832, B:388:0x07ea, B:390:0x07f1, B:394:0x07fa, B:399:0x0809, B:405:0x0816, B:407:0x081c, B:417:0x082f, B:420:0x0841, B:422:0x0847, B:426:0x0854, B:428:0x085c, B:430:0x0860, B:431:0x086b, B:433:0x0871, B:434:0x0875, B:486:0x094f, B:489:0x0957, B:491:0x095c, B:493:0x0964, B:495:0x0972, B:496:0x0979, B:497:0x097d, B:499:0x0983, B:501:0x098c, B:503:0x0992, B:505:0x099d, B:506:0x09a1, B:513:0x09c0, B:515:0x09c6, B:519:0x09cf, B:521:0x09d3, B:526:0x09dc, B:528:0x09e2, B:530:0x0a3e, B:532:0x0a43, B:541:0x0a54, B:543:0x0a58, B:544:0x0a60, B:545:0x0a67, B:507:0x09a4, B:510:0x09b2, B:511:0x09b9, B:435:0x087a, B:437:0x0881, B:439:0x0885, B:466:0x08fb, B:468:0x0907, B:444:0x0891, B:446:0x0895, B:448:0x08a7, B:450:0x08b5, B:452:0x08c1, B:456:0x08ca, B:458:0x08d4, B:464:0x08df, B:469:0x090b, B:471:0x0911, B:473:0x0915, B:477:0x091e, B:479:0x092c, B:481:0x0934, B:483:0x093e, B:484:0x0943, B:485:0x0948, B:419:0x083a, B:250:0x056e, B:252:0x0574, B:255:0x057a, B:258:0x0585, B:260:0x058b, B:263:0x0599, B:265:0x059f, B:266:0x05a7, B:267:0x05aa, B:269:0x05b2, B:271:0x05c0, B:273:0x05f3, B:275:0x05fd, B:278:0x0608, B:280:0x0610, B:281:0x0613, B:283:0x0617, B:285:0x061d, B:287:0x0627, B:289:0x0631, B:291:0x0642, B:293:0x0648, B:294:0x0653, B:295:0x0656, B:297:0x065f, B:300:0x0664, B:302:0x066a, B:304:0x0672, B:306:0x0678, B:308:0x067e, B:312:0x068c, B:314:0x0694, B:315:0x0697, B:246:0x055e, B:546:0x0a6c, B:550:0x0a73, B:551:0x0a7b, B:555:0x0a99), top: B:615:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0754 A[Catch: RuntimeException -> 0x0aaa, IOException -> 0x0ad5, s56 -> 0x0ada, dl3 -> 0x0adf, fn8 -> 0x0af6, vu7 -> 0x0aff, TryCatch #9 {dl3 -> 0x0adf, fn8 -> 0x0af6, s56 -> 0x0ada, vu7 -> 0x0aff, IOException -> 0x0ad5, RuntimeException -> 0x0aaa, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001b, B:12:0x0022, B:14:0x0026, B:16:0x002a, B:18:0x0030, B:19:0x0037, B:23:0x003e, B:25:0x0047, B:27:0x0055, B:28:0x0058, B:29:0x005d, B:30:0x0068, B:31:0x0077, B:32:0x007c, B:33:0x0090, B:34:0x00a2, B:36:0x00b1, B:37:0x00b5, B:38:0x00c2, B:40:0x00d1, B:41:0x00ed, B:42:0x00fd, B:43:0x0106, B:45:0x0118, B:46:0x0124, B:47:0x0134, B:48:0x013d, B:52:0x0144, B:54:0x014c, B:56:0x0150, B:58:0x0156, B:60:0x015e, B:62:0x0166, B:63:0x0169, B:65:0x016e, B:72:0x017b, B:73:0x017c, B:77:0x0183, B:79:0x0191, B:80:0x0196, B:82:0x01a6, B:83:0x01ab, B:85:0x01c2, B:87:0x01c6, B:89:0x01d4, B:93:0x01de, B:95:0x01e3, B:97:0x01e9, B:101:0x01f1, B:103:0x01f9, B:105:0x021f, B:109:0x0228, B:111:0x024a, B:112:0x024d, B:113:0x0253, B:115:0x0258, B:117:0x0268, B:119:0x026e, B:120:0x0272, B:122:0x0276, B:123:0x027b, B:124:0x0280, B:128:0x02a1, B:130:0x02ac, B:125:0x0284, B:127:0x028e, B:131:0x02b9, B:133:0x02c5, B:134:0x02cc, B:135:0x02d1, B:137:0x02dd, B:139:0x0305, B:140:0x0326, B:141:0x0338, B:148:0x0343, B:149:0x0344, B:150:0x034b, B:151:0x0353, B:152:0x0368, B:154:0x0394, B:219:0x04b6, B:204:0x0482, B:203:0x047e, B:228:0x04cd, B:229:0x04dd, B:155:0x03b7, B:159:0x03ca, B:161:0x03da, B:163:0x03f1, B:165:0x03fb, B:230:0x04de, B:232:0x04f3, B:235:0x04fd, B:237:0x050c, B:239:0x0518, B:241:0x0547, B:242:0x054c, B:243:0x0550, B:245:0x0554, B:247:0x0561, B:316:0x069a, B:318:0x06a2, B:320:0x06aa, B:323:0x06af, B:324:0x06bb, B:326:0x06c1, B:328:0x06c9, B:332:0x06da, B:334:0x06e0, B:335:0x06fa, B:337:0x0700, B:339:0x0705, B:341:0x070a, B:343:0x070e, B:345:0x0714, B:347:0x0718, B:349:0x0720, B:351:0x0726, B:353:0x0730, B:356:0x0736, B:357:0x0739, B:359:0x0742, B:361:0x0754, B:363:0x075c, B:365:0x0764, B:369:0x076d, B:372:0x0798, B:377:0x07a4, B:379:0x07b0, B:380:0x07b5, B:382:0x07c5, B:383:0x07db, B:385:0x07e1, B:418:0x0832, B:388:0x07ea, B:390:0x07f1, B:394:0x07fa, B:399:0x0809, B:405:0x0816, B:407:0x081c, B:417:0x082f, B:420:0x0841, B:422:0x0847, B:426:0x0854, B:428:0x085c, B:430:0x0860, B:431:0x086b, B:433:0x0871, B:434:0x0875, B:486:0x094f, B:489:0x0957, B:491:0x095c, B:493:0x0964, B:495:0x0972, B:496:0x0979, B:497:0x097d, B:499:0x0983, B:501:0x098c, B:503:0x0992, B:505:0x099d, B:506:0x09a1, B:513:0x09c0, B:515:0x09c6, B:519:0x09cf, B:521:0x09d3, B:526:0x09dc, B:528:0x09e2, B:530:0x0a3e, B:532:0x0a43, B:541:0x0a54, B:543:0x0a58, B:544:0x0a60, B:545:0x0a67, B:507:0x09a4, B:510:0x09b2, B:511:0x09b9, B:435:0x087a, B:437:0x0881, B:439:0x0885, B:466:0x08fb, B:468:0x0907, B:444:0x0891, B:446:0x0895, B:448:0x08a7, B:450:0x08b5, B:452:0x08c1, B:456:0x08ca, B:458:0x08d4, B:464:0x08df, B:469:0x090b, B:471:0x0911, B:473:0x0915, B:477:0x091e, B:479:0x092c, B:481:0x0934, B:483:0x093e, B:484:0x0943, B:485:0x0948, B:419:0x083a, B:250:0x056e, B:252:0x0574, B:255:0x057a, B:258:0x0585, B:260:0x058b, B:263:0x0599, B:265:0x059f, B:266:0x05a7, B:267:0x05aa, B:269:0x05b2, B:271:0x05c0, B:273:0x05f3, B:275:0x05fd, B:278:0x0608, B:280:0x0610, B:281:0x0613, B:283:0x0617, B:285:0x061d, B:287:0x0627, B:289:0x0631, B:291:0x0642, B:293:0x0648, B:294:0x0653, B:295:0x0656, B:297:0x065f, B:300:0x0664, B:302:0x066a, B:304:0x0672, B:306:0x0678, B:308:0x067e, B:312:0x068c, B:314:0x0694, B:315:0x0697, B:246:0x055e, B:546:0x0a6c, B:550:0x0a73, B:551:0x0a7b, B:555:0x0a99), top: B:615:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x07b0 A[Catch: RuntimeException -> 0x0aaa, IOException -> 0x0ad5, s56 -> 0x0ada, dl3 -> 0x0adf, fn8 -> 0x0af6, vu7 -> 0x0aff, TryCatch #9 {dl3 -> 0x0adf, fn8 -> 0x0af6, s56 -> 0x0ada, vu7 -> 0x0aff, IOException -> 0x0ad5, RuntimeException -> 0x0aaa, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001b, B:12:0x0022, B:14:0x0026, B:16:0x002a, B:18:0x0030, B:19:0x0037, B:23:0x003e, B:25:0x0047, B:27:0x0055, B:28:0x0058, B:29:0x005d, B:30:0x0068, B:31:0x0077, B:32:0x007c, B:33:0x0090, B:34:0x00a2, B:36:0x00b1, B:37:0x00b5, B:38:0x00c2, B:40:0x00d1, B:41:0x00ed, B:42:0x00fd, B:43:0x0106, B:45:0x0118, B:46:0x0124, B:47:0x0134, B:48:0x013d, B:52:0x0144, B:54:0x014c, B:56:0x0150, B:58:0x0156, B:60:0x015e, B:62:0x0166, B:63:0x0169, B:65:0x016e, B:72:0x017b, B:73:0x017c, B:77:0x0183, B:79:0x0191, B:80:0x0196, B:82:0x01a6, B:83:0x01ab, B:85:0x01c2, B:87:0x01c6, B:89:0x01d4, B:93:0x01de, B:95:0x01e3, B:97:0x01e9, B:101:0x01f1, B:103:0x01f9, B:105:0x021f, B:109:0x0228, B:111:0x024a, B:112:0x024d, B:113:0x0253, B:115:0x0258, B:117:0x0268, B:119:0x026e, B:120:0x0272, B:122:0x0276, B:123:0x027b, B:124:0x0280, B:128:0x02a1, B:130:0x02ac, B:125:0x0284, B:127:0x028e, B:131:0x02b9, B:133:0x02c5, B:134:0x02cc, B:135:0x02d1, B:137:0x02dd, B:139:0x0305, B:140:0x0326, B:141:0x0338, B:148:0x0343, B:149:0x0344, B:150:0x034b, B:151:0x0353, B:152:0x0368, B:154:0x0394, B:219:0x04b6, B:204:0x0482, B:203:0x047e, B:228:0x04cd, B:229:0x04dd, B:155:0x03b7, B:159:0x03ca, B:161:0x03da, B:163:0x03f1, B:165:0x03fb, B:230:0x04de, B:232:0x04f3, B:235:0x04fd, B:237:0x050c, B:239:0x0518, B:241:0x0547, B:242:0x054c, B:243:0x0550, B:245:0x0554, B:247:0x0561, B:316:0x069a, B:318:0x06a2, B:320:0x06aa, B:323:0x06af, B:324:0x06bb, B:326:0x06c1, B:328:0x06c9, B:332:0x06da, B:334:0x06e0, B:335:0x06fa, B:337:0x0700, B:339:0x0705, B:341:0x070a, B:343:0x070e, B:345:0x0714, B:347:0x0718, B:349:0x0720, B:351:0x0726, B:353:0x0730, B:356:0x0736, B:357:0x0739, B:359:0x0742, B:361:0x0754, B:363:0x075c, B:365:0x0764, B:369:0x076d, B:372:0x0798, B:377:0x07a4, B:379:0x07b0, B:380:0x07b5, B:382:0x07c5, B:383:0x07db, B:385:0x07e1, B:418:0x0832, B:388:0x07ea, B:390:0x07f1, B:394:0x07fa, B:399:0x0809, B:405:0x0816, B:407:0x081c, B:417:0x082f, B:420:0x0841, B:422:0x0847, B:426:0x0854, B:428:0x085c, B:430:0x0860, B:431:0x086b, B:433:0x0871, B:434:0x0875, B:486:0x094f, B:489:0x0957, B:491:0x095c, B:493:0x0964, B:495:0x0972, B:496:0x0979, B:497:0x097d, B:499:0x0983, B:501:0x098c, B:503:0x0992, B:505:0x099d, B:506:0x09a1, B:513:0x09c0, B:515:0x09c6, B:519:0x09cf, B:521:0x09d3, B:526:0x09dc, B:528:0x09e2, B:530:0x0a3e, B:532:0x0a43, B:541:0x0a54, B:543:0x0a58, B:544:0x0a60, B:545:0x0a67, B:507:0x09a4, B:510:0x09b2, B:511:0x09b9, B:435:0x087a, B:437:0x0881, B:439:0x0885, B:466:0x08fb, B:468:0x0907, B:444:0x0891, B:446:0x0895, B:448:0x08a7, B:450:0x08b5, B:452:0x08c1, B:456:0x08ca, B:458:0x08d4, B:464:0x08df, B:469:0x090b, B:471:0x0911, B:473:0x0915, B:477:0x091e, B:479:0x092c, B:481:0x0934, B:483:0x093e, B:484:0x0943, B:485:0x0948, B:419:0x083a, B:250:0x056e, B:252:0x0574, B:255:0x057a, B:258:0x0585, B:260:0x058b, B:263:0x0599, B:265:0x059f, B:266:0x05a7, B:267:0x05aa, B:269:0x05b2, B:271:0x05c0, B:273:0x05f3, B:275:0x05fd, B:278:0x0608, B:280:0x0610, B:281:0x0613, B:283:0x0617, B:285:0x061d, B:287:0x0627, B:289:0x0631, B:291:0x0642, B:293:0x0648, B:294:0x0653, B:295:0x0656, B:297:0x065f, B:300:0x0664, B:302:0x066a, B:304:0x0672, B:306:0x0678, B:308:0x067e, B:312:0x068c, B:314:0x0694, B:315:0x0697, B:246:0x055e, B:546:0x0a6c, B:550:0x0a73, B:551:0x0a7b, B:555:0x0a99), top: B:615:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x07b5 A[Catch: RuntimeException -> 0x0aaa, IOException -> 0x0ad5, s56 -> 0x0ada, dl3 -> 0x0adf, fn8 -> 0x0af6, vu7 -> 0x0aff, TryCatch #9 {dl3 -> 0x0adf, fn8 -> 0x0af6, s56 -> 0x0ada, vu7 -> 0x0aff, IOException -> 0x0ad5, RuntimeException -> 0x0aaa, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001b, B:12:0x0022, B:14:0x0026, B:16:0x002a, B:18:0x0030, B:19:0x0037, B:23:0x003e, B:25:0x0047, B:27:0x0055, B:28:0x0058, B:29:0x005d, B:30:0x0068, B:31:0x0077, B:32:0x007c, B:33:0x0090, B:34:0x00a2, B:36:0x00b1, B:37:0x00b5, B:38:0x00c2, B:40:0x00d1, B:41:0x00ed, B:42:0x00fd, B:43:0x0106, B:45:0x0118, B:46:0x0124, B:47:0x0134, B:48:0x013d, B:52:0x0144, B:54:0x014c, B:56:0x0150, B:58:0x0156, B:60:0x015e, B:62:0x0166, B:63:0x0169, B:65:0x016e, B:72:0x017b, B:73:0x017c, B:77:0x0183, B:79:0x0191, B:80:0x0196, B:82:0x01a6, B:83:0x01ab, B:85:0x01c2, B:87:0x01c6, B:89:0x01d4, B:93:0x01de, B:95:0x01e3, B:97:0x01e9, B:101:0x01f1, B:103:0x01f9, B:105:0x021f, B:109:0x0228, B:111:0x024a, B:112:0x024d, B:113:0x0253, B:115:0x0258, B:117:0x0268, B:119:0x026e, B:120:0x0272, B:122:0x0276, B:123:0x027b, B:124:0x0280, B:128:0x02a1, B:130:0x02ac, B:125:0x0284, B:127:0x028e, B:131:0x02b9, B:133:0x02c5, B:134:0x02cc, B:135:0x02d1, B:137:0x02dd, B:139:0x0305, B:140:0x0326, B:141:0x0338, B:148:0x0343, B:149:0x0344, B:150:0x034b, B:151:0x0353, B:152:0x0368, B:154:0x0394, B:219:0x04b6, B:204:0x0482, B:203:0x047e, B:228:0x04cd, B:229:0x04dd, B:155:0x03b7, B:159:0x03ca, B:161:0x03da, B:163:0x03f1, B:165:0x03fb, B:230:0x04de, B:232:0x04f3, B:235:0x04fd, B:237:0x050c, B:239:0x0518, B:241:0x0547, B:242:0x054c, B:243:0x0550, B:245:0x0554, B:247:0x0561, B:316:0x069a, B:318:0x06a2, B:320:0x06aa, B:323:0x06af, B:324:0x06bb, B:326:0x06c1, B:328:0x06c9, B:332:0x06da, B:334:0x06e0, B:335:0x06fa, B:337:0x0700, B:339:0x0705, B:341:0x070a, B:343:0x070e, B:345:0x0714, B:347:0x0718, B:349:0x0720, B:351:0x0726, B:353:0x0730, B:356:0x0736, B:357:0x0739, B:359:0x0742, B:361:0x0754, B:363:0x075c, B:365:0x0764, B:369:0x076d, B:372:0x0798, B:377:0x07a4, B:379:0x07b0, B:380:0x07b5, B:382:0x07c5, B:383:0x07db, B:385:0x07e1, B:418:0x0832, B:388:0x07ea, B:390:0x07f1, B:394:0x07fa, B:399:0x0809, B:405:0x0816, B:407:0x081c, B:417:0x082f, B:420:0x0841, B:422:0x0847, B:426:0x0854, B:428:0x085c, B:430:0x0860, B:431:0x086b, B:433:0x0871, B:434:0x0875, B:486:0x094f, B:489:0x0957, B:491:0x095c, B:493:0x0964, B:495:0x0972, B:496:0x0979, B:497:0x097d, B:499:0x0983, B:501:0x098c, B:503:0x0992, B:505:0x099d, B:506:0x09a1, B:513:0x09c0, B:515:0x09c6, B:519:0x09cf, B:521:0x09d3, B:526:0x09dc, B:528:0x09e2, B:530:0x0a3e, B:532:0x0a43, B:541:0x0a54, B:543:0x0a58, B:544:0x0a60, B:545:0x0a67, B:507:0x09a4, B:510:0x09b2, B:511:0x09b9, B:435:0x087a, B:437:0x0881, B:439:0x0885, B:466:0x08fb, B:468:0x0907, B:444:0x0891, B:446:0x0895, B:448:0x08a7, B:450:0x08b5, B:452:0x08c1, B:456:0x08ca, B:458:0x08d4, B:464:0x08df, B:469:0x090b, B:471:0x0911, B:473:0x0915, B:477:0x091e, B:479:0x092c, B:481:0x0934, B:483:0x093e, B:484:0x0943, B:485:0x0948, B:419:0x083a, B:250:0x056e, B:252:0x0574, B:255:0x057a, B:258:0x0585, B:260:0x058b, B:263:0x0599, B:265:0x059f, B:266:0x05a7, B:267:0x05aa, B:269:0x05b2, B:271:0x05c0, B:273:0x05f3, B:275:0x05fd, B:278:0x0608, B:280:0x0610, B:281:0x0613, B:283:0x0617, B:285:0x061d, B:287:0x0627, B:289:0x0631, B:291:0x0642, B:293:0x0648, B:294:0x0653, B:295:0x0656, B:297:0x065f, B:300:0x0664, B:302:0x066a, B:304:0x0672, B:306:0x0678, B:308:0x067e, B:312:0x068c, B:314:0x0694, B:315:0x0697, B:246:0x055e, B:546:0x0a6c, B:550:0x0a73, B:551:0x0a7b, B:555:0x0a99), top: B:615:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x082f A[Catch: RuntimeException -> 0x0aaa, IOException -> 0x0ad5, s56 -> 0x0ada, dl3 -> 0x0adf, fn8 -> 0x0af6, vu7 -> 0x0aff, TryCatch #9 {dl3 -> 0x0adf, fn8 -> 0x0af6, s56 -> 0x0ada, vu7 -> 0x0aff, IOException -> 0x0ad5, RuntimeException -> 0x0aaa, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001b, B:12:0x0022, B:14:0x0026, B:16:0x002a, B:18:0x0030, B:19:0x0037, B:23:0x003e, B:25:0x0047, B:27:0x0055, B:28:0x0058, B:29:0x005d, B:30:0x0068, B:31:0x0077, B:32:0x007c, B:33:0x0090, B:34:0x00a2, B:36:0x00b1, B:37:0x00b5, B:38:0x00c2, B:40:0x00d1, B:41:0x00ed, B:42:0x00fd, B:43:0x0106, B:45:0x0118, B:46:0x0124, B:47:0x0134, B:48:0x013d, B:52:0x0144, B:54:0x014c, B:56:0x0150, B:58:0x0156, B:60:0x015e, B:62:0x0166, B:63:0x0169, B:65:0x016e, B:72:0x017b, B:73:0x017c, B:77:0x0183, B:79:0x0191, B:80:0x0196, B:82:0x01a6, B:83:0x01ab, B:85:0x01c2, B:87:0x01c6, B:89:0x01d4, B:93:0x01de, B:95:0x01e3, B:97:0x01e9, B:101:0x01f1, B:103:0x01f9, B:105:0x021f, B:109:0x0228, B:111:0x024a, B:112:0x024d, B:113:0x0253, B:115:0x0258, B:117:0x0268, B:119:0x026e, B:120:0x0272, B:122:0x0276, B:123:0x027b, B:124:0x0280, B:128:0x02a1, B:130:0x02ac, B:125:0x0284, B:127:0x028e, B:131:0x02b9, B:133:0x02c5, B:134:0x02cc, B:135:0x02d1, B:137:0x02dd, B:139:0x0305, B:140:0x0326, B:141:0x0338, B:148:0x0343, B:149:0x0344, B:150:0x034b, B:151:0x0353, B:152:0x0368, B:154:0x0394, B:219:0x04b6, B:204:0x0482, B:203:0x047e, B:228:0x04cd, B:229:0x04dd, B:155:0x03b7, B:159:0x03ca, B:161:0x03da, B:163:0x03f1, B:165:0x03fb, B:230:0x04de, B:232:0x04f3, B:235:0x04fd, B:237:0x050c, B:239:0x0518, B:241:0x0547, B:242:0x054c, B:243:0x0550, B:245:0x0554, B:247:0x0561, B:316:0x069a, B:318:0x06a2, B:320:0x06aa, B:323:0x06af, B:324:0x06bb, B:326:0x06c1, B:328:0x06c9, B:332:0x06da, B:334:0x06e0, B:335:0x06fa, B:337:0x0700, B:339:0x0705, B:341:0x070a, B:343:0x070e, B:345:0x0714, B:347:0x0718, B:349:0x0720, B:351:0x0726, B:353:0x0730, B:356:0x0736, B:357:0x0739, B:359:0x0742, B:361:0x0754, B:363:0x075c, B:365:0x0764, B:369:0x076d, B:372:0x0798, B:377:0x07a4, B:379:0x07b0, B:380:0x07b5, B:382:0x07c5, B:383:0x07db, B:385:0x07e1, B:418:0x0832, B:388:0x07ea, B:390:0x07f1, B:394:0x07fa, B:399:0x0809, B:405:0x0816, B:407:0x081c, B:417:0x082f, B:420:0x0841, B:422:0x0847, B:426:0x0854, B:428:0x085c, B:430:0x0860, B:431:0x086b, B:433:0x0871, B:434:0x0875, B:486:0x094f, B:489:0x0957, B:491:0x095c, B:493:0x0964, B:495:0x0972, B:496:0x0979, B:497:0x097d, B:499:0x0983, B:501:0x098c, B:503:0x0992, B:505:0x099d, B:506:0x09a1, B:513:0x09c0, B:515:0x09c6, B:519:0x09cf, B:521:0x09d3, B:526:0x09dc, B:528:0x09e2, B:530:0x0a3e, B:532:0x0a43, B:541:0x0a54, B:543:0x0a58, B:544:0x0a60, B:545:0x0a67, B:507:0x09a4, B:510:0x09b2, B:511:0x09b9, B:435:0x087a, B:437:0x0881, B:439:0x0885, B:466:0x08fb, B:468:0x0907, B:444:0x0891, B:446:0x0895, B:448:0x08a7, B:450:0x08b5, B:452:0x08c1, B:456:0x08ca, B:458:0x08d4, B:464:0x08df, B:469:0x090b, B:471:0x0911, B:473:0x0915, B:477:0x091e, B:479:0x092c, B:481:0x0934, B:483:0x093e, B:484:0x0943, B:485:0x0948, B:419:0x083a, B:250:0x056e, B:252:0x0574, B:255:0x057a, B:258:0x0585, B:260:0x058b, B:263:0x0599, B:265:0x059f, B:266:0x05a7, B:267:0x05aa, B:269:0x05b2, B:271:0x05c0, B:273:0x05f3, B:275:0x05fd, B:278:0x0608, B:280:0x0610, B:281:0x0613, B:283:0x0617, B:285:0x061d, B:287:0x0627, B:289:0x0631, B:291:0x0642, B:293:0x0648, B:294:0x0653, B:295:0x0656, B:297:0x065f, B:300:0x0664, B:302:0x066a, B:304:0x0672, B:306:0x0678, B:308:0x067e, B:312:0x068c, B:314:0x0694, B:315:0x0697, B:246:0x055e, B:546:0x0a6c, B:550:0x0a73, B:551:0x0a7b, B:555:0x0a99), top: B:615:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0907 A[Catch: RuntimeException -> 0x0aaa, IOException -> 0x0ad5, s56 -> 0x0ada, dl3 -> 0x0adf, fn8 -> 0x0af6, vu7 -> 0x0aff, TryCatch #9 {dl3 -> 0x0adf, fn8 -> 0x0af6, s56 -> 0x0ada, vu7 -> 0x0aff, IOException -> 0x0ad5, RuntimeException -> 0x0aaa, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001b, B:12:0x0022, B:14:0x0026, B:16:0x002a, B:18:0x0030, B:19:0x0037, B:23:0x003e, B:25:0x0047, B:27:0x0055, B:28:0x0058, B:29:0x005d, B:30:0x0068, B:31:0x0077, B:32:0x007c, B:33:0x0090, B:34:0x00a2, B:36:0x00b1, B:37:0x00b5, B:38:0x00c2, B:40:0x00d1, B:41:0x00ed, B:42:0x00fd, B:43:0x0106, B:45:0x0118, B:46:0x0124, B:47:0x0134, B:48:0x013d, B:52:0x0144, B:54:0x014c, B:56:0x0150, B:58:0x0156, B:60:0x015e, B:62:0x0166, B:63:0x0169, B:65:0x016e, B:72:0x017b, B:73:0x017c, B:77:0x0183, B:79:0x0191, B:80:0x0196, B:82:0x01a6, B:83:0x01ab, B:85:0x01c2, B:87:0x01c6, B:89:0x01d4, B:93:0x01de, B:95:0x01e3, B:97:0x01e9, B:101:0x01f1, B:103:0x01f9, B:105:0x021f, B:109:0x0228, B:111:0x024a, B:112:0x024d, B:113:0x0253, B:115:0x0258, B:117:0x0268, B:119:0x026e, B:120:0x0272, B:122:0x0276, B:123:0x027b, B:124:0x0280, B:128:0x02a1, B:130:0x02ac, B:125:0x0284, B:127:0x028e, B:131:0x02b9, B:133:0x02c5, B:134:0x02cc, B:135:0x02d1, B:137:0x02dd, B:139:0x0305, B:140:0x0326, B:141:0x0338, B:148:0x0343, B:149:0x0344, B:150:0x034b, B:151:0x0353, B:152:0x0368, B:154:0x0394, B:219:0x04b6, B:204:0x0482, B:203:0x047e, B:228:0x04cd, B:229:0x04dd, B:155:0x03b7, B:159:0x03ca, B:161:0x03da, B:163:0x03f1, B:165:0x03fb, B:230:0x04de, B:232:0x04f3, B:235:0x04fd, B:237:0x050c, B:239:0x0518, B:241:0x0547, B:242:0x054c, B:243:0x0550, B:245:0x0554, B:247:0x0561, B:316:0x069a, B:318:0x06a2, B:320:0x06aa, B:323:0x06af, B:324:0x06bb, B:326:0x06c1, B:328:0x06c9, B:332:0x06da, B:334:0x06e0, B:335:0x06fa, B:337:0x0700, B:339:0x0705, B:341:0x070a, B:343:0x070e, B:345:0x0714, B:347:0x0718, B:349:0x0720, B:351:0x0726, B:353:0x0730, B:356:0x0736, B:357:0x0739, B:359:0x0742, B:361:0x0754, B:363:0x075c, B:365:0x0764, B:369:0x076d, B:372:0x0798, B:377:0x07a4, B:379:0x07b0, B:380:0x07b5, B:382:0x07c5, B:383:0x07db, B:385:0x07e1, B:418:0x0832, B:388:0x07ea, B:390:0x07f1, B:394:0x07fa, B:399:0x0809, B:405:0x0816, B:407:0x081c, B:417:0x082f, B:420:0x0841, B:422:0x0847, B:426:0x0854, B:428:0x085c, B:430:0x0860, B:431:0x086b, B:433:0x0871, B:434:0x0875, B:486:0x094f, B:489:0x0957, B:491:0x095c, B:493:0x0964, B:495:0x0972, B:496:0x0979, B:497:0x097d, B:499:0x0983, B:501:0x098c, B:503:0x0992, B:505:0x099d, B:506:0x09a1, B:513:0x09c0, B:515:0x09c6, B:519:0x09cf, B:521:0x09d3, B:526:0x09dc, B:528:0x09e2, B:530:0x0a3e, B:532:0x0a43, B:541:0x0a54, B:543:0x0a58, B:544:0x0a60, B:545:0x0a67, B:507:0x09a4, B:510:0x09b2, B:511:0x09b9, B:435:0x087a, B:437:0x0881, B:439:0x0885, B:466:0x08fb, B:468:0x0907, B:444:0x0891, B:446:0x0895, B:448:0x08a7, B:450:0x08b5, B:452:0x08c1, B:456:0x08ca, B:458:0x08d4, B:464:0x08df, B:469:0x090b, B:471:0x0911, B:473:0x0915, B:477:0x091e, B:479:0x092c, B:481:0x0934, B:483:0x093e, B:484:0x0943, B:485:0x0948, B:419:0x083a, B:250:0x056e, B:252:0x0574, B:255:0x057a, B:258:0x0585, B:260:0x058b, B:263:0x0599, B:265:0x059f, B:266:0x05a7, B:267:0x05aa, B:269:0x05b2, B:271:0x05c0, B:273:0x05f3, B:275:0x05fd, B:278:0x0608, B:280:0x0610, B:281:0x0613, B:283:0x0617, B:285:0x061d, B:287:0x0627, B:289:0x0631, B:291:0x0642, B:293:0x0648, B:294:0x0653, B:295:0x0656, B:297:0x065f, B:300:0x0664, B:302:0x066a, B:304:0x0672, B:306:0x0678, B:308:0x067e, B:312:0x068c, B:314:0x0694, B:315:0x0697, B:246:0x055e, B:546:0x0a6c, B:550:0x0a73, B:551:0x0a7b, B:555:0x0a99), top: B:615:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0956  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x09c6 A[Catch: RuntimeException -> 0x0aaa, IOException -> 0x0ad5, s56 -> 0x0ada, dl3 -> 0x0adf, fn8 -> 0x0af6, vu7 -> 0x0aff, TryCatch #9 {dl3 -> 0x0adf, fn8 -> 0x0af6, s56 -> 0x0ada, vu7 -> 0x0aff, IOException -> 0x0ad5, RuntimeException -> 0x0aaa, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001b, B:12:0x0022, B:14:0x0026, B:16:0x002a, B:18:0x0030, B:19:0x0037, B:23:0x003e, B:25:0x0047, B:27:0x0055, B:28:0x0058, B:29:0x005d, B:30:0x0068, B:31:0x0077, B:32:0x007c, B:33:0x0090, B:34:0x00a2, B:36:0x00b1, B:37:0x00b5, B:38:0x00c2, B:40:0x00d1, B:41:0x00ed, B:42:0x00fd, B:43:0x0106, B:45:0x0118, B:46:0x0124, B:47:0x0134, B:48:0x013d, B:52:0x0144, B:54:0x014c, B:56:0x0150, B:58:0x0156, B:60:0x015e, B:62:0x0166, B:63:0x0169, B:65:0x016e, B:72:0x017b, B:73:0x017c, B:77:0x0183, B:79:0x0191, B:80:0x0196, B:82:0x01a6, B:83:0x01ab, B:85:0x01c2, B:87:0x01c6, B:89:0x01d4, B:93:0x01de, B:95:0x01e3, B:97:0x01e9, B:101:0x01f1, B:103:0x01f9, B:105:0x021f, B:109:0x0228, B:111:0x024a, B:112:0x024d, B:113:0x0253, B:115:0x0258, B:117:0x0268, B:119:0x026e, B:120:0x0272, B:122:0x0276, B:123:0x027b, B:124:0x0280, B:128:0x02a1, B:130:0x02ac, B:125:0x0284, B:127:0x028e, B:131:0x02b9, B:133:0x02c5, B:134:0x02cc, B:135:0x02d1, B:137:0x02dd, B:139:0x0305, B:140:0x0326, B:141:0x0338, B:148:0x0343, B:149:0x0344, B:150:0x034b, B:151:0x0353, B:152:0x0368, B:154:0x0394, B:219:0x04b6, B:204:0x0482, B:203:0x047e, B:228:0x04cd, B:229:0x04dd, B:155:0x03b7, B:159:0x03ca, B:161:0x03da, B:163:0x03f1, B:165:0x03fb, B:230:0x04de, B:232:0x04f3, B:235:0x04fd, B:237:0x050c, B:239:0x0518, B:241:0x0547, B:242:0x054c, B:243:0x0550, B:245:0x0554, B:247:0x0561, B:316:0x069a, B:318:0x06a2, B:320:0x06aa, B:323:0x06af, B:324:0x06bb, B:326:0x06c1, B:328:0x06c9, B:332:0x06da, B:334:0x06e0, B:335:0x06fa, B:337:0x0700, B:339:0x0705, B:341:0x070a, B:343:0x070e, B:345:0x0714, B:347:0x0718, B:349:0x0720, B:351:0x0726, B:353:0x0730, B:356:0x0736, B:357:0x0739, B:359:0x0742, B:361:0x0754, B:363:0x075c, B:365:0x0764, B:369:0x076d, B:372:0x0798, B:377:0x07a4, B:379:0x07b0, B:380:0x07b5, B:382:0x07c5, B:383:0x07db, B:385:0x07e1, B:418:0x0832, B:388:0x07ea, B:390:0x07f1, B:394:0x07fa, B:399:0x0809, B:405:0x0816, B:407:0x081c, B:417:0x082f, B:420:0x0841, B:422:0x0847, B:426:0x0854, B:428:0x085c, B:430:0x0860, B:431:0x086b, B:433:0x0871, B:434:0x0875, B:486:0x094f, B:489:0x0957, B:491:0x095c, B:493:0x0964, B:495:0x0972, B:496:0x0979, B:497:0x097d, B:499:0x0983, B:501:0x098c, B:503:0x0992, B:505:0x099d, B:506:0x09a1, B:513:0x09c0, B:515:0x09c6, B:519:0x09cf, B:521:0x09d3, B:526:0x09dc, B:528:0x09e2, B:530:0x0a3e, B:532:0x0a43, B:541:0x0a54, B:543:0x0a58, B:544:0x0a60, B:545:0x0a67, B:507:0x09a4, B:510:0x09b2, B:511:0x09b9, B:435:0x087a, B:437:0x0881, B:439:0x0885, B:466:0x08fb, B:468:0x0907, B:444:0x0891, B:446:0x0895, B:448:0x08a7, B:450:0x08b5, B:452:0x08c1, B:456:0x08ca, B:458:0x08d4, B:464:0x08df, B:469:0x090b, B:471:0x0911, B:473:0x0915, B:477:0x091e, B:479:0x092c, B:481:0x0934, B:483:0x093e, B:484:0x0943, B:485:0x0948, B:419:0x083a, B:250:0x056e, B:252:0x0574, B:255:0x057a, B:258:0x0585, B:260:0x058b, B:263:0x0599, B:265:0x059f, B:266:0x05a7, B:267:0x05aa, B:269:0x05b2, B:271:0x05c0, B:273:0x05f3, B:275:0x05fd, B:278:0x0608, B:280:0x0610, B:281:0x0613, B:283:0x0617, B:285:0x061d, B:287:0x0627, B:289:0x0631, B:291:0x0642, B:293:0x0648, B:294:0x0653, B:295:0x0656, B:297:0x065f, B:300:0x0664, B:302:0x066a, B:304:0x0672, B:306:0x0678, B:308:0x067e, B:312:0x068c, B:314:0x0694, B:315:0x0697, B:246:0x055e, B:546:0x0a6c, B:550:0x0a73, B:551:0x0a7b, B:555:0x0a99), top: B:615:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:521:0x09d3 A[Catch: RuntimeException -> 0x0aaa, IOException -> 0x0ad5, s56 -> 0x0ada, dl3 -> 0x0adf, fn8 -> 0x0af6, vu7 -> 0x0aff, TryCatch #9 {dl3 -> 0x0adf, fn8 -> 0x0af6, s56 -> 0x0ada, vu7 -> 0x0aff, IOException -> 0x0ad5, RuntimeException -> 0x0aaa, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001b, B:12:0x0022, B:14:0x0026, B:16:0x002a, B:18:0x0030, B:19:0x0037, B:23:0x003e, B:25:0x0047, B:27:0x0055, B:28:0x0058, B:29:0x005d, B:30:0x0068, B:31:0x0077, B:32:0x007c, B:33:0x0090, B:34:0x00a2, B:36:0x00b1, B:37:0x00b5, B:38:0x00c2, B:40:0x00d1, B:41:0x00ed, B:42:0x00fd, B:43:0x0106, B:45:0x0118, B:46:0x0124, B:47:0x0134, B:48:0x013d, B:52:0x0144, B:54:0x014c, B:56:0x0150, B:58:0x0156, B:60:0x015e, B:62:0x0166, B:63:0x0169, B:65:0x016e, B:72:0x017b, B:73:0x017c, B:77:0x0183, B:79:0x0191, B:80:0x0196, B:82:0x01a6, B:83:0x01ab, B:85:0x01c2, B:87:0x01c6, B:89:0x01d4, B:93:0x01de, B:95:0x01e3, B:97:0x01e9, B:101:0x01f1, B:103:0x01f9, B:105:0x021f, B:109:0x0228, B:111:0x024a, B:112:0x024d, B:113:0x0253, B:115:0x0258, B:117:0x0268, B:119:0x026e, B:120:0x0272, B:122:0x0276, B:123:0x027b, B:124:0x0280, B:128:0x02a1, B:130:0x02ac, B:125:0x0284, B:127:0x028e, B:131:0x02b9, B:133:0x02c5, B:134:0x02cc, B:135:0x02d1, B:137:0x02dd, B:139:0x0305, B:140:0x0326, B:141:0x0338, B:148:0x0343, B:149:0x0344, B:150:0x034b, B:151:0x0353, B:152:0x0368, B:154:0x0394, B:219:0x04b6, B:204:0x0482, B:203:0x047e, B:228:0x04cd, B:229:0x04dd, B:155:0x03b7, B:159:0x03ca, B:161:0x03da, B:163:0x03f1, B:165:0x03fb, B:230:0x04de, B:232:0x04f3, B:235:0x04fd, B:237:0x050c, B:239:0x0518, B:241:0x0547, B:242:0x054c, B:243:0x0550, B:245:0x0554, B:247:0x0561, B:316:0x069a, B:318:0x06a2, B:320:0x06aa, B:323:0x06af, B:324:0x06bb, B:326:0x06c1, B:328:0x06c9, B:332:0x06da, B:334:0x06e0, B:335:0x06fa, B:337:0x0700, B:339:0x0705, B:341:0x070a, B:343:0x070e, B:345:0x0714, B:347:0x0718, B:349:0x0720, B:351:0x0726, B:353:0x0730, B:356:0x0736, B:357:0x0739, B:359:0x0742, B:361:0x0754, B:363:0x075c, B:365:0x0764, B:369:0x076d, B:372:0x0798, B:377:0x07a4, B:379:0x07b0, B:380:0x07b5, B:382:0x07c5, B:383:0x07db, B:385:0x07e1, B:418:0x0832, B:388:0x07ea, B:390:0x07f1, B:394:0x07fa, B:399:0x0809, B:405:0x0816, B:407:0x081c, B:417:0x082f, B:420:0x0841, B:422:0x0847, B:426:0x0854, B:428:0x085c, B:430:0x0860, B:431:0x086b, B:433:0x0871, B:434:0x0875, B:486:0x094f, B:489:0x0957, B:491:0x095c, B:493:0x0964, B:495:0x0972, B:496:0x0979, B:497:0x097d, B:499:0x0983, B:501:0x098c, B:503:0x0992, B:505:0x099d, B:506:0x09a1, B:513:0x09c0, B:515:0x09c6, B:519:0x09cf, B:521:0x09d3, B:526:0x09dc, B:528:0x09e2, B:530:0x0a3e, B:532:0x0a43, B:541:0x0a54, B:543:0x0a58, B:544:0x0a60, B:545:0x0a67, B:507:0x09a4, B:510:0x09b2, B:511:0x09b9, B:435:0x087a, B:437:0x0881, B:439:0x0885, B:466:0x08fb, B:468:0x0907, B:444:0x0891, B:446:0x0895, B:448:0x08a7, B:450:0x08b5, B:452:0x08c1, B:456:0x08ca, B:458:0x08d4, B:464:0x08df, B:469:0x090b, B:471:0x0911, B:473:0x0915, B:477:0x091e, B:479:0x092c, B:481:0x0934, B:483:0x093e, B:484:0x0943, B:485:0x0948, B:419:0x083a, B:250:0x056e, B:252:0x0574, B:255:0x057a, B:258:0x0585, B:260:0x058b, B:263:0x0599, B:265:0x059f, B:266:0x05a7, B:267:0x05aa, B:269:0x05b2, B:271:0x05c0, B:273:0x05f3, B:275:0x05fd, B:278:0x0608, B:280:0x0610, B:281:0x0613, B:283:0x0617, B:285:0x061d, B:287:0x0627, B:289:0x0631, B:291:0x0642, B:293:0x0648, B:294:0x0653, B:295:0x0656, B:297:0x065f, B:300:0x0664, B:302:0x066a, B:304:0x0672, B:306:0x0678, B:308:0x067e, B:312:0x068c, B:314:0x0694, B:315:0x0697, B:246:0x055e, B:546:0x0a6c, B:550:0x0a73, B:551:0x0a7b, B:555:0x0a99), top: B:615:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:528:0x09e2 A[Catch: RuntimeException -> 0x0aaa, IOException -> 0x0ad5, s56 -> 0x0ada, dl3 -> 0x0adf, fn8 -> 0x0af6, vu7 -> 0x0aff, TryCatch #9 {dl3 -> 0x0adf, fn8 -> 0x0af6, s56 -> 0x0ada, vu7 -> 0x0aff, IOException -> 0x0ad5, RuntimeException -> 0x0aaa, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001b, B:12:0x0022, B:14:0x0026, B:16:0x002a, B:18:0x0030, B:19:0x0037, B:23:0x003e, B:25:0x0047, B:27:0x0055, B:28:0x0058, B:29:0x005d, B:30:0x0068, B:31:0x0077, B:32:0x007c, B:33:0x0090, B:34:0x00a2, B:36:0x00b1, B:37:0x00b5, B:38:0x00c2, B:40:0x00d1, B:41:0x00ed, B:42:0x00fd, B:43:0x0106, B:45:0x0118, B:46:0x0124, B:47:0x0134, B:48:0x013d, B:52:0x0144, B:54:0x014c, B:56:0x0150, B:58:0x0156, B:60:0x015e, B:62:0x0166, B:63:0x0169, B:65:0x016e, B:72:0x017b, B:73:0x017c, B:77:0x0183, B:79:0x0191, B:80:0x0196, B:82:0x01a6, B:83:0x01ab, B:85:0x01c2, B:87:0x01c6, B:89:0x01d4, B:93:0x01de, B:95:0x01e3, B:97:0x01e9, B:101:0x01f1, B:103:0x01f9, B:105:0x021f, B:109:0x0228, B:111:0x024a, B:112:0x024d, B:113:0x0253, B:115:0x0258, B:117:0x0268, B:119:0x026e, B:120:0x0272, B:122:0x0276, B:123:0x027b, B:124:0x0280, B:128:0x02a1, B:130:0x02ac, B:125:0x0284, B:127:0x028e, B:131:0x02b9, B:133:0x02c5, B:134:0x02cc, B:135:0x02d1, B:137:0x02dd, B:139:0x0305, B:140:0x0326, B:141:0x0338, B:148:0x0343, B:149:0x0344, B:150:0x034b, B:151:0x0353, B:152:0x0368, B:154:0x0394, B:219:0x04b6, B:204:0x0482, B:203:0x047e, B:228:0x04cd, B:229:0x04dd, B:155:0x03b7, B:159:0x03ca, B:161:0x03da, B:163:0x03f1, B:165:0x03fb, B:230:0x04de, B:232:0x04f3, B:235:0x04fd, B:237:0x050c, B:239:0x0518, B:241:0x0547, B:242:0x054c, B:243:0x0550, B:245:0x0554, B:247:0x0561, B:316:0x069a, B:318:0x06a2, B:320:0x06aa, B:323:0x06af, B:324:0x06bb, B:326:0x06c1, B:328:0x06c9, B:332:0x06da, B:334:0x06e0, B:335:0x06fa, B:337:0x0700, B:339:0x0705, B:341:0x070a, B:343:0x070e, B:345:0x0714, B:347:0x0718, B:349:0x0720, B:351:0x0726, B:353:0x0730, B:356:0x0736, B:357:0x0739, B:359:0x0742, B:361:0x0754, B:363:0x075c, B:365:0x0764, B:369:0x076d, B:372:0x0798, B:377:0x07a4, B:379:0x07b0, B:380:0x07b5, B:382:0x07c5, B:383:0x07db, B:385:0x07e1, B:418:0x0832, B:388:0x07ea, B:390:0x07f1, B:394:0x07fa, B:399:0x0809, B:405:0x0816, B:407:0x081c, B:417:0x082f, B:420:0x0841, B:422:0x0847, B:426:0x0854, B:428:0x085c, B:430:0x0860, B:431:0x086b, B:433:0x0871, B:434:0x0875, B:486:0x094f, B:489:0x0957, B:491:0x095c, B:493:0x0964, B:495:0x0972, B:496:0x0979, B:497:0x097d, B:499:0x0983, B:501:0x098c, B:503:0x0992, B:505:0x099d, B:506:0x09a1, B:513:0x09c0, B:515:0x09c6, B:519:0x09cf, B:521:0x09d3, B:526:0x09dc, B:528:0x09e2, B:530:0x0a3e, B:532:0x0a43, B:541:0x0a54, B:543:0x0a58, B:544:0x0a60, B:545:0x0a67, B:507:0x09a4, B:510:0x09b2, B:511:0x09b9, B:435:0x087a, B:437:0x0881, B:439:0x0885, B:466:0x08fb, B:468:0x0907, B:444:0x0891, B:446:0x0895, B:448:0x08a7, B:450:0x08b5, B:452:0x08c1, B:456:0x08ca, B:458:0x08d4, B:464:0x08df, B:469:0x090b, B:471:0x0911, B:473:0x0915, B:477:0x091e, B:479:0x092c, B:481:0x0934, B:483:0x093e, B:484:0x0943, B:485:0x0948, B:419:0x083a, B:250:0x056e, B:252:0x0574, B:255:0x057a, B:258:0x0585, B:260:0x058b, B:263:0x0599, B:265:0x059f, B:266:0x05a7, B:267:0x05aa, B:269:0x05b2, B:271:0x05c0, B:273:0x05f3, B:275:0x05fd, B:278:0x0608, B:280:0x0610, B:281:0x0613, B:283:0x0617, B:285:0x061d, B:287:0x0627, B:289:0x0631, B:291:0x0642, B:293:0x0648, B:294:0x0653, B:295:0x0656, B:297:0x065f, B:300:0x0664, B:302:0x066a, B:304:0x0672, B:306:0x0678, B:308:0x067e, B:312:0x068c, B:314:0x0694, B:315:0x0697, B:246:0x055e, B:546:0x0a6c, B:550:0x0a73, B:551:0x0a7b, B:555:0x0a99), top: B:615:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0a38  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0a43 A[Catch: RuntimeException -> 0x0aaa, IOException -> 0x0ad5, s56 -> 0x0ada, dl3 -> 0x0adf, fn8 -> 0x0af6, vu7 -> 0x0aff, TryCatch #9 {dl3 -> 0x0adf, fn8 -> 0x0af6, s56 -> 0x0ada, vu7 -> 0x0aff, IOException -> 0x0ad5, RuntimeException -> 0x0aaa, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x001b, B:12:0x0022, B:14:0x0026, B:16:0x002a, B:18:0x0030, B:19:0x0037, B:23:0x003e, B:25:0x0047, B:27:0x0055, B:28:0x0058, B:29:0x005d, B:30:0x0068, B:31:0x0077, B:32:0x007c, B:33:0x0090, B:34:0x00a2, B:36:0x00b1, B:37:0x00b5, B:38:0x00c2, B:40:0x00d1, B:41:0x00ed, B:42:0x00fd, B:43:0x0106, B:45:0x0118, B:46:0x0124, B:47:0x0134, B:48:0x013d, B:52:0x0144, B:54:0x014c, B:56:0x0150, B:58:0x0156, B:60:0x015e, B:62:0x0166, B:63:0x0169, B:65:0x016e, B:72:0x017b, B:73:0x017c, B:77:0x0183, B:79:0x0191, B:80:0x0196, B:82:0x01a6, B:83:0x01ab, B:85:0x01c2, B:87:0x01c6, B:89:0x01d4, B:93:0x01de, B:95:0x01e3, B:97:0x01e9, B:101:0x01f1, B:103:0x01f9, B:105:0x021f, B:109:0x0228, B:111:0x024a, B:112:0x024d, B:113:0x0253, B:115:0x0258, B:117:0x0268, B:119:0x026e, B:120:0x0272, B:122:0x0276, B:123:0x027b, B:124:0x0280, B:128:0x02a1, B:130:0x02ac, B:125:0x0284, B:127:0x028e, B:131:0x02b9, B:133:0x02c5, B:134:0x02cc, B:135:0x02d1, B:137:0x02dd, B:139:0x0305, B:140:0x0326, B:141:0x0338, B:148:0x0343, B:149:0x0344, B:150:0x034b, B:151:0x0353, B:152:0x0368, B:154:0x0394, B:219:0x04b6, B:204:0x0482, B:203:0x047e, B:228:0x04cd, B:229:0x04dd, B:155:0x03b7, B:159:0x03ca, B:161:0x03da, B:163:0x03f1, B:165:0x03fb, B:230:0x04de, B:232:0x04f3, B:235:0x04fd, B:237:0x050c, B:239:0x0518, B:241:0x0547, B:242:0x054c, B:243:0x0550, B:245:0x0554, B:247:0x0561, B:316:0x069a, B:318:0x06a2, B:320:0x06aa, B:323:0x06af, B:324:0x06bb, B:326:0x06c1, B:328:0x06c9, B:332:0x06da, B:334:0x06e0, B:335:0x06fa, B:337:0x0700, B:339:0x0705, B:341:0x070a, B:343:0x070e, B:345:0x0714, B:347:0x0718, B:349:0x0720, B:351:0x0726, B:353:0x0730, B:356:0x0736, B:357:0x0739, B:359:0x0742, B:361:0x0754, B:363:0x075c, B:365:0x0764, B:369:0x076d, B:372:0x0798, B:377:0x07a4, B:379:0x07b0, B:380:0x07b5, B:382:0x07c5, B:383:0x07db, B:385:0x07e1, B:418:0x0832, B:388:0x07ea, B:390:0x07f1, B:394:0x07fa, B:399:0x0809, B:405:0x0816, B:407:0x081c, B:417:0x082f, B:420:0x0841, B:422:0x0847, B:426:0x0854, B:428:0x085c, B:430:0x0860, B:431:0x086b, B:433:0x0871, B:434:0x0875, B:486:0x094f, B:489:0x0957, B:491:0x095c, B:493:0x0964, B:495:0x0972, B:496:0x0979, B:497:0x097d, B:499:0x0983, B:501:0x098c, B:503:0x0992, B:505:0x099d, B:506:0x09a1, B:513:0x09c0, B:515:0x09c6, B:519:0x09cf, B:521:0x09d3, B:526:0x09dc, B:528:0x09e2, B:530:0x0a3e, B:532:0x0a43, B:541:0x0a54, B:543:0x0a58, B:544:0x0a60, B:545:0x0a67, B:507:0x09a4, B:510:0x09b2, B:511:0x09b9, B:435:0x087a, B:437:0x0881, B:439:0x0885, B:466:0x08fb, B:468:0x0907, B:444:0x0891, B:446:0x0895, B:448:0x08a7, B:450:0x08b5, B:452:0x08c1, B:456:0x08ca, B:458:0x08d4, B:464:0x08df, B:469:0x090b, B:471:0x0911, B:473:0x0915, B:477:0x091e, B:479:0x092c, B:481:0x0934, B:483:0x093e, B:484:0x0943, B:485:0x0948, B:419:0x083a, B:250:0x056e, B:252:0x0574, B:255:0x057a, B:258:0x0585, B:260:0x058b, B:263:0x0599, B:265:0x059f, B:266:0x05a7, B:267:0x05aa, B:269:0x05b2, B:271:0x05c0, B:273:0x05f3, B:275:0x05fd, B:278:0x0608, B:280:0x0610, B:281:0x0613, B:283:0x0617, B:285:0x061d, B:287:0x0627, B:289:0x0631, B:291:0x0642, B:293:0x0648, B:294:0x0653, B:295:0x0656, B:297:0x065f, B:300:0x0664, B:302:0x066a, B:304:0x0672, B:306:0x0678, B:308:0x067e, B:312:0x068c, B:314:0x0694, B:315:0x0697, B:246:0x055e, B:546:0x0a6c, B:550:0x0a73, B:551:0x0a7b, B:555:0x0a99), top: B:615:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0708 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:650:0x0832 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.daaw.qz6, com.daaw.mw8] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        IOException iOException;
        int i;
        boolean z;
        j78 m10579h;
        long j;
        int i2;
        int i3;
        j78 m10580g;
        boolean z2;
        boolean z3;
        tv8[] tv8VarArr;
        long j2;
        boolean z4;
        q88 q88Var;
        boolean z5;
        boolean z6;
        long j3;
        int i4;
        boolean z7;
        j78 m10579h2;
        boolean z8;
        j78 m10580g2;
        j78 m18753g;
        j78 m10583d;
        boolean z9;
        int i5;
        m78 m10578i;
        long j4;
        pr8 pr8Var;
        boolean z10;
        long j5;
        long j6;
        Throwable th;
        Throwable th2;
        boolean z11;
        long j7;
        long j8;
        long m8509e0;
        q88 q88Var2;
        int i6;
        q88 m8501i0;
        int i7;
        int i8;
        List list;
        wt8 wt8Var;
        l64 m15400m;
        List list2;
        wt8 wt8Var2;
        int i9;
        long j9;
        List list3;
        wt8 wt8Var3;
        try {
            int i10 = -1;
            switch (message.what) {
                case 0:
                    this.f28604K.m14520a(1);
                    m8495o(false, false, false, true);
                    this.f28629u.zzb();
                    m8487w(true != this.f28603J.f23759a.m17121o() ? 2 : 4);
                    this.f28600G.m15407f(this.f28630v);
                    this.f28631w.mo5886i(2);
                    break;
                case 1:
                    m8488v(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.f28631w.zze(2);
                    if (!this.f28603J.f23759a.m17121o() && this.f28600G.m15404i()) {
                        this.f28599F.m10573n(this.f28617X);
                        if (this.f28599F.m10570q() && (m10578i = this.f28599F.m10578i(this.f28617X, this.f28603J)) != null) {
                            j78 m10566u = this.f28599F.m10566u(this.f28626r, this.f28627s, this.f28629u.zzi(), this.f28600G, m10578i, this.f28628t);
                            m10566u.f14502a.mo3299g(this, m10578i.f18574b);
                            if (this.f28599F.m10580g() == m10566u) {
                                m8493q(m10578i.f18574b);
                            }
                            m8502i(false);
                        }
                        if (this.f28609P) {
                            this.f28609P = m8539F();
                            m8544A();
                        } else {
                            m8497m();
                        }
                        j78 m10579h3 = this.f28599F.m10579h();
                        if (m10579h3 != null) {
                            if (m10579h3.m18753g() != null && !this.f28607N) {
                                j78 m10579h4 = this.f28599F.m10579h();
                                if (m10579h4.f14505d) {
                                    int i11 = 0;
                                    while (true) {
                                        i98[] i98VarArr = this.f28624p;
                                        int length = i98VarArr.length;
                                        if (i11 < 2) {
                                            i98 i98Var = i98VarArr[i11];
                                            mt8 mt8Var = m10579h4.f14504c[i11];
                                            if (i98Var.zzm() == mt8Var) {
                                                if (mt8Var == null || i98Var.mo15109j()) {
                                                    i11++;
                                                } else {
                                                    m10579h4.m18753g();
                                                    boolean z12 = m10579h4.f14507f.f18578f;
                                                }
                                            }
                                        } else if (m10579h3.m18753g().f14505d || this.f28617X >= m10579h3.m18753g().m18754f()) {
                                            fw8 m18751i = m10579h3.m18751i();
                                            j78 m10582e = this.f28599F.m10582e();
                                            fw8 m18751i2 = m10582e.m18751i();
                                            l64 l64Var = this.f28603J.f23759a;
                                            j = uptimeMillis;
                                            m8541D(l64Var, m10582e.f14507f.f18573a, l64Var, m10579h3.f14507f.f18573a, -9223372036854775807L);
                                            if (!m10582e.f14505d || m10582e.f14502a.zzd() == -9223372036854775807L) {
                                                int i12 = 0;
                                                while (true) {
                                                    int length2 = this.f28624p.length;
                                                    if (i12 < 2) {
                                                        boolean m22181b = m18751i.m22181b(i12);
                                                        boolean m22181b2 = m18751i2.m22181b(i12);
                                                        if (m22181b && !this.f28624p[i12].mo15110g()) {
                                                            this.f28626r[i12].zzb();
                                                            x98 x98Var = m18751i.f10041b[i12];
                                                            x98 x98Var2 = m18751i2.f10041b[i12];
                                                            if (!m22181b2 || !x98Var2.equals(x98Var)) {
                                                                m8530O(this.f28624p[i12], m10582e.m18754f());
                                                            }
                                                        }
                                                        i12++;
                                                    }
                                                }
                                            } else {
                                                long m18754f = m10582e.m18754f();
                                                i98[] i98VarArr2 = this.f28624p;
                                                int length3 = i98VarArr2.length;
                                                for (int i13 = 0; i13 < 2; i13++) {
                                                    i98 i98Var2 = i98VarArr2[i13];
                                                    if (i98Var2.zzm() != null) {
                                                        m8530O(i98Var2, m18754f);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            j = uptimeMillis;
                            if (m10579h3.f14507f.f18581i || this.f28607N) {
                                int i14 = 0;
                                while (true) {
                                    i98[] i98VarArr3 = this.f28624p;
                                    int length4 = i98VarArr3.length;
                                    if (i14 < 2) {
                                        i98 i98Var3 = i98VarArr3[i14];
                                        mt8 mt8Var2 = m10579h3.f14504c[i14];
                                        if (mt8Var2 != null && i98Var3.zzm() == mt8Var2 && i98Var3.mo15109j()) {
                                            long j10 = m10579h3.f14507f.f18577e;
                                            m8530O(i98Var3, (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? -9223372036854775807L : j10 + m10579h3.m18755e());
                                        }
                                        i14++;
                                    }
                                }
                            }
                            m10579h2 = this.f28599F.m10579h();
                            if (m10579h2 != null && this.f28599F.m10580g() != m10579h2 && !m10579h2.f14508g) {
                                j78 m10579h5 = this.f28599F.m10579h();
                                fw8 m18751i3 = m10579h5.m18751i();
                                i5 = 0;
                                boolean z13 = false;
                                while (true) {
                                    i98[] i98VarArr4 = this.f28624p;
                                    int length5 = i98VarArr4.length;
                                    if (i5 >= 2) {
                                        i98 i98Var4 = i98VarArr4[i5];
                                        if (m8538G(i98Var4)) {
                                            mt8 zzm = i98Var4.zzm();
                                            mt8 mt8Var3 = m10579h5.f14504c[i5];
                                            if (!m18751i3.m22181b(i5) || zzm != mt8Var3) {
                                                if (!i98Var4.mo15110g()) {
                                                    i98Var4.mo15111f(m8533L(m18751i3.f10042c[i5]), m10579h5.f14504c[i5], m10579h5.m18754f(), m10579h5.m18755e());
                                                } else if (i98Var4.zzM()) {
                                                    m8510e(i98Var4);
                                                } else {
                                                    z13 = true;
                                                }
                                            }
                                        }
                                        i5++;
                                    } else if (!z13) {
                                        m8508f();
                                    }
                                }
                            }
                            z8 = false;
                            while (m8535J() && !this.f28607N && (m10580g2 = this.f28599F.m10580g()) != null && (m18753g = m10580g2.m18753g()) != null && this.f28617X >= m18753g.m18754f() && m18753g.f14508g) {
                                if (z8) {
                                    m8496n();
                                }
                                m10583d = this.f28599F.m10583d();
                                Objects.requireNonNull(m10583d);
                                if (this.f28603J.f23760b.f18805a.equals(m10583d.f14507f.f18573a.f18805a)) {
                                    pr8 pr8Var2 = this.f28603J.f23760b;
                                    if (pr8Var2.f18806b == i10) {
                                        pr8 pr8Var3 = m10583d.f14507f.f18573a;
                                        if (pr8Var3.f18806b == i10 && pr8Var2.f18809e != pr8Var3.f18809e) {
                                            z9 = true;
                                            m78 m78Var = m10583d.f14507f;
                                            pr8 pr8Var4 = m78Var.f18573a;
                                            long j11 = m78Var.f18574b;
                                            this.f28603J = m8501i0(pr8Var4, j11, m78Var.f18575c, j11, !z9, 0);
                                            m8494p();
                                            m8542C();
                                            z8 = true;
                                            i10 = -1;
                                        }
                                    }
                                }
                                z9 = false;
                                m78 m78Var2 = m10583d.f14507f;
                                pr8 pr8Var42 = m78Var2.f18573a;
                                long j112 = m78Var2.f18574b;
                                this.f28603J = m8501i0(pr8Var42, j112, m78Var2.f18575c, j112, !z9, 0);
                                m8494p();
                                m8542C();
                                z8 = true;
                                i10 = -1;
                            }
                            i2 = 3;
                            i3 = this.f28603J.f23763e;
                            if (i3 != 1 && i3 != 4) {
                                m10580g = this.f28599F.m10580g();
                                long j12 = j;
                                if (m10580g != null) {
                                    m8491s(j12, 10L);
                                    break;
                                } else {
                                    int i15 = it5.f13991a;
                                    Trace.beginSection("doSomeWork");
                                    m8542C();
                                    if (m10580g.f14505d) {
                                        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                                        m10580g.f14502a.mo3301e(this.f28603J.f23776r - this.f28595B, false);
                                        z2 = true;
                                        z3 = true;
                                        int i16 = 0;
                                        while (true) {
                                            i98[] i98VarArr5 = this.f28624p;
                                            int length6 = i98VarArr5.length;
                                            if (i16 < 2) {
                                                i98 i98Var5 = i98VarArr5[i16];
                                                if (m8538G(i98Var5)) {
                                                    i98Var5.mo20009i(this.f28617X, elapsedRealtime);
                                                    z3 = z3 && i98Var5.zzM();
                                                    boolean z14 = m10580g.f14504c[i16] != i98Var5.zzm();
                                                    boolean z15 = !z14 && i98Var5.mo15109j();
                                                    if (!z14 && !z15 && !i98Var5.zzN() && !i98Var5.zzM()) {
                                                        z7 = false;
                                                        z2 = !z2 && z7;
                                                        if (z7) {
                                                            i98Var5.zzr();
                                                        }
                                                    }
                                                    z7 = true;
                                                    if (z2) {
                                                    }
                                                    if (z7) {
                                                    }
                                                }
                                                i16++;
                                            }
                                        }
                                    } else {
                                        m10580g.f14502a.zzk();
                                        z2 = true;
                                        z3 = true;
                                    }
                                    long j13 = m10580g.f14507f.f18577e;
                                    if (z3 && m10580g.f14505d && (j13 == -9223372036854775807L || j13 <= this.f28603J.f23776r)) {
                                        if (this.f28607N) {
                                            this.f28607N = false;
                                            m8488v(false, this.f28603J.f23771m, false, 5);
                                        }
                                        if (m10580g.f14507f.f18581i) {
                                            m8487w(4);
                                            m8484z();
                                            int i17 = 2;
                                            if (this.f28603J.f23763e == 2) {
                                                int i18 = 0;
                                                while (true) {
                                                    i98[] i98VarArr6 = this.f28624p;
                                                    int length7 = i98VarArr6.length;
                                                    if (i18 < i17) {
                                                        if (m8538G(i98VarArr6[i18]) && this.f28624p[i18].zzm() == m10580g.f14504c[i18]) {
                                                            this.f28624p[i18].zzr();
                                                        }
                                                        i18++;
                                                        i17 = 2;
                                                    } else {
                                                        q88 q88Var3 = this.f28603J;
                                                        if (!q88Var3.f23765g && q88Var3.f23775q < 500000 && m8539F()) {
                                                            if (this.f28621b0 == -9223372036854775807L) {
                                                                j2 = SystemClock.elapsedRealtime();
                                                                this.f28621b0 = j2;
                                                                boolean z16 = !m8535J() && this.f28603J.f23763e == i2;
                                                                z4 = !this.f28614U && this.f28613T && z16;
                                                                q88Var = this.f28603J;
                                                                if (q88Var.f23773o == z4) {
                                                                    j3 = j12;
                                                                    z5 = z16;
                                                                    z6 = z4;
                                                                    this.f28603J = new q88(q88Var.f23759a, q88Var.f23760b, q88Var.f23761c, q88Var.f23762d, q88Var.f23763e, q88Var.f23764f, q88Var.f23765g, q88Var.f23766h, q88Var.f23767i, q88Var.f23768j, q88Var.f23769k, q88Var.f23770l, q88Var.f23771m, q88Var.f23772n, q88Var.f23774p, q88Var.f23775q, q88Var.f23776r, z6);
                                                                } else {
                                                                    z5 = z16;
                                                                    z6 = z4;
                                                                    j3 = j12;
                                                                }
                                                                this.f28613T = false;
                                                                if (!z6 && (i4 = this.f28603J.f23763e) != 4) {
                                                                    if (!z5 && i4 != 2) {
                                                                        if (i4 == 3 && this.f28615V != 0) {
                                                                            m8491s(j3, 1000L);
                                                                        }
                                                                    }
                                                                    m8491s(j3, 10L);
                                                                }
                                                                Trace.endSection();
                                                            } else if (SystemClock.elapsedRealtime() - this.f28621b0 >= 4000) {
                                                                throw new IllegalStateException("Playback stuck buffering and not loading");
                                                            } else {
                                                                if (m8535J()) {
                                                                }
                                                                if (this.f28614U) {
                                                                }
                                                                q88Var = this.f28603J;
                                                                if (q88Var.f23773o == z4) {
                                                                }
                                                                this.f28613T = false;
                                                                if (!z6) {
                                                                    if (!z5) {
                                                                        if (i4 == 3) {
                                                                            m8491s(j3, 1000L);
                                                                        }
                                                                    }
                                                                    m8491s(j3, 10L);
                                                                }
                                                                Trace.endSection();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            j2 = -9223372036854775807L;
                                            this.f28621b0 = j2;
                                            if (m8535J()) {
                                            }
                                            if (this.f28614U) {
                                            }
                                            q88Var = this.f28603J;
                                            if (q88Var.f23773o == z4) {
                                            }
                                            this.f28613T = false;
                                            if (!z6) {
                                            }
                                            Trace.endSection();
                                        }
                                    }
                                    q88 q88Var4 = this.f28603J;
                                    if (q88Var4.f23763e == 2) {
                                        if (this.f28615V == 0) {
                                            if (m8537H()) {
                                                m8487w(i2);
                                                this.f28620a0 = null;
                                                if (m8535J()) {
                                                    m8486x();
                                                }
                                                int i172 = 2;
                                                if (this.f28603J.f23763e == 2) {
                                                }
                                                j2 = -9223372036854775807L;
                                                this.f28621b0 = j2;
                                                if (m8535J()) {
                                                }
                                                if (this.f28614U) {
                                                }
                                                q88Var = this.f28603J;
                                                if (q88Var.f23773o == z4) {
                                                }
                                                this.f28613T = false;
                                                if (!z6) {
                                                }
                                                Trace.endSection();
                                            }
                                        } else if (z2) {
                                            if (q88Var4.f23765g) {
                                                long m2028b = m8534K(q88Var4.f23759a, this.f28599F.m10580g().f14507f.f18573a) ? this.f28623d0.m2028b() : -9223372036854775807L;
                                                j78 m10581f = this.f28599F.m10581f();
                                                boolean z17 = m10581f.m18742r() && m10581f.f14507f.f18581i;
                                                boolean z18 = m10581f.f14507f.f18573a.m16079b() && !m10581f.f14505d;
                                                if (!z17) {
                                                    if (!z18) {
                                                        break;
                                                    }
                                                }
                                            }
                                            m8487w(i2);
                                            this.f28620a0 = null;
                                            if (m8535J()) {
                                            }
                                            int i1722 = 2;
                                            if (this.f28603J.f23763e == 2) {
                                            }
                                            j2 = -9223372036854775807L;
                                            this.f28621b0 = j2;
                                            if (m8535J()) {
                                            }
                                            if (this.f28614U) {
                                            }
                                            q88Var = this.f28603J;
                                            if (q88Var.f23773o == z4) {
                                            }
                                            this.f28613T = false;
                                            if (!z6) {
                                            }
                                            Trace.endSection();
                                        }
                                    }
                                    if (this.f28603J.f23763e == i2) {
                                        if (this.f28615V == 0) {
                                            if (!m8537H()) {
                                                this.f28608O = m8535J();
                                                m8487w(2);
                                                if (this.f28608O) {
                                                    for (j78 m10580g3 = this.f28599F.m10580g(); m10580g3 != null; m10580g3 = m10580g3.m18753g()) {
                                                        for (tv8 tv8Var : m10580g3.m18751i().f10042c) {
                                                        }
                                                    }
                                                    this.f28623d0.m2027c();
                                                }
                                            }
                                        }
                                        m8484z();
                                    }
                                    int i17222 = 2;
                                    if (this.f28603J.f23763e == 2) {
                                    }
                                    j2 = -9223372036854775807L;
                                    this.f28621b0 = j2;
                                    if (m8535J()) {
                                    }
                                    if (this.f28614U) {
                                    }
                                    q88Var = this.f28603J;
                                    if (q88Var.f23773o == z4) {
                                    }
                                    this.f28613T = false;
                                    if (!z6) {
                                    }
                                    Trace.endSection();
                                }
                            }
                        }
                        j = uptimeMillis;
                        m10579h2 = this.f28599F.m10579h();
                        if (m10579h2 != null) {
                            j78 m10579h52 = this.f28599F.m10579h();
                            fw8 m18751i32 = m10579h52.m18751i();
                            i5 = 0;
                            boolean z132 = false;
                            while (true) {
                                i98[] i98VarArr42 = this.f28624p;
                                int length52 = i98VarArr42.length;
                                if (i5 >= 2) {
                                }
                                i5++;
                            }
                        }
                        z8 = false;
                        while (m8535J()) {
                            if (z8) {
                            }
                            m10583d = this.f28599F.m10583d();
                            Objects.requireNonNull(m10583d);
                            if (this.f28603J.f23760b.f18805a.equals(m10583d.f14507f.f18573a.f18805a)) {
                            }
                            z9 = false;
                            m78 m78Var22 = m10583d.f14507f;
                            pr8 pr8Var422 = m78Var22.f18573a;
                            long j1122 = m78Var22.f18574b;
                            this.f28603J = m8501i0(pr8Var422, j1122, m78Var22.f18575c, j1122, !z9, 0);
                            m8494p();
                            m8542C();
                            z8 = true;
                            i10 = -1;
                        }
                        i2 = 3;
                        i3 = this.f28603J.f23763e;
                        if (i3 != 1) {
                            m10580g = this.f28599F.m10580g();
                            long j122 = j;
                            if (m10580g != null) {
                            }
                        }
                    }
                    j = uptimeMillis;
                    i2 = 3;
                    i3 = this.f28603J.f23763e;
                    if (i3 != 1) {
                    }
                    break;
                case 3:
                    r68 r68Var = (r68) message.obj;
                    this.f28604K.m14520a(1);
                    Pair m8503h0 = m8503h0(this.f28603J.f23759a, r68Var, true, this.f28610Q, this.f28611R, this.f28634z, this.f28594A);
                    if (m8503h0 == null) {
                        Pair m8505g0 = m8505g0(this.f28603J.f23759a);
                        pr8Var = (pr8) m8505g0.first;
                        long longValue = ((Long) m8505g0.second).longValue();
                        j4 = -9223372036854775807L;
                        z10 = !this.f28603J.f23759a.m17121o();
                        j5 = longValue;
                    } else {
                        Object obj = m8503h0.first;
                        long longValue2 = ((Long) m8503h0.second).longValue();
                        j4 = r68Var.f24904c == -9223372036854775807L ? -9223372036854775807L : longValue2;
                        pr8 m10576k = this.f28599F.m10576k(this.f28603J.f23759a, obj, longValue2);
                        if (m10576k.m16079b()) {
                            this.f28603J.f23759a.mo13467n(m10576k.f18805a, this.f28594A);
                            if (this.f28594A.m24724e(m10576k.f18806b) == m10576k.f18807c) {
                                this.f28594A.m24720i();
                            }
                            pr8Var = m10576k;
                            j5 = 0;
                            z10 = true;
                        } else {
                            pr8Var = m10576k;
                            z10 = r68Var.f24904c == -9223372036854775807L;
                            j5 = longValue2;
                        }
                    }
                    try {
                    } catch (Throwable th3) {
                        th = th3;
                        j6 = j4;
                    }
                    try {
                        if (this.f28603J.f23759a.m17121o()) {
                            this.f28616W = r68Var;
                        } else if (m8503h0 == null) {
                            if (this.f28603J.f23763e != 1) {
                                m8487w(4);
                            }
                            m8495o(false, true, false, true);
                        } else {
                            try {
                                if (pr8Var.equals(this.f28603J.f23760b)) {
                                    j78 m10580g4 = this.f28599F.m10580g();
                                    j8 = (m10580g4 == null || !m10580g4.f14505d || j5 == 0) ? j5 : m10580g4.f14502a.mo3298h(j5, this.f28602I);
                                    j6 = j4;
                                    try {
                                        if (it5.m19386j0(j8) == it5.m19386j0(this.f28603J.f23776r) && ((i6 = (q88Var2 = this.f28603J).f23763e) == 2 || i6 == 3)) {
                                            long j14 = q88Var2.f23776r;
                                            m8501i0 = m8501i0(pr8Var, j14, j6, j14, z10, 2);
                                            this.f28603J = m8501i0;
                                            break;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        th = th;
                                        th2 = th;
                                        z11 = z10;
                                        j7 = j5;
                                        this.f28603J = m8501i0(pr8Var, j7, j6, j7, z11, 2);
                                        throw th2;
                                    }
                                } else {
                                    j6 = j4;
                                    j8 = j5;
                                }
                                q88 q88Var5 = this.f28603J;
                                l64 l64Var2 = q88Var5.f23759a;
                                m8541D(l64Var2, pr8Var, l64Var2, q88Var5.f23760b, j6);
                                m8501i0 = m8501i0(pr8Var, m8509e0, j6, m8509e0, z10, 2);
                                this.f28603J = m8501i0;
                            } catch (Throwable th5) {
                                th2 = th5;
                                z11 = z10;
                                j7 = m8509e0;
                                this.f28603J = m8501i0(pr8Var, j7, j6, j7, z11, 2);
                                throw th2;
                            }
                            m8509e0 = m8509e0(pr8Var, j8, this.f28603J.f23763e == 4);
                            z10 |= j5 != m8509e0;
                        }
                        j6 = j4;
                        m8509e0 = j5;
                        m8501i0 = m8501i0(pr8Var, m8509e0, j6, m8509e0, z10, 2);
                        this.f28603J = m8501i0;
                    } catch (Throwable th6) {
                        th = th6;
                        j6 = j4;
                        th2 = th;
                        z11 = z10;
                        j7 = j5;
                        this.f28603J = m8501i0(pr8Var, j7, j6, j7, z11, 2);
                        throw th2;
                    }
                    break;
                case 4:
                    this.f28596C.mo19439l((pp3) message.obj);
                    m8499k(this.f28596C.zzc(), true);
                    break;
                case 5:
                    this.f28602I = (aa8) message.obj;
                    break;
                case 6:
                    m8485y(false, true);
                    break;
                case 7:
                    m8495o(true, false, true, false);
                    this.f28629u.zzc();
                    m8487w(1);
                    this.f28632x.quit();
                    synchronized (this) {
                        this.f28605L = true;
                        notifyAll();
                    }
                    return true;
                case 8:
                    if (this.f28599F.m10572o((nr8) message.obj)) {
                        j78 m10581f2 = this.f28599F.m10581f();
                        m10581f2.m18748l(this.f28596C.zzc().f23131a, this.f28603J.f23759a);
                        m8543B(m10581f2.m18752h(), m10581f2.m18751i());
                        if (m10581f2 == this.f28599F.m10580g()) {
                            m8493q(m10581f2.f14507f.f18574b);
                            m8508f();
                            q88 q88Var6 = this.f28603J;
                            pr8 pr8Var5 = q88Var6.f23760b;
                            long j15 = m10581f2.f14507f.f18574b;
                            this.f28603J = m8501i0(pr8Var5, j15, q88Var6.f23761c, j15, false, 5);
                        }
                        m8497m();
                        break;
                    }
                    break;
                case 9:
                    if (this.f28599F.m10572o((nr8) message.obj)) {
                        this.f28599F.m10573n(this.f28617X);
                        m8497m();
                        break;
                    }
                    break;
                case 10:
                    float f = this.f28596C.zzc().f23131a;
                    j78 m10580g5 = this.f28599F.m10580g();
                    j78 m10579h6 = this.f28599F.m10579h();
                    boolean z19 = true;
                    while (m10580g5 != null && m10580g5.f14505d) {
                        fw8 m18750j = m10580g5.m18750j(f, this.f28603J.f23759a);
                        fw8 m18751i4 = m10580g5.m18751i();
                        if (m18751i4 != null && m18751i4.f10042c.length == m18750j.f10042c.length) {
                            for (int i19 = 0; i19 < m18750j.f10042c.length; i19++) {
                                if (m18750j.m22182a(m18751i4, i19)) {
                                }
                            }
                            z19 &= m10580g5 != m10579h6;
                            m10580g5 = m10580g5.m18753g();
                        }
                        if (z19) {
                            j78 m10580g6 = this.f28599F.m10580g();
                            boolean m10571p = this.f28599F.m10571p(m10580g6);
                            int length8 = this.f28624p.length;
                            boolean[] zArr = new boolean[2];
                            long m18758b = m10580g6.m18758b(m18750j, this.f28603J.f23776r, m10571p, zArr);
                            q88 q88Var7 = this.f28603J;
                            boolean z20 = (q88Var7.f23763e == 4 || m18758b == q88Var7.f23776r) ? false : true;
                            q88 q88Var8 = this.f28603J;
                            i7 = 2;
                            j78 j78Var = m10580g6;
                            this.f28603J = m8501i0(q88Var8.f23760b, m18758b, q88Var8.f23761c, q88Var8.f23762d, z20, 5);
                            if (z20) {
                                m8493q(m18758b);
                            }
                            int length9 = this.f28624p.length;
                            boolean[] zArr2 = new boolean[2];
                            int i20 = 0;
                            while (true) {
                                i98[] i98VarArr7 = this.f28624p;
                                int length10 = i98VarArr7.length;
                                if (i20 < 2) {
                                    i98 i98Var6 = i98VarArr7[i20];
                                    boolean m8538G = m8538G(i98Var6);
                                    zArr2[i20] = m8538G;
                                    j78 j78Var2 = j78Var;
                                    mt8 mt8Var4 = j78Var2.f14504c[i20];
                                    if (m8538G) {
                                        if (mt8Var4 != i98Var6.zzm()) {
                                            m8510e(i98Var6);
                                        } else if (zArr[i20]) {
                                            i98Var6.mo15113b(this.f28617X);
                                        }
                                    }
                                    i20++;
                                    j78Var = j78Var2;
                                } else {
                                    m8506g(zArr2);
                                }
                            }
                        } else {
                            i7 = 2;
                            this.f28599F.m10571p(m10580g5);
                            if (m10580g5.f14505d) {
                                m10580g5.m18759a(m18750j, Math.max(m10580g5.f14507f.f18574b, this.f28617X - m10580g5.m18755e()), false);
                            }
                        }
                        m8502i(true);
                        if (this.f28603J.f23763e != 4) {
                            m8497m();
                            m8542C();
                            this.f28631w.mo5886i(i7);
                            break;
                        }
                    }
                    break;
                case 11:
                    int i21 = message.arg1;
                    this.f28610Q = i21;
                    if (!this.f28599F.m10568s(this.f28603J.f23759a, i21)) {
                        m8490t(true);
                    }
                    m8502i(false);
                    break;
                case 12:
                    boolean z21 = message.arg1 != 0;
                    this.f28611R = z21;
                    if (!this.f28599F.m10567t(this.f28603J.f23759a, z21)) {
                        m8490t(true);
                    }
                    m8502i(false);
                    break;
                case 13:
                    boolean z22 = message.arg1 != 0;
                    AtomicBoolean atomicBoolean = (AtomicBoolean) message.obj;
                    if (this.f28612S != z22) {
                        this.f28612S = z22;
                        if (!z22) {
                            i98[] i98VarArr8 = this.f28624p;
                            int length11 = i98VarArr8.length;
                            for (int i22 = 0; i22 < 2; i22++) {
                                i98 i98Var7 = i98VarArr8[i22];
                                if (!m8538G(i98Var7) && this.f28625q.remove(i98Var7)) {
                                    i98Var7.zzA();
                                }
                            }
                        }
                    }
                    if (atomicBoolean != null) {
                        synchronized (this) {
                            atomicBoolean.set(true);
                            notifyAll();
                        }
                        break;
                    }
                    break;
                case 14:
                    m8489u((z88) message.obj);
                    break;
                case 15:
                    final z88 z88Var = (z88) message.obj;
                    Looper m2608b = z88Var.m2608b();
                    if (m2608b.getThread().isAlive()) {
                        this.f28598E.mo4854a(m2608b, null).mo5893b(new Runnable() { // from class: com.daaw.p58
                            @Override // java.lang.Runnable
                            public final void run() {
                                u68.m8517a0(z88Var);
                            }
                        });
                        break;
                    } else {
                        s95.m10493e("TAG", "Trying to send message on a dead thread.");
                        z88Var.m2602h(false);
                        break;
                    }
                case 16:
                    m8499k((pp3) message.obj, false);
                    break;
                case 17:
                    y58 y58Var = (y58) message.obj;
                    this.f28604K.m14520a(1);
                    i8 = y58Var.f33383b;
                    if (i8 != -1) {
                        list2 = y58Var.f33382a;
                        wt8Var2 = y58Var.f33385d;
                        c98 c98Var = new c98(list2, wt8Var2, null);
                        i9 = y58Var.f33383b;
                        j9 = y58Var.f33384c;
                        this.f28616W = new r68(c98Var, i9, j9);
                    }
                    n88 n88Var = this.f28600G;
                    list = y58Var.f33382a;
                    wt8Var = y58Var.f33385d;
                    m15400m = n88Var.m15400m(list, wt8Var);
                    m8500j(m15400m, false);
                    break;
                case 18:
                    y58 y58Var2 = (y58) message.obj;
                    int i23 = message.arg1;
                    this.f28604K.m14520a(1);
                    n88 n88Var2 = this.f28600G;
                    if (i23 == -1) {
                        i23 = n88Var2.m15412a();
                    }
                    list3 = y58Var2.f33382a;
                    wt8Var3 = y58Var2.f33385d;
                    m15400m = n88Var2.m15403j(i23, list3, wt8Var3);
                    m8500j(m15400m, false);
                    break;
                case 19:
                    this.f28604K.m14520a(1);
                    n88 n88Var3 = this.f28600G;
                    int i24 = ((b68) message.obj).f4377a;
                    m15400m = n88Var3.m15402k(0, 0, 0, null);
                    m8500j(m15400m, false);
                    break;
                case 20:
                    this.f28604K.m14520a(1);
                    m15400m = this.f28600G.m15401l(message.arg1, message.arg2, (wt8) message.obj);
                    m8500j(m15400m, false);
                    break;
                case 21:
                    this.f28604K.m14520a(1);
                    m15400m = this.f28600G.m15399n((wt8) message.obj);
                    m8500j(m15400m, false);
                    break;
                case 22:
                    m8500j(this.f28600G.m15411b(), true);
                    break;
                case 23:
                    this.f28606M = message.arg1 != 0;
                    m8494p();
                    if (this.f28607N && this.f28599F.m10579h() != this.f28599F.m10580g()) {
                        m8490t(true);
                        m8502i(false);
                        break;
                    }
                    break;
                case 24:
                    boolean z23 = message.arg1 == 1;
                    if (z23 != this.f28614U) {
                        this.f28614U = z23;
                        if (!z23 && this.f28603J.f23773o) {
                            this.f28631w.mo5886i(2);
                            break;
                        }
                    }
                    break;
                case 25:
                    m8490t(true);
                    break;
                default:
                    return false;
            }
        } catch (dl3 e) {
            m8504h(e, e.f7427q == 1 ? true != e.f7426p ? 3003 : 3001 : 1000);
        } catch (fn8 e2) {
            fn8 fn8Var = e2;
            i = fn8Var.f9711p;
            iOException = fn8Var;
            m8504h(iOException, i);
        } catch (s56 e3) {
            s56 s56Var = e3;
            i = s56Var.f25888p;
            iOException = s56Var;
            m8504h(iOException, i);
        } catch (vu7 e4) {
            vu7 vu7Var = e4;
            if (vu7Var.f30607s == 1 && (m10579h = this.f28599F.m10579h()) != null) {
                vu7Var = vu7Var.m6774a(m10579h.f14507f.f18573a);
            }
            if (vu7Var.f30613y && this.f28620a0 == null) {
                s95.m10492f("ExoPlayerImplInternal", "Recoverable renderer error", vu7Var);
                this.f28620a0 = vu7Var;
                vz4 vz4Var = this.f28631w;
                vz4Var.mo5891d(vz4Var.mo5892c(25, vu7Var));
            } else {
                vu7 vu7Var2 = this.f28620a0;
                if (vu7Var2 != null) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(vu7Var2, vu7Var);
                    } catch (Exception unused) {
                    }
                    vu7Var = this.f28620a0;
                }
                s95.m10495c("ExoPlayerImplInternal", "Playback error", vu7Var);
                z = true;
                m8485y(true, false);
                this.f28603J = this.f28603J.m12704d(vu7Var);
            }
        } catch (IOException e5) {
            iOException = e5;
            i = 2000;
            m8504h(iOException, i);
        } catch (RuntimeException e6) {
            vu7 m6771d = vu7.m6771d(e6, ((e6 instanceof IllegalStateException) || (e6 instanceof IllegalArgumentException)) ? 1004 : 1000);
            s95.m10495c("ExoPlayerImplInternal", "Playback error", m6771d);
            m8485y(true, false);
            this.f28603J = this.f28603J.m12704d(m6771d);
        }
        z = true;
        m8496n();
        return z;
    }

    /* renamed from: i */
    public final void m8502i(boolean z) {
        j78 m10581f = this.f28599F.m10581f();
        pr8 pr8Var = m10581f == null ? this.f28603J.f23760b : m10581f.f14507f.f18573a;
        boolean z2 = !this.f28603J.f23769k.equals(pr8Var);
        if (z2) {
            this.f28603J = this.f28603J.m12707a(pr8Var);
        }
        q88 q88Var = this.f28603J;
        q88Var.f23774p = m10581f == null ? q88Var.f23776r : m10581f.m18757c();
        this.f28603J.f23775q = m8513c0();
        if ((z2 || z) && m10581f != null && m10581f.f14505d) {
            m8543B(m10581f.m18752h(), m10581f.m18751i());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q88 m8501i0(pr8 pr8Var, long j, long j2, long j3, boolean z, int i) {
        y17 y17Var;
        au8 au8Var;
        fw8 fw8Var;
        this.f28619Z = (!this.f28619Z && j == this.f28603J.f23776r && pr8Var.equals(this.f28603J.f23760b)) ? false : true;
        m8494p();
        q88 q88Var = this.f28603J;
        au8 au8Var2 = q88Var.f23766h;
        fw8 fw8Var2 = q88Var.f23767i;
        List list = q88Var.f23768j;
        if (this.f28600G.m15404i()) {
            j78 m10580g = this.f28599F.m10580g();
            au8Var2 = m10580g == null ? au8.f3666d : m10580g.m18752h();
            fw8Var2 = m10580g == null ? this.f28628t : m10580g.m18751i();
            tv8[] tv8VarArr = fw8Var2.f10042c;
            v17 v17Var = new v17();
            boolean z2 = false;
            for (tv8 tv8Var : tv8VarArr) {
                if (tv8Var != null) {
                    zzbq zzbqVar = tv8Var.mo4482b(0).f9273j;
                    if (zzbqVar == null) {
                        v17Var.m7548f(new zzbq(-9223372036854775807L, new zzbp[0]));
                    } else {
                        v17Var.m7548f(zzbqVar);
                        z2 = true;
                    }
                }
            }
            y17 m7546h = z2 ? v17Var.m7546h() : y17.m4260u();
            if (m10580g != null) {
                m78 m78Var = m10580g.f14507f;
                if (m78Var.f18575c != j2) {
                    m10580g.f14507f = m78Var.m16185a(j2);
                }
            }
            y17Var = m7546h;
        } else if (!pr8Var.equals(this.f28603J.f23760b)) {
            au8Var = au8.f3666d;
            fw8Var = this.f28628t;
            y17Var = y17.m4260u();
            if (z) {
                this.f28604K.m14517d(i);
            }
            return this.f28603J.m12706b(pr8Var, j, j2, j3, m8513c0(), au8Var, fw8Var, y17Var);
        } else {
            y17Var = list;
        }
        au8Var = au8Var2;
        fw8Var = fw8Var2;
        if (z) {
        }
        return this.f28603J.m12706b(pr8Var, j, j2, j3, m8513c0(), au8Var, fw8Var, y17Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x035d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bd  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.daaw.d34] */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.daaw.r68] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.daaw.l64] */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.daaw.l64] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8500j(l64 l64Var, boolean z) {
        pr8 pr8Var;
        s78 s78Var;
        int i;
        Object obj;
        long j;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        boolean z5;
        long j2;
        pr8 m10576k;
        boolean z6;
        long j3;
        pr8 pr8Var2;
        boolean z7;
        boolean z8;
        u68 u68Var;
        long j4;
        boolean z9;
        int i5;
        boolean z10;
        int i6;
        boolean z11;
        boolean z12;
        boolean z13;
        long j5;
        boolean z14;
        boolean z15;
        r68 r68Var;
        long j6;
        q88 q88Var = this.f28603J;
        r68 r68Var2 = this.f28616W;
        s78 s78Var2 = this.f28599F;
        int i7 = this.f28610Q;
        boolean z16 = this.f28611R;
        i54 i54Var = this.f28634z;
        ?? r14 = this.f28594A;
        boolean z17 = true;
        if (l64Var.m17121o()) {
            pr8Var2 = q88.m12700h();
            u68Var = this;
            j3 = -9223372036854775807;
            z7 = false;
            z9 = true;
            z8 = false;
            z13 = -1;
            j4 = 0;
        } else {
            pr8 pr8Var3 = q88Var.f23760b;
            Object obj2 = pr8Var3.f18805a;
            boolean m8536I = m8536I(q88Var, r14);
            long j7 = (q88Var.f23760b.m16079b() || m8536I) ? q88Var.f23761c : q88Var.f23776r;
            if (r68Var2 != null) {
                pr8Var = pr8Var3;
                s78Var = s78Var2;
                i = -1;
                Pair m8503h0 = m8503h0(l64Var, r68Var2, true, i7, z16, i54Var, r14);
                if (m8503h0 == null) {
                    i6 = l64Var.mo4800g(z16);
                    j = j7;
                    z5 = true;
                    z11 = false;
                    z12 = false;
                } else {
                    if (r68Var2.f24904c == -9223372036854775807L) {
                        i6 = l64Var.mo13467n(m8503h0.first, r14).f6450c;
                        j = j7;
                        z10 = false;
                    } else {
                        obj2 = m8503h0.first;
                        j = ((Long) m8503h0.second).longValue();
                        z10 = true;
                        i6 = -1;
                    }
                    z11 = q88Var.f23763e == 4;
                    z12 = z10;
                    z5 = false;
                }
                z2 = z11;
                i2 = i6;
                z4 = z12;
            } else {
                pr8Var = pr8Var3;
                s78Var = s78Var2;
                i = -1;
                if (q88Var.f23759a.m17121o()) {
                    i3 = l64Var.mo4800g(z16);
                } else if (l64Var.mo4511a(obj2) == -1) {
                    Object m8526S = m8526S(i54Var, r14, i7, z16, obj2, q88Var.f23759a, l64Var);
                    if (m8526S == null) {
                        i4 = l64Var.mo4800g(z16);
                        z5 = true;
                    } else {
                        i4 = l64Var.mo13467n(m8526S, r14).f6450c;
                        z5 = false;
                    }
                    i2 = i4;
                    j = j7;
                    z2 = false;
                    z4 = false;
                } else if (j7 == -9223372036854775807L) {
                    i3 = l64Var.mo13467n(obj2, r14).f6450c;
                } else if (m8536I) {
                    q88Var.f23759a.mo13467n(pr8Var.f18805a, r14);
                    if (q88Var.f23759a.mo1923e(r14.f6450c, i54Var, 0L).f13279m == q88Var.f23759a.mo4511a(pr8Var.f18805a)) {
                        Pair m17123l = l64Var.m17123l(i54Var, r14, l64Var.mo13467n(obj2, r14).f6450c, j7);
                        obj2 = m17123l.first;
                        j = ((Long) m17123l.second).longValue();
                    } else {
                        j = j7;
                    }
                    obj = obj2;
                    i2 = -1;
                    z2 = false;
                    z3 = false;
                    z4 = true;
                    if (i2 == i) {
                        Pair m17123l2 = l64Var.m17123l(i54Var, r14, i2, -9223372036854775807L);
                        obj = m17123l2.first;
                        j2 = ((Long) m17123l2.second).longValue();
                        j = -9223372036854775807L;
                    } else {
                        j2 = j;
                    }
                    m10576k = s78Var.m10576k(l64Var, obj, j2);
                    int i8 = m10576k.f18809e;
                    z6 = (pr8Var.f18805a.equals(obj) || pr8Var.m16079b() || m10576k.m16079b() || !(i8 != i || ((i5 = pr8Var.f18809e) != i && i8 >= i5))) ? false : true;
                    d34 mo13467n = l64Var.mo13467n(obj, r14);
                    if (!m8536I && j7 == j && pr8Var.f18805a.equals(m10576k.f18805a)) {
                        if (pr8Var.m16079b()) {
                            mo13467n.m24717l(pr8Var.f18806b);
                        }
                        if (m10576k.m16079b()) {
                            mo13467n.m24717l(m10576k.f18806b);
                        }
                    }
                    if (true == z6) {
                        m10576k = pr8Var;
                    }
                    if (m10576k.m16079b()) {
                        if (m10576k.equals(pr8Var)) {
                            j2 = q88Var.f23776r;
                        } else {
                            l64Var.mo13467n(m10576k.f18805a, r14);
                            if (m10576k.f18807c == r14.m24724e(m10576k.f18806b)) {
                                r14.m24720i();
                            }
                            j2 = 0;
                        }
                    }
                    j3 = j;
                    pr8Var2 = m10576k;
                    z7 = z2;
                    z17 = z3;
                    z8 = z4;
                    u68Var = this;
                    j4 = j2;
                    z9 = true;
                    z13 = i;
                } else {
                    obj = obj2;
                    j = j7;
                    i2 = -1;
                    z2 = false;
                    z3 = false;
                    z4 = false;
                    if (i2 == i) {
                    }
                    m10576k = s78Var.m10576k(l64Var, obj, j2);
                    int i82 = m10576k.f18809e;
                    if (pr8Var.f18805a.equals(obj)) {
                    }
                    d34 mo13467n2 = l64Var.mo13467n(obj, r14);
                    if (!m8536I) {
                        if (pr8Var.m16079b()) {
                        }
                        if (m10576k.m16079b()) {
                        }
                    }
                    if (true == z6) {
                    }
                    if (m10576k.m16079b()) {
                    }
                    j3 = j;
                    pr8Var2 = m10576k;
                    z7 = z2;
                    z17 = z3;
                    z8 = z4;
                    u68Var = this;
                    j4 = j2;
                    z9 = true;
                    z13 = i;
                }
                i2 = i3;
                obj = obj2;
                j = j7;
                z2 = false;
                z3 = false;
                z4 = false;
                if (i2 == i) {
                }
                m10576k = s78Var.m10576k(l64Var, obj, j2);
                int i822 = m10576k.f18809e;
                if (pr8Var.f18805a.equals(obj)) {
                }
                d34 mo13467n22 = l64Var.mo13467n(obj, r14);
                if (!m8536I) {
                }
                if (true == z6) {
                }
                if (m10576k.m16079b()) {
                }
                j3 = j;
                pr8Var2 = m10576k;
                z7 = z2;
                z17 = z3;
                z8 = z4;
                u68Var = this;
                j4 = j2;
                z9 = true;
                z13 = i;
            }
            Object obj3 = obj2;
            z3 = z5;
            obj = obj3;
            if (i2 == i) {
            }
            m10576k = s78Var.m10576k(l64Var, obj, j2);
            int i8222 = m10576k.f18809e;
            if (pr8Var.f18805a.equals(obj)) {
            }
            d34 mo13467n222 = l64Var.mo13467n(obj, r14);
            if (!m8536I) {
            }
            if (true == z6) {
            }
            if (m10576k.m16079b()) {
            }
            j3 = j;
            pr8Var2 = m10576k;
            z7 = z2;
            z17 = z3;
            z8 = z4;
            u68Var = this;
            j4 = j2;
            z9 = true;
            z13 = i;
        }
        boolean z18 = (u68Var.f28603J.f23760b.equals(pr8Var2) && j4 == u68Var.f28603J.f23776r) ? false : true;
        if (z17) {
            try {
                if (u68Var.f28603J.f23763e != z9) {
                    u68Var.m8487w(4);
                }
                u68Var.m8495o(false, false, false, z9);
            } catch (Throwable th) {
                th = th;
                j5 = j3;
                z13 = true;
                j3 = 0;
                r14 = 0;
                q88 q88Var2 = u68Var.f28603J;
                m8541D(l64Var, pr8Var2, q88Var2.f23759a, q88Var2.f23760b, z13 != z8 ? -9223372036854775807L : j4);
                if (!z18 || j5 != u68Var.f28603J.f23761c) {
                    q88 q88Var3 = u68Var.f28603J;
                    Object obj4 = q88Var3.f23760b.f18805a;
                    l64 l64Var2 = q88Var3.f23759a;
                    u68Var.f28603J = m8501i0(pr8Var2, j4, j5, u68Var.f28603J.f23762d, (z18 || !z || l64Var2.m17121o() || l64Var2.mo13467n(obj4, u68Var.f28594A).f6453f) ? false : false, l64Var.mo4511a(obj4) == -1 ? 4 : 3);
                }
                m8494p();
                u68Var.m8492r(l64Var, u68Var.f28603J.f23759a);
                u68Var.f28603J = u68Var.f28603J.m12702f(l64Var);
                if (!l64Var.m17121o()) {
                    u68Var.f28616W = r14;
                }
                u68Var.m8502i(j3);
                throw th;
            }
        }
        try {
            if (z18) {
                j5 = j3;
                z14 = true;
                z15 = false;
                r68Var = null;
                if (!l64Var.m17121o()) {
                    for (j78 m10580g = u68Var.f28599F.m10580g(); m10580g != null; m10580g = m10580g.m18753g()) {
                        if (m10580g.f14507f.f18573a.equals(pr8Var2)) {
                            m10580g.f14507f = u68Var.f28599F.m10577j(l64Var, m10580g.f14507f);
                            m10580g.m18743q();
                        }
                    }
                    j4 = u68Var.m8509e0(pr8Var2, j4, z7);
                }
            } else {
                s78 s78Var3 = u68Var.f28599F;
                long j8 = u68Var.f28617X;
                j78 m10579h = s78Var3.m10579h();
                if (m10579h == null) {
                    j5 = j3;
                    j6 = 0;
                } else {
                    long m18755e = m10579h.m18755e();
                    if (m10579h.f14505d) {
                        j6 = m18755e;
                        int i9 = 0;
                        j3 = j3;
                        while (true) {
                            i98[] i98VarArr = u68Var.f28624p;
                            j5 = j3;
                            try {
                                int length = i98VarArr.length;
                                if (i9 >= 2) {
                                    break;
                                }
                                if (m8538G(i98VarArr[i9]) && u68Var.f28624p[i9].zzm() == m10579h.f14504c[i9]) {
                                    long zzf = u68Var.f28624p[i9].zzf();
                                    if (zzf == Long.MIN_VALUE) {
                                        j6 = Long.MIN_VALUE;
                                        break;
                                    }
                                    j6 = Math.max(zzf, j6);
                                }
                                i9++;
                                j3 = j5;
                            } catch (Throwable th2) {
                                th = th2;
                                z13 = true;
                                j3 = 0;
                                r14 = 0;
                                q88 q88Var22 = u68Var.f28603J;
                                m8541D(l64Var, pr8Var2, q88Var22.f23759a, q88Var22.f23760b, z13 != z8 ? -9223372036854775807L : j4);
                                if (!z18) {
                                }
                                q88 q88Var32 = u68Var.f28603J;
                                Object obj42 = q88Var32.f23760b.f18805a;
                                l64 l64Var22 = q88Var32.f23759a;
                                u68Var.f28603J = m8501i0(pr8Var2, j4, j5, u68Var.f28603J.f23762d, (z18 || !z || l64Var22.m17121o() || l64Var22.mo13467n(obj42, u68Var.f28594A).f6453f) ? false : false, l64Var.mo4511a(obj42) == -1 ? 4 : 3);
                                m8494p();
                                u68Var.m8492r(l64Var, u68Var.f28603J.f23759a);
                                u68Var.f28603J = u68Var.f28603J.m12702f(l64Var);
                                if (!l64Var.m17121o()) {
                                }
                                u68Var.m8502i(j3);
                                throw th;
                            }
                        }
                    } else {
                        j5 = j3;
                        j6 = m18755e;
                    }
                }
                z15 = false;
                z14 = true;
                r68Var = null;
                if (!s78Var3.m10569r(l64Var, j8, j6)) {
                    u68Var.m8490t(false);
                }
            }
            q88 q88Var4 = u68Var.f28603J;
            m8541D(l64Var, pr8Var2, q88Var4.f23759a, q88Var4.f23760b, z14 != z8 ? -9223372036854775807L : j4);
            if (z18 || j5 != u68Var.f28603J.f23761c) {
                q88 q88Var5 = u68Var.f28603J;
                Object obj5 = q88Var5.f23760b.f18805a;
                l64 l64Var3 = q88Var5.f23759a;
                u68Var.f28603J = m8501i0(pr8Var2, j4, j5, u68Var.f28603J.f23762d, (!z18 || !z || l64Var3.m17121o() || l64Var3.mo13467n(obj5, u68Var.f28594A).f6453f) ? false : false, l64Var.mo4511a(obj5) == -1 ? 4 : 3);
            }
            m8494p();
            u68Var.m8492r(l64Var, u68Var.f28603J.f23759a);
            u68Var.f28603J = u68Var.f28603J.m12702f(l64Var);
            if (!l64Var.m17121o()) {
                u68Var.f28616W = r68Var;
            }
            u68Var.m8502i(z15);
        } catch (Throwable th3) {
            th = th3;
            q88 q88Var222 = u68Var.f28603J;
            m8541D(l64Var, pr8Var2, q88Var222.f23759a, q88Var222.f23760b, z13 != z8 ? -9223372036854775807L : j4);
            if (!z18) {
            }
            q88 q88Var322 = u68Var.f28603J;
            Object obj422 = q88Var322.f23760b.f18805a;
            l64 l64Var222 = q88Var322.f23759a;
            u68Var.f28603J = m8501i0(pr8Var2, j4, j5, u68Var.f28603J.f23762d, (z18 || !z || l64Var222.m17121o() || l64Var222.mo13467n(obj422, u68Var.f28594A).f6453f) ? false : false, l64Var.mo4511a(obj422) == -1 ? 4 : 3);
            m8494p();
            u68Var.m8492r(l64Var, u68Var.f28603J.f23759a);
            u68Var.f28603J = u68Var.f28603J.m12702f(l64Var);
            if (!l64Var.m17121o()) {
            }
            u68Var.m8502i(j3);
            throw th;
        }
    }

    /* renamed from: k */
    public final void m8499k(pp3 pp3Var, boolean z) {
        m8498l(pp3Var, pp3Var.f23131a, true, z);
    }

    /* renamed from: l */
    public final void m8498l(pp3 pp3Var, float f, boolean z, boolean z2) {
        int i;
        u68 u68Var = this;
        if (z) {
            if (z2) {
                u68Var.f28604K.m14520a(1);
            }
            q88 q88Var = u68Var.f28603J;
            u68Var = this;
            u68Var.f28603J = new q88(q88Var.f23759a, q88Var.f23760b, q88Var.f23761c, q88Var.f23762d, q88Var.f23763e, q88Var.f23764f, q88Var.f23765g, q88Var.f23766h, q88Var.f23767i, q88Var.f23768j, q88Var.f23769k, q88Var.f23770l, q88Var.f23771m, pp3Var, q88Var.f23774p, q88Var.f23775q, q88Var.f23776r, q88Var.f23773o);
        }
        float f2 = pp3Var.f23131a;
        j78 m10580g = u68Var.f28599F.m10580g();
        while (true) {
            i = 0;
            if (m10580g == null) {
                break;
            }
            tv8[] tv8VarArr = m10580g.m18751i().f10042c;
            int length = tv8VarArr.length;
            while (i < length) {
                tv8 tv8Var = tv8VarArr[i];
                i++;
            }
            m10580g = m10580g.m18753g();
        }
        i98[] i98VarArr = u68Var.f28624p;
        int length2 = i98VarArr.length;
        while (i < 2) {
            i98 i98Var = i98VarArr[i];
            if (i98Var != null) {
                i98Var.mo9749e(f, pp3Var.f23131a);
            }
            i++;
        }
    }

    /* renamed from: m */
    public final void m8497m() {
        long m18755e;
        long j;
        boolean z = false;
        if (m8539F()) {
            j78 m10581f = this.f28599F.m10581f();
            long m8511d0 = m8511d0(m10581f.m18756d());
            if (m10581f == this.f28599F.m10580g()) {
                m18755e = this.f28617X;
                j = m10581f.m18755e();
            } else {
                m18755e = this.f28617X - m10581f.m18755e();
                j = m10581f.f14507f.f18574b;
            }
            long j2 = m18755e - j;
            boolean mo7404c = this.f28629u.mo7404c(j2, m8511d0, this.f28596C.zzc().f23131a);
            if (mo7404c || m8511d0 >= 500000 || this.f28595B <= 0) {
                z = mo7404c;
            } else {
                this.f28599F.m10580g().f14502a.mo3301e(this.f28603J.f23776r, false);
                z = this.f28629u.mo7404c(j2, m8511d0, this.f28596C.zzc().f23131a);
            }
        }
        this.f28609P = z;
        if (z) {
            this.f28599F.m10581f().m18749k(this.f28617X);
        }
        m8544A();
    }

    /* renamed from: n */
    public final void m8496n() {
        boolean z;
        this.f28604K.m14518c(this.f28603J);
        z = this.f28604K.f21091a;
        if (z) {
            x38 x38Var = this.f28622c0;
            x38Var.f32076a.m18800u(this.f28604K);
            this.f28604K = new o68(this.f28603J);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8495o(boolean z, boolean z2, boolean z3, boolean z4) {
        pr8 pr8Var;
        long j;
        long j2;
        boolean z5;
        this.f28631w.zze(2);
        this.f28620a0 = null;
        this.f28608O = false;
        this.f28596C.m19440f();
        this.f28617X = 1000000000000L;
        i98[] i98VarArr = this.f28624p;
        int length = i98VarArr.length;
        for (int i = 0; i < 2; i++) {
            try {
                m8510e(i98VarArr[i]);
            } catch (vu7 | RuntimeException e) {
                s95.m10495c("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        if (z) {
            i98[] i98VarArr2 = this.f28624p;
            int length2 = i98VarArr2.length;
            for (int i2 = 0; i2 < 2; i2++) {
                i98 i98Var = i98VarArr2[i2];
                if (this.f28625q.remove(i98Var)) {
                    try {
                        i98Var.zzA();
                    } catch (RuntimeException e2) {
                        s95.m10495c("ExoPlayerImplInternal", "Reset failed.", e2);
                    }
                }
            }
        }
        this.f28615V = 0;
        q88 q88Var = this.f28603J;
        pr8 pr8Var2 = q88Var.f23760b;
        long j3 = q88Var.f23776r;
        long j4 = (this.f28603J.f23760b.m16079b() || m8536I(this.f28603J, this.f28594A)) ? this.f28603J.f23761c : this.f28603J.f23776r;
        if (z2) {
            this.f28616W = null;
            Pair m8505g0 = m8505g0(this.f28603J.f23759a);
            pr8 pr8Var3 = (pr8) m8505g0.first;
            long longValue = ((Long) m8505g0.second).longValue();
            if (!pr8Var3.equals(this.f28603J.f23760b)) {
                z5 = true;
                pr8Var = pr8Var3;
                j = longValue;
                j2 = -9223372036854775807L;
                this.f28599F.m10575l();
                this.f28609P = false;
                q88 q88Var2 = this.f28603J;
                l64 l64Var = q88Var2.f23759a;
                int i3 = q88Var2.f23763e;
                vu7 vu7Var = z4 ? null : q88Var2.f23764f;
                au8 au8Var = !z5 ? au8.f3666d : q88Var2.f23766h;
                fw8 fw8Var = !z5 ? this.f28628t : q88Var2.f23767i;
                List m4260u = !z5 ? y17.m4260u() : q88Var2.f23768j;
                q88 q88Var3 = this.f28603J;
                this.f28603J = new q88(l64Var, pr8Var, j2, j, i3, vu7Var, false, au8Var, fw8Var, m4260u, pr8Var, q88Var3.f23770l, q88Var3.f23771m, q88Var3.f23772n, j, 0L, j, false);
                if (z3) {
                    return;
                }
                this.f28600G.m15406g();
                return;
            }
            pr8Var = pr8Var3;
            j = longValue;
            j2 = -9223372036854775807L;
        } else {
            pr8Var = pr8Var2;
            j = j3;
            j2 = j4;
        }
        z5 = false;
        this.f28599F.m10575l();
        this.f28609P = false;
        q88 q88Var22 = this.f28603J;
        l64 l64Var2 = q88Var22.f23759a;
        int i32 = q88Var22.f23763e;
        vu7 vu7Var2 = z4 ? null : q88Var22.f23764f;
        au8 au8Var2 = !z5 ? au8.f3666d : q88Var22.f23766h;
        fw8 fw8Var2 = !z5 ? this.f28628t : q88Var22.f23767i;
        List m4260u2 = !z5 ? y17.m4260u() : q88Var22.f23768j;
        q88 q88Var32 = this.f28603J;
        this.f28603J = new q88(l64Var2, pr8Var, j2, j, i32, vu7Var2, false, au8Var2, fw8Var2, m4260u2, pr8Var, q88Var32.f23770l, q88Var32.f23771m, q88Var32.f23772n, j, 0L, j, false);
        if (z3) {
        }
    }

    /* renamed from: p */
    public final void m8494p() {
        j78 m10580g = this.f28599F.m10580g();
        boolean z = false;
        if (m10580g != null && m10580g.f14507f.f18580h && this.f28606M) {
            z = true;
        }
        this.f28607N = z;
    }

    /* renamed from: q */
    public final void m8493q(long j) {
        tv8[] tv8VarArr;
        j78 m10580g = this.f28599F.m10580g();
        long m18755e = j + (m10580g == null ? 1000000000000L : m10580g.m18755e());
        this.f28617X = m18755e;
        this.f28596C.m19442d(m18755e);
        i98[] i98VarArr = this.f28624p;
        int length = i98VarArr.length;
        for (int i = 0; i < 2; i++) {
            i98 i98Var = i98VarArr[i];
            if (m8538G(i98Var)) {
                i98Var.mo15113b(this.f28617X);
            }
        }
        for (j78 m10580g2 = this.f28599F.m10580g(); m10580g2 != null; m10580g2 = m10580g2.m18753g()) {
            for (tv8 tv8Var : m10580g2.m18751i().f10042c) {
            }
        }
    }

    /* renamed from: r */
    public final void m8492r(l64 l64Var, l64 l64Var2) {
        if (l64Var.m17121o() && l64Var2.m17121o()) {
            return;
        }
        int size = this.f28597D.size() - 1;
        if (size < 0) {
            Collections.sort(this.f28597D);
            return;
        }
        Object obj = ((e68) this.f28597D.get(size)).f8203p;
        int i = it5.f13991a;
        throw null;
    }

    /* renamed from: s */
    public final void m8491s(long j, long j2) {
        this.f28631w.mo5888g(2, j + j2);
    }

    /* renamed from: t */
    public final void m8490t(boolean z) {
        pr8 pr8Var = this.f28599F.m10580g().f14507f.f18573a;
        long m8507f0 = m8507f0(pr8Var, this.f28603J.f23776r, true, false);
        if (m8507f0 != this.f28603J.f23776r) {
            q88 q88Var = this.f28603J;
            this.f28603J = m8501i0(pr8Var, m8507f0, q88Var.f23761c, q88Var.f23762d, z, 5);
        }
    }

    /* renamed from: u */
    public final void m8489u(z88 z88Var) {
        if (z88Var.m2608b() != this.f28633y) {
            this.f28631w.mo5892c(15, z88Var).zza();
            return;
        }
        m8532M(z88Var);
        int i = this.f28603J.f23763e;
        if (i == 3 || i == 2) {
            this.f28631w.mo5886i(2);
        }
    }

    /* renamed from: v */
    public final void m8488v(boolean z, int i, boolean z2, int i2) {
        tv8[] tv8VarArr;
        this.f28604K.m14520a(z2 ? 1 : 0);
        this.f28604K.m14519b(i2);
        this.f28603J = this.f28603J.m12705c(z, i);
        this.f28608O = false;
        for (j78 m10580g = this.f28599F.m10580g(); m10580g != null; m10580g = m10580g.m18753g()) {
            for (tv8 tv8Var : m10580g.m18751i().f10042c) {
            }
        }
        if (!m8535J()) {
            m8484z();
            m8542C();
            return;
        }
        int i3 = this.f28603J.f23763e;
        if (i3 == 3) {
            m8486x();
            this.f28631w.mo5886i(2);
        } else if (i3 == 2) {
            this.f28631w.mo5886i(2);
        }
    }

    /* renamed from: w */
    public final void m8487w(int i) {
        q88 q88Var = this.f28603J;
        if (q88Var.f23763e != i) {
            if (i != 2) {
                this.f28621b0 = -9223372036854775807L;
            }
            this.f28603J = q88Var.m12703e(i);
        }
    }

    /* renamed from: x */
    public final void m8486x() {
        this.f28608O = false;
        this.f28596C.m19441e();
        i98[] i98VarArr = this.f28624p;
        int length = i98VarArr.length;
        for (int i = 0; i < 2; i++) {
            i98 i98Var = i98VarArr[i];
            if (m8538G(i98Var)) {
                i98Var.zzE();
            }
        }
    }

    /* renamed from: y */
    public final void m8485y(boolean z, boolean z2) {
        m8495o(z || !this.f28612S, false, true, false);
        this.f28604K.m14520a(z2 ? 1 : 0);
        this.f28629u.zzd();
        m8487w(1);
    }

    /* renamed from: z */
    public final void m8484z() {
        this.f28596C.m19440f();
        i98[] i98VarArr = this.f28624p;
        int length = i98VarArr.length;
        for (int i = 0; i < 2; i++) {
            i98 i98Var = i98VarArr[i];
            if (m8538G(i98Var)) {
                m8531N(i98Var);
            }
        }
    }

    @Override // com.daaw.k88
    public final void zzh() {
        this.f28631w.mo5886i(22);
    }

    @Override // com.daaw.yv8
    public final void zzj() {
        this.f28631w.mo5886i(10);
    }
}
