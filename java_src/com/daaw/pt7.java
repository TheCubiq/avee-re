package com.daaw;
/* loaded from: classes.dex */
public final class pt7 implements dv7 {
    public static final vt7 b = new nt7();
    public final vt7 a;

    public pt7() {
        vt7 vt7Var;
        vt7[] vt7VarArr = new vt7[2];
        vt7VarArr[0] = es7.c();
        try {
            vt7Var = (vt7) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            vt7Var = b;
        }
        vt7VarArr[1] = vt7Var;
        ot7 ot7Var = new ot7(vt7VarArr);
        vs7.f(ot7Var, "messageInfoFactory");
        this.a = ot7Var;
    }

    public static boolean b(ut7 ut7Var) {
        return ut7Var.zzc() == 1;
    }

    @Override // com.daaw.dv7
    public final cv7 a(Class cls) {
        cu7 a;
        lt7 d;
        tv7 a2;
        wr7 wr7Var;
        st7 a3;
        tv7 b0;
        wr7 a4;
        ev7.g(cls);
        ut7 a5 = this.a.a(cls);
        if (a5.zzb()) {
            if (ls7.class.isAssignableFrom(cls)) {
                b0 = ev7.b();
                a4 = yr7.b();
            } else {
                b0 = ev7.b0();
                a4 = yr7.a();
            }
            return bu7.i(b0, a4, a5.zza());
        }
        if (ls7.class.isAssignableFrom(cls)) {
            boolean b2 = b(a5);
            a = du7.b();
            d = lt7.e();
            a2 = ev7.b();
            wr7Var = b2 ? yr7.b() : null;
            a3 = tt7.b();
        } else {
            boolean b3 = b(a5);
            a = du7.a();
            d = lt7.d();
            if (b3) {
                a2 = ev7.b0();
                wr7Var = yr7.a();
            } else {
                a2 = ev7.a();
                wr7Var = null;
            }
            a3 = tt7.a();
        }
        return au7.O(cls, a5, a, d, a2, wr7Var, a3);
    }
}
