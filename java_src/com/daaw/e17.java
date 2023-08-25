package com.daaw;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public abstract class e17 implements Iterator {

    /* renamed from: p */
    public int f8038p;

    /* renamed from: q */
    public int f8039q;

    /* renamed from: r */
    public int f8040r;

    /* renamed from: s */
    public final /* synthetic */ i17 f8041s;

    public /* synthetic */ e17(i17 i17Var, n07 n07Var) {
        int i;
        this.f8041s = i17Var;
        i = i17Var.f13185t;
        this.f8038p = i;
        this.f8039q = i17Var.m20192g();
        this.f8040r = -1;
    }

    /* renamed from: a */
    public abstract Object mo13772a(int i);

    /* renamed from: b */
    public final void m23791b() {
        int i;
        i = this.f8041s.f13185t;
        if (i != this.f8038p) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8039q >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        m23791b();
        if (hasNext()) {
            int i = this.f8039q;
            this.f8040r = i;
            Object mo13772a = mo13772a(i);
            this.f8039q = this.f8041s.m20191h(this.f8039q);
            return mo13772a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        m23791b();
        sy6.m9700i(this.f8040r >= 0, "no calls to next() since the last call to remove()");
        this.f8038p += 32;
        i17 i17Var = this.f8041s;
        i17Var.remove(i17.m20190i(i17Var, this.f8040r));
        this.f8039q--;
        this.f8040r = -1;
    }
}
