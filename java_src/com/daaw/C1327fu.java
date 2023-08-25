package com.daaw;

import com.daaw.p51;
/* renamed from: com.daaw.fu */
/* loaded from: classes2.dex */
public final class C1327fu {
    /* renamed from: a */
    public static final <T> void m22270a(AbstractC1219eu<? super T> abstractC1219eu, int i) {
        InterfaceC1438gl<? super T> mo7265d = abstractC1219eu.mo7265d();
        boolean z = i == 4;
        if (z || !(mo7265d instanceof C0887bu) || m22269b(i) != m22269b(abstractC1219eu.f8831r)) {
            m22267d(abstractC1219eu, mo7265d, z);
            return;
        }
        AbstractC2557pl abstractC2557pl = ((C0887bu) mo7265d).f5180s;
        InterfaceC2307nl context = mo7265d.getContext();
        if (abstractC2557pl.mo11594U(context)) {
            abstractC2557pl.mo5048T(context, abstractC1219eu);
        } else {
            m22266e(abstractC1219eu);
        }
    }

    /* renamed from: b */
    public static final boolean m22269b(int i) {
        return i == 1 || i == 2;
    }

    /* renamed from: c */
    public static final boolean m22268c(int i) {
        return i == 2;
    }

    /* renamed from: d */
    public static final <T> void m22267d(AbstractC1219eu<? super T> abstractC1219eu, InterfaceC1438gl<? super T> interfaceC1438gl, boolean z) {
        Object mo7263f;
        Object mo7262h = abstractC1219eu.mo7262h();
        Throwable mo7264e = abstractC1219eu.mo7264e(mo7262h);
        if (mo7264e != null) {
            p51.C2516a c2516a = p51.f22616p;
            mo7263f = s51.m10708a(mo7264e);
        } else {
            p51.C2516a c2516a2 = p51.f22616p;
            mo7263f = abstractC1219eu.mo7263f(mo7262h);
        }
        Object m13631a = p51.m13631a(mo7263f);
        if (!z) {
            interfaceC1438gl.mo7267b(m13631a);
            return;
        }
        C0887bu c0887bu = (C0887bu) interfaceC1438gl;
        InterfaceC1438gl<T> interfaceC1438gl2 = c0887bu.f5181t;
        Object obj = c0887bu.f5183v;
        InterfaceC2307nl context = interfaceC1438gl2.getContext();
        Object m26071c = bl1.m26071c(context, obj);
        ip1<?> m14202c = m26071c != bl1.f4887a ? C2447ol.m14202c(interfaceC1438gl2, context, m26071c) : null;
        try {
            c0887bu.f5181t.mo7267b(m13631a);
            lp1 lp1Var = lp1.f17593a;
        } finally {
            if (m14202c == null || m14202c.m19544l0()) {
                bl1.m26073a(context, m26071c);
            }
        }
    }

    /* renamed from: e */
    public static final void m22266e(AbstractC1219eu<?> abstractC1219eu) {
        AbstractC1150dy m25251a = cl1.f5936a.m25251a();
        if (m25251a.m23819c0()) {
            m25251a.m23822Y(abstractC1219eu);
            return;
        }
        m25251a.m23821a0(true);
        try {
            m22267d(abstractC1219eu, abstractC1219eu.mo7265d(), true);
            do {
            } while (m25251a.m23817e0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
