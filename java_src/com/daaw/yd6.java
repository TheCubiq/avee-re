package com.daaw;
/* loaded from: classes.dex */
public final class yd6 implements m36 {

    /* renamed from: b */
    public qz6 f33553b;

    /* renamed from: c */
    public String f33554c;

    /* renamed from: f */
    public boolean f33557f;

    /* renamed from: a */
    public final kt6 f33552a = new kt6();

    /* renamed from: d */
    public int f33555d = 8000;

    /* renamed from: e */
    public int f33556e = 8000;

    /* renamed from: a */
    public final yd6 m3846a(boolean z) {
        this.f33557f = true;
        return this;
    }

    /* renamed from: b */
    public final yd6 m3845b(int i) {
        this.f33555d = i;
        return this;
    }

    /* renamed from: c */
    public final yd6 m3844c(int i) {
        this.f33556e = i;
        return this;
    }

    /* renamed from: d */
    public final yd6 m3843d(qz6 qz6Var) {
        this.f33553b = qz6Var;
        return this;
    }

    /* renamed from: e */
    public final yd6 m3842e(String str) {
        this.f33554c = str;
        return this;
    }

    @Override // com.daaw.m36
    /* renamed from: f */
    public final mj6 zza() {
        mj6 mj6Var = new mj6(this.f33554c, this.f33555d, this.f33556e, this.f33557f, this.f33552a);
        qz6 qz6Var = this.f33553b;
        if (qz6Var != null) {
            mj6Var.mo1979d(qz6Var);
        }
        return mj6Var;
    }
}
