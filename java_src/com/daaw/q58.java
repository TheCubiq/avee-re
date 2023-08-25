package com.daaw;

import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
public final class q58 extends w58 {

    /* renamed from: p */
    public int f23680p = 0;

    /* renamed from: q */
    public final int f23681q;

    /* renamed from: r */
    public final /* synthetic */ y68 f23682r;

    public q58(y68 y68Var) {
        this.f23682r = y68Var;
        this.f23681q = y68Var.mo2805f();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23680p < this.f23681q;
    }

    @Override // com.daaw.c68
    public final byte zza() {
        int i = this.f23680p;
        if (i < this.f23681q) {
            this.f23680p = i + 1;
            return this.f23682r.mo2806e(i);
        }
        throw new NoSuchElementException();
    }
}
