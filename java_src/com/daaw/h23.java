package com.daaw;

import java.util.Comparator;
/* loaded from: classes.dex */
public final class h23 implements Comparator {
    public h23(i23 i23Var) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        t13 t13Var = (t13) obj;
        t13 t13Var2 = (t13) obj2;
        if (t13Var.d() >= t13Var2.d()) {
            if (t13Var.d() > t13Var2.d()) {
                return 1;
            }
            if (t13Var.b() >= t13Var2.b()) {
                if (t13Var.b() > t13Var2.b()) {
                    return 1;
                }
                float a = (t13Var.a() - t13Var.d()) * (t13Var.c() - t13Var.b());
                float a2 = (t13Var2.a() - t13Var2.d()) * (t13Var2.c() - t13Var2.b());
                if (a <= a2) {
                    return a < a2 ? 1 : 0;
                }
            }
        }
        return -1;
    }
}
