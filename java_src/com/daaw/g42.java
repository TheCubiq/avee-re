package com.daaw;
/* loaded from: classes.dex */
public final class g42 {

    /* renamed from: a */
    public final j42 f10252a;

    /* renamed from: b */
    public final j42 f10253b;

    public g42(j42 j42Var, j42 j42Var2) {
        this.f10252a = j42Var;
        this.f10253b = j42Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g42.class == obj.getClass()) {
            g42 g42Var = (g42) obj;
            if (this.f10252a.equals(g42Var.f10252a) && this.f10253b.equals(g42Var.f10253b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f10252a.hashCode() * 31) + this.f10253b.hashCode();
    }

    public final String toString() {
        String obj = this.f10252a.toString();
        String concat = this.f10252a.equals(this.f10253b) ? "" : ", ".concat(this.f10253b.toString());
        return "[" + obj + concat + "]";
    }
}
