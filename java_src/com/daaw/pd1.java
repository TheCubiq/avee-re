package com.daaw;

import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public final class pd1 extends AbstractC2928sa {

    /* renamed from: m */
    public final int f22844m;

    /* renamed from: n */
    public final Format f22845n;

    /* renamed from: o */
    public volatile int f22846o;

    /* renamed from: p */
    public volatile boolean f22847p;

    public pd1(InterfaceC2200mp interfaceC2200mp, C2570pp c2570pp, Format format, int i, Object obj, long j, long j2, long j3, int i2, Format format2) {
        super(interfaceC2200mp, c2570pp, format, i, obj, j, j2, -9223372036854775807L, j3);
        this.f22844m = i2;
        this.f22845n = format2;
    }

    @Override // com.daaw.jk0.InterfaceC1836c
    /* renamed from: a */
    public void mo6740a() {
        try {
            long mo8641c = this.f8435h.mo8641c(this.f8428a.m13248b(this.f22846o));
            if (mo8641c != -1) {
                mo8641c += this.f22846o;
            }
            C3462wq c3462wq = new C3462wq(this.f8435h, this.f22846o, mo8641c);
            C3029ta m10483h = m10483h();
            m10483h.m9417c(0L);
            sm1 mo9419a = m10483h.mo9419a(0, this.f22844m);
            mo9419a.mo10156d(this.f22845n);
            for (int i = 0; i != -1; i = mo9419a.mo10158b(c3462wq, Integer.MAX_VALUE, true)) {
                this.f22846o += i;
            }
            mo9419a.mo10159a(this.f8433f, 1, this.f22846o, 0, null);
            sq1.m10008h(this.f8435h);
            this.f22847p = true;
        } catch (Throwable th) {
            sq1.m10008h(this.f8435h);
            throw th;
        }
    }

    @Override // com.daaw.jk0.InterfaceC1836c
    /* renamed from: b */
    public void mo6739b() {
    }

    @Override // com.daaw.AbstractC1180ef
    /* renamed from: c */
    public long mo8279c() {
        return this.f22846o;
    }

    @Override // com.daaw.zn0
    /* renamed from: f */
    public boolean mo2103f() {
        return this.f22847p;
    }
}
