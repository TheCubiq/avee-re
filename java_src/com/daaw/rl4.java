package com.daaw;
/* loaded from: classes.dex */
public final class rl4 {
    public final jt4 a;
    public final wv4 b;

    public rl4(jt4 jt4Var, wv4 wv4Var) {
        this.a = jt4Var;
        this.b = wv4Var;
    }

    public final jt4 a() {
        return this.a;
    }

    public final wv4 b() {
        return this.b;
    }

    public final ly4 c() {
        wv4 wv4Var = this.b;
        return wv4Var != null ? new ly4(wv4Var, z04.f) : new ly4(new ql4(this), z04.f);
    }
}
