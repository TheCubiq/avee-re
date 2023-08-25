package com.daaw;

import com.daaw.tb0;
/* loaded from: classes.dex */
public final class hr extends tb0.a {
    public final String b;
    public final bn1<? super mp> c;
    public final int d;
    public final int e;
    public final boolean f;

    public hr(String str, bn1<? super mp> bn1Var) {
        this(str, bn1Var, 8000, 8000, false);
    }

    public hr(String str, bn1<? super mp> bn1Var, int i, int i2, boolean z) {
        this.b = str;
        this.c = bn1Var;
        this.d = i;
        this.e = i2;
        this.f = z;
    }

    @Override // com.daaw.tb0.a
    /* renamed from: d */
    public gr c(tb0.f fVar) {
        return new gr(this.b, null, this.c, this.d, this.e, this.f, fVar);
    }
}
