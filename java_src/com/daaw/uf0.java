package com.daaw;

import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public final class uf0 extends AbstractC1180ef {

    /* renamed from: i */
    public final C1275ff f29023i;

    /* renamed from: j */
    public volatile int f29024j;

    /* renamed from: k */
    public volatile boolean f29025k;

    public uf0(InterfaceC2200mp interfaceC2200mp, C2570pp c2570pp, Format format, int i, Object obj, C1275ff c1275ff) {
        super(interfaceC2200mp, c2570pp, 2, format, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.f29023i = c1275ff;
    }

    @Override // com.daaw.jk0.InterfaceC1836c
    /* renamed from: a */
    public void mo6740a() {
        C2570pp m13248b = this.f8428a.m13248b(this.f29024j);
        try {
            InterfaceC2200mp interfaceC2200mp = this.f8435h;
            C3462wq c3462wq = new C3462wq(interfaceC2200mp, m13248b.f23117c, interfaceC2200mp.mo8641c(m13248b));
            if (this.f29024j == 0) {
                this.f29023i.m22697e(null, -9223372036854775807L);
            }
            InterfaceC3919zz interfaceC3919zz = this.f29023i.f9519p;
            int i = 0;
            while (i == 0 && !this.f29025k) {
                i = interfaceC3919zz.mo1760d(c3462wq, null);
            }
            C2914s6.m10685f(i != 1);
            this.f29024j = (int) (c3462wq.getPosition() - this.f8428a.f23117c);
        } finally {
            sq1.m10008h(this.f8435h);
        }
    }

    @Override // com.daaw.jk0.InterfaceC1836c
    /* renamed from: b */
    public void mo6739b() {
        this.f29025k = true;
    }

    @Override // com.daaw.AbstractC1180ef
    /* renamed from: c */
    public long mo8279c() {
        return this.f29024j;
    }
}
