package com.daaw;

import java.util.Set;
/* loaded from: classes.dex */
public final class un1 implements tn1 {
    public final Set<bx> a;
    public final sn1 b;
    public final wn1 c;

    public un1(Set<bx> set, sn1 sn1Var, wn1 wn1Var) {
        this.a = set;
        this.b = sn1Var;
        this.c = wn1Var;
    }

    @Override // com.daaw.tn1
    public <T> qn1<T> a(String str, Class<T> cls, bx bxVar, hn1<T, byte[]> hn1Var) {
        if (this.a.contains(bxVar)) {
            return new vn1(this.b, str, bxVar, hn1Var, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bxVar, this.a));
    }
}
