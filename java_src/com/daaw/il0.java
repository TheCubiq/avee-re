package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class il0 {

    /* renamed from: c */
    public static final il0 f13761c = new C1719a().m19670a();

    /* renamed from: a */
    public final String f13762a;

    /* renamed from: b */
    public final List<dl0> f13763b;

    /* renamed from: com.daaw.il0$a */
    /* loaded from: classes.dex */
    public static final class C1719a {

        /* renamed from: a */
        public String f13764a = "";

        /* renamed from: b */
        public List<dl0> f13765b = new ArrayList();

        /* renamed from: a */
        public il0 m19670a() {
            return new il0(this.f13764a, Collections.unmodifiableList(this.f13765b));
        }

        /* renamed from: b */
        public C1719a m19669b(List<dl0> list) {
            this.f13765b = list;
            return this;
        }

        /* renamed from: c */
        public C1719a m19668c(String str) {
            this.f13764a = str;
            return this;
        }
    }

    public il0(String str, List<dl0> list) {
        this.f13762a = str;
        this.f13763b = list;
    }

    /* renamed from: c */
    public static C1719a m19671c() {
        return new C1719a();
    }

    @uz0(tag = 2)
    /* renamed from: a */
    public List<dl0> m19673a() {
        return this.f13763b;
    }

    @uz0(tag = 1)
    /* renamed from: b */
    public String m19672b() {
        return this.f13762a;
    }
}
