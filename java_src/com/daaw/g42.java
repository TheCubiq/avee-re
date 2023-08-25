package com.daaw;
/* loaded from: classes.dex */
public final class g42 {
    public final j42 a;
    public final j42 b;

    public g42(j42 j42Var, j42 j42Var2) {
        this.a = j42Var;
        this.b = j42Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g42.class == obj.getClass()) {
            g42 g42Var = (g42) obj;
            if (this.a.equals(g42Var.a) && this.b.equals(g42Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        String obj = this.a.toString();
        String concat = this.a.equals(this.b) ? "" : ", ".concat(this.b.toString());
        return "[" + obj + concat + "]";
    }
}
