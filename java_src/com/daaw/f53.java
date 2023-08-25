package com.daaw;
/* loaded from: classes.dex */
public final class f53 {

    /* renamed from: i */
    public static final f53 f9116i = new ee2().m23538c();

    /* renamed from: j */
    public static final th8 f9117j = new th8() { // from class: com.daaw.sb2
    };

    /* renamed from: a */
    public final String f9118a;

    /* renamed from: b */
    public final jv2 f9119b;
    @Deprecated

    /* renamed from: c */
    public final ny2 f9120c;

    /* renamed from: d */
    public final ht2 f9121d;

    /* renamed from: e */
    public final gc3 f9122e;

    /* renamed from: f */
    public final wi2 f9123f;
    @Deprecated

    /* renamed from: g */
    public final fl2 f9124g;

    /* renamed from: h */
    public final y13 f9125h;

    public /* synthetic */ f53(String str, fl2 fl2Var, ny2 ny2Var, ht2 ht2Var, gc3 gc3Var, y13 y13Var, d43 d43Var) {
        this.f9118a = str;
        this.f9119b = ny2Var;
        this.f9120c = ny2Var;
        this.f9121d = ht2Var;
        this.f9122e = gc3Var;
        this.f9123f = fl2Var;
        this.f9124g = fl2Var;
        this.f9125h = y13Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f53) {
            f53 f53Var = (f53) obj;
            return it5.m19376t(this.f9118a, f53Var.f9118a) && this.f9123f.equals(f53Var.f9123f) && it5.m19376t(this.f9119b, f53Var.f9119b) && it5.m19376t(this.f9121d, f53Var.f9121d) && it5.m19376t(this.f9122e, f53Var.f9122e) && it5.m19376t(this.f9125h, f53Var.f9125h);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f9118a.hashCode() * 31;
        jv2 jv2Var = this.f9119b;
        return (((((((hashCode + (jv2Var != null ? jv2Var.hashCode() : 0)) * 31) + this.f9121d.hashCode()) * 31) + this.f9123f.hashCode()) * 31) + this.f9122e.hashCode()) * 31;
    }
}
