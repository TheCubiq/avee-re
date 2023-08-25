package com.daaw;
/* loaded from: classes.dex */
public final class vn1<T> implements qn1<T> {
    public final sn1 a;
    public final String b;
    public final bx c;
    public final hn1<T, byte[]> d;
    public final wn1 e;

    public vn1(sn1 sn1Var, String str, bx bxVar, hn1<T, byte[]> hn1Var, wn1 wn1Var) {
        this.a = sn1Var;
        this.b = str;
        this.c = bxVar;
        this.d = hn1Var;
        this.e = wn1Var;
    }

    @Override // com.daaw.qn1
    public void a(xx<T> xxVar, ao1 ao1Var) {
        this.e.a(db1.a().e(this.a).c(xxVar).f(this.b).d(this.d).b(this.c).a(), ao1Var);
    }

    public sn1 b() {
        return this.a;
    }
}
