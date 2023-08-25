package com.daaw;

import com.google.android.gms.ads.internal.zzi;
/* loaded from: classes.dex */
public final class su7 implements nt6 {
    public final /* synthetic */ zzi a;

    public su7(zzi zziVar) {
        this.a = zziVar;
    }

    @Override // com.daaw.nt6
    public final void a(int i, long j, String str) {
        es6 es6Var;
        es6Var = this.a.w;
        es6Var.e(i, System.currentTimeMillis() - j, str);
    }

    @Override // com.daaw.nt6
    public final void b(int i, long j) {
        es6 es6Var;
        es6Var = this.a.w;
        es6Var.d(i, System.currentTimeMillis() - j);
    }
}
