package com.daaw;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class oq7 extends qq7 {
    public int p = 0;
    public final int q;
    public final /* synthetic */ yq7 r;

    public oq7(yq7 yq7Var) {
        this.r = yq7Var;
        this.q = yq7Var.o();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.p < this.q;
    }

    @Override // com.daaw.sq7
    public final byte zza() {
        int i = this.p;
        if (i < this.q) {
            this.p = i + 1;
            return this.r.m(i);
        }
        throw new NoSuchElementException();
    }
}
