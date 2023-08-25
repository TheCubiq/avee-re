package com.daaw;

import java.util.Collections;
import java.util.TreeMap;
/* loaded from: classes2.dex */
public final class vz8 {
    public final TreeMap a = new TreeMap();
    public final TreeMap b = new TreeMap();

    public static final int c(w07 w07Var, ck2 ck2Var, gl2 gl2Var) {
        gl2 a = ck2Var.a(w07Var, Collections.singletonList(gl2Var));
        if (a instanceof tb2) {
            return ou7.b(a.zzh().doubleValue());
        }
        return -1;
    }

    public final void a(String str, int i, ck2 ck2Var, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.b;
        } else if (!"edit".equals(str2)) {
            throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
        } else {
            treeMap = this.a;
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i), ck2Var);
    }

    public final void b(w07 w07Var, z42 z42Var) {
        uc8 uc8Var = new uc8(z42Var);
        for (Integer num : this.a.keySet()) {
            s32 clone = z42Var.b().clone();
            int c = c(w07Var, (ck2) this.a.get(num), uc8Var);
            if (c == 2 || c == -1) {
                z42Var.f(clone);
            }
        }
        for (Integer num2 : this.b.keySet()) {
            c(w07Var, (ck2) this.b.get(num2), uc8Var);
        }
    }
}
