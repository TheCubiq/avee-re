package com.daaw;

import android.os.Handler;
/* loaded from: classes.dex */
public final class fx0 {
    public final b a;
    public final a b;
    public final nl1 c;
    public int d;
    public Object e;
    public Handler f;
    public int g;
    public long h = -9223372036854775807L;
    public boolean i = true;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    /* loaded from: classes.dex */
    public interface a {
        void b(fx0 fx0Var);
    }

    /* loaded from: classes.dex */
    public interface b {
        void r(int i, Object obj);
    }

    public fx0(a aVar, b bVar, nl1 nl1Var, int i, Handler handler) {
        this.b = aVar;
        this.a = bVar;
        this.c = nl1Var;
        this.f = handler;
        this.g = i;
    }

    public synchronized boolean a() {
        s6.f(this.j);
        s6.f(this.f.getLooper().getThread() != Thread.currentThread());
        while (!this.l) {
            wait();
        }
        return this.k;
    }

    public boolean b() {
        return this.i;
    }

    public Handler c() {
        return this.f;
    }

    public Object d() {
        return this.e;
    }

    public long e() {
        return this.h;
    }

    public b f() {
        return this.a;
    }

    public nl1 g() {
        return this.c;
    }

    public int h() {
        return this.d;
    }

    public int i() {
        return this.g;
    }

    public synchronized boolean j() {
        return this.m;
    }

    public synchronized void k(boolean z) {
        this.k = z | this.k;
        this.l = true;
        notifyAll();
    }

    public fx0 l() {
        s6.f(!this.j);
        if (this.h == -9223372036854775807L) {
            s6.a(this.i);
        }
        this.j = true;
        this.b.b(this);
        return this;
    }

    public fx0 m(Object obj) {
        s6.f(!this.j);
        this.e = obj;
        return this;
    }

    public fx0 n(int i) {
        s6.f(!this.j);
        this.d = i;
        return this;
    }
}
