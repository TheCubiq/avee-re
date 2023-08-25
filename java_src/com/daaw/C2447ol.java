package com.daaw;
/* renamed from: com.daaw.ol */
/* loaded from: classes2.dex */
public final class C2447ol {
    /* renamed from: a */
    public static final String m14204a(InterfaceC2307nl interfaceC2307nl) {
        return null;
    }

    /* renamed from: b */
    public static final ip1<?> m14203b(InterfaceC3343vl interfaceC3343vl) {
        while (!(interfaceC3343vl instanceof C1138du) && (interfaceC3343vl = interfaceC3343vl.mo7066a()) != null) {
            if (interfaceC3343vl instanceof ip1) {
                return (ip1) interfaceC3343vl;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static final ip1<?> m14202c(InterfaceC1438gl<?> interfaceC1438gl, InterfaceC2307nl interfaceC2307nl, Object obj) {
        if (interfaceC1438gl instanceof InterfaceC3343vl) {
            if (interfaceC2307nl.get(jp1.f15304p) != null) {
                ip1<?> m14203b = m14203b((InterfaceC3343vl) interfaceC1438gl);
                if (m14203b != null) {
                    m14203b.m19543m0(interfaceC2307nl, obj);
                }
                return m14203b;
            }
            return null;
        }
        return null;
    }
}
