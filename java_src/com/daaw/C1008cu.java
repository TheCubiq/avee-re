package com.daaw;

import com.daaw.p51;
import java.util.concurrent.CancellationException;
/* renamed from: com.daaw.cu */
/* loaded from: classes2.dex */
public final class C1008cu {

    /* renamed from: a */
    public static final pi1 f6181a = new pi1("UNDEFINED");

    /* renamed from: b */
    public static final pi1 f6182b = new pi1("REUSABLE_CLAIMED");

    /* renamed from: a */
    public static final /* synthetic */ pi1 m24978a() {
        return f6181a;
    }

    /* renamed from: b */
    public static final <T> void m24977b(InterfaceC1438gl<? super T> interfaceC1438gl, Object obj, z40<? super Throwable, lp1> z40Var) {
        boolean z;
        if (!(interfaceC1438gl instanceof C0887bu)) {
            interfaceC1438gl.mo7267b(obj);
            return;
        }
        C0887bu c0887bu = (C0887bu) interfaceC1438gl;
        Object m11313c = C2862rh.m11313c(obj, z40Var);
        if (c0887bu.f5180s.mo11594U(c0887bu.getContext())) {
            c0887bu.f5182u = m11313c;
            c0887bu.f8831r = 1;
            c0887bu.f5180s.mo5048T(c0887bu.getContext(), c0887bu);
            return;
        }
        AbstractC1150dy m25251a = cl1.f5936a.m25251a();
        if (m25251a.m23819c0()) {
            c0887bu.f5182u = m11313c;
            c0887bu.f8831r = 1;
            m25251a.m23822Y(c0887bu);
            return;
        }
        m25251a.m23821a0(true);
        try {
            mh0 mh0Var = (mh0) c0887bu.getContext().get(mh0.f18874d);
            if (mh0Var == null || mh0Var.mo8224d()) {
                z = false;
            } else {
                CancellationException mo8207q = mh0Var.mo8207q();
                c0887bu.mo7266c(m11313c, mo8207q);
                p51.C2516a c2516a = p51.f22616p;
                c0887bu.mo7267b(p51.m13631a(s51.m10708a(mo8207q)));
                z = true;
            }
            if (!z) {
                InterfaceC1438gl<T> interfaceC1438gl2 = c0887bu.f5181t;
                Object obj2 = c0887bu.f5183v;
                InterfaceC2307nl context = interfaceC1438gl2.getContext();
                Object m26071c = bl1.m26071c(context, obj2);
                ip1<?> m14202c = m26071c != bl1.f4887a ? C2447ol.m14202c(interfaceC1438gl2, context, m26071c) : null;
                c0887bu.f5181t.mo7267b(obj);
                lp1 lp1Var = lp1.f17593a;
                if (m14202c == null || m14202c.m19544l0()) {
                    bl1.m26073a(context, m26071c);
                }
            }
            do {
            } while (m25251a.m23817e0());
        } finally {
            try {
            } finally {
            }
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m24976c(InterfaceC1438gl interfaceC1438gl, Object obj, z40 z40Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            z40Var = null;
        }
        m24977b(interfaceC1438gl, obj, z40Var);
    }
}
