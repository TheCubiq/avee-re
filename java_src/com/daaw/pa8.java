package com.daaw;
/* loaded from: classes2.dex */
public abstract class pa8 extends na8 {
    public boolean c;

    public pa8(yb8 yb8Var) {
        super(yb8Var);
        this.b.q();
    }

    public final void g() {
        if (!j()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void h() {
        if (this.c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        k();
        this.b.l();
        this.c = true;
    }

    public final boolean j() {
        return this.c;
    }

    public abstract boolean k();
}
