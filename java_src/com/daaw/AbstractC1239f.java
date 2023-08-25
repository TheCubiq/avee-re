package com.daaw;
/* renamed from: com.daaw.f */
/* loaded from: classes2.dex */
public abstract class AbstractC1239f<T> extends uh0 implements InterfaceC1438gl<T> {

    /* renamed from: q */
    public final InterfaceC2307nl f8977q;

    @Override // com.daaw.uh0
    /* renamed from: H */
    public final void mo8247H(Throwable th) {
        C2954sl.m10220a(this.f8977q, th);
    }

    @Override // com.daaw.uh0
    /* renamed from: O */
    public String mo8240O() {
        String m14204a = C2447ol.m14204a(this.f8977q);
        if (m14204a == null) {
            return super.mo8240O();
        }
        return '\"' + m14204a + "\":" + super.mo8240O();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daaw.uh0
    /* renamed from: U */
    public final void mo8234U(Object obj) {
        if (!(obj instanceof C2292nh)) {
            m22975k0(obj);
            return;
        }
        C2292nh c2292nh = (C2292nh) obj;
        m22976j0(c2292nh.f20118a, c2292nh.m15181a());
    }

    @Override // com.daaw.InterfaceC1438gl
    /* renamed from: b */
    public final void mo7267b(Object obj) {
        Object m8242M = m8242M(C2862rh.m11312d(obj, null, 1, null));
        if (m8242M == vh0.f30224b) {
            return;
        }
        mo19545i0(m8242M);
    }

    @Override // com.daaw.uh0, com.daaw.mh0
    /* renamed from: d */
    public boolean mo8224d() {
        return super.mo8224d();
    }

    @Override // com.daaw.InterfaceC1438gl
    public final InterfaceC2307nl getContext() {
        return this.f8977q;
    }

    /* renamed from: i0 */
    public void mo19545i0(Object obj) {
        mo8216h(obj);
    }

    /* renamed from: j0 */
    public void m22976j0(Throwable th, boolean z) {
    }

    /* renamed from: k0 */
    public void m22975k0(T t) {
    }

    @Override // com.daaw.uh0
    /* renamed from: m */
    public String mo8210m() {
        return ug0.m8262l(C0666aq.m27227a(this), " was cancelled");
    }
}
