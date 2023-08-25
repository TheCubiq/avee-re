package com.daaw;

import com.daaw.p51;
/* renamed from: com.daaw.aq */
/* loaded from: classes2.dex */
public final class C0666aq {
    /* renamed from: a */
    public static final String m27227a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* renamed from: b */
    public static final String m27226b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: c */
    public static final String m27225c(InterfaceC1438gl<?> interfaceC1438gl) {
        String m13631a;
        if (interfaceC1438gl instanceof C0887bu) {
            return interfaceC1438gl.toString();
        }
        try {
            p51.C2516a c2516a = p51.f22616p;
            m13631a = p51.m13631a(interfaceC1438gl + '@' + m27226b(interfaceC1438gl));
        } catch (Throwable th) {
            p51.C2516a c2516a2 = p51.f22616p;
            m13631a = p51.m13631a(s51.m10708a(th));
        }
        if (p51.m13630b(m13631a) != null) {
            m13631a = ((Object) interfaceC1438gl.getClass().getName()) + '@' + m27226b(interfaceC1438gl);
        }
        return (String) m13631a;
    }
}
