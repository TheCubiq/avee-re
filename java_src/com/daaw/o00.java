package com.daaw;

import com.daaw.p51;
/* loaded from: classes2.dex */
public final class o00 {
    public static final boolean a;

    static {
        Object a2;
        try {
            p51.a aVar = p51.p;
            a2 = p51.a(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            p51.a aVar2 = p51.p;
            a2 = p51.a(s51.a(th));
        }
        a = p51.d(a2);
    }

    public static final boolean a() {
        return a;
    }
}
