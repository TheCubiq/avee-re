package com.daaw;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.measurement.internal.zzaw;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public final class z57 implements Callable {
    public final /* synthetic */ zzaw a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ob7 c;

    public z57(ob7 ob7Var, zzaw zzawVar, String str) {
        this.c = ob7Var;
        this.a = zzawVar;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        yb8 yb8Var;
        yb8 yb8Var2;
        byte[] bArr;
        mc8 mc8Var;
        qu7 qu7Var;
        b17 b17Var;
        String str;
        Bundle bundle;
        g37 g37Var;
        String str2;
        to2 c;
        long j;
        String str3;
        yb8Var = this.c.p;
        yb8Var.c();
        yb8Var2 = this.c.p;
        n38 d0 = yb8Var2.d0();
        zzaw zzawVar = this.a;
        String str4 = this.b;
        d0.f();
        dr6.t();
        ry0.j(zzawVar);
        ry0.f(str4);
        if (!d0.a.z().B(str4, m75.U)) {
            d0.a.i().p().b("Generating ScionPayload disabled. packageName", str4);
            return new byte[0];
        } else if (!"_iap".equals(zzawVar.p) && !"_iapx".equals(zzawVar.p)) {
            d0.a.i().p().c("Generating a payload for this event is not available. package_name, event_name", str4, zzawVar.p);
            return null;
        } else {
            b17 D = e27.D();
            d0.b.W().e0();
            try {
                qu7 R = d0.b.W().R(str4);
                if (R == null) {
                    d0.a.i().p().b("Log and bundle not available. package_name", str4);
                } else if (R.J()) {
                    g37 O1 = j47.O1();
                    O1.W(1);
                    O1.R("android");
                    if (!TextUtils.isEmpty(R.d0())) {
                        O1.v(R.d0());
                    }
                    if (!TextUtils.isEmpty(R.f0())) {
                        O1.x((String) ry0.j(R.f0()));
                    }
                    if (!TextUtils.isEmpty(R.g0())) {
                        O1.y((String) ry0.j(R.g0()));
                    }
                    if (R.L() != -2147483648L) {
                        O1.z((int) R.L());
                    }
                    O1.N(R.W());
                    O1.H(R.U());
                    String i0 = R.i0();
                    String b0 = R.b0();
                    if (!TextUtils.isEmpty(i0)) {
                        O1.M(i0);
                    } else if (!TextUtils.isEmpty(b0)) {
                        O1.u(b0);
                    }
                    cd2 V = d0.b.V(str4);
                    O1.E(R.T());
                    if (d0.a.n() && d0.a.z().C(O1.i0()) && V.i(vb2.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        O1.G(null);
                    }
                    O1.D(V.h());
                    if (V.i(vb2.AD_STORAGE) && R.I()) {
                        Pair m = d0.b.e0().m(R.d0(), V);
                        if (R.I() && !TextUtils.isEmpty((CharSequence) m.first)) {
                            try {
                                O1.X(n38.c((String) m.first, Long.toString(zzawVar.s)));
                                Object obj = m.second;
                                if (obj != null) {
                                    O1.P(((Boolean) obj).booleanValue());
                                }
                            } catch (SecurityException e) {
                                d0.a.i().p().b("Resettable device id encryption failed", e.getMessage());
                            }
                        }
                    }
                    d0.a.A().j();
                    O1.F(Build.MODEL);
                    d0.a.A().j();
                    O1.Q(Build.VERSION.RELEASE);
                    O1.c0((int) d0.a.A().o());
                    O1.g0(d0.a.A().p());
                    try {
                        if (V.i(vb2.ANALYTICS_STORAGE) && R.e0() != null) {
                            O1.w(n38.c((String) ry0.j(R.e0()), Long.toString(zzawVar.s)));
                        }
                        if (!TextUtils.isEmpty(R.h0())) {
                            O1.L((String) ry0.j(R.h0()));
                        }
                        String d02 = R.d0();
                        List c0 = d0.b.W().c0(d02);
                        Iterator it = c0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                mc8Var = null;
                                break;
                            }
                            mc8Var = (mc8) it.next();
                            if ("_lte".equals(mc8Var.c)) {
                                break;
                            }
                        }
                        if (mc8Var == null || mc8Var.e == null) {
                            mc8 mc8Var2 = new mc8(d02, "auto", "_lte", d0.a.b().a(), 0L);
                            c0.add(mc8Var2);
                            d0.b.W().x(mc8Var2);
                        }
                        ec8 g0 = d0.b.g0();
                        g0.a.i().v().a("Checking account type status for ad personalization signals");
                        if (g0.a.A().s()) {
                            String d03 = R.d0();
                            ry0.j(d03);
                            if (R.I() && g0.b.a0().B(d03)) {
                                g0.a.i().p().a("Turning off ad personalization due to account type");
                                Iterator it2 = c0.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if ("_npa".equals(((mc8) it2.next()).c)) {
                                        it2.remove();
                                        break;
                                    }
                                }
                                c0.add(new mc8(d03, "auto", "_npa", g0.a.b().a(), 1L));
                            }
                        }
                        we7[] we7VarArr = new we7[c0.size()];
                        for (int i = 0; i < c0.size(); i++) {
                            td7 G = we7.G();
                            G.x(((mc8) c0.get(i)).c);
                            G.y(((mc8) c0.get(i)).d);
                            d0.b.g0().K(G, ((mc8) c0.get(i)).e);
                            we7VarArr[i] = (we7) G.m();
                        }
                        O1.v0(Arrays.asList(we7VarArr));
                        sn5 b = sn5.b(zzawVar);
                        d0.a.N().z(b.d, d0.b.W().Q(str4));
                        d0.a.N().A(b, d0.a.z().m(str4));
                        Bundle bundle2 = b.d;
                        bundle2.putLong("_c", 1L);
                        d0.a.i().p().a("Marking in-app purchase as real-time");
                        bundle2.putLong("_r", 1L);
                        bundle2.putString("_o", zzawVar.r);
                        if (d0.a.N().T(O1.i0())) {
                            d0.a.N().C(bundle2, "_dbg", 1L);
                            d0.a.N().C(bundle2, "_r", 1L);
                        }
                        to2 V2 = d0.b.W().V(str4, zzawVar.p);
                        if (V2 == null) {
                            g37Var = O1;
                            qu7Var = R;
                            b17Var = D;
                            str = str4;
                            bundle = bundle2;
                            str2 = null;
                            c = new to2(str4, zzawVar.p, 0L, 0L, 0L, zzawVar.s, 0L, null, null, null, null);
                            j = 0;
                        } else {
                            qu7Var = R;
                            b17Var = D;
                            str = str4;
                            bundle = bundle2;
                            g37Var = O1;
                            str2 = null;
                            long j2 = V2.f;
                            c = V2.c(zzawVar.s);
                            j = j2;
                        }
                        d0.b.W().p(c);
                        on2 on2Var = new on2(d0.a, zzawVar.r, str, zzawVar.p, zzawVar.s, j, bundle);
                        fs6 H = it6.H();
                        H.E(on2Var.d);
                        H.A(on2Var.b);
                        H.D(on2Var.e);
                        xp2 xp2Var = new xp2(on2Var.f);
                        while (xp2Var.hasNext()) {
                            String next = xp2Var.next();
                            fw6 H2 = ix6.H();
                            H2.B(next);
                            Object u = on2Var.f.u(next);
                            if (u != null) {
                                d0.b.g0().J(H2, u);
                                H.w(H2);
                            }
                        }
                        g37 g37Var2 = g37Var;
                        g37Var2.w0(H);
                        y57 D2 = e87.D();
                        gu6 D3 = cv6.D();
                        D3.s(c.c);
                        D3.t(zzawVar.p);
                        D2.s(D3);
                        g37Var2.T(D2);
                        g37Var2.r0(d0.b.T().l(qu7Var.d0(), Collections.emptyList(), g37Var2.m0(), Long.valueOf(H.u()), Long.valueOf(H.u())));
                        if (H.I()) {
                            g37Var2.b0(H.u());
                            g37Var2.I(H.u());
                        }
                        long X = qu7Var.X();
                        if (X != 0) {
                            g37Var2.U(X);
                        }
                        long Z = qu7Var.Z();
                        if (Z != 0) {
                            g37Var2.V(Z);
                        } else if (X != 0) {
                            g37Var2.V(X);
                        }
                        String b2 = qu7Var.b();
                        zm8.b();
                        if (d0.a.z().B(str2, m75.n0)) {
                            str3 = str;
                            if (d0.a.z().B(str3, m75.p0) && b2 != null) {
                                g37Var2.a0(b2);
                            }
                        } else {
                            str3 = str;
                        }
                        qu7Var.e();
                        g37Var2.A((int) qu7Var.Y());
                        d0.a.z().p();
                        g37Var2.e0(74029L);
                        g37Var2.d0(d0.a.b().a());
                        g37Var2.Z(true);
                        if (d0.a.z().B(str2, m75.t0)) {
                            d0.b.f(g37Var2.i0(), g37Var2);
                        }
                        b17 b17Var2 = b17Var;
                        b17Var2.s(g37Var2);
                        qu7 qu7Var2 = qu7Var;
                        qu7Var2.C(g37Var2.p0());
                        qu7Var2.z(g37Var2.o0());
                        d0.b.W().o(qu7Var2);
                        d0.b.W().n();
                        try {
                            return d0.b.g0().O(((e27) b17Var2.m()).i());
                        } catch (IOException e2) {
                            d0.a.i().q().c("Data loss. Failed to bundle and serialize. appId", om5.z(str3), e2);
                            return str2;
                        }
                    } catch (SecurityException e3) {
                        d0.a.i().p().b("app instance id encryption failed", e3.getMessage());
                        bArr = new byte[0];
                    }
                } else {
                    d0.a.i().p().b("Log and bundle disabled. package_name", str4);
                }
                bArr = new byte[0];
                return bArr;
            } finally {
                d0.b.W().f0();
            }
        }
    }
}
