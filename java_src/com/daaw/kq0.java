package com.daaw;
/* loaded from: classes2.dex */
public final class kq0 extends rm0 implements InterfaceC1459gs {

    /* renamed from: q */
    public final Throwable f16688q;

    /* renamed from: r */
    public final String f16689r;

    public kq0(Throwable th, String str) {
        this.f16688q = th;
        this.f16689r = str;
    }

    @Override // com.daaw.AbstractC2557pl
    /* renamed from: U */
    public boolean mo11594U(InterfaceC2307nl interfaceC2307nl) {
        m17489Z();
        throw new mi0();
    }

    @Override // com.daaw.rm0
    /* renamed from: W */
    public rm0 mo11184W() {
        return this;
    }

    @Override // com.daaw.AbstractC2557pl
    /* renamed from: Y */
    public Void mo5048T(InterfaceC2307nl interfaceC2307nl, Runnable runnable) {
        m17489Z();
        throw new mi0();
    }

    /* renamed from: Z */
    public final Void m17489Z() {
        String m8262l;
        if (this.f16688q == null) {
            um0.m8021d();
            throw new mi0();
        }
        String str = this.f16689r;
        String str2 = "";
        if (str != null && (m8262l = ug0.m8262l(". ", str)) != null) {
            str2 = m8262l;
        }
        throw new IllegalStateException(ug0.m8262l("Module with the Main dispatcher had failed to initialize", str2), this.f16688q);
    }

    @Override // com.daaw.rm0, com.daaw.AbstractC2557pl
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        Throwable th = this.f16688q;
        sb.append(th != null ? ug0.m8262l(", cause=", th) : "");
        sb.append(']');
        return sb.toString();
    }
}
