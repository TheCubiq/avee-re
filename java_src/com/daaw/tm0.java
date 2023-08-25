package com.daaw;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
/* loaded from: classes2.dex */
public final class tm0 {

    /* renamed from: a */
    public static final tm0 f27856a;

    /* renamed from: b */
    public static final boolean f27857b;

    /* renamed from: c */
    public static final rm0 f27858c;

    static {
        tm0 tm0Var = new tm0();
        f27856a = tm0Var;
        f27857b = dj1.m24352e("kotlinx.coroutines.fast.service.loader", true);
        f27858c = tm0Var.m8969a();
    }

    /* renamed from: a */
    public final rm0 m8969a() {
        Object next;
        try {
            List<sm0> m15625c = f27857b ? n00.f19316a.m15625c() : lb1.m17064d(jb1.m18650a(ServiceLoader.load(sm0.class, sm0.class.getClassLoader()).iterator()));
            Iterator<T> it = m15625c.iterator();
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
            rm0 m8020e = sm0Var == null ? null : um0.m8020e(sm0Var, m15625c);
            return m8020e == null ? um0.m8023b(null, null, 3, null) : m8020e;
        } catch (Throwable th) {
            return um0.m8023b(th, null, 2, null);
        }
    }
}
