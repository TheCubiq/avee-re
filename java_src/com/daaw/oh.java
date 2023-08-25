package com.daaw;
/* loaded from: classes2.dex */
public final class oh {
    public final Object a;
    public final z40<Throwable, lp1> b;

    /* JADX WARN: Multi-variable type inference failed */
    public oh(Object obj, z40<? super Throwable, lp1> z40Var) {
        this.a = obj;
        this.b = z40Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oh) {
            oh ohVar = (oh) obj;
            return ug0.a(this.a, ohVar.a) && ug0.a(this.b, ohVar.b);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.a + ", onCancellation=" + this.b + ')';
    }
}
