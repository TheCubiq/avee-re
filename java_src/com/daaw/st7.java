package com.daaw;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class st7 {
    /* renamed from: a */
    public static final int m9885a(int i, Object obj, Object obj2) {
        rt7 rt7Var = (rt7) obj;
        qt7 qt7Var = (qt7) obj2;
        if (rt7Var.isEmpty()) {
            return 0;
        }
        Iterator it = rt7Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    /* renamed from: b */
    public static final boolean m9884b(Object obj) {
        return !((rt7) obj).m10951e();
    }

    /* renamed from: c */
    public static final Object m9883c(Object obj, Object obj2) {
        rt7 rt7Var = (rt7) obj;
        rt7 rt7Var2 = (rt7) obj2;
        if (!rt7Var2.isEmpty()) {
            if (!rt7Var.m10951e()) {
                rt7Var = rt7Var.m10954b();
            }
            rt7Var.m10952d(rt7Var2);
        }
        return rt7Var;
    }
}
