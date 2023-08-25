package com.daaw;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final /* synthetic */ class fe2 {
    public static gl2 a(og2 og2Var, gl2 gl2Var, w07 w07Var, List list) {
        if (og2Var.zzt(gl2Var.zzi())) {
            gl2 f = og2Var.f(gl2Var.zzi());
            if (f instanceof ad2) {
                return ((ad2) f).a(w07Var, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", gl2Var.zzi()));
        } else if ("hasOwnProperty".equals(gl2Var.zzi())) {
            ou7.h("hasOwnProperty", 1, list);
            return og2Var.zzt(w07Var.b((gl2) list.get(0)).zzi()) ? gl2.l : gl2.m;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", gl2Var.zzi()));
        }
    }

    public static Iterator b(Map map) {
        return new jf2(map.keySet().iterator());
    }
}
