package com.daaw;
/* loaded from: classes2.dex */
public abstract class pa8 extends na8 {

    /* renamed from: c */
    public boolean f22778c;

    public pa8(yb8 yb8Var) {
        super(yb8Var);
        this.f19771b.m3883q();
    }

    /* renamed from: g */
    public final void m13533g() {
        if (!m13531j()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: h */
    public final void m13532h() {
        if (this.f22778c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo8149k();
        this.f19771b.m3889l();
        this.f22778c = true;
    }

    /* renamed from: j */
    public final boolean m13531j() {
        return this.f22778c;
    }

    /* renamed from: k */
    public abstract boolean mo8149k();
}
