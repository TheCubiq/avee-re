package com.daaw;
/* loaded from: classes.dex */
public final class gf1 implements ao0 {

    /* renamed from: p */
    public final InterfaceC3836zf f11137p;

    /* renamed from: q */
    public boolean f11138q;

    /* renamed from: r */
    public long f11139r;

    /* renamed from: s */
    public long f11140s;

    /* renamed from: t */
    public zw0 f11141t = zw0.f35604e;

    public gf1(InterfaceC3836zf interfaceC3836zf) {
        this.f11137p = interfaceC3836zf;
    }

    /* renamed from: a */
    public void m21729a(long j) {
        this.f11139r = j;
        if (this.f11138q) {
            this.f11140s = this.f11137p.mo2363b();
        }
    }

    /* renamed from: b */
    public void m21728b() {
        if (this.f11138q) {
            return;
        }
        this.f11140s = this.f11137p.mo2363b();
        this.f11138q = true;
    }

    /* renamed from: c */
    public void m21727c() {
        if (this.f11138q) {
            m21729a(mo15824o());
            this.f11138q = false;
        }
    }

    @Override // com.daaw.ao0
    /* renamed from: f */
    public zw0 mo15829f(zw0 zw0Var) {
        if (this.f11138q) {
            m21729a(mo15824o());
        }
        this.f11141t = zw0Var;
        return zw0Var;
    }

    @Override // com.daaw.ao0
    /* renamed from: h */
    public zw0 mo15827h() {
        return this.f11141t;
    }

    @Override // com.daaw.ao0
    /* renamed from: o */
    public long mo15824o() {
        long j = this.f11139r;
        if (this.f11138q) {
            long mo2363b = this.f11137p.mo2363b() - this.f11140s;
            zw0 zw0Var = this.f11141t;
            return j + (zw0Var.f35605a == 1.0f ? C1075dd.m24527a(mo2363b) : zw0Var.m1826a(mo2363b));
        }
        return j;
    }
}
