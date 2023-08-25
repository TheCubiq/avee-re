package com.daaw;
/* loaded from: classes2.dex */
public final class kq0 extends rm0 implements gs {
    public final Throwable q;
    public final String r;

    public kq0(Throwable th, String str) {
        this.q = th;
        this.r = str;
    }

    @Override // com.daaw.pl
    public boolean U(nl nlVar) {
        Z();
        throw new mi0();
    }

    @Override // com.daaw.rm0
    public rm0 W() {
        return this;
    }

    @Override // com.daaw.pl
    /* renamed from: Y */
    public Void T(nl nlVar, Runnable runnable) {
        Z();
        throw new mi0();
    }

    public final Void Z() {
        String l;
        if (this.q == null) {
            um0.d();
            throw new mi0();
        }
        String str = this.r;
        String str2 = "";
        if (str != null && (l = ug0.l(". ", str)) != null) {
            str2 = l;
        }
        throw new IllegalStateException(ug0.l("Module with the Main dispatcher had failed to initialize", str2), this.q);
    }

    @Override // com.daaw.rm0, com.daaw.pl
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        Throwable th = this.q;
        sb.append(th != null ? ug0.l(", cause=", th) : "");
        sb.append(']');
        return sb.toString();
    }
}
