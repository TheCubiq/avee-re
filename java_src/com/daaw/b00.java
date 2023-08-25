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
import com.google.android.exoplayer2.trackselection.InterfaceC3970c;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class b00 implements qo0, d00, jk0.InterfaceC1834a<C0796c>, jk0.InterfaceC1837d, b81.InterfaceC0826b {

    /* renamed from: D */
    public qo0.InterfaceC2744a f4152D;

    /* renamed from: E */
    public da1 f4153E;

    /* renamed from: H */
    public boolean f4156H;

    /* renamed from: I */
    public boolean f4157I;

    /* renamed from: J */
    public int f4158J;

    /* renamed from: K */
    public boolean f4159K;

    /* renamed from: L */
    public boolean f4160L;

    /* renamed from: M */
    public boolean f4161M;

    /* renamed from: N */
    public int f4162N;

    /* renamed from: O */
    public TrackGroupArray f4163O;

    /* renamed from: Q */
    public boolean[] f4165Q;

    /* renamed from: R */
    public boolean[] f4166R;

    /* renamed from: S */
    public boolean[] f4167S;

    /* renamed from: T */
    public boolean f4168T;

    /* renamed from: V */
    public long f4170V;

    /* renamed from: X */
    public boolean f4172X;

    /* renamed from: Y */
    public int f4173Y;

    /* renamed from: Z */
    public boolean f4174Z;

    /* renamed from: a0 */
    public boolean f4175a0;

    /* renamed from: p */
    public final Uri f4176p;

    /* renamed from: q */
    public final InterfaceC2200mp f4177q;

    /* renamed from: r */
    public final int f4178r;

    /* renamed from: s */
    public final cp0.C0975a f4179s;

    /* renamed from: t */
    public final InterfaceC0798e f4180t;

    /* renamed from: u */
    public final InterfaceC2006l2 f4181u;

    /* renamed from: v */
    public final String f4182v;

    /* renamed from: w */
    public final long f4183w;

    /* renamed from: y */
    public final C0797d f4185y;

    /* renamed from: x */
    public final jk0 f4184x = new jk0("Loader:ExtractorMediaPeriod");

    /* renamed from: z */
    public final C0844bj f4186z = new C0844bj();

    /* renamed from: A */
    public final Runnable f4149A = new RunnableC0794a();

    /* renamed from: B */
    public final Runnable f4150B = new RunnableC0795b();

    /* renamed from: C */
    public final Handler f4151C = new Handler();

    /* renamed from: G */
    public int[] f4155G = new int[0];

    /* renamed from: F */
    public b81[] f4154F = new b81[0];

    /* renamed from: W */
    public long f4171W = -9223372036854775807L;

    /* renamed from: U */
    public long f4169U = -1;

    /* renamed from: P */
    public long f4164P = -9223372036854775807L;

    /* renamed from: com.daaw.b00$a */
    /* loaded from: classes.dex */
    public class RunnableC0794a implements Runnable {
        public RunnableC0794a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b00.this.m26555I();
        }
    }

    /* renamed from: com.daaw.b00$b */
    /* loaded from: classes.dex */
    public class RunnableC0795b implements Runnable {
        public RunnableC0795b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b00.this.f4175a0) {
                return;
            }
            b00.this.f4152D.mo2077n(b00.this);
        }
    }

    /* renamed from: com.daaw.b00$c */
    /* loaded from: classes.dex */
    public final class C0796c implements jk0.InterfaceC1836c {

        /* renamed from: a */
        public final Uri f4189a;

        /* renamed from: b */
        public final InterfaceC2200mp f4190b;

        /* renamed from: c */
        public final C0797d f4191c;

        /* renamed from: d */
        public final C0844bj f4192d;

        /* renamed from: f */
        public volatile boolean f4194f;

        /* renamed from: h */
        public long f4196h;

        /* renamed from: i */
        public C2570pp f4197i;

        /* renamed from: k */
        public long f4199k;

        /* renamed from: e */
        public final iy0 f4193e = new iy0();

        /* renamed from: g */
        public boolean f4195g = true;

        /* renamed from: j */
        public long f4198j = -1;

        public C0796c(Uri uri, InterfaceC2200mp interfaceC2200mp, C0797d c0797d, C0844bj c0844bj) {
            this.f4189a = (Uri) C2914s6.m10686e(uri);
            this.f4190b = (InterfaceC2200mp) C2914s6.m10686e(interfaceC2200mp);
            this.f4191c = (C0797d) C2914s6.m10686e(c0797d);
            this.f4192d = c0844bj;
        }

        @Override // com.daaw.jk0.InterfaceC1836c
        /* renamed from: a */
        public void mo6740a() {
            int i = 0;
            while (i == 0 && !this.f4194f) {
                C3462wq c3462wq = null;
                try {
                    long j = this.f4193e.f14112a;
                    C2570pp c2570pp = new C2570pp(this.f4189a, j, -1L, b00.this.f4182v);
                    this.f4197i = c2570pp;
                    long mo8641c = this.f4190b.mo8641c(c2570pp);
                    this.f4198j = mo8641c;
                    if (mo8641c != -1) {
                        this.f4198j = mo8641c + j;
                    }
                    C3462wq c3462wq2 = new C3462wq(this.f4190b, j, this.f4198j);
                    try {
                        InterfaceC3919zz m26530b = this.f4191c.m26530b(c3462wq2, this.f4190b.mo8640d());
                        if (this.f4195g) {
                            m26530b.mo1759f(j, this.f4196h);
                            this.f4195g = false;
                        }
                        while (i == 0 && !this.f4194f) {
                            this.f4192d.m26135a();
                            i = m26530b.mo1760d(c3462wq2, this.f4193e);
                            if (c3462wq2.getPosition() > b00.this.f4183w + j) {
                                j = c3462wq2.getPosition();
                                this.f4192d.m26134b();
                                b00.this.f4151C.post(b00.this.f4150B);
                            }
                        }
                        if (i == 1) {
                            i = 0;
                        } else {
                            this.f4193e.f14112a = c3462wq2.getPosition();
                            this.f4199k = this.f4193e.f14112a - this.f4197i.f23117c;
                        }
                        sq1.m10008h(this.f4190b);
                    } catch (Throwable th) {
                        th = th;
                        c3462wq = c3462wq2;
                        if (i != 1 && c3462wq != null) {
                            this.f4193e.f14112a = c3462wq.getPosition();
                            this.f4199k = this.f4193e.f14112a - this.f4197i.f23117c;
                        }
                        sq1.m10008h(this.f4190b);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }

        @Override // com.daaw.jk0.InterfaceC1836c
        /* renamed from: b */
        public void mo6739b() {
            this.f4194f = true;
        }

        /* renamed from: g */
        public void m26532g(long j, long j2) {
            this.f4193e.f14112a = j;
            this.f4196h = j2;
            this.f4195g = true;
        }
    }

    /* renamed from: com.daaw.b00$d */
    /* loaded from: classes.dex */
    public static final class C0797d {

        /* renamed from: a */
        public final InterfaceC3919zz[] f4201a;

        /* renamed from: b */
        public final d00 f4202b;

        /* renamed from: c */
        public InterfaceC3919zz f4203c;

        public C0797d(InterfaceC3919zz[] interfaceC3919zzArr, d00 d00Var) {
            this.f4201a = interfaceC3919zzArr;
            this.f4202b = d00Var;
        }

        /* renamed from: a */
        public void m26531a() {
            InterfaceC3919zz interfaceC3919zz = this.f4203c;
            if (interfaceC3919zz != null) {
                interfaceC3919zz.mo1762a();
                this.f4203c = null;
            }
        }

        /* renamed from: b */
        public InterfaceC3919zz m26530b(a00 a00Var, Uri uri) {
            InterfaceC3919zz interfaceC3919zz = this.f4203c;
            if (interfaceC3919zz != null) {
                return interfaceC3919zz;
            }
            InterfaceC3919zz[] interfaceC3919zzArr = this.f4201a;
            int length = interfaceC3919zzArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                InterfaceC3919zz interfaceC3919zz2 = interfaceC3919zzArr[i];
                try {
                } catch (EOFException unused) {
                } catch (Throwable th) {
                    a00Var.mo5858i();
                    throw th;
                }
                if (interfaceC3919zz2.mo1761c(a00Var)) {
                    this.f4203c = interfaceC3919zz2;
                    a00Var.mo5858i();
                    break;
                }
                continue;
                a00Var.mo5858i();
                i++;
            }
            InterfaceC3919zz interfaceC3919zz3 = this.f4203c;
            if (interfaceC3919zz3 != null) {
                interfaceC3919zz3.mo1758i(this.f4202b);
                return this.f4203c;
            }
            throw new qp1("None of the available extractors (" + sq1.m9996t(this.f4201a) + ") could read the stream.", uri);
        }
    }

    /* renamed from: com.daaw.b00$e */
    /* loaded from: classes.dex */
    public interface InterfaceC0798e {
        /* renamed from: b */
        void mo25704b(long j, boolean z);
    }

    /* renamed from: com.daaw.b00$f */
    /* loaded from: classes.dex */
    public final class C0799f implements d81 {

        /* renamed from: p */
        public final int f4204p;

        public C0799f(int i) {
            this.f4204p = i;
        }

        @Override // com.daaw.d81
        /* renamed from: a */
        public void mo3789a() {
            b00.this.m26552L();
        }

        @Override // com.daaw.d81
        /* renamed from: d */
        public boolean mo3787d() {
            return b00.this.m26556H(this.f4204p);
        }

        @Override // com.daaw.d81
        /* renamed from: j */
        public int mo3786j(k30 k30Var, C1454gq c1454gq, boolean z) {
            return b00.this.m26548P(this.f4204p, k30Var, c1454gq, z);
        }

        @Override // com.daaw.d81
        /* renamed from: n */
        public int mo3785n(long j) {
            return b00.this.m26545S(this.f4204p, j);
        }
    }

    public b00(Uri uri, InterfaceC2200mp interfaceC2200mp, InterfaceC3919zz[] interfaceC3919zzArr, int i, cp0.C0975a c0975a, InterfaceC0798e interfaceC0798e, InterfaceC2006l2 interfaceC2006l2, String str, int i2) {
        this.f4176p = uri;
        this.f4177q = interfaceC2200mp;
        this.f4178r = i;
        this.f4179s = c0975a;
        this.f4180t = interfaceC0798e;
        this.f4181u = interfaceC2006l2;
        this.f4182v = str;
        this.f4183w = i2;
        this.f4185y = new C0797d(interfaceC3919zzArr, this);
        this.f4158J = i == -1 ? 3 : i;
        c0975a.m25151q();
    }

    /* renamed from: F */
    public static boolean m26558F(IOException iOException) {
        return iOException instanceof qp1;
    }

    /* renamed from: B */
    public final boolean m26562B(C0796c c0796c, int i) {
        da1 da1Var;
        if (this.f4169U != -1 || ((da1Var = this.f4153E) != null && da1Var.mo6930h() != -9223372036854775807L)) {
            this.f4173Y = i;
            return true;
        }
        if (this.f4157I && !m26543U()) {
            this.f4172X = true;
            return false;
        }
        this.f4160L = this.f4157I;
        this.f4170V = 0L;
        this.f4173Y = 0;
        for (b81 b81Var : this.f4154F) {
            b81Var.m26361C();
        }
        c0796c.m26532g(0L, 0L);
        return true;
    }

    /* renamed from: C */
    public final void m26561C(C0796c c0796c) {
        if (this.f4169U == -1) {
            this.f4169U = c0796c.f4198j;
        }
    }

    /* renamed from: D */
    public final int m26560D() {
        int i = 0;
        for (b81 b81Var : this.f4154F) {
            i += b81Var.m26338t();
        }
        return i;
    }

    /* renamed from: E */
    public final long m26559E() {
        long j = Long.MIN_VALUE;
        for (b81 b81Var : this.f4154F) {
            j = Math.max(j, b81Var.m26341q());
        }
        return j;
    }

    /* renamed from: G */
    public final boolean m26557G() {
        return this.f4171W != -9223372036854775807L;
    }

    /* renamed from: H */
    public boolean m26556H(int i) {
        return !m26543U() && (this.f4174Z || this.f4154F[i].m26337u());
    }

    /* renamed from: I */
    public final void m26555I() {
        if (this.f4175a0 || this.f4157I || this.f4153E == null || !this.f4156H) {
            return;
        }
        for (b81 b81Var : this.f4154F) {
            if (b81Var.m26339s() == null) {
                return;
            }
        }
        this.f4186z.m26134b();
        int length = this.f4154F.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        this.f4166R = new boolean[length];
        this.f4165Q = new boolean[length];
        this.f4167S = new boolean[length];
        this.f4164P = this.f4153E.mo6930h();
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                break;
            }
            Format m26339s = this.f4154F[i].m26339s();
            trackGroupArr[i] = new TrackGroup(m26339s);
            String str = m26339s.f35721u;
            if (!hq0.m20492m(str) && !hq0.m20494k(str)) {
                z = false;
            }
            this.f4166R[i] = z;
            this.f4168T = z | this.f4168T;
            i++;
        }
        this.f4163O = new TrackGroupArray(trackGroupArr);
        if (this.f4178r == -1 && this.f4169U == -1 && this.f4153E.mo6930h() == -9223372036854775807L) {
            this.f4158J = 6;
        }
        this.f4157I = true;
        this.f4180t.mo25704b(this.f4164P, this.f4153E.mo6932e());
        this.f4152D.mo3792j(this);
    }

    /* renamed from: J */
    public final void m26554J(int i) {
        if (this.f4167S[i]) {
            return;
        }
        Format m1598a = this.f4163O.m1594a(i).m1598a(0);
        this.f4179s.m25165c(hq0.m20498g(m1598a.f35721u), m1598a, 0, null, this.f4170V);
        this.f4167S[i] = true;
    }

    /* renamed from: K */
    public final void m26553K(int i) {
        if (this.f4172X && this.f4166R[i] && !this.f4154F[i].m26337u()) {
            this.f4171W = 0L;
            this.f4172X = false;
            this.f4160L = true;
            this.f4170V = 0L;
            this.f4173Y = 0;
            for (b81 b81Var : this.f4154F) {
                b81Var.m26361C();
            }
            this.f4152D.mo2077n(this);
        }
    }

    /* renamed from: L */
    public void m26552L() {
        this.f4184x.m18464h(this.f4158J);
    }

    @Override // com.daaw.jk0.InterfaceC1834a
    /* renamed from: M */
    public void mo11472k(C0796c c0796c, long j, long j2, boolean z) {
        this.f4179s.m25163e(c0796c.f4197i, 1, -1, null, 0, null, c0796c.f4196h, this.f4164P, j, j2, c0796c.f4199k);
        if (z) {
            return;
        }
        m26561C(c0796c);
        for (b81 b81Var : this.f4154F) {
            b81Var.m26361C();
        }
        if (this.f4162N > 0) {
            this.f4152D.mo2077n(this);
        }
    }

    @Override // com.daaw.jk0.InterfaceC1834a
    /* renamed from: N */
    public void mo11469o(C0796c c0796c, long j, long j2) {
        if (this.f4164P == -9223372036854775807L) {
            long m26559E = m26559E();
            long j3 = m26559E == Long.MIN_VALUE ? 0L : m26559E + 10000;
            this.f4164P = j3;
            this.f4180t.mo25704b(j3, this.f4153E.mo6932e());
        }
        this.f4179s.m25160h(c0796c.f4197i, 1, -1, null, 0, null, c0796c.f4196h, this.f4164P, j, j2, c0796c.f4199k);
        m26561C(c0796c);
        this.f4174Z = true;
        this.f4152D.mo2077n(this);
    }

    @Override // com.daaw.jk0.InterfaceC1834a
    /* renamed from: O */
    public int mo11468r(C0796c c0796c, long j, long j2, IOException iOException) {
        C0796c c0796c2;
        boolean z;
        boolean m26558F = m26558F(iOException);
        this.f4179s.m25157k(c0796c.f4197i, 1, -1, null, 0, null, c0796c.f4196h, this.f4164P, j, j2, c0796c.f4199k, iOException, m26558F);
        m26561C(c0796c);
        if (m26558F) {
            return 3;
        }
        int m26560D = m26560D();
        if (m26560D > this.f4173Y) {
            c0796c2 = c0796c;
            z = true;
        } else {
            c0796c2 = c0796c;
            z = false;
        }
        if (m26562B(c0796c2, m26560D)) {
            return z ? 1 : 0;
        }
        return 2;
    }

    /* renamed from: P */
    public int m26548P(int i, k30 k30Var, C1454gq c1454gq, boolean z) {
        if (m26543U()) {
            return -3;
        }
        int m26333y = this.f4154F[i].m26333y(k30Var, c1454gq, z, this.f4174Z, this.f4170V);
        if (m26333y == -4) {
            m26554J(i);
        } else if (m26333y == -3) {
            m26553K(i);
        }
        return m26333y;
    }

    /* renamed from: Q */
    public void m26547Q() {
        if (this.f4157I) {
            for (b81 b81Var : this.f4154F) {
                b81Var.m26347k();
            }
        }
        this.f4184x.m18462j(this);
        this.f4151C.removeCallbacksAndMessages(null);
        this.f4152D = null;
        this.f4175a0 = true;
        this.f4179s.m25150r();
    }

    /* renamed from: R */
    public final boolean m26546R(long j) {
        int i;
        int length = this.f4154F.length;
        while (true) {
            if (i >= length) {
                return true;
            }
            b81 b81Var = this.f4154F[i];
            b81Var.m26359E();
            i = ((b81Var.m26352f(j, true, false) != -1) || (!this.f4166R[i] && this.f4168T)) ? i + 1 : 0;
        }
        return false;
    }

    /* renamed from: S */
    public int m26545S(int i, long j) {
        int i2 = 0;
        if (m26543U()) {
            return 0;
        }
        b81 b81Var = this.f4154F[i];
        if (!this.f4174Z || j <= b81Var.m26341q()) {
            int m26352f = b81Var.m26352f(j, true, true);
            if (m26352f != -1) {
                i2 = m26352f;
            }
        } else {
            i2 = b81Var.m26351g();
        }
        if (i2 > 0) {
            m26554J(i);
        } else {
            m26553K(i);
        }
        return i2;
    }

    /* renamed from: T */
    public final void m26544T() {
        C0796c c0796c = new C0796c(this.f4176p, this.f4177q, this.f4185y, this.f4186z);
        if (this.f4157I) {
            C2914s6.m10685f(m26557G());
            long j = this.f4164P;
            if (j != -9223372036854775807L && this.f4171W >= j) {
                this.f4174Z = true;
                this.f4171W = -9223372036854775807L;
                return;
            }
            c0796c.m26532g(this.f4153E.mo6931g(this.f4171W).f6712a.f9303b, this.f4171W);
            this.f4171W = -9223372036854775807L;
        }
        this.f4173Y = m26560D();
        this.f4179s.m25154n(c0796c.f4197i, 1, -1, null, 0, null, c0796c.f4196h, this.f4164P, this.f4184x.m18461k(c0796c, this, this.f4158J));
    }

    /* renamed from: U */
    public final boolean m26543U() {
        return this.f4160L || m26557G();
    }

    @Override // com.daaw.d00
    /* renamed from: a */
    public sm1 mo11478a(int i, int i2) {
        int length = this.f4154F.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.f4155G[i3] == i) {
                return this.f4154F[i3];
            }
        }
        b81 b81Var = new b81(this.f4181u);
        b81Var.m26356H(this);
        int i4 = length + 1;
        int[] copyOf = Arrays.copyOf(this.f4155G, i4);
        this.f4155G = copyOf;
        copyOf[length] = i;
        b81[] b81VarArr = (b81[]) Arrays.copyOf(this.f4154F, i4);
        this.f4154F = b81VarArr;
        b81VarArr[length] = b81Var;
        return b81Var;
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    /* renamed from: b */
    public long mo2087b() {
        if (this.f4162N == 0) {
            return Long.MIN_VALUE;
        }
        return mo2083f();
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    /* renamed from: c */
    public boolean mo2086c(long j) {
        if (this.f4174Z || this.f4172X) {
            return false;
        }
        if (this.f4157I && this.f4162N == 0) {
            return false;
        }
        boolean m26133c = this.f4186z.m26133c();
        if (this.f4184x.m18465g()) {
            return m26133c;
        }
        m26544T();
        return true;
    }

    @Override // com.daaw.d00
    /* renamed from: d */
    public void mo11475d(da1 da1Var) {
        this.f4153E = da1Var;
        this.f4151C.post(this.f4149A);
    }

    @Override // com.daaw.qo0
    /* renamed from: e */
    public long mo2084e(long j, ea1 ea1Var) {
        if (this.f4153E.mo6932e()) {
            da1.C1068a mo6931g = this.f4153E.mo6931g(j);
            return sq1.m10026S(j, ea1Var, mo6931g.f6712a.f9302a, mo6931g.f6713b.f9302a);
        }
        return 0L;
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    /* renamed from: f */
    public long mo2083f() {
        long m26559E;
        if (this.f4174Z) {
            return Long.MIN_VALUE;
        }
        if (m26557G()) {
            return this.f4171W;
        }
        if (this.f4168T) {
            m26559E = Long.MAX_VALUE;
            int length = this.f4154F.length;
            for (int i = 0; i < length; i++) {
                if (this.f4166R[i]) {
                    m26559E = Math.min(m26559E, this.f4154F[i].m26341q());
                }
            }
        } else {
            m26559E = m26559E();
        }
        return m26559E == Long.MIN_VALUE ? this.f4170V : m26559E;
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    /* renamed from: g */
    public void mo2082g(long j) {
    }

    @Override // com.daaw.jk0.InterfaceC1837d
    /* renamed from: h */
    public void mo11474h() {
        for (b81 b81Var : this.f4154F) {
            b81Var.m26361C();
        }
        this.f4185y.m26531a();
    }

    @Override // com.daaw.qo0
    /* renamed from: i */
    public long mo2080i(InterfaceC3970c[] interfaceC3970cArr, boolean[] zArr, d81[] d81VarArr, boolean[] zArr2, long j) {
        C2914s6.m10685f(this.f4157I);
        int i = this.f4162N;
        int i2 = 0;
        for (int i3 = 0; i3 < interfaceC3970cArr.length; i3++) {
            if (d81VarArr[i3] != null && (interfaceC3970cArr[i3] == null || !zArr[i3])) {
                int i4 = ((C0799f) d81VarArr[i3]).f4204p;
                C2914s6.m10685f(this.f4165Q[i4]);
                this.f4162N--;
                this.f4165Q[i4] = false;
                d81VarArr[i3] = null;
            }
        }
        boolean z = !this.f4159K ? j == 0 : i != 0;
        for (int i5 = 0; i5 < interfaceC3970cArr.length; i5++) {
            if (d81VarArr[i5] == null && interfaceC3970cArr[i5] != null) {
                InterfaceC3970c interfaceC3970c = interfaceC3970cArr[i5];
                C2914s6.m10685f(interfaceC3970c.length() == 1);
                C2914s6.m10685f(interfaceC3970c.mo1529f(0) == 0);
                int m1593b = this.f4163O.m1593b(interfaceC3970c.mo1534a());
                C2914s6.m10685f(!this.f4165Q[m1593b]);
                this.f4162N++;
                this.f4165Q[m1593b] = true;
                d81VarArr[i5] = new C0799f(m1593b);
                zArr2[i5] = true;
                if (!z) {
                    b81 b81Var = this.f4154F[m1593b];
                    b81Var.m26359E();
                    z = b81Var.m26352f(j, true, true) == -1 && b81Var.m26340r() != 0;
                }
            }
        }
        if (this.f4162N == 0) {
            this.f4172X = false;
            this.f4160L = false;
            if (this.f4184x.m18465g()) {
                b81[] b81VarArr = this.f4154F;
                int length = b81VarArr.length;
                while (i2 < length) {
                    b81VarArr[i2].m26347k();
                    i2++;
                }
                this.f4184x.m18466f();
            } else {
                b81[] b81VarArr2 = this.f4154F;
                int length2 = b81VarArr2.length;
                while (i2 < length2) {
                    b81VarArr2[i2].m26361C();
                    i2++;
                }
            }
        } else if (z) {
            j = mo2078m(j);
            while (i2 < d81VarArr.length) {
                if (d81VarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f4159K = true;
        return j;
    }

    @Override // com.daaw.b81.InterfaceC0826b
    /* renamed from: j */
    public void mo11473j(Format format) {
        this.f4151C.post(this.f4149A);
    }

    @Override // com.daaw.qo0
    /* renamed from: l */
    public void mo2079l() {
        m26552L();
    }

    @Override // com.daaw.qo0
    /* renamed from: m */
    public long mo2078m(long j) {
        if (!this.f4153E.mo6932e()) {
            j = 0;
        }
        this.f4170V = j;
        this.f4160L = false;
        if (m26557G() || !m26546R(j)) {
            this.f4172X = false;
            this.f4171W = j;
            this.f4174Z = false;
            if (this.f4184x.m18465g()) {
                this.f4184x.m18466f();
            } else {
                for (b81 b81Var : this.f4154F) {
                    b81Var.m26361C();
                }
            }
            return j;
        }
        return j;
    }

    @Override // com.daaw.d00
    /* renamed from: n */
    public void mo11470n() {
        this.f4156H = true;
        this.f4151C.post(this.f4149A);
    }

    @Override // com.daaw.qo0
    /* renamed from: p */
    public void mo2075p(qo0.InterfaceC2744a interfaceC2744a, long j) {
        this.f4152D = interfaceC2744a;
        this.f4186z.m26133c();
        m26544T();
    }

    @Override // com.daaw.qo0
    /* renamed from: q */
    public long mo2074q() {
        if (!this.f4161M) {
            this.f4179s.m25148t();
            this.f4161M = true;
        }
        if (this.f4160L) {
            if (this.f4174Z || m26560D() > this.f4173Y) {
                this.f4160L = false;
                return this.f4170V;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // com.daaw.qo0
    /* renamed from: s */
    public TrackGroupArray mo2072s() {
        return this.f4163O;
    }

    @Override // com.daaw.qo0
    /* renamed from: t */
    public void mo2071t(long j, boolean z) {
        int length = this.f4154F.length;
        for (int i = 0; i < length; i++) {
            this.f4154F[i].m26348j(j, z, this.f4165Q[i]);
        }
    }
}
