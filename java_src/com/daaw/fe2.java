package com.daaw;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final /* synthetic */ class fe2 {
    /* renamed from: a */
    public static gl2 m22750a(og2 og2Var, gl2 gl2Var, w07 w07Var, List list) {
        if (og2Var.zzt(gl2Var.zzi())) {
            gl2 mo2706f = og2Var.mo2706f(gl2Var.zzi());
            if (mo2706f instanceof ad2) {
                return ((ad2) mo2706f).mo5780a(w07Var, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", gl2Var.zzi()));
        } else if ("hasOwnProperty".equals(gl2Var.zzi())) {
            ou7.m13916h("hasOwnProperty", 1, list);
            return og2Var.zzt(w07Var.m6608b((gl2) list.get(0)).zzi()) ? gl2.f11425l : gl2.f11426m;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", gl2Var.zzi()));
        }
    }

    /* renamed from: b */
    public static Iterator m22749b(Map map) {
        return new jf2(map.keySet().iterator());
    }
}
