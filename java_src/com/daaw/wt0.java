package com.daaw;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public abstract class wt0 {

    /* renamed from: a */
    public boolean f31501a;

    /* renamed from: b */
    public CopyOnWriteArrayList<InterfaceC3057td> f31502b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public InterfaceC3222uj<Boolean> f31503c;

    public wt0(boolean z) {
        this.f31501a = z;
    }

    /* renamed from: a */
    public void m5817a(InterfaceC3057td interfaceC3057td) {
        this.f31502b.add(interfaceC3057td);
    }

    /* renamed from: b */
    public abstract void mo5816b();

    /* renamed from: c */
    public final boolean m5815c() {
        return this.f31501a;
    }

    /* renamed from: d */
    public final void m5814d() {
        Iterator<InterfaceC3057td> it = this.f31502b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* renamed from: e */
    public void m5813e(InterfaceC3057td interfaceC3057td) {
        this.f31502b.remove(interfaceC3057td);
    }

    /* renamed from: f */
    public final void m5812f(boolean z) {
        this.f31501a = z;
        InterfaceC3222uj<Boolean> interfaceC3222uj = this.f31503c;
        if (interfaceC3222uj != null) {
            interfaceC3222uj.mo2971a(Boolean.valueOf(z));
        }
    }

    /* renamed from: g */
    public void m5811g(InterfaceC3222uj<Boolean> interfaceC3222uj) {
        this.f31503c = interfaceC3222uj;
    }
}
