package com.daaw;

import com.daaw.jt1;
/* loaded from: classes.dex */
public final class xf0 implements jt1.b {
    public final it1<?>[] b;

    public xf0(it1<?>... it1VarArr) {
        ug0.f(it1VarArr, "initializers");
        this.b = it1VarArr;
    }

    @Override // com.daaw.jt1.b
    public /* synthetic */ ht1 a(Class cls) {
        return kt1.a(this, cls);
    }

    @Override // com.daaw.jt1.b
    public <T extends ht1> T b(Class<T> cls, hn hnVar) {
        it1<?>[] it1VarArr;
        ug0.f(cls, "modelClass");
        ug0.f(hnVar, "extras");
        T t = null;
        for (it1<?> it1Var : this.b) {
            if (ug0.a(it1Var.a(), cls)) {
                Object b = it1Var.b().b(hnVar);
                t = b instanceof ht1 ? (T) b : null;
            }
        }
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
