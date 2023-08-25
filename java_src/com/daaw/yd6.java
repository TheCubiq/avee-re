package com.daaw;
/* loaded from: classes.dex */
public final class yd6 implements m36 {
    public qz6 b;
    public String c;
    public boolean f;
    public final kt6 a = new kt6();
    public int d = 8000;
    public int e = 8000;

    public final yd6 a(boolean z) {
        this.f = true;
        return this;
    }

    public final yd6 b(int i) {
        this.d = i;
        return this;
    }

    public final yd6 c(int i) {
        this.e = i;
        return this;
    }

    public final yd6 d(qz6 qz6Var) {
        this.b = qz6Var;
        return this;
    }

    public final yd6 e(String str) {
        this.c = str;
        return this;
    }

    @Override // com.daaw.m36
    /* renamed from: f */
    public final mj6 zza() {
        mj6 mj6Var = new mj6(this.c, this.d, this.e, this.f, this.a);
        qz6 qz6Var = this.b;
        if (qz6Var != null) {
            mj6Var.d(qz6Var);
        }
        return mj6Var;
    }
}
