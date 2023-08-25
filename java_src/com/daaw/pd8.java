package com.daaw;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes2.dex */
public final class pd8 {
    public static final int a(int i, Object obj, Object obj2) {
        nd8 nd8Var = (nd8) obj;
        ld8 ld8Var = (ld8) obj2;
        if (nd8Var.isEmpty()) {
            return 0;
        }
        Iterator it = nd8Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    public static final Object b(Object obj, Object obj2) {
        nd8 nd8Var = (nd8) obj;
        nd8 nd8Var2 = (nd8) obj2;
        if (!nd8Var2.isEmpty()) {
            if (!nd8Var.e()) {
                nd8Var = nd8Var.b();
            }
            nd8Var.d(nd8Var2);
        }
        return nd8Var;
    }
}
