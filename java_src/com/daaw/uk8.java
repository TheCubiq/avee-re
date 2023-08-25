package com.daaw;
/* loaded from: classes.dex */
public final class uk8 {
    public bi8 a = bi8.c;
    public final sk8 b = sk8.a;
    public yk8 c;

    public final uk8 b(bi8 bi8Var) {
        this.a = bi8Var;
        return this;
    }

    public final uk8 c(hi8[] hi8VarArr) {
        this.c = new yk8(hi8VarArr);
        return this;
    }

    public final sl8 d() {
        if (this.c == null) {
            this.c = new yk8(new hi8[0]);
        }
        return new sl8(this, null);
    }
}
