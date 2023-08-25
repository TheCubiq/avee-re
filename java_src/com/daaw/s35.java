package com.daaw;
/* loaded from: classes.dex */
public final class s35 {
    public zd3 a;
    public wd3 b;
    public me3 c;
    public je3 d;
    public sj3 e;
    public final cd1 f = new cd1();
    public final cd1 g = new cd1();

    public final s35 a(wd3 wd3Var) {
        this.b = wd3Var;
        return this;
    }

    public final s35 b(zd3 zd3Var) {
        this.a = zd3Var;
        return this;
    }

    public final s35 c(String str, fe3 fe3Var, ce3 ce3Var) {
        this.f.put(str, fe3Var);
        if (ce3Var != null) {
            this.g.put(str, ce3Var);
        }
        return this;
    }

    public final s35 d(sj3 sj3Var) {
        this.e = sj3Var;
        return this;
    }

    public final s35 e(je3 je3Var) {
        this.d = je3Var;
        return this;
    }

    public final s35 f(me3 me3Var) {
        this.c = me3Var;
        return this;
    }

    public final u35 g() {
        return new u35(this);
    }
}
