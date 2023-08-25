package com.daaw;
/* loaded from: classes2.dex */
public final class jd8 implements xe8 {
    public static final vd8 b = new fd8();
    public final vd8 a;

    public jd8() {
        vd8 vd8Var;
        vd8[] vd8VarArr = new vd8[2];
        vd8VarArr[0] = v98.c();
        try {
            vd8Var = (vd8) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            vd8Var = b;
        }
        vd8VarArr[1] = vd8Var;
        hd8 hd8Var = new hd8(vd8VarArr);
        gb8.f(hd8Var, "messageInfoFactory");
        this.a = hd8Var;
    }

    public static boolean b(td8 td8Var) {
        return td8Var.zzc() == 1;
    }

    @Override // com.daaw.xe8
    public final ve8 a(Class cls) {
        je8 a;
        zc8 c;
        og8 a2;
        o88 o88Var;
        pd8 a3;
        og8 b0;
        o88 a4;
        ze8.g(cls);
        td8 a5 = this.a.a(cls);
        if (a5.zzb()) {
            if (ja8.class.isAssignableFrom(cls)) {
                b0 = ze8.b();
                a4 = u88.b();
            } else {
                b0 = ze8.b0();
                a4 = u88.a();
            }
            return he8.h(b0, a4, a5.zza());
        }
        if (ja8.class.isAssignableFrom(cls)) {
            boolean b2 = b(a5);
            a = le8.b();
            c = zc8.d();
            a2 = ze8.b();
            o88Var = b2 ? u88.b() : null;
            a3 = rd8.b();
        } else {
            boolean b3 = b(a5);
            a = le8.a();
            c = zc8.c();
            if (b3) {
                a2 = ze8.b0();
                o88Var = u88.a();
            } else {
                a2 = ze8.a();
                o88Var = null;
            }
            a3 = rd8.a();
        }
        return fe8.J(cls, a5, a, c, a2, o88Var, a3);
    }
}
