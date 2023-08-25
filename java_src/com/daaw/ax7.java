package com.daaw;
/* loaded from: classes2.dex */
public final class ax7 implements Runnable {
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ long s;
    public final /* synthetic */ p28 t;

    public ax7(p28 p28Var, String str, String str2, Object obj, long j) {
        this.t = p28Var;
        this.p = str;
        this.q = str2;
        this.r = obj;
        this.s = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.t.M(this.p, this.q, this.r, this.s);
    }
}
