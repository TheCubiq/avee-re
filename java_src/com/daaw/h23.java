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
        if (t13Var.m9652d() >= t13Var2.m9652d()) {
            if (t13Var.m9652d() > t13Var2.m9652d()) {
                return 1;
            }
            if (t13Var.m9654b() >= t13Var2.m9654b()) {
                if (t13Var.m9654b() > t13Var2.m9654b()) {
                    return 1;
                }
                float m9655a = (t13Var.m9655a() - t13Var.m9652d()) * (t13Var.m9653c() - t13Var.m9654b());
                float m9655a2 = (t13Var2.m9655a() - t13Var2.m9652d()) * (t13Var2.m9653c() - t13Var2.m9654b());
                if (m9655a <= m9655a2) {
                    return m9655a < m9655a2 ? 1 : 0;
                }
            }
        }
        return -1;
    }
}
