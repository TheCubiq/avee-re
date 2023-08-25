package com.daaw;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class st7 {
    public static final int a(int i, Object obj, Object obj2) {
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

    public static final boolean b(Object obj) {
        return !((rt7) obj).e();
    }

    public static final Object c(Object obj, Object obj2) {
        rt7 rt7Var = (rt7) obj;
        rt7 rt7Var2 = (rt7) obj2;
        if (!rt7Var2.isEmpty()) {
            if (!rt7Var.e()) {
                rt7Var = rt7Var.b();
            }
            rt7Var.d(rt7Var2);
        }
        return rt7Var;
    }
}
