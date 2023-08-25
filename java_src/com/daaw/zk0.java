package com.daaw;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2.dex */
public class zk0<E> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(zk0.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public zk0(boolean z) {
        this._cur = new al0(8, z);
    }

    public final boolean a(E e) {
        while (true) {
            al0 al0Var = (al0) this._cur;
            int a2 = al0Var.a(e);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                j.a(a, this, al0Var, al0Var.i());
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            al0 al0Var = (al0) this._cur;
            if (al0Var.d()) {
                return;
            }
            j.a(a, this, al0Var, al0Var.i());
        }
    }

    public final int c() {
        return ((al0) this._cur).f();
    }

    public final E d() {
        while (true) {
            al0 al0Var = (al0) this._cur;
            E e = (E) al0Var.j();
            if (e != al0.h) {
                return e;
            }
            j.a(a, this, al0Var, al0Var.i());
        }
    }
}
