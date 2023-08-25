package com.daaw;
/* loaded from: classes.dex */
public final class t26 {
    public final f77 a;
    public final long b;
    public final ag c;

    public t26(f77 f77Var, long j, ag agVar) {
        this.a = f77Var;
        this.c = agVar;
        this.b = agVar.b() + j;
    }

    public final boolean a() {
        return this.b < this.c.b();
    }
}
