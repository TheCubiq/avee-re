package com.daaw;
/* loaded from: classes.dex */
public final class el2 implements nt6 {
    public final /* synthetic */ es6 a;

    public el2(es6 es6Var) {
        this.a = es6Var;
    }

    @Override // com.daaw.nt6
    public final void a(int i, long j, String str) {
        this.a.e(i, System.currentTimeMillis() - j, str);
    }

    @Override // com.daaw.nt6
    public final void b(int i, long j) {
        this.a.d(i, System.currentTimeMillis() - j);
    }
}
