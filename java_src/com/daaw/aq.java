package com.daaw;

import com.daaw.p51;
/* loaded from: classes2.dex */
public final class aq {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(gl<?> glVar) {
        String a;
        if (glVar instanceof bu) {
            return glVar.toString();
        }
        try {
            p51.a aVar = p51.p;
            a = p51.a(glVar + '@' + b(glVar));
        } catch (Throwable th) {
            p51.a aVar2 = p51.p;
            a = p51.a(s51.a(th));
        }
        if (p51.b(a) != null) {
            a = ((Object) glVar.getClass().getName()) + '@' + b(glVar);
        }
        return (String) a;
    }
}
