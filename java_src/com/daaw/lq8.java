package com.daaw;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class lq8 implements rr8 {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final yr8 c = new yr8();
    public final jn8 d = new jn8();
    public Looper e;
    public l64 f;
    public lh8 g;

    @Override // com.daaw.rr8
    public final void a(qr8 qr8Var) {
        boolean isEmpty = this.b.isEmpty();
        this.b.remove(qr8Var);
        if ((!isEmpty) && this.b.isEmpty()) {
            u();
        }
    }

    @Override // com.daaw.rr8
    public /* synthetic */ boolean b() {
        return true;
    }

    @Override // com.daaw.rr8
    public final void d(Handler handler, ln8 ln8Var) {
        Objects.requireNonNull(ln8Var);
        this.d.b(handler, ln8Var);
    }

    @Override // com.daaw.rr8
    public final void f(Handler handler, zr8 zr8Var) {
        Objects.requireNonNull(zr8Var);
        this.c.b(handler, zr8Var);
    }

    @Override // com.daaw.rr8
    public final void g(zr8 zr8Var) {
        this.c.m(zr8Var);
    }

    @Override // com.daaw.rr8
    public final void i(ln8 ln8Var) {
        this.d.c(ln8Var);
    }

    @Override // com.daaw.rr8
    public final void j(qr8 qr8Var) {
        Objects.requireNonNull(this.e);
        boolean isEmpty = this.b.isEmpty();
        this.b.add(qr8Var);
        if (isEmpty) {
            v();
        }
    }

    @Override // com.daaw.rr8
    public final void m(qr8 qr8Var, qz6 qz6Var, lh8 lh8Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        boolean z = true;
        if (looper != null && looper != myLooper) {
            z = false;
        }
        uo4.d(z);
        this.g = lh8Var;
        l64 l64Var = this.f;
        this.a.add(qr8Var);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(qr8Var);
            w(qz6Var);
        } else if (l64Var != null) {
            j(qr8Var);
            qr8Var.a(this, l64Var);
        }
    }

    @Override // com.daaw.rr8
    public final void n(qr8 qr8Var) {
        this.a.remove(qr8Var);
        if (!this.a.isEmpty()) {
            a(qr8Var);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        y();
    }

    public final lh8 o() {
        lh8 lh8Var = this.g;
        uo4.b(lh8Var);
        return lh8Var;
    }

    @Override // com.daaw.rr8
    public /* synthetic */ l64 p() {
        return null;
    }

    public final jn8 q(pr8 pr8Var) {
        return this.d.a(0, pr8Var);
    }

    public final jn8 r(int i, pr8 pr8Var) {
        return this.d.a(i, pr8Var);
    }

    public final yr8 s(pr8 pr8Var) {
        return this.c.a(0, pr8Var, 0L);
    }

    public final yr8 t(int i, pr8 pr8Var, long j) {
        return this.c.a(i, pr8Var, 0L);
    }

    public void u() {
    }

    public void v() {
    }

    public abstract void w(qz6 qz6Var);

    public final void x(l64 l64Var) {
        this.f = l64Var;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((qr8) arrayList.get(i)).a(this, l64Var);
        }
    }

    public abstract void y();

    public final boolean z() {
        return !this.b.isEmpty();
    }
}
