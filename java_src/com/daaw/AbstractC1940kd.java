package com.daaw;

import java.io.Serializable;
/* renamed from: com.daaw.kd */
/* loaded from: classes2.dex */
public abstract class AbstractC1940kd implements ci0, Serializable {

    /* renamed from: v */
    public static final Object f16190v = C1941a.f16197p;

    /* renamed from: p */
    public transient ci0 f16191p;

    /* renamed from: q */
    public final Object f16192q;

    /* renamed from: r */
    public final Class f16193r;

    /* renamed from: s */
    public final String f16194s;

    /* renamed from: t */
    public final String f16195t;

    /* renamed from: u */
    public final boolean f16196u;

    /* renamed from: com.daaw.kd$a */
    /* loaded from: classes2.dex */
    public static class C1941a implements Serializable {

        /* renamed from: p */
        public static final C1941a f16197p = new C1941a();
    }

    public AbstractC1940kd() {
        this(f16190v);
    }

    public AbstractC1940kd(Object obj) {
        this(obj, null, null, null, false);
    }

    public AbstractC1940kd(Object obj, Class cls, String str, String str2, boolean z) {
        this.f16192q = obj;
        this.f16193r = cls;
        this.f16194s = str;
        this.f16195t = str2;
        this.f16196u = z;
    }

    /* renamed from: b */
    public ci0 m17793b() {
        ci0 ci0Var = this.f16191p;
        if (ci0Var == null) {
            ci0 mo13798c = mo13798c();
            this.f16191p = mo13798c;
            return mo13798c;
        }
        return ci0Var;
    }

    /* renamed from: c */
    public abstract ci0 mo13798c();

    /* renamed from: d */
    public Object m17792d() {
        return this.f16192q;
    }

    /* renamed from: e */
    public String m17791e() {
        return this.f16194s;
    }

    /* renamed from: f */
    public ei0 m17790f() {
        Class cls = this.f16193r;
        if (cls == null) {
            return null;
        }
        return this.f16196u ? m31.m16242b(cls) : m31.m16243a(cls);
    }

    /* renamed from: g */
    public String m17789g() {
        return this.f16195t;
    }
}
