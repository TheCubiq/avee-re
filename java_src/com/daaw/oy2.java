package com.daaw;

import java.util.Arrays;
import java.util.Comparator;
/* loaded from: classes2.dex */
public final class oy2 implements Comparator {
    public final /* synthetic */ ad2 p;
    public final /* synthetic */ w07 q;

    public oy2(ad2 ad2Var, w07 w07Var) {
        this.p = ad2Var;
        this.q = w07Var;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        gl2 gl2Var = (gl2) obj;
        gl2 gl2Var2 = (gl2) obj2;
        ad2 ad2Var = this.p;
        w07 w07Var = this.q;
        if (gl2Var instanceof br2) {
            return !(gl2Var2 instanceof br2) ? 1 : 0;
        } else if (gl2Var2 instanceof br2) {
            return -1;
        } else {
            return ad2Var == null ? gl2Var.zzi().compareTo(gl2Var2.zzi()) : (int) ou7.a(ad2Var.a(w07Var, Arrays.asList(gl2Var, gl2Var2)).zzh().doubleValue());
        }
    }
}
