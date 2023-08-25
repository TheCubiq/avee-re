package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class wf {
    public static final wf e = new a().b();
    public final ml1 a;
    public final List<il0> b;
    public final q70 c;
    public final String d;

    /* loaded from: classes.dex */
    public static final class a {
        public ml1 a = null;
        public List<il0> b = new ArrayList();
        public q70 c = null;
        public String d = "";

        public a a(il0 il0Var) {
            this.b.add(il0Var);
            return this;
        }

        public wf b() {
            return new wf(this.a, Collections.unmodifiableList(this.b), this.c, this.d);
        }

        public a c(String str) {
            this.d = str;
            return this;
        }

        public a d(q70 q70Var) {
            this.c = q70Var;
            return this;
        }

        public a e(ml1 ml1Var) {
            this.a = ml1Var;
            return this;
        }
    }

    public wf(ml1 ml1Var, List<il0> list, q70 q70Var, String str) {
        this.a = ml1Var;
        this.b = list;
        this.c = q70Var;
        this.d = str;
    }

    public static a e() {
        return new a();
    }

    @uz0(tag = 4)
    public String a() {
        return this.d;
    }

    @uz0(tag = 3)
    public q70 b() {
        return this.c;
    }

    @uz0(tag = 2)
    public List<il0> c() {
        return this.b;
    }

    @uz0(tag = 1)
    public ml1 d() {
        return this.a;
    }

    public byte[] f() {
        return sz0.a(this);
    }
}
