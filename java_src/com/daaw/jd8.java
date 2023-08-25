package com.daaw;
/* loaded from: classes2.dex */
public final class jd8 implements xe8 {

    /* renamed from: b */
    public static final vd8 f15007b = new fd8();

    /* renamed from: a */
    public final vd8 f15008a;

    public jd8() {
        vd8 vd8Var;
        vd8[] vd8VarArr = new vd8[2];
        vd8VarArr[0] = v98.m7310c();
        try {
            vd8Var = (vd8) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            vd8Var = f15007b;
        }
        vd8VarArr[1] = vd8Var;
        hd8 hd8Var = new hd8(vd8VarArr);
        gb8.m21815f(hd8Var, "messageInfoFactory");
        this.f15008a = hd8Var;
    }

    /* renamed from: b */
    public static boolean m18581b(td8 td8Var) {
        return td8Var.zzc() == 1;
    }

    @Override // com.daaw.xe8
    /* renamed from: a */
    public final ve8 mo5168a(Class cls) {
        je8 m16981a;
        zc8 m2481c;
        og8 m2391a;
        o88 o88Var;
        pd8 m11373a;
        og8 m2388b0;
        o88 m8413a;
        ze8.m2383g(cls);
        td8 mo7240a = this.f15008a.mo7240a(cls);
        if (mo7240a.zzb()) {
            if (ja8.class.isAssignableFrom(cls)) {
                m2388b0 = ze8.m2389b();
                m8413a = u88.m8412b();
            } else {
                m2388b0 = ze8.m2388b0();
                m8413a = u88.m8413a();
            }
            return he8.m20832h(m2388b0, m8413a, mo7240a.zza());
        }
        if (ja8.class.isAssignableFrom(cls)) {
            boolean m18581b = m18581b(mo7240a);
            m16981a = le8.m16980b();
            m2481c = zc8.m2480d();
            m2391a = ze8.m2389b();
            o88Var = m18581b ? u88.m8412b() : null;
            m11373a = rd8.m11372b();
        } else {
            boolean m18581b2 = m18581b(mo7240a);
            m16981a = le8.m16981a();
            m2481c = zc8.m2481c();
            if (m18581b2) {
                m2391a = ze8.m2388b0();
                o88Var = u88.m8413a();
            } else {
                m2391a = ze8.m2391a();
                o88Var = null;
            }
            m11373a = rd8.m11373a();
        }
        return fe8.m22733J(cls, mo7240a, m16981a, m2481c, m2391a, o88Var, m11373a);
    }
}
