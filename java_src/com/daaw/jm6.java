package com.daaw;

import java.util.List;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class jm6 {

    /* renamed from: a */
    public final Object f15213a;

    /* renamed from: b */
    public final List f15214b;

    /* renamed from: c */
    public final /* synthetic */ wm6 f15215c;

    public /* synthetic */ jm6(wm6 wm6Var, Object obj, List list, im6 im6Var) {
        this.f15215c = wm6Var;
        this.f15213a = obj;
        this.f15214b = list;
    }

    /* renamed from: a */
    public final vm6 m18406a(Callable callable) {
        g77 g77Var;
        r67 m10640c = s67.m10640c(this.f15214b);
        f77 m11710a = m10640c.m11710a(new Callable() { // from class: com.daaw.hm6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, z04.f34310f);
        wm6 wm6Var = this.f15215c;
        Object obj = this.f15213a;
        List list = this.f15214b;
        g77Var = wm6Var.f31346a;
        return new vm6(wm6Var, obj, m11710a, list, m10640c.m11710a(callable, g77Var));
    }
}
