package com.daaw;

import java.util.Map;
/* loaded from: classes2.dex */
public final class br5 implements Runnable {
    public final vo5 p;
    public final int q;
    public final Throwable r;
    public final byte[] s;
    public final String t;
    public final Map u;

    public /* synthetic */ br5(String str, vo5 vo5Var, int i, Throwable th, byte[] bArr, Map map, yp5 yp5Var) {
        ry0.j(vo5Var);
        this.p = vo5Var;
        this.q = i;
        this.r = th;
        this.s = bArr;
        this.t = str;
        this.u = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.p.a(this.t, this.q, this.r, this.s, this.u);
    }
}
