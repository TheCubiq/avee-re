package com.daaw;
/* loaded from: classes.dex */
public final class wf2 {
    public final Object a;
    public final ve2 b;
    public final zf2 c;
    public boolean d;

    public wf2(zf2 zf2Var) {
        this.d = false;
        this.a = null;
        this.b = null;
        this.c = zf2Var;
    }

    public wf2(Object obj, ve2 ve2Var) {
        this.d = false;
        this.a = obj;
        this.b = ve2Var;
        this.c = null;
    }

    public static wf2 a(zf2 zf2Var) {
        return new wf2(zf2Var);
    }

    public static wf2 b(Object obj, ve2 ve2Var) {
        return new wf2(obj, ve2Var);
    }

    public final boolean c() {
        return this.c == null;
    }
}
