package com.daaw;

import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.internal.ads.zzacn;
import com.google.android.gms.internal.ads.zzbq;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* loaded from: classes.dex */
public final class ys8 implements nr8, m09, tw8, yw8, kt8 {

    /* renamed from: a0 */
    public static final Map f34015a0;

    /* renamed from: b0 */
    public static final f92 f34016b0;

    /* renamed from: C */
    public mr8 f34019C;

    /* renamed from: D */
    public zzacn f34020D;

    /* renamed from: G */
    public boolean f34023G;

    /* renamed from: H */
    public boolean f34024H;

    /* renamed from: I */
    public boolean f34025I;

    /* renamed from: J */
    public xs8 f34026J;

    /* renamed from: K */
    public i42 f34027K;

    /* renamed from: M */
    public boolean f34029M;

    /* renamed from: O */
    public boolean f34031O;

    /* renamed from: P */
    public boolean f34032P;

    /* renamed from: Q */
    public int f34033Q;

    /* renamed from: R */
    public boolean f34034R;

    /* renamed from: S */
    public long f34035S;

    /* renamed from: U */
    public boolean f34037U;

    /* renamed from: V */
    public int f34038V;

    /* renamed from: W */
    public boolean f34039W;

    /* renamed from: X */
    public boolean f34040X;

    /* renamed from: Y */
    public final rw8 f34041Y;

    /* renamed from: Z */
    public final nw8 f34042Z;

    /* renamed from: p */
    public final Uri f34043p;

    /* renamed from: q */
    public final p46 f34044q;

    /* renamed from: r */
    public final vn8 f34045r;

    /* renamed from: s */
    public final yr8 f34046s;

    /* renamed from: t */
    public final jn8 f34047t;

    /* renamed from: u */
    public final us8 f34048u;

    /* renamed from: v */
    public final long f34049v;

    /* renamed from: x */
    public final os8 f34051x;

    /* renamed from: w */
    public final bx8 f34050w = new bx8("ProgressiveMediaPeriod");

    /* renamed from: y */
    public final ds4 f34052y = new ds4(xp4.f32865a);

    /* renamed from: z */
    public final Runnable f34053z = new Runnable() { // from class: com.daaw.ps8
        @Override // java.lang.Runnable
        public final void run() {
            ys8.this.m3321B();
        }
    };

    /* renamed from: A */
    public final Runnable f34017A = new Runnable() { // from class: com.daaw.qs8
        @Override // java.lang.Runnable
        public final void run() {
            ys8.this.m3289q();
        }
    };

    /* renamed from: B */
    public final Handler f34018B = it5.m19399d(null);

    /* renamed from: F */
    public ws8[] f34022F = new ws8[0];

    /* renamed from: E */
    public lt8[] f34021E = new lt8[0];

    /* renamed from: T */
    public long f34036T = -9223372036854775807L;

    /* renamed from: L */
    public long f34028L = -9223372036854775807L;

    /* renamed from: N */
    public int f34030N = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f34015a0 = Collections.unmodifiableMap(hashMap);
        b72 b72Var = new b72();
        b72Var.m26384h("icy");
        b72Var.m26372s("application/x-icy");
        f34016b0 = b72Var.m26366y();
    }

    public ys8(Uri uri, p46 p46Var, os8 os8Var, vn8 vn8Var, jn8 jn8Var, rw8 rw8Var, yr8 yr8Var, us8 us8Var, nw8 nw8Var, String str, int i, byte[] bArr) {
        this.f34043p = uri;
        this.f34044q = p46Var;
        this.f34045r = vn8Var;
        this.f34047t = jn8Var;
        this.f34041Y = rw8Var;
        this.f34046s = yr8Var;
        this.f34048u = us8Var;
        this.f34042Z = nw8Var;
        this.f34049v = i;
        this.f34051x = os8Var;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    /* renamed from: A */
    public final void m3322A() {
        uo4.m7872f(this.f34024H);
        Objects.requireNonNull(this.f34026J);
        Objects.requireNonNull(this.f34027K);
    }

    /* renamed from: B */
    public final void m3321B() {
        int i;
        if (this.f34040X || this.f34024H || !this.f34023G || this.f34027K == null) {
            return;
        }
        for (lt8 lt8Var : this.f34021E) {
            if (lt8Var.m16527x() == null) {
                return;
            }
        }
        this.f34052y.m24008c();
        int length = this.f34021E.length;
        r84[] r84VarArr = new r84[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            f92 m16527x = this.f34021E[i2].m16527x();
            Objects.requireNonNull(m16527x);
            String str = m16527x.f9275l;
            boolean m27383g = ak3.m27383g(str);
            boolean z = m27383g || ak3.m27382h(str);
            zArr[i2] = z;
            this.f34025I = z | this.f34025I;
            zzacn zzacnVar = this.f34020D;
            if (zzacnVar != null) {
                if (m27383g || this.f34022F[i2].f31493b) {
                    zzbq zzbqVar = m16527x.f9273j;
                    zzbq zzbqVar2 = zzbqVar == null ? new zzbq(-9223372036854775807L, zzacnVar) : zzbqVar.m1101c(zzacnVar);
                    b72 m22830b = m16527x.m22830b();
                    m22830b.m26378m(zzbqVar2);
                    m16527x = m22830b.m26366y();
                }
                if (m27383g && m16527x.f9269f == -1 && m16527x.f9270g == -1 && (i = zzacnVar.f36718p) != -1) {
                    b72 m22830b2 = m16527x.m22830b();
                    m22830b2.m26391d0(i);
                    m16527x = m22830b2.m26366y();
                }
            }
            r84VarArr[i2] = new r84(Integer.toString(i2), m16527x.m22829c(this.f34045r.mo6977a(m16527x)));
        }
        this.f34026J = new xs8(new au8(r84VarArr), zArr);
        this.f34024H = true;
        mr8 mr8Var = this.f34019C;
        Objects.requireNonNull(mr8Var);
        mr8Var.mo8512d(this);
    }

    /* renamed from: C */
    public final void m3320C(int i) {
        m3322A();
        xs8 xs8Var = this.f34026J;
        boolean[] zArr = xs8Var.f32937d;
        if (zArr[i]) {
            return;
        }
        f92 m11590b = xs8Var.f32934a.m26965b(i).m11590b(0);
        this.f34046s.m3369d(ak3.m27388b(m11590b.f9275l), m11590b, 0, null, this.f34035S);
        zArr[i] = true;
    }

    /* renamed from: D */
    public final void m3319D(int i) {
        m3322A();
        boolean[] zArr = this.f34026J.f32935b;
        if (this.f34037U && zArr[i] && !this.f34021E[i].m16547J(false)) {
            this.f34036T = 0L;
            this.f34037U = false;
            this.f34032P = true;
            this.f34035S = 0L;
            this.f34038V = 0;
            for (lt8 lt8Var : this.f34021E) {
                lt8Var.m16552E(false);
            }
            mr8 mr8Var = this.f34019C;
            Objects.requireNonNull(mr8Var);
            mr8Var.mo8518a(this);
        }
    }

    /* renamed from: E */
    public final void m3318E() {
        ts8 ts8Var = new ts8(this, this.f34043p, this.f34044q, this.f34051x, this, this.f34052y);
        if (this.f34024H) {
            uo4.m7872f(m3317F());
            long j = this.f34028L;
            if (j != -9223372036854775807L && this.f34036T > j) {
                this.f34039W = true;
                this.f34036T = -9223372036854775807L;
                return;
            }
            i42 i42Var = this.f34027K;
            Objects.requireNonNull(i42Var);
            ts8.m8833f(ts8Var, i42Var.mo2631b(this.f34036T).f10252a.f14257b, this.f34036T);
            for (lt8 lt8Var : this.f34021E) {
                lt8Var.m16551F(this.f34036T);
            }
            this.f34036T = -9223372036854775807L;
        }
        this.f34038V = m3282x();
        long m25760a = this.f34050w.m25760a(ts8Var, this, rw8.m10856a(this.f34030N));
        pa6 m8835d = ts8.m8835d(ts8Var);
        this.f34046s.m3361l(new ar8(ts8.m8837b(ts8Var), m8835d, m8835d.f22769a, Collections.emptyMap(), m25760a, 0L, 0L), 1, -1, null, 0, null, ts8.m8836c(ts8Var), this.f34028L);
    }

    /* renamed from: F */
    public final boolean m3317F() {
        return this.f34036T != -9223372036854775807L;
    }

    /* renamed from: G */
    public final boolean m3316G() {
        return this.f34032P || m3317F();
    }

    /* renamed from: H */
    public final int m3315H(int i, a78 a78Var, ma7 ma7Var, int i2) {
        if (m3316G()) {
            return -3;
        }
        m3320C(i);
        int m16529v = this.f34021E[i].m16529v(a78Var, ma7Var, i2, this.f34039W);
        if (m16529v == -3) {
            m3319D(i);
        }
        return m16529v;
    }

    /* renamed from: I */
    public final int m3314I(int i, long j) {
        if (m3316G()) {
            return 0;
        }
        m3320C(i);
        lt8 lt8Var = this.f34021E[i];
        int m16531t = lt8Var.m16531t(j, this.f34039W);
        lt8Var.m16549H(m16531t);
        if (m16531t == 0) {
            m3319D(i);
            return 0;
        }
        return m16531t;
    }

    /* renamed from: N */
    public final m42 m3309N() {
        return m3280z(new ws8(0, true));
    }

    @Override // com.daaw.yw8
    /* renamed from: a */
    public final void mo3146a() {
        for (lt8 lt8Var : this.f34021E) {
            lt8Var.m16553D();
        }
        this.f34051x.zze();
    }

    @Override // com.daaw.nr8
    /* renamed from: b */
    public final long mo3304b(long j) {
        int i;
        m3322A();
        boolean[] zArr = this.f34026J.f32935b;
        if (true != this.f34027K.zzh()) {
            j = 0;
        }
        this.f34032P = false;
        this.f34035S = j;
        if (m3317F()) {
            this.f34036T = j;
            return j;
        }
        if (this.f34030N != 7) {
            int length = this.f34021E.length;
            while (i < length) {
                i = (this.f34021E[i].m16546K(j, false) || (!zArr[i] && this.f34025I)) ? i + 1 : 0;
            }
            return j;
        }
        this.f34037U = false;
        this.f34036T = j;
        this.f34039W = false;
        bx8 bx8Var = this.f34050w;
        if (bx8Var.m25749l()) {
            for (lt8 lt8Var : this.f34021E) {
                lt8Var.m16525z();
            }
            this.f34050w.m25754g();
        } else {
            bx8Var.m25753h();
            for (lt8 lt8Var2 : this.f34021E) {
                lt8Var2.m16552E(false);
            }
        }
        return j;
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    /* renamed from: c */
    public final boolean mo3303c(long j) {
        if (this.f34039W || this.f34050w.m25750k() || this.f34037U) {
            return false;
        }
        if (this.f34024H && this.f34033Q == 0) {
            return false;
        }
        boolean m24006e = this.f34052y.m24006e();
        if (this.f34050w.m25749l()) {
            return m24006e;
        }
        m3318E();
        return true;
    }

    @Override // com.daaw.tw8
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo3302d(xw8 xw8Var, long j, long j2) {
        i42 i42Var;
        if (this.f34028L == -9223372036854775807L && (i42Var = this.f34027K) != null) {
            boolean zzh = i42Var.zzh();
            long m3281y = m3281y(true);
            long j3 = m3281y == Long.MIN_VALUE ? 0L : m3281y + 10000;
            this.f34028L = j3;
            this.f34048u.mo7740c(j3, zzh, this.f34029M);
        }
        ts8 ts8Var = (ts8) xw8Var;
        ny6 m8834e = ts8.m8834e(ts8Var);
        ar8 ar8Var = new ar8(ts8.m8837b(ts8Var), ts8.m8835d(ts8Var), m8834e.m14717l(), m8834e.m14716m(), j, j2, m8834e.m14718k());
        ts8.m8837b(ts8Var);
        this.f34046s.m3365h(ar8Var, 1, -1, null, 0, null, ts8.m8836c(ts8Var), this.f34028L);
        this.f34039W = true;
        mr8 mr8Var = this.f34019C;
        Objects.requireNonNull(mr8Var);
        mr8Var.mo8518a(this);
    }

    @Override // com.daaw.nr8
    /* renamed from: e */
    public final void mo3301e(long j, boolean z) {
        m3322A();
        if (m3317F()) {
            return;
        }
        boolean[] zArr = this.f34026J.f32936c;
        int length = this.f34021E.length;
        for (int i = 0; i < length; i++) {
            this.f34021E[i].m16526y(j, false, zArr[i]);
        }
    }

    @Override // com.daaw.tw8
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo3300f(xw8 xw8Var, long j, long j2, boolean z) {
        ts8 ts8Var = (ts8) xw8Var;
        ny6 m8834e = ts8.m8834e(ts8Var);
        ar8 ar8Var = new ar8(ts8.m8837b(ts8Var), ts8.m8835d(ts8Var), m8834e.m14717l(), m8834e.m14716m(), j, j2, m8834e.m14718k());
        ts8.m8837b(ts8Var);
        this.f34046s.m3367f(ar8Var, 1, -1, null, 0, null, ts8.m8836c(ts8Var), this.f34028L);
        if (z) {
            return;
        }
        for (lt8 lt8Var : this.f34021E) {
            lt8Var.m16552E(false);
        }
        if (this.f34033Q > 0) {
            mr8 mr8Var = this.f34019C;
            Objects.requireNonNull(mr8Var);
            mr8Var.mo8518a(this);
        }
    }

    @Override // com.daaw.nr8
    /* renamed from: g */
    public final void mo3299g(mr8 mr8Var, long j) {
        this.f34019C = mr8Var;
        this.f34052y.m24006e();
        m3318E();
    }

    @Override // com.daaw.nr8
    /* renamed from: h */
    public final long mo3298h(long j, aa8 aa8Var) {
        long j2;
        m3322A();
        if (this.f34027K.zzh()) {
            g42 mo2631b = this.f34027K.mo2631b(j);
            long j3 = mo2631b.f10252a.f14256a;
            long j4 = mo2631b.f10253b.f14256a;
            long j5 = aa8Var.f3028a;
            if (j5 != 0) {
                j2 = j5;
            } else if (aa8Var.f3029b == 0) {
                return j;
            } else {
                j2 = 0;
            }
            long m19390h0 = it5.m19390h0(j, j2, Long.MIN_VALUE);
            long m19404a0 = it5.m19404a0(j, aa8Var.f3029b, Long.MAX_VALUE);
            boolean z = true;
            boolean z2 = m19390h0 <= j3 && j3 <= m19404a0;
            z = (m19390h0 > j4 || j4 > m19404a0) ? false : false;
            if (z2 && z) {
                if (Math.abs(j3 - j) > Math.abs(j4 - j)) {
                    return j4;
                }
            } else if (!z2) {
                return z ? j4 : m19390h0;
            }
            return j3;
        }
        return 0L;
    }

    @Override // com.daaw.m09
    /* renamed from: i */
    public final void mo3297i(final i42 i42Var) {
        this.f34018B.post(new Runnable() { // from class: com.daaw.ss8
            @Override // java.lang.Runnable
            public final void run() {
                ys8.this.m3287s(i42Var);
            }
        });
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    /* renamed from: j */
    public final void mo3296j(long j) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r2 == 0) goto L77;
     */
    @Override // com.daaw.nr8
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo3295k(tv8[] tv8VarArr, boolean[] zArr, mt8[] mt8VarArr, boolean[] zArr2, long j) {
        boolean z;
        tv8 tv8Var;
        int i;
        m3322A();
        xs8 xs8Var = this.f34026J;
        au8 au8Var = xs8Var.f32934a;
        boolean[] zArr3 = xs8Var.f32936c;
        int i2 = this.f34033Q;
        int i3 = 0;
        for (int i4 = 0; i4 < tv8VarArr.length; i4++) {
            mt8 mt8Var = mt8VarArr[i4];
            if (mt8Var != null && (tv8VarArr[i4] == null || !zArr[i4])) {
                i = ((vs8) mt8Var).f30563a;
                uo4.m7872f(zArr3[i]);
                this.f34033Q--;
                zArr3[i] = false;
                mt8VarArr[i4] = null;
            }
        }
        if (!this.f34031O) {
            if (j == 0) {
                j = 0;
                z = false;
            }
            z = true;
        }
        for (int i5 = 0; i5 < tv8VarArr.length; i5++) {
            if (mt8VarArr[i5] == null && (tv8Var = tv8VarArr[i5]) != null) {
                uo4.m7872f(tv8Var.zzc() == 1);
                uo4.m7872f(tv8Var.mo4483a(0) == 0);
                int m26966a = au8Var.m26966a(tv8Var.zze());
                uo4.m7872f(!zArr3[m26966a]);
                this.f34033Q++;
                zArr3[m26966a] = true;
                mt8VarArr[i5] = new vs8(this, m26966a);
                zArr2[i5] = true;
                if (!z) {
                    lt8 lt8Var = this.f34021E[m26966a];
                    z = (lt8Var.m16546K(j, true) || lt8Var.m16532s() == 0) ? false : true;
                }
            }
        }
        if (this.f34033Q == 0) {
            this.f34037U = false;
            this.f34032P = false;
            if (this.f34050w.m25749l()) {
                lt8[] lt8VarArr = this.f34021E;
                int length = lt8VarArr.length;
                while (i3 < length) {
                    lt8VarArr[i3].m16525z();
                    i3++;
                }
                this.f34050w.m25754g();
            } else {
                for (lt8 lt8Var2 : this.f34021E) {
                    lt8Var2.m16552E(false);
                }
            }
        } else if (z) {
            j = mo3304b(j);
            while (i3 < mt8VarArr.length) {
                if (mt8VarArr[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.f34031O = true;
        return j;
    }

    @Override // com.daaw.kt8
    /* renamed from: l */
    public final void mo3294l(f92 f92Var) {
        this.f34018B.post(this.f34053z);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc  */
    @Override // com.daaw.tw8
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ vw8 mo3293m(xw8 xw8Var, long j, long j2, IOException iOException, int i) {
        sw8 sw8Var;
        long j3;
        vw8 m25759b;
        i42 i42Var;
        boolean z;
        ts8 ts8Var = (ts8) xw8Var;
        ny6 m8834e = ts8.m8834e(ts8Var);
        ar8 ar8Var = new ar8(ts8.m8837b(ts8Var), ts8.m8835d(ts8Var), m8834e.m14717l(), m8834e.m14716m(), j, j2, m8834e.m14718k());
        Throwable th = new sw8(ar8Var, new lr8(1, -1, null, 0, null, it5.m19386j0(ts8.m8836c(ts8Var)), it5.m19386j0(this.f34028L)), iOException, i).f26725c;
        if (!(th instanceof dl3) && !(th instanceof FileNotFoundException) && !(th instanceof zo6) && !(th instanceof ax8)) {
            while (th != null) {
                if (!(th instanceof s56) || ((s56) th).f25888p != 2008) {
                    th = th.getCause();
                }
            }
            j3 = Math.min((sw8Var.f26726d - 1) * 1000, 5000);
            if (j3 != -9223372036854775807L) {
                m25759b = bx8.f5266g;
            } else {
                int m3282x = m3282x();
                boolean z2 = m3282x > this.f34038V;
                if (this.f34034R || !((i42Var = this.f34027K) == null || i42Var.zze() == -9223372036854775807L)) {
                    this.f34038V = m3282x;
                } else {
                    boolean z3 = this.f34024H;
                    if (!z3 || m3316G()) {
                        this.f34032P = z3;
                        this.f34035S = 0L;
                        this.f34038V = 0;
                        for (lt8 lt8Var : this.f34021E) {
                            lt8Var.m16552E(false);
                        }
                        ts8.m8833f(ts8Var, 0L, 0L);
                    } else {
                        this.f34037U = true;
                        m25759b = bx8.f5265f;
                    }
                }
                m25759b = bx8.m25759b(z2, j3);
            }
            z = !m25759b.m6683c();
            this.f34046s.m3363j(ar8Var, 1, -1, null, 0, null, ts8.m8836c(ts8Var), this.f34028L, iOException, z);
            if (z) {
                ts8.m8837b(ts8Var);
            }
            return m25759b;
        }
        j3 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
        }
        z = !m25759b.m6683c();
        this.f34046s.m3363j(ar8Var, 1, -1, null, 0, null, ts8.m8836c(ts8Var), this.f34028L, iOException, z);
        if (z) {
        }
        return m25759b;
    }

    @Override // com.daaw.m09
    /* renamed from: n */
    public final m42 mo3292n(int i, int i2) {
        return m3280z(new ws8(i, false));
    }

    /* renamed from: q */
    public final /* synthetic */ void m3289q() {
        if (this.f34040X) {
            return;
        }
        mr8 mr8Var = this.f34019C;
        Objects.requireNonNull(mr8Var);
        mr8Var.mo8518a(this);
    }

    /* renamed from: r */
    public final /* synthetic */ void m3288r() {
        this.f34034R = true;
    }

    /* renamed from: s */
    public final /* synthetic */ void m3287s(i42 i42Var) {
        this.f34027K = this.f34020D == null ? i42Var : new h42(-9223372036854775807L, 0L);
        this.f34028L = i42Var.zze();
        boolean z = false;
        if (!this.f34034R && i42Var.zze() == -9223372036854775807L) {
            z = true;
        }
        this.f34029M = z;
        this.f34030N = true == z ? 7 : 1;
        this.f34048u.mo7740c(this.f34028L, i42Var.zzh(), this.f34029M);
        if (this.f34024H) {
            return;
        }
        m3321B();
    }

    /* renamed from: t */
    public final void m3286t() {
        this.f34050w.m25752i(rw8.m10856a(this.f34030N));
    }

    /* renamed from: u */
    public final void m3285u(int i) {
        this.f34021E[i].m16555B();
        m3286t();
    }

    /* renamed from: v */
    public final void m3284v() {
        if (this.f34024H) {
            for (lt8 lt8Var : this.f34021E) {
                lt8Var.m16554C();
            }
        }
        this.f34050w.m25751j(this);
        this.f34018B.removeCallbacksAndMessages(null);
        this.f34019C = null;
        this.f34040X = true;
    }

    /* renamed from: w */
    public final boolean m3283w(int i) {
        return !m3316G() && this.f34021E[i].m16547J(this.f34039W);
    }

    /* renamed from: x */
    public final int m3282x() {
        int i = 0;
        for (lt8 lt8Var : this.f34021E) {
            i += lt8Var.m16530u();
        }
        return i;
    }

    /* renamed from: y */
    public final long m3281y(boolean z) {
        int i;
        long j = Long.MIN_VALUE;
        while (true) {
            lt8[] lt8VarArr = this.f34021E;
            if (i >= lt8VarArr.length) {
                return j;
            }
            if (!z) {
                xs8 xs8Var = this.f34026J;
                Objects.requireNonNull(xs8Var);
                i = xs8Var.f32936c[i] ? 0 : i + 1;
            }
            j = Math.max(j, lt8VarArr[i].m16528w());
        }
    }

    /* renamed from: z */
    public final m42 m3280z(ws8 ws8Var) {
        int length = this.f34021E.length;
        for (int i = 0; i < length; i++) {
            if (ws8Var.equals(this.f34022F[i])) {
                return this.f34021E[i];
            }
        }
        nw8 nw8Var = this.f34042Z;
        vn8 vn8Var = this.f34045r;
        jn8 jn8Var = this.f34047t;
        Objects.requireNonNull(vn8Var);
        lt8 lt8Var = new lt8(nw8Var, vn8Var, jn8Var, null);
        lt8Var.m16550G(this);
        int i2 = length + 1;
        ws8[] ws8VarArr = (ws8[]) Arrays.copyOf(this.f34022F, i2);
        ws8VarArr[length] = ws8Var;
        this.f34022F = (ws8[]) it5.m19428D(ws8VarArr);
        lt8[] lt8VarArr = (lt8[]) Arrays.copyOf(this.f34021E, i2);
        lt8VarArr[length] = lt8Var;
        this.f34021E = (lt8[]) it5.m19428D(lt8VarArr);
        return lt8Var;
    }

    @Override // com.daaw.m09
    public final void zzC() {
        this.f34023G = true;
        this.f34018B.post(this.f34053z);
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final long zzb() {
        long j;
        m3322A();
        if (this.f34039W || this.f34033Q == 0) {
            return Long.MIN_VALUE;
        }
        if (m3317F()) {
            return this.f34036T;
        }
        if (this.f34025I) {
            int length = this.f34021E.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                xs8 xs8Var = this.f34026J;
                if (xs8Var.f32935b[i] && xs8Var.f32936c[i] && !this.f34021E[i].m16548I()) {
                    j = Math.min(j, this.f34021E[i].m16528w());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = m3281y(false);
        }
        return j == Long.MIN_VALUE ? this.f34035S : j;
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final long zzc() {
        return zzb();
    }

    @Override // com.daaw.nr8
    public final long zzd() {
        if (this.f34032P) {
            if (this.f34039W || m3282x() > this.f34038V) {
                this.f34032P = false;
                return this.f34035S;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // com.daaw.nr8
    public final au8 zzh() {
        m3322A();
        return this.f34026J.f32934a;
    }

    @Override // com.daaw.nr8
    public final void zzk() {
        m3286t();
        if (this.f34039W && !this.f34024H) {
            throw dl3.m24267a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final boolean zzp() {
        return this.f34050w.m25749l() && this.f34052y.m24007d();
    }
}
