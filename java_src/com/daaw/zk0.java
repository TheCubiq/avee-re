package com.daaw;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2.dex */
public class zk0<E> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f35181a = AtomicReferenceFieldUpdater.newUpdater(zk0.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public zk0(boolean z) {
        this._cur = new al0(8, z);
    }

    /* renamed from: a */
    public final boolean m2156a(E e) {
        while (true) {
            al0 al0Var = (al0) this._cur;
            int m27374a = al0Var.m27374a(e);
            if (m27374a == 0) {
                return true;
            }
            if (m27374a == 1) {
                C1773j.m19216a(f35181a, this, al0Var, al0Var.m27366i());
            } else if (m27374a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void m2155b() {
        while (true) {
            al0 al0Var = (al0) this._cur;
            if (al0Var.m27371d()) {
                return;
            }
            C1773j.m19216a(f35181a, this, al0Var, al0Var.m27366i());
        }
    }

    /* renamed from: c */
    public final int m2154c() {
        return ((al0) this._cur).m27369f();
    }

    /* renamed from: d */
    public final E m2153d() {
        while (true) {
            al0 al0Var = (al0) this._cur;
            E e = (E) al0Var.m27365j();
            if (e != al0.f3290h) {
                return e;
            }
            C1773j.m19216a(f35181a, this, al0Var, al0Var.m27366i());
        }
    }
}
