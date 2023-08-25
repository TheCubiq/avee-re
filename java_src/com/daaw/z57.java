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

    /* renamed from: a */
    public final /* synthetic */ zzaw f34479a;

    /* renamed from: b */
    public final /* synthetic */ String f34480b;

    /* renamed from: c */
    public final /* synthetic */ ob7 f34481c;

    public z57(ob7 ob7Var, zzaw zzawVar, String str) {
        this.f34481c = ob7Var;
        this.f34479a = zzawVar;
        this.f34480b = str;
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
        to2 m8904c;
        long j;
        String str3;
        yb8Var = this.f34481c.f21251p;
        yb8Var.m3907c();
        yb8Var2 = this.f34481c.f21251p;
        n38 m3904d0 = yb8Var2.m3904d0();
        zzaw zzawVar = this.f34479a;
        String str4 = this.f34480b;
        m3904d0.mo6991f();
        dr6.m24026t();
        ry0.m10830j(zzawVar);
        ry0.m10834f(str4);
        if (!m3904d0.f25143a.m24020z().m12677B(str4, m75.f18513U)) {
            m3904d0.f25143a.mo3895i().m14161p().m20652b("Generating ScionPayload disabled. packageName", str4);
            return new byte[0];
        } else if (!"_iap".equals(zzawVar.f37068p) && !"_iapx".equals(zzawVar.f37068p)) {
            m3904d0.f25143a.mo3895i().m14161p().m20651c("Generating a payload for this event is not available. package_name, event_name", str4, zzawVar.f37068p);
            return null;
        } else {
            b17 m23789D = e27.m23789D();
            m3904d0.f19771b.m3915W().m8153e0();
            try {
                qu7 m8166R = m3904d0.f19771b.m3915W().m8166R(str4);
                if (m8166R == null) {
                    m3904d0.f25143a.mo3895i().m14161p().m20652b("Log and bundle not available. package_name", str4);
                } else if (m8166R.m12193J()) {
                    g37 m19043O1 = j47.m19043O1();
                    m19043O1.m22015W(1);
                    m19043O1.m22020R("android");
                    if (!TextUtils.isEmpty(m8166R.m12169d0())) {
                        m19043O1.m21987v(m8166R.m12169d0());
                    }
                    if (!TextUtils.isEmpty(m8166R.m12165f0())) {
                        m19043O1.m21983x((String) ry0.m10830j(m8166R.m12165f0()));
                    }
                    if (!TextUtils.isEmpty(m8166R.m12163g0())) {
                        m19043O1.m21981y((String) ry0.m10830j(m8166R.m12163g0()));
                    }
                    if (m8166R.m12191L() != -2147483648L) {
                        m19043O1.m21979z((int) m8166R.m12191L());
                    }
                    m19043O1.m22024N(m8166R.m12180W());
                    m19043O1.m22035H(m8166R.m12182U());
                    String m12159i0 = m8166R.m12159i0();
                    String m12173b0 = m8166R.m12173b0();
                    if (!TextUtils.isEmpty(m12159i0)) {
                        m19043O1.m22025M(m12159i0);
                    } else if (!TextUtils.isEmpty(m12173b0)) {
                        m19043O1.m21989u(m12173b0);
                    }
                    cd2 m3916V = m3904d0.f19771b.m3916V(str4);
                    m19043O1.m22041E(m8166R.m12183T());
                    if (m3904d0.f25143a.m24031n() && m3904d0.f25143a.m24020z().m12676C(m19043O1.m22003i0()) && m3916V.m25423i(vb2.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        m19043O1.m22037G(null);
                    }
                    m19043O1.m22043D(m3916V.m25424h());
                    if (m3916V.m25423i(vb2.AD_STORAGE) && m8166R.m12194I()) {
                        Pair m24596m = m3904d0.f19771b.m3902e0().m24596m(m8166R.m12169d0(), m3916V);
                        if (m8166R.m12194I() && !TextUtils.isEmpty((CharSequence) m24596m.first)) {
                            try {
                                m19043O1.m22014X(n38.m15541c((String) m24596m.first, Long.toString(zzawVar.f37071s)));
                                Object obj = m24596m.second;
                                if (obj != null) {
                                    m19043O1.m22022P(((Boolean) obj).booleanValue());
                                }
                            } catch (SecurityException e) {
                                m3904d0.f25143a.mo3895i().m14161p().m20652b("Resettable device id encryption failed", e.getMessage());
                            }
                        }
                    }
                    m3904d0.f25143a.m24058A().m8310j();
                    m19043O1.m22039F(Build.MODEL);
                    m3904d0.f25143a.m24058A().m8310j();
                    m19043O1.m22021Q(Build.VERSION.RELEASE);
                    m19043O1.m22009c0((int) m3904d0.f25143a.m24058A().m16725o());
                    m19043O1.m22005g0(m3904d0.f25143a.m24058A().m16724p());
                    try {
                        if (m3916V.m25423i(vb2.ANALYTICS_STORAGE) && m8166R.m12167e0() != null) {
                            m19043O1.m21985w(n38.m15541c((String) ry0.m10830j(m8166R.m12167e0()), Long.toString(zzawVar.f37071s)));
                        }
                        if (!TextUtils.isEmpty(m8166R.m12161h0())) {
                            m19043O1.m22027L((String) ry0.m10830j(m8166R.m12161h0()));
                        }
                        String m12169d0 = m8166R.m12169d0();
                        List m8155c0 = m3904d0.f19771b.m3915W().m8155c0(m12169d0);
                        Iterator it = m8155c0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                mc8Var = null;
                                break;
                            }
                            mc8Var = (mc8) it.next();
                            if ("_lte".equals(mc8Var.f18796c)) {
                                break;
                            }
                        }
                        if (mc8Var == null || mc8Var.f18798e == null) {
                            mc8 mc8Var2 = new mc8(m12169d0, "auto", "_lte", m3904d0.f25143a.mo3909b().mo15860a(), 0L);
                            m8155c0.add(mc8Var2);
                            m3904d0.f19771b.m3915W().m8137x(mc8Var2);
                        }
                        ec8 m3898g0 = m3904d0.f19771b.m3898g0();
                        m3898g0.f25143a.mo3895i().m14156v().m20653a("Checking account type status for ad personalization signals");
                        if (m3898g0.f25143a.m24058A().m16722s()) {
                            String m12169d02 = m8166R.m12169d0();
                            ry0.m10830j(m12169d02);
                            if (m8166R.m12194I() && m3898g0.f19771b.m3910a0().m21632B(m12169d02)) {
                                m3898g0.f25143a.mo3895i().m14161p().m20653a("Turning off ad personalization due to account type");
                                Iterator it2 = m8155c0.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if ("_npa".equals(((mc8) it2.next()).f18796c)) {
                                        it2.remove();
                                        break;
                                    }
                                }
                                m8155c0.add(new mc8(m12169d02, "auto", "_npa", m3898g0.f25143a.mo3909b().mo15860a(), 1L));
                            }
                        }
                        we7[] we7VarArr = new we7[m8155c0.size()];
                        for (int i = 0; i < m8155c0.size(); i++) {
                            td7 m6125G = we7.m6125G();
                            m6125G.m9265x(((mc8) m8155c0.get(i)).f18796c);
                            m6125G.m9264y(((mc8) m8155c0.get(i)).f18797d);
                            m3904d0.f19771b.m3898g0().m23593K(m6125G, ((mc8) m8155c0.get(i)).f18798e);
                            we7VarArr[i] = (we7) m6125G.m3975m();
                        }
                        m19043O1.m21986v0(Arrays.asList(we7VarArr));
                        sn5 m10141b = sn5.m10141b(zzawVar);
                        m3904d0.f25143a.m24045N().m24454z(m10141b.f26433d, m3904d0.f19771b.m3915W().m8167Q(str4));
                        m3904d0.f25143a.m24045N().m24514A(m10141b, m3904d0.f25143a.m24020z().m12664m(str4));
                        Bundle bundle2 = m10141b.f26433d;
                        bundle2.putLong("_c", 1L);
                        m3904d0.f25143a.mo3895i().m14161p().m20653a("Marking in-app purchase as real-time");
                        bundle2.putLong("_r", 1L);
                        bundle2.putString("_o", zzawVar.f37070r);
                        if (m3904d0.f25143a.m24045N().m24495T(m19043O1.m22003i0())) {
                            m3904d0.f25143a.m24045N().m24512C(bundle2, "_dbg", 1L);
                            m3904d0.f25143a.m24045N().m24512C(bundle2, "_r", 1L);
                        }
                        to2 m8162V = m3904d0.f19771b.m3915W().m8162V(str4, zzawVar.f37068p);
                        if (m8162V == null) {
                            g37Var = m19043O1;
                            qu7Var = m8166R;
                            b17Var = m23789D;
                            str = str4;
                            bundle = bundle2;
                            str2 = null;
                            m8904c = new to2(str4, zzawVar.f37068p, 0L, 0L, 0L, zzawVar.f37071s, 0L, null, null, null, null);
                            j = 0;
                        } else {
                            qu7Var = m8166R;
                            b17Var = m23789D;
                            str = str4;
                            bundle = bundle2;
                            g37Var = m19043O1;
                            str2 = null;
                            long j2 = m8162V.f27921f;
                            m8904c = m8162V.m8904c(zzawVar.f37071s);
                            j = j2;
                        }
                        m3904d0.f19771b.m3915W().m8144p(m8904c);
                        on2 on2Var = new on2(m3904d0.f25143a, zzawVar.f37070r, str, zzawVar.f37068p, zzawVar.f37071s, j, bundle);
                        fs6 m19365H = it6.m19365H();
                        m19365H.m22332E(on2Var.f21681d);
                        m19365H.m22336A(on2Var.f21679b);
                        m19365H.m22333D(on2Var.f21682e);
                        xp2 xp2Var = new xp2(on2Var.f21683f);
                        while (xp2Var.hasNext()) {
                            String next = xp2Var.next();
                            fw6 m19288H = ix6.m19288H();
                            m19288H.m22210B(next);
                            Object m1075u = on2Var.f21683f.m1075u(next);
                            if (m1075u != null) {
                                m3904d0.f19771b.m3898g0().m23594J(m19288H, m1075u);
                                m19365H.m22323w(m19288H);
                            }
                        }
                        g37 g37Var2 = g37Var;
                        g37Var2.m21984w0(m19365H);
                        y57 m23665D = e87.m23665D();
                        gu6 m24965D = cv6.m24965D();
                        m24965D.m21215s(m8904c.f27918c);
                        m24965D.m21214t(zzawVar.f37068p);
                        m23665D.m4091s(m24965D);
                        g37Var2.m22018T(m23665D);
                        g37Var2.m21994r0(m3904d0.f19771b.m3918T().m8607l(qu7Var.m12169d0(), Collections.emptyList(), g37Var2.m21999m0(), Long.valueOf(m19365H.m22325u()), Long.valueOf(m19365H.m22325u())));
                        if (m19365H.m22328I()) {
                            g37Var2.m22010b0(m19365H.m22325u());
                            g37Var2.m22033I(m19365H.m22325u());
                        }
                        long m12179X = qu7Var.m12179X();
                        if (m12179X != 0) {
                            g37Var2.m22017U(m12179X);
                        }
                        long m12177Z = qu7Var.m12177Z();
                        if (m12177Z != 0) {
                            g37Var2.m22016V(m12177Z);
                        } else if (m12179X != 0) {
                            g37Var2.m22016V(m12179X);
                        }
                        String m12174b = qu7Var.m12174b();
                        zm8.m2111b();
                        if (m3904d0.f25143a.m24020z().m12677B(str2, m75.f18546n0)) {
                            str3 = str;
                            if (m3904d0.f25143a.m24020z().m12677B(str3, m75.f18550p0) && m12174b != null) {
                                g37Var2.m22011a0(m12174b);
                            }
                        } else {
                            str3 = str;
                        }
                        qu7Var.m12168e();
                        g37Var2.m22049A((int) qu7Var.m12178Y());
                        m3904d0.f25143a.m24020z().m12661p();
                        g37Var2.m22007e0(74029L);
                        g37Var2.m22008d0(m3904d0.f25143a.mo3909b().mo15860a());
                        g37Var2.m22012Z(true);
                        if (m3904d0.f25143a.m24020z().m12677B(str2, m75.f18558t0)) {
                            m3904d0.f19771b.m3901f(g37Var2.m22003i0(), g37Var2);
                        }
                        b17 b17Var2 = b17Var;
                        b17Var2.m26525s(g37Var2);
                        qu7 qu7Var2 = qu7Var;
                        qu7Var2.m12200C(g37Var2.m21996p0());
                        qu7Var2.m12141z(g37Var2.m21997o0());
                        m3904d0.f19771b.m3915W().m8145o(qu7Var2);
                        m3904d0.f19771b.m3915W().m8146n();
                        try {
                            return m3904d0.f19771b.m3898g0().m23589O(((e27) b17Var2.m3975m()).m6531i());
                        } catch (IOException e2) {
                            m3904d0.f25143a.mo3895i().m14160q().m20651c("Data loss. Failed to bundle and serialize. appId", om5.m14152z(str3), e2);
                            return str2;
                        }
                    } catch (SecurityException e3) {
                        m3904d0.f25143a.mo3895i().m14161p().m20652b("app instance id encryption failed", e3.getMessage());
                        bArr = new byte[0];
                    }
                } else {
                    m3904d0.f25143a.mo3895i().m14161p().m20652b("Log and bundle disabled. package_name", str4);
                }
                bArr = new byte[0];
                return bArr;
            } finally {
                m3904d0.f19771b.m3915W().m8152f0();
            }
        }
    }
}
