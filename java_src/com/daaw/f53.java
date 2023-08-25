package com.daaw;
/* loaded from: classes.dex */
public final class f53 {
    public static final f53 i = new ee2().c();
    public static final th8 j = new th8() { // from class: com.daaw.sb2
    };
    public final String a;
    public final jv2 b;
    @Deprecated
    public final ny2 c;
    public final ht2 d;
    public final gc3 e;
    public final wi2 f;
    @Deprecated
    public final fl2 g;
    public final y13 h;

    public /* synthetic */ f53(String str, fl2 fl2Var, ny2 ny2Var, ht2 ht2Var, gc3 gc3Var, y13 y13Var, d43 d43Var) {
        this.a = str;
        this.b = ny2Var;
        this.c = ny2Var;
        this.d = ht2Var;
        this.e = gc3Var;
        this.f = fl2Var;
        this.g = fl2Var;
        this.h = y13Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f53) {
            f53 f53Var = (f53) obj;
            return it5.t(this.a, f53Var.a) && this.f.equals(f53Var.f) && it5.t(this.b, f53Var.b) && it5.t(this.d, f53Var.d) && it5.t(this.e, f53Var.e) && it5.t(this.h, f53Var.h);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        jv2 jv2Var = this.b;
        return (((((((hashCode + (jv2Var != null ? jv2Var.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.f.hashCode()) * 31) + this.e.hashCode()) * 31;
    }
}
