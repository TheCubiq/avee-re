package com.daaw;

import java.util.Comparator;
/* loaded from: classes.dex */
public final class v13 implements Comparator {
    public v13(a23 a23Var) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        e23 e23Var = (e23) obj;
        e23 e23Var2 = (e23) obj2;
        int i = e23Var.c - e23Var2.c;
        return i != 0 ? i : (e23Var.a > e23Var2.a ? 1 : (e23Var.a == e23Var2.a ? 0 : -1));
    }
}
