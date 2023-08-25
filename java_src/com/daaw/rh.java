package com.daaw;

import com.daaw.p51;
/* loaded from: classes2.dex */
public final class rh {
    public static final <T> Object a(Object obj, gl<? super T> glVar) {
        if (obj instanceof nh) {
            p51.a aVar = p51.p;
            obj = s51.a(((nh) obj).a);
        } else {
            p51.a aVar2 = p51.p;
        }
        return p51.a(obj);
    }

    public static final <T> Object b(Object obj, ud<?> udVar) {
        Throwable b = p51.b(obj);
        return b == null ? obj : new nh(b, false, 2, null);
    }

    public static final <T> Object c(Object obj, z40<? super Throwable, lp1> z40Var) {
        Throwable b = p51.b(obj);
        return b == null ? z40Var != null ? new oh(obj, z40Var) : obj : new nh(b, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, z40 z40Var, int i, Object obj2) {
        if ((i & 1) != 0) {
            z40Var = null;
        }
        return c(obj, z40Var);
    }
}
