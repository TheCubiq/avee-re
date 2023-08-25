package com.daaw;
/* renamed from: com.daaw.xb */
/* loaded from: classes.dex */
public final class C3518xb {

    /* renamed from: a */
    public int f32313a;

    /* renamed from: b */
    public String f32314b;

    /* renamed from: com.daaw.xb$a */
    /* loaded from: classes.dex */
    public static class C3519a {

        /* renamed from: a */
        public int f32315a;

        /* renamed from: b */
        public String f32316b = "";

        public /* synthetic */ C3519a(qy2 qy2Var) {
        }

        /* renamed from: a */
        public C3518xb m5320a() {
            C3518xb c3518xb = new C3518xb();
            c3518xb.f32313a = this.f32315a;
            c3518xb.f32314b = this.f32316b;
            return c3518xb;
        }

        /* renamed from: b */
        public C3519a m5319b(String str) {
            this.f32316b = str;
            return this;
        }

        /* renamed from: c */
        public C3519a m5318c(int i) {
            this.f32315a = i;
            return this;
        }
    }

    /* renamed from: c */
    public static C3519a m5323c() {
        return new C3519a(null);
    }

    /* renamed from: a */
    public String m5325a() {
        return this.f32314b;
    }

    /* renamed from: b */
    public int m5324b() {
        return this.f32313a;
    }

    public String toString() {
        String m3097i = yx2.m3097i(this.f32313a);
        String str = this.f32314b;
        return "Response Code: " + m3097i + ", Debug Message: " + str;
    }
}
