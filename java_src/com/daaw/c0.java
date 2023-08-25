package com.daaw;
/* loaded from: classes.dex */
public final class c0 {
    public String a;

    /* loaded from: classes.dex */
    public static final class a {
        public String a;

        public /* synthetic */ a(p32 p32Var) {
        }

        public c0 a() {
            String str = this.a;
            if (str != null) {
                c0 c0Var = new c0(null);
                c0Var.a = str;
                return c0Var;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        }

        public a b(String str) {
            this.a = str;
            return this;
        }
    }

    public /* synthetic */ c0(my2 my2Var) {
    }

    public static a b() {
        return new a(null);
    }

    public String a() {
        return this.a;
    }
}
