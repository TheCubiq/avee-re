package com.daaw;

import java.util.List;
import java.util.ListIterator;
/* loaded from: classes.dex */
public final class e07 extends c07 implements ListIterator {
    public final /* synthetic */ f07 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e07(f07 f07Var) {
        super(f07Var);
        this.s = f07Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e07(f07 f07Var, int i) {
        super(f07Var, ((List) f07Var.q).listIterator(i));
        this.s = f07Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean isEmpty = this.s.isEmpty();
        a();
        ((ListIterator) this.p).add(obj);
        g07.k(this.s.u);
        if (isEmpty) {
            this.s.d();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.p).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.p).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.p).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.p).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.p).set(obj);
    }
}
