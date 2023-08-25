package com.daaw;

import com.daaw.jt1;
/* loaded from: classes.dex */
public final class xf0 implements jt1.InterfaceC1864b {

    /* renamed from: b */
    public final it1<?>[] f32652b;

    public xf0(it1<?>... it1VarArr) {
        ug0.m8268f(it1VarArr, "initializers");
        this.f32652b = it1VarArr;
    }

    @Override // com.daaw.jt1.InterfaceC1864b
    /* renamed from: a */
    public /* synthetic */ ht1 mo5153a(Class cls) {
        return kt1.m17442a(this, cls);
    }

    @Override // com.daaw.jt1.InterfaceC1864b
    /* renamed from: b */
    public <T extends ht1> T mo5152b(Class<T> cls, AbstractC1589hn abstractC1589hn) {
        it1<?>[] it1VarArr;
        ug0.m8268f(cls, "modelClass");
        ug0.m8268f(abstractC1589hn, "extras");
        T t = null;
        for (it1<?> it1Var : this.f32652b) {
            if (ug0.m8273a(it1Var.m19434a(), cls)) {
                Object mo2829b = it1Var.m19433b().mo2829b(abstractC1589hn);
                t = mo2829b instanceof ht1 ? (T) mo2829b : null;
            }
        }
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
