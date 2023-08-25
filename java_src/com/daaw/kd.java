package com.daaw;

import java.io.Serializable;
/* loaded from: classes2.dex */
public abstract class kd implements ci0, Serializable {
    public static final Object v = a.p;
    public transient ci0 p;
    public final Object q;
    public final Class r;
    public final String s;
    public final String t;
    public final boolean u;

    /* loaded from: classes2.dex */
    public static class a implements Serializable {
        public static final a p = new a();
    }

    public kd() {
        this(v);
    }

    public kd(Object obj) {
        this(obj, null, null, null, false);
    }

    public kd(Object obj, Class cls, String str, String str2, boolean z) {
        this.q = obj;
        this.r = cls;
        this.s = str;
        this.t = str2;
        this.u = z;
    }

    public ci0 b() {
        ci0 ci0Var = this.p;
        if (ci0Var == null) {
            ci0 c = c();
            this.p = c;
            return c;
        }
        return ci0Var;
    }

    public abstract ci0 c();

    public Object d() {
        return this.q;
    }

    public String e() {
        return this.s;
    }

    public ei0 f() {
        Class cls = this.r;
        if (cls == null) {
            return null;
        }
        return this.u ? m31.b(cls) : m31.a(cls);
    }

    public String g() {
        return this.t;
    }
}
