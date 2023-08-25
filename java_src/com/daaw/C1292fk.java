package com.daaw;

import com.google.android.exoplayer2.Format;
/* renamed from: com.daaw.fk */
/* loaded from: classes.dex */
public class C1292fk extends AbstractC2928sa {

    /* renamed from: m */
    public final int f9630m;

    /* renamed from: n */
    public final long f9631n;

    /* renamed from: o */
    public final C1275ff f9632o;

    /* renamed from: p */
    public volatile int f9633p;

    /* renamed from: q */
    public volatile boolean f9634q;

    /* renamed from: r */
    public volatile boolean f9635r;

    public C1292fk(InterfaceC2200mp interfaceC2200mp, C2570pp c2570pp, Format format, int i, Object obj, long j, long j2, long j3, long j4, int i2, long j5, C1275ff c1275ff) {
        super(interfaceC2200mp, c2570pp, format, i, obj, j, j2, j3, j4);
        this.f9630m = i2;
        this.f9631n = j5;
        this.f9632o = c1275ff;
    }

    @Override // com.daaw.jk0.InterfaceC1836c
    /* renamed from: a */
    public final void mo6740a() {
        C2570pp m13248b = this.f8428a.m13248b(this.f9633p);
        try {
            InterfaceC2200mp interfaceC2200mp = this.f8435h;
            C3462wq c3462wq = new C3462wq(interfaceC2200mp, m13248b.f23117c, interfaceC2200mp.mo8641c(m13248b));
            if (this.f9633p == 0) {
                C3029ta m10483h = m10483h();
                m10483h.m9417c(this.f9631n);
                C1275ff c1275ff = this.f9632o;
                long j = this.f26039j;
                c1275ff.m22697e(m10483h, j == -9223372036854775807L ? 0L : j - this.f9631n);
            }
            InterfaceC3919zz interfaceC3919zz = this.f9632o.f9519p;
            int i = 0;
            while (i == 0 && !this.f9634q) {
                i = interfaceC3919zz.mo1760d(c3462wq, null);
            }
            C2914s6.m10685f(i != 1);
            this.f9633p = (int) (c3462wq.getPosition() - this.f8428a.f23117c);
            sq1.m10008h(this.f8435h);
            this.f9635r = true;
        } catch (Throwable th) {
            sq1.m10008h(this.f8435h);
            throw th;
        }
    }

    @Override // com.daaw.jk0.InterfaceC1836c
    /* renamed from: b */
    public final void mo6739b() {
        this.f9634q = true;
    }

    @Override // com.daaw.AbstractC1180ef
    /* renamed from: c */
    public final long mo8279c() {
        return this.f9633p;
    }

    @Override // com.daaw.zn0
    /* renamed from: e */
    public long mo2104e() {
        return this.f35250i + this.f9630m;
    }

    @Override // com.daaw.zn0
    /* renamed from: f */
    public boolean mo2103f() {
        return this.f9635r;
    }
}
