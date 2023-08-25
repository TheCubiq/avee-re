package com.daaw;
/* loaded from: classes.dex */
public abstract class nj1 {
    public final sm1 a;

    /* loaded from: classes.dex */
    public static final class a extends tv0 {
        public a(String str) {
            super(str);
        }
    }

    public nj1(sm1 sm1Var) {
        this.a = sm1Var;
    }

    public final void a(rv0 rv0Var, long j) {
        if (b(rv0Var)) {
            c(rv0Var, j);
        }
    }

    public abstract boolean b(rv0 rv0Var);

    public abstract void c(rv0 rv0Var, long j);
}
