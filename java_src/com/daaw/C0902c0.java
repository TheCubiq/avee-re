package com.daaw;
/* renamed from: com.daaw.c0 */
/* loaded from: classes.dex */
public final class C0902c0 {

    /* renamed from: a */
    public String f5308a;

    /* renamed from: com.daaw.c0$a */
    /* loaded from: classes.dex */
    public static final class C0903a {

        /* renamed from: a */
        public String f5309a;

        public /* synthetic */ C0903a(p32 p32Var) {
        }

        /* renamed from: a */
        public C0902c0 m25706a() {
            String str = this.f5309a;
            if (str != null) {
                C0902c0 c0902c0 = new C0902c0(null);
                c0902c0.f5308a = str;
                return c0902c0;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        }

        /* renamed from: b */
        public C0903a m25705b(String str) {
            this.f5309a = str;
            return this;
        }
    }

    public /* synthetic */ C0902c0(my2 my2Var) {
    }

    /* renamed from: b */
    public static C0903a m25708b() {
        return new C0903a(null);
    }

    /* renamed from: a */
    public String m25709a() {
        return this.f5308a;
    }
}
