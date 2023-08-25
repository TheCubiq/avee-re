package com.daaw;
/* loaded from: classes.dex */
public final class k01 {
    public final String a;

    /* loaded from: classes.dex */
    public static class a {
        public String a;

        public /* synthetic */ a(sf3 sf3Var) {
        }

        public k01 a() {
            if (this.a != null) {
                return new k01(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public a b(String str) {
            this.a = str;
            return this;
        }
    }

    public /* synthetic */ k01(a aVar, vg3 vg3Var) {
        this.a = aVar.a;
    }

    public static a a() {
        return new a(null);
    }

    public final String b() {
        return this.a;
    }
}
