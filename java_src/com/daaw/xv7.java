package com.daaw;

import android.os.Bundle;
/* loaded from: classes2.dex */
public final class xv7 implements Runnable {
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ long r;
    public final /* synthetic */ Bundle s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ String w;
    public final /* synthetic */ p28 x;

    public xv7(p28 p28Var, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.x = p28Var;
        this.p = str;
        this.q = str2;
        this.r = j;
        this.s = bundle;
        this.t = z;
        this.u = z2;
        this.v = z3;
        this.w = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.x.w(this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w);
    }
}
