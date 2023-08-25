package com.daaw;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class oq7 extends qq7 {

    /* renamed from: p */
    public int f21837p = 0;

    /* renamed from: q */
    public final int f21838q;

    /* renamed from: r */
    public final /* synthetic */ yq7 f21839r;

    public oq7(yq7 yq7Var) {
        this.f21839r = yq7Var;
        this.f21838q = yq7Var.mo3411o();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21837p < this.f21838q;
    }

    @Override // com.daaw.sq7
    public final byte zza() {
        int i = this.f21837p;
        if (i < this.f21838q) {
            this.f21837p = i + 1;
            return this.f21839r.mo3413m(i);
        }
        throw new NoSuchElementException();
    }
}
