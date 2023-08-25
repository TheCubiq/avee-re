package com.daaw;
/* loaded from: classes.dex */
public final class pt7 implements dv7 {

    /* renamed from: b */
    public static final vt7 f23266b = new nt7();

    /* renamed from: a */
    public final vt7 f23267a;

    public pt7() {
        vt7 vt7Var;
        vt7[] vt7VarArr = new vt7[2];
        vt7VarArr[0] = es7.m23223c();
        try {
            vt7Var = (vt7) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            vt7Var = f23266b;
        }
        vt7VarArr[1] = vt7Var;
        ot7 ot7Var = new ot7(vt7VarArr);
        vs7.m6815f(ot7Var, "messageInfoFactory");
        this.f23267a = ot7Var;
    }

    /* renamed from: b */
    public static boolean m13147b(ut7 ut7Var) {
        return ut7Var.zzc() == 1;
    }

    @Override // com.daaw.dv7
    /* renamed from: a */
    public final cv7 mo13148a(Class cls) {
        cu7 m23940a;
        lt7 m16558d;
        tv7 m23140a;
        wr7 wr7Var;
        st7 m8822a;
        tv7 m23137b0;
        wr7 m3374a;
        ev7.m23132g(cls);
        ut7 mo6791a = this.f23267a.mo6791a(cls);
        if (mo6791a.zzb()) {
            if (ls7.class.isAssignableFrom(cls)) {
                m23137b0 = ev7.m23138b();
                m3374a = yr7.m3373b();
            } else {
                m23137b0 = ev7.m23137b0();
                m3374a = yr7.m3374a();
            }
            return bu7.m25813i(m23137b0, m3374a, mo6791a.zza());
        }
        if (ls7.class.isAssignableFrom(cls)) {
            boolean m13147b = m13147b(mo6791a);
            m23940a = du7.m23939b();
            m16558d = lt7.m16557e();
            m23140a = ev7.m23138b();
            wr7Var = m13147b ? yr7.m3373b() : null;
            m8822a = tt7.m8821b();
        } else {
            boolean m13147b2 = m13147b(mo6791a);
            m23940a = du7.m23940a();
            m16558d = lt7.m16558d();
            if (m13147b2) {
                m23140a = ev7.m23137b0();
                wr7Var = yr7.m3374a();
            } else {
                m23140a = ev7.m23140a();
                wr7Var = null;
            }
            m8822a = tt7.m8822a();
        }
        return au7.m26998O(cls, mo6791a, m23940a, m16558d, m23140a, wr7Var, m8822a);
    }
}
