package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class il0 {
    public static final il0 c = new a().a();
    public final String a;
    public final List<dl0> b;

    /* loaded from: classes.dex */
    public static final class a {
        public String a = "";
        public List<dl0> b = new ArrayList();

        public il0 a() {
            return new il0(this.a, Collections.unmodifiableList(this.b));
        }

        public a b(List<dl0> list) {
            this.b = list;
            return this;
        }

        public a c(String str) {
            this.a = str;
            return this;
        }
    }

    public il0(String str, List<dl0> list) {
        this.a = str;
        this.b = list;
    }

    public static a c() {
        return new a();
    }

    @uz0(tag = 2)
    public List<dl0> a() {
        return this.b;
    }

    @uz0(tag = 1)
    public String b() {
        return this.a;
    }
}
