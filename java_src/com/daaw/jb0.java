package com.daaw;

import android.util.Pair;
import com.daaw.ib0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class jb0 extends zn0 {

    /* renamed from: F */
    public static final AtomicInteger f14631F = new AtomicInteger();

    /* renamed from: A */
    public int f14632A;

    /* renamed from: B */
    public boolean f14633B;

    /* renamed from: C */
    public boolean f14634C;

    /* renamed from: D */
    public volatile boolean f14635D;

    /* renamed from: E */
    public volatile boolean f14636E;

    /* renamed from: j */
    public final int f14637j;

    /* renamed from: k */
    public final int f14638k;

    /* renamed from: l */
    public final ib0.C1674a f14639l;

    /* renamed from: m */
    public final InterfaceC2200mp f14640m;

    /* renamed from: n */
    public final C2570pp f14641n;

    /* renamed from: o */
    public final boolean f14642o;

    /* renamed from: p */
    public final boolean f14643p;

    /* renamed from: q */
    public final boolean f14644q;

    /* renamed from: r */
    public final ol1 f14645r;

    /* renamed from: s */
    public final boolean f14646s;

    /* renamed from: t */
    public final InterfaceC3919zz f14647t;

    /* renamed from: u */
    public final boolean f14648u;

    /* renamed from: v */
    public final boolean f14649v;

    /* renamed from: w */
    public final qe0 f14650w;

    /* renamed from: x */
    public final rv0 f14651x;

    /* renamed from: y */
    public rb0 f14652y;

    /* renamed from: z */
    public int f14653z;

    public jb0(gb0 gb0Var, InterfaceC2200mp interfaceC2200mp, C2570pp c2570pp, C2570pp c2570pp2, ib0.C1674a c1674a, List<Format> list, int i, Object obj, long j, long j2, long j3, int i2, boolean z, boolean z2, ol1 ol1Var, jb0 jb0Var, DrmInitData drmInitData, byte[] bArr, byte[] bArr2) {
        super(m18655g(interfaceC2200mp, bArr, bArr2), c2570pp, c1674a.f13430b, i, obj, j, j2, j3);
        C2570pp c2570pp3;
        InterfaceC3919zz interfaceC3919zz;
        rv0 rv0Var;
        this.f14638k = i2;
        this.f14641n = c2570pp2;
        this.f14639l = c1674a;
        this.f14643p = z2;
        this.f14645r = ol1Var;
        this.f14642o = this.f8435h instanceof C3154u1;
        this.f14644q = z;
        boolean z3 = true;
        if (jb0Var != null) {
            boolean z4 = jb0Var.f14639l != c1674a;
            this.f14646s = z4;
            interfaceC3919zz = (jb0Var.f14638k != i2 || z4) ? null : jb0Var.f14647t;
            c2570pp3 = c2570pp;
        } else {
            this.f14646s = false;
            c2570pp3 = c2570pp;
            interfaceC3919zz = null;
        }
        Pair<InterfaceC3919zz, Boolean> mo21827a = gb0Var.mo21827a(interfaceC3919zz, c2570pp3.f23115a, this.f8430c, list, drmInitData, ol1Var);
        InterfaceC3919zz interfaceC3919zz2 = (InterfaceC3919zz) mo21827a.first;
        this.f14647t = interfaceC3919zz2;
        boolean booleanValue = ((Boolean) mo21827a.second).booleanValue();
        this.f14648u = booleanValue;
        boolean z5 = interfaceC3919zz2 == interfaceC3919zz;
        this.f14649v = z5;
        this.f14634C = (!z5 || c2570pp2 == null) ? false : false;
        if (booleanValue) {
            if (jb0Var == null || (rv0Var = jb0Var.f14651x) == null) {
                this.f14650w = new qe0();
                rv0Var = new rv0(10);
            } else {
                this.f14650w = jb0Var.f14650w;
            }
            this.f14651x = rv0Var;
        } else {
            this.f14650w = null;
            this.f14651x = null;
        }
        this.f14640m = interfaceC2200mp;
        this.f14637j = f14631F.getAndIncrement();
    }

    /* renamed from: g */
    public static InterfaceC2200mp m18655g(InterfaceC2200mp interfaceC2200mp, byte[] bArr, byte[] bArr2) {
        return bArr != null ? new C3154u1(interfaceC2200mp, bArr, bArr2) : interfaceC2200mp;
    }

    @Override // com.daaw.jk0.InterfaceC1836c
    /* renamed from: a */
    public void mo6740a() {
        m18652j();
        if (this.f14635D) {
            return;
        }
        if (!this.f14644q) {
            m18653i();
        }
        this.f14636E = true;
    }

    @Override // com.daaw.jk0.InterfaceC1836c
    /* renamed from: b */
    public void mo6739b() {
        this.f14635D = true;
    }

    @Override // com.daaw.AbstractC1180ef
    /* renamed from: c */
    public long mo8279c() {
        return this.f14632A;
    }

    @Override // com.daaw.zn0
    /* renamed from: f */
    public boolean mo2103f() {
        return this.f14636E;
    }

    /* renamed from: h */
    public void m18654h(rb0 rb0Var) {
        this.f14652y = rb0Var;
        rb0Var.m11500E(this.f14637j, this.f14646s, this.f14649v);
        if (this.f14649v) {
            return;
        }
        this.f14647t.mo1758i(rb0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f A[Catch: all -> 0x00a0, TryCatch #1 {all -> 0x00a0, blocks: (B:15:0x0038, B:17:0x004a, B:19:0x004e, B:21:0x005f, B:23:0x0068, B:22:0x0066, B:25:0x006d, B:34:0x008e, B:27:0x0074, B:29:0x0078), top: B:41:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066 A[Catch: all -> 0x00a0, TryCatch #1 {all -> 0x00a0, blocks: (B:15:0x0038, B:17:0x004a, B:19:0x004e, B:21:0x005f, B:23:0x0068, B:22:0x0066, B:25:0x006d, B:34:0x008e, B:27:0x0074, B:29:0x0078), top: B:41:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d A[Catch: all -> 0x00a0, TRY_LEAVE, TryCatch #1 {all -> 0x00a0, blocks: (B:15:0x0038, B:17:0x004a, B:19:0x004e, B:21:0x005f, B:23:0x0068, B:22:0x0066, B:25:0x006d, B:34:0x008e, B:27:0x0074, B:29:0x0078), top: B:41:0x0038 }] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m18653i() {
        C2570pp m13248b;
        boolean z;
        C3462wq c3462wq;
        int i = 0;
        try {
            if (this.f14642o) {
                m13248b = this.f8428a;
                if (this.f14632A != 0) {
                    z = true;
                    if (this.f14643p) {
                        this.f14645r.m14179j();
                    } else if (this.f14645r.m14186c() == Long.MAX_VALUE) {
                        this.f14645r.m14181h(this.f8433f);
                    }
                    InterfaceC2200mp interfaceC2200mp = this.f8435h;
                    c3462wq = new C3462wq(interfaceC2200mp, m13248b.f23117c, interfaceC2200mp.mo8641c(m13248b));
                    if (this.f14648u && !this.f14633B) {
                        long m18651k = m18651k(c3462wq);
                        this.f14633B = true;
                        this.f14652y.m11480Y(m18651k == -9223372036854775807L ? this.f14645r.m14187b(m18651k) : this.f8433f);
                    }
                    if (z) {
                        c3462wq.mo5857j(this.f14632A);
                    }
                    while (i == 0 && !this.f14635D) {
                        i = this.f14647t.mo1760d(c3462wq, null);
                    }
                    this.f14632A = (int) (c3462wq.getPosition() - this.f8428a.f23117c);
                    return;
                }
            } else {
                m13248b = this.f8428a.m13248b(this.f14632A);
            }
            InterfaceC2200mp interfaceC2200mp2 = this.f8435h;
            c3462wq = new C3462wq(interfaceC2200mp2, m13248b.f23117c, interfaceC2200mp2.mo8641c(m13248b));
            if (this.f14648u) {
                long m18651k2 = m18651k(c3462wq);
                this.f14633B = true;
                this.f14652y.m11480Y(m18651k2 == -9223372036854775807L ? this.f14645r.m14187b(m18651k2) : this.f8433f);
            }
            if (z) {
            }
            while (i == 0) {
                i = this.f14647t.mo1760d(c3462wq, null);
            }
            this.f14632A = (int) (c3462wq.getPosition() - this.f8428a.f23117c);
            return;
        } finally {
            sq1.m10008h(this.f8435h);
        }
        z = false;
        if (this.f14643p) {
        }
    }

    /* renamed from: j */
    public final void m18652j() {
        C2570pp c2570pp;
        if (this.f14634C || (c2570pp = this.f14641n) == null) {
            return;
        }
        C2570pp m13248b = c2570pp.m13248b(this.f14653z);
        try {
            InterfaceC2200mp interfaceC2200mp = this.f14640m;
            C3462wq c3462wq = new C3462wq(interfaceC2200mp, m13248b.f23117c, interfaceC2200mp.mo8641c(m13248b));
            int i = 0;
            while (i == 0 && !this.f14635D) {
                i = this.f14647t.mo1760d(c3462wq, null);
            }
            this.f14653z = (int) (c3462wq.getPosition() - this.f14641n.f23117c);
            sq1.m10008h(this.f14640m);
            this.f14634C = true;
        } catch (Throwable th) {
            sq1.m10008h(this.f14640m);
            throw th;
        }
    }

    /* renamed from: k */
    public final long m18651k(a00 a00Var) {
        Metadata m12600c;
        a00Var.mo5858i();
        if (a00Var.mo5863d(this.f14651x.f25637a, 0, 10, true)) {
            this.f14651x.m10924G(10);
            if (this.f14651x.m10930A() != qe0.f23885c) {
                return -9223372036854775807L;
            }
            this.f14651x.m10920K(3);
            int m10897w = this.f14651x.m10897w();
            int i = m10897w + 10;
            if (i > this.f14651x.m10918b()) {
                rv0 rv0Var = this.f14651x;
                byte[] bArr = rv0Var.f25637a;
                rv0Var.m10924G(i);
                System.arraycopy(bArr, 0, this.f14651x.f25637a, 0, 10);
            }
            if (a00Var.mo5863d(this.f14651x.f25637a, 10, m10897w, true) && (m12600c = this.f14650w.m12600c(this.f14651x.f25637a, m10897w)) != null) {
                int m1648b = m12600c.m1648b();
                for (int i2 = 0; i2 < m1648b; i2++) {
                    Metadata.Entry m1649a = m12600c.m1649a(i2);
                    if (m1649a instanceof PrivFrame) {
                        PrivFrame privFrame = (PrivFrame) m1649a;
                        if ("com.apple.streaming.transportStreamTimestamp".equals(privFrame.f35803q)) {
                            System.arraycopy(privFrame.f35804r, 0, this.f14651x.f25637a, 0, 8);
                            this.f14651x.m10924G(8);
                            return this.f14651x.m10903q() & 8589934591L;
                        }
                    }
                }
                return -9223372036854775807L;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }
}
