package com.daaw;
/* loaded from: classes2.dex */
public final class la7 implements Runnable {
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;
    public final /* synthetic */ long s;
    public final /* synthetic */ ob7 t;

    public la7(ob7 ob7Var, String str, String str2, String str3, long j) {
        this.t = ob7Var;
        this.p = str;
        this.q = str2;
        this.r = str3;
        this.s = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yb8 yb8Var;
        yb8 yb8Var2;
        String str = this.p;
        if (str == null) {
            yb8Var2 = this.t.p;
            yb8Var2.w(this.q, null);
            return;
        }
        t38 t38Var = new t38(this.r, str, this.s);
        yb8Var = this.t.p;
        yb8Var.w(this.q, t38Var);
    }
}
