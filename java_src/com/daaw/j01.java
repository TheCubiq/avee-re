package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public final class j01 {
    public final rt8 a;

    /* loaded from: classes.dex */
    public static class a {
        public rt8 a;

        public /* synthetic */ a(w83 w83Var) {
        }

        public j01 a() {
            return new j01(this, null);
        }

        public a b(List<b> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            boolean z = false;
            boolean z2 = false;
            for (b bVar : list) {
                z |= bVar.c().equals("inapp");
                z2 |= bVar.c().equals("subs");
            }
            if (z && z2) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.a = rt8.q(list);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public final String a;
        public final String b;

        /* loaded from: classes.dex */
        public static class a {
            public String a;
            public String b;

            public /* synthetic */ a(aa3 aa3Var) {
            }

            public b a() {
                if (this.a != null) {
                    if (this.b != null) {
                        return new b(this, null);
                    }
                    throw new IllegalArgumentException("Product type must be provided.");
                }
                throw new IllegalArgumentException("Product id must be provided.");
            }

            public a b(String str) {
                this.a = str;
                return this;
            }

            public a c(String str) {
                this.b = str;
                return this;
            }
        }

        public /* synthetic */ b(a aVar, fb3 fb3Var) {
            this.a = aVar.a;
            this.b = aVar.b;
        }

        public static a a() {
            return new a(null);
        }

        public final String b() {
            return this.a;
        }

        public final String c() {
            return this.b;
        }
    }

    public /* synthetic */ j01(a aVar, jc3 jc3Var) {
        this.a = aVar.a;
    }

    public static a a() {
        return new a(null);
    }

    public final rt8 b() {
        return this.a;
    }

    public final String c() {
        return ((b) this.a.get(0)).c();
    }
}
