package com.daaw;
/* renamed from: com.daaw.oh */
/* loaded from: classes2.dex */
public final class C2440oh {

    /* renamed from: a */
    public final Object f21557a;

    /* renamed from: b */
    public final z40<Throwable, lp1> f21558b;

    /* JADX WARN: Multi-variable type inference failed */
    public C2440oh(Object obj, z40<? super Throwable, lp1> z40Var) {
        this.f21557a = obj;
        this.f21558b = z40Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2440oh) {
            C2440oh c2440oh = (C2440oh) obj;
            return ug0.m8273a(this.f21557a, c2440oh.f21557a) && ug0.m8273a(this.f21558b, c2440oh.f21558b);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f21557a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f21558b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f21557a + ", onCancellation=" + this.f21558b + ')';
    }
}
