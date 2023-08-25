package com.daaw;
/* loaded from: classes.dex */
public final class fw8 {

    /* renamed from: a */
    public final int f10040a;

    /* renamed from: b */
    public final x98[] f10041b;

    /* renamed from: c */
    public final tv8[] f10042c;

    /* renamed from: d */
    public final ni4 f10043d;

    /* renamed from: e */
    public final Object f10044e;

    public fw8(x98[] x98VarArr, tv8[] tv8VarArr, ni4 ni4Var, Object obj) {
        this.f10041b = x98VarArr;
        this.f10042c = (tv8[]) tv8VarArr.clone();
        this.f10043d = ni4Var;
        this.f10044e = obj;
        this.f10040a = x98VarArr.length;
    }

    /* renamed from: a */
    public final boolean m22182a(fw8 fw8Var, int i) {
        return fw8Var != null && it5.m19376t(this.f10041b[i], fw8Var.f10041b[i]) && it5.m19376t(this.f10042c[i], fw8Var.f10042c[i]);
    }

    /* renamed from: b */
    public final boolean m22181b(int i) {
        return this.f10041b[i] != null;
    }
}
