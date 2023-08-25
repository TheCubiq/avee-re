package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public final class j01 {

    /* renamed from: a */
    public final rt8 f14142a;

    /* renamed from: com.daaw.j01$a */
    /* loaded from: classes.dex */
    public static class C1776a {

        /* renamed from: a */
        public rt8 f14143a;

        public /* synthetic */ C1776a(w83 w83Var) {
        }

        /* renamed from: a */
        public j01 m19210a() {
            return new j01(this, null);
        }

        /* renamed from: b */
        public C1776a m19209b(List<C1777b> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            boolean z = false;
            boolean z2 = false;
            for (C1777b c1777b : list) {
                z |= c1777b.m19205c().equals("inapp");
                z2 |= c1777b.m19205c().equals("subs");
            }
            if (z && z2) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.f14143a = rt8.m10943q(list);
            return this;
        }
    }

    /* renamed from: com.daaw.j01$b */
    /* loaded from: classes.dex */
    public static class C1777b {

        /* renamed from: a */
        public final String f14144a;

        /* renamed from: b */
        public final String f14145b;

        /* renamed from: com.daaw.j01$b$a */
        /* loaded from: classes.dex */
        public static class C1778a {

            /* renamed from: a */
            public String f14146a;

            /* renamed from: b */
            public String f14147b;

            public /* synthetic */ C1778a(aa3 aa3Var) {
            }

            /* renamed from: a */
            public C1777b m19204a() {
                if (this.f14146a != null) {
                    if (this.f14147b != null) {
                        return new C1777b(this, null);
                    }
                    throw new IllegalArgumentException("Product type must be provided.");
                }
                throw new IllegalArgumentException("Product id must be provided.");
            }

            /* renamed from: b */
            public C1778a m19203b(String str) {
                this.f14146a = str;
                return this;
            }

            /* renamed from: c */
            public C1778a m19202c(String str) {
                this.f14147b = str;
                return this;
            }
        }

        public /* synthetic */ C1777b(C1778a c1778a, fb3 fb3Var) {
            this.f14144a = c1778a.f14146a;
            this.f14145b = c1778a.f14147b;
        }

        /* renamed from: a */
        public static C1778a m19207a() {
            return new C1778a(null);
        }

        /* renamed from: b */
        public final String m19206b() {
            return this.f14144a;
        }

        /* renamed from: c */
        public final String m19205c() {
            return this.f14145b;
        }
    }

    public /* synthetic */ j01(C1776a c1776a, jc3 jc3Var) {
        this.f14142a = c1776a.f14143a;
    }

    /* renamed from: a */
    public static C1776a m19213a() {
        return new C1776a(null);
    }

    /* renamed from: b */
    public final rt8 m19212b() {
        return this.f14142a;
    }

    /* renamed from: c */
    public final String m19211c() {
        return ((C1777b) this.f14142a.get(0)).m19205c();
    }
}
