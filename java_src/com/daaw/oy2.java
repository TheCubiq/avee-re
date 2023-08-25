package com.daaw;

import java.util.Arrays;
import java.util.Comparator;
/* loaded from: classes2.dex */
public final class oy2 implements Comparator {

    /* renamed from: p */
    public final /* synthetic */ ad2 f22111p;

    /* renamed from: q */
    public final /* synthetic */ w07 f22112q;

    public oy2(ad2 ad2Var, w07 w07Var) {
        this.f22111p = ad2Var;
        this.f22112q = w07Var;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        gl2 gl2Var = (gl2) obj;
        gl2 gl2Var2 = (gl2) obj2;
        ad2 ad2Var = this.f22111p;
        w07 w07Var = this.f22112q;
        if (gl2Var instanceof br2) {
            return !(gl2Var2 instanceof br2) ? 1 : 0;
        } else if (gl2Var2 instanceof br2) {
            return -1;
        } else {
            return ad2Var == null ? gl2Var.zzi().compareTo(gl2Var2.zzi()) : (int) ou7.m13923a(ad2Var.mo5780a(w07Var, Arrays.asList(gl2Var, gl2Var2)).zzh().doubleValue());
        }
    }
}
