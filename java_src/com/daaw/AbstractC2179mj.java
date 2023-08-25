package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* renamed from: com.daaw.mj */
/* loaded from: classes.dex */
public abstract class AbstractC2179mj<T> implements InterfaceC2443oj<T> {

    /* renamed from: a */
    public final List<String> f18891a = new ArrayList();

    /* renamed from: b */
    public T f18892b;

    /* renamed from: c */
    public AbstractC2554pj<T> f18893c;

    /* renamed from: d */
    public InterfaceC2180a f18894d;

    /* renamed from: com.daaw.mj$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2180a {
        /* renamed from: a */
        void mo9792a(List<String> list);

        /* renamed from: b */
        void mo9791b(List<String> list);
    }

    public AbstractC2179mj(AbstractC2554pj<T> abstractC2554pj) {
        this.f18893c = abstractC2554pj;
    }

    @Override // com.daaw.InterfaceC2443oj
    /* renamed from: a */
    public void mo14258a(T t) {
        this.f18892b = t;
        m16015h(this.f18894d, t);
    }

    /* renamed from: b */
    public abstract boolean mo10995b(qy1 qy1Var);

    /* renamed from: c */
    public abstract boolean mo10994c(T t);

    /* renamed from: d */
    public boolean m16019d(String str) {
        T t = this.f18892b;
        return t != null && mo10994c(t) && this.f18891a.contains(str);
    }

    /* renamed from: e */
    public void m16018e(Iterable<qy1> iterable) {
        this.f18891a.clear();
        for (qy1 qy1Var : iterable) {
            if (mo10995b(qy1Var)) {
                this.f18891a.add(qy1Var.f24624a);
            }
        }
        if (this.f18891a.isEmpty()) {
            this.f18893c.m13335c(this);
        } else {
            this.f18893c.m13336a(this);
        }
        m16015h(this.f18894d, this.f18892b);
    }

    /* renamed from: f */
    public void m16017f() {
        if (this.f18891a.isEmpty()) {
            return;
        }
        this.f18891a.clear();
        this.f18893c.m13335c(this);
    }

    /* renamed from: g */
    public void m16016g(InterfaceC2180a interfaceC2180a) {
        if (this.f18894d != interfaceC2180a) {
            this.f18894d = interfaceC2180a;
            m16015h(interfaceC2180a, this.f18892b);
        }
    }

    /* renamed from: h */
    public final void m16015h(InterfaceC2180a interfaceC2180a, T t) {
        if (this.f18891a.isEmpty() || interfaceC2180a == null) {
            return;
        }
        if (t == null || mo10994c(t)) {
            interfaceC2180a.mo9791b(this.f18891a);
        } else {
            interfaceC2180a.mo9792a(this.f18891a);
        }
    }
}
