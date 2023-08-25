package com.daaw;
/* renamed from: com.daaw.cp */
/* loaded from: classes.dex */
public final class C0974cp implements InterfaceC0879bp {

    /* renamed from: a */
    public final C1533hf f6016a;

    /* renamed from: b */
    public final long f6017b;

    public C0974cp(C1533hf c1533hf, long j) {
        this.f6016a = c1533hf;
        this.f6017b = j;
    }

    @Override // com.daaw.InterfaceC0879bp
    /* renamed from: b */
    public long mo12611b(long j) {
        return this.f6016a.f12490e[(int) j] - this.f6017b;
    }

    @Override // com.daaw.InterfaceC0879bp
    /* renamed from: c */
    public long mo12610c(long j, long j2) {
        return this.f6016a.f12489d[(int) j];
    }

    @Override // com.daaw.InterfaceC0879bp
    /* renamed from: d */
    public d31 mo12609d(long j) {
        C1533hf c1533hf = this.f6016a;
        int i = (int) j;
        return new d31(null, c1533hf.f12488c[i], c1533hf.f12487b[i]);
    }

    @Override // com.daaw.InterfaceC0879bp
    /* renamed from: e */
    public long mo12608e(long j, long j2) {
        return this.f6016a.m20831a(j + this.f6017b);
    }

    @Override // com.daaw.InterfaceC0879bp
    /* renamed from: f */
    public boolean mo12607f() {
        return true;
    }

    @Override // com.daaw.InterfaceC0879bp
    /* renamed from: g */
    public long mo12606g() {
        return 0L;
    }

    @Override // com.daaw.InterfaceC0879bp
    /* renamed from: h */
    public int mo12605h(long j) {
        return this.f6016a.f12486a;
    }
}
