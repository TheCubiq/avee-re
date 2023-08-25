package com.daaw;
/* loaded from: classes2.dex */
public final class fa8 {

    /* renamed from: a */
    public final InterfaceC0623ag f9310a;

    /* renamed from: b */
    public long f9311b;

    public fa8(InterfaceC0623ag interfaceC0623ag) {
        ry0.m10830j(interfaceC0623ag);
        this.f9310a = interfaceC0623ag;
    }

    /* renamed from: a */
    public final void m22816a() {
        this.f9311b = 0L;
    }

    /* renamed from: b */
    public final void m22815b() {
        this.f9311b = this.f9310a.mo15859b();
    }

    /* renamed from: c */
    public final boolean m22814c(long j) {
        return this.f9311b == 0 || this.f9310a.mo15859b() - this.f9311b >= 3600000;
    }
}
