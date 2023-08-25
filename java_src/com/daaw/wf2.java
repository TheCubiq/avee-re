package com.daaw;
/* loaded from: classes.dex */
public final class wf2 {

    /* renamed from: a */
    public final Object f31212a;

    /* renamed from: b */
    public final ve2 f31213b;

    /* renamed from: c */
    public final zf2 f31214c;

    /* renamed from: d */
    public boolean f31215d;

    public wf2(zf2 zf2Var) {
        this.f31215d = false;
        this.f31212a = null;
        this.f31213b = null;
        this.f31214c = zf2Var;
    }

    public wf2(Object obj, ve2 ve2Var) {
        this.f31215d = false;
        this.f31212a = obj;
        this.f31213b = ve2Var;
        this.f31214c = null;
    }

    /* renamed from: a */
    public static wf2 m6089a(zf2 zf2Var) {
        return new wf2(zf2Var);
    }

    /* renamed from: b */
    public static wf2 m6088b(Object obj, ve2 ve2Var) {
        return new wf2(obj, ve2Var);
    }

    /* renamed from: c */
    public final boolean m6087c() {
        return this.f31214c == null;
    }
}
