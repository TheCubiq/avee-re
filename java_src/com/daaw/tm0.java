package com.daaw;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
/* loaded from: classes2.dex */
public final class tm0 {
    public static final tm0 a;
    public static final boolean b;
    public static final rm0 c;

    static {
        tm0 tm0Var = new tm0();
        a = tm0Var;
        b = dj1.e("kotlinx.coroutines.fast.service.loader", true);
        c = tm0Var.a();
    }

    public final rm0 a() {
        Object next;
        try {
            List<sm0> c2 = b ? n00.a.c() : lb1.d(jb1.a(ServiceLoader.load(sm0.class, sm0.class.getClassLoader()).iterator()));
            Iterator<T> it = c2.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((sm0) next).getLoadPriority();
                    do {
                        Object next2 = it.next();
                        int loadPriority2 = ((sm0) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            sm0 sm0Var = (sm0) next;
            rm0 e = sm0Var == null ? null : um0.e(sm0Var, c2);
            return e == null ? um0.b(null, null, 3, null) : e;
        } catch (Throwable th) {
            return um0.b(th, null, 2, null);
        }
    }
}
