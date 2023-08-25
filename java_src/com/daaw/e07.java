package com.daaw;

import java.util.List;
import java.util.ListIterator;
/* loaded from: classes.dex */
public final class e07 extends c07 implements ListIterator {

    /* renamed from: s */
    public final /* synthetic */ f07 f8017s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e07(f07 f07Var) {
        super(f07Var);
        this.f8017s = f07Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e07(f07 f07Var, int i) {
        super(f07Var, ((List) f07Var.f6352q).listIterator(i));
        this.f8017s = f07Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean isEmpty = this.f8017s.isEmpty();
        m25693a();
        ((ListIterator) this.f5357p).add(obj);
        g07.m22114k(this.f8017s.f8986u);
        if (isEmpty) {
            this.f8017s.m24805d();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        m25693a();
        return ((ListIterator) this.f5357p).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m25693a();
        return ((ListIterator) this.f5357p).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m25693a();
        return ((ListIterator) this.f5357p).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m25693a();
        return ((ListIterator) this.f5357p).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m25693a();
        ((ListIterator) this.f5357p).set(obj);
    }
}
