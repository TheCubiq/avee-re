package com.daaw;

import java.util.Collections;
import java.util.TreeMap;
/* loaded from: classes2.dex */
public final class vz8 {

    /* renamed from: a */
    public final TreeMap f30735a = new TreeMap();

    /* renamed from: b */
    public final TreeMap f30736b = new TreeMap();

    /* renamed from: c */
    public static final int m6635c(w07 w07Var, ck2 ck2Var, gl2 gl2Var) {
        gl2 mo5780a = ck2Var.mo5780a(w07Var, Collections.singletonList(gl2Var));
        if (mo5780a instanceof tb2) {
            return ou7.m13922b(mo5780a.zzh().doubleValue());
        }
        return -1;
    }

    /* renamed from: a */
    public final void m6637a(String str, int i, ck2 ck2Var, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f30736b;
        } else if (!"edit".equals(str2)) {
            throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
        } else {
            treeMap = this.f30735a;
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i), ck2Var);
    }

    /* renamed from: b */
    public final void m6636b(w07 w07Var, z42 z42Var) {
        uc8 uc8Var = new uc8(z42Var);
        for (Integer num : this.f30735a.keySet()) {
            s32 clone = z42Var.m2825b().clone();
            int m6635c = m6635c(w07Var, (ck2) this.f30735a.get(num), uc8Var);
            if (m6635c == 2 || m6635c == -1) {
                z42Var.m2821f(clone);
            }
        }
        for (Integer num2 : this.f30736b.keySet()) {
            m6635c(w07Var, (ck2) this.f30736b.get(num2), uc8Var);
        }
    }
}
