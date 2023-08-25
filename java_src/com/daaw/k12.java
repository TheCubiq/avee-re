package com.daaw;

import com.daaw.k3;
import com.google.android.gms.common.api.Scope;
/* loaded from: classes2.dex */
public final class k12 {
    public static final k3.g<wc1> a;
    public static final k3.g<wc1> b;
    public static final k3.a<wc1, xc1> c;
    public static final k3.a<wc1, t02> d;
    public static final Scope e;
    public static final Scope f;
    public static final k3<xc1> g;
    public static final k3<t02> h;

    static {
        k3.g<wc1> gVar = new k3.g<>();
        a = gVar;
        k3.g<wc1> gVar2 = new k3.g<>();
        b = gVar2;
        nz1 nz1Var = new nz1();
        c = nz1Var;
        zz1 zz1Var = new zz1();
        d = zz1Var;
        e = new Scope("profile");
        f = new Scope("email");
        g = new k3<>("SignIn.API", nz1Var, gVar);
        h = new k3<>("SignIn.INTERNAL_API", zz1Var, gVar2);
    }
}
