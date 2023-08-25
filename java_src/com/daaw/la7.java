package com.daaw;
/* loaded from: classes2.dex */
public final class la7 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ String f17180p;

    /* renamed from: q */
    public final /* synthetic */ String f17181q;

    /* renamed from: r */
    public final /* synthetic */ String f17182r;

    /* renamed from: s */
    public final /* synthetic */ long f17183s;

    /* renamed from: t */
    public final /* synthetic */ ob7 f17184t;

    public la7(ob7 ob7Var, String str, String str2, String str3, long j) {
        this.f17184t = ob7Var;
        this.f17180p = str;
        this.f17181q = str2;
        this.f17182r = str3;
        this.f17183s = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yb8 yb8Var;
        yb8 yb8Var2;
        String str = this.f17180p;
        if (str == null) {
            yb8Var2 = this.f17184t.f21251p;
            yb8Var2.m3877w(this.f17181q, null);
            return;
        }
        t38 t38Var = new t38(this.f17182r, str, this.f17183s);
        yb8Var = this.f17184t.f21251p;
        yb8Var.m3877w(this.f17181q, t38Var);
    }
}
