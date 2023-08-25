package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: com.daaw.wf */
/* loaded from: classes.dex */
public final class C3435wf {

    /* renamed from: e */
    public static final C3435wf f31199e = new C3436a().m6102b();

    /* renamed from: a */
    public final ml1 f31200a;

    /* renamed from: b */
    public final List<il0> f31201b;

    /* renamed from: c */
    public final q70 f31202c;

    /* renamed from: d */
    public final String f31203d;

    /* renamed from: com.daaw.wf$a */
    /* loaded from: classes.dex */
    public static final class C3436a {

        /* renamed from: a */
        public ml1 f31204a = null;

        /* renamed from: b */
        public List<il0> f31205b = new ArrayList();

        /* renamed from: c */
        public q70 f31206c = null;

        /* renamed from: d */
        public String f31207d = "";

        /* renamed from: a */
        public C3436a m6103a(il0 il0Var) {
            this.f31205b.add(il0Var);
            return this;
        }

        /* renamed from: b */
        public C3435wf m6102b() {
            return new C3435wf(this.f31204a, Collections.unmodifiableList(this.f31205b), this.f31206c, this.f31207d);
        }

        /* renamed from: c */
        public C3436a m6101c(String str) {
            this.f31207d = str;
            return this;
        }

        /* renamed from: d */
        public C3436a m6100d(q70 q70Var) {
            this.f31206c = q70Var;
            return this;
        }

        /* renamed from: e */
        public C3436a m6099e(ml1 ml1Var) {
            this.f31204a = ml1Var;
            return this;
        }
    }

    public C3435wf(ml1 ml1Var, List<il0> list, q70 q70Var, String str) {
        this.f31200a = ml1Var;
        this.f31201b = list;
        this.f31202c = q70Var;
        this.f31203d = str;
    }

    /* renamed from: e */
    public static C3436a m6105e() {
        return new C3436a();
    }

    @uz0(tag = 4)
    /* renamed from: a */
    public String m6109a() {
        return this.f31203d;
    }

    @uz0(tag = 3)
    /* renamed from: b */
    public q70 m6108b() {
        return this.f31202c;
    }

    @uz0(tag = 2)
    /* renamed from: c */
    public List<il0> m6107c() {
        return this.f31201b;
    }

    @uz0(tag = 1)
    /* renamed from: d */
    public ml1 m6106d() {
        return this.f31200a;
    }

    /* renamed from: f */
    public byte[] m6104f() {
        return sz0.m9696a(this);
    }
}
