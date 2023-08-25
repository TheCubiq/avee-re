package com.daaw;

import java.util.Set;
/* loaded from: classes.dex */
public final class un1 implements tn1 {

    /* renamed from: a */
    public final Set<C0892bx> f29341a;

    /* renamed from: b */
    public final sn1 f29342b;

    /* renamed from: c */
    public final wn1 f29343c;

    public un1(Set<C0892bx> set, sn1 sn1Var, wn1 wn1Var) {
        this.f29341a = set;
        this.f29342b = sn1Var;
        this.f29343c = wn1Var;
    }

    @Override // com.daaw.tn1
    /* renamed from: a */
    public <T> qn1<T> mo7891a(String str, Class<T> cls, C0892bx c0892bx, hn1<T, byte[]> hn1Var) {
        if (this.f29341a.contains(c0892bx)) {
            return new vn1(this.f29342b, str, c0892bx, hn1Var, this.f29343c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c0892bx, this.f29341a));
    }
}
