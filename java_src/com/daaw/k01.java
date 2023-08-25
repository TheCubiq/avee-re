package com.daaw;
/* loaded from: classes.dex */
public final class k01 {

    /* renamed from: a */
    public final String f15571a;

    /* renamed from: com.daaw.k01$a */
    /* loaded from: classes.dex */
    public static class C1894a {

        /* renamed from: a */
        public String f15572a;

        public /* synthetic */ C1894a(sf3 sf3Var) {
        }

        /* renamed from: a */
        public k01 m18103a() {
            if (this.f15572a != null) {
                return new k01(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        /* renamed from: b */
        public C1894a m18102b(String str) {
            this.f15572a = str;
            return this;
        }
    }

    public /* synthetic */ k01(C1894a c1894a, vg3 vg3Var) {
        this.f15571a = c1894a.f15572a;
    }

    /* renamed from: a */
    public static C1894a m18105a() {
        return new C1894a(null);
    }

    /* renamed from: b */
    public final String m18104b() {
        return this.f15571a;
    }
}
