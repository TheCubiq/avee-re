package com.daaw;

import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
public final class q58 extends w58 {
    public int p = 0;
    public final int q;
    public final /* synthetic */ y68 r;

    public q58(y68 y68Var) {
        this.r = y68Var;
        this.q = y68Var.f();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.p < this.q;
    }

    @Override // com.daaw.c68
    public final byte zza() {
        int i = this.p;
        if (i < this.q) {
            this.p = i + 1;
            return this.r.e(i);
        }
        throw new NoSuchElementException();
    }
}
