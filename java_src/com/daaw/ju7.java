package com.daaw;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class ju7 extends qq7 {
    public final zu7 p;
    public sq7 q = a();
    public final /* synthetic */ bv7 r;

    public ju7(bv7 bv7Var) {
        this.r = bv7Var;
        this.p = new zu7(bv7Var, null);
    }

    public final sq7 a() {
        zu7 zu7Var = this.p;
        if (zu7Var.hasNext()) {
            return zu7Var.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.q != null;
    }

    @Override // com.daaw.sq7
    public final byte zza() {
        sq7 sq7Var = this.q;
        if (sq7Var != null) {
            byte zza = sq7Var.zza();
            if (!this.q.hasNext()) {
                this.q = a();
            }
            return zza;
        }
        throw new NoSuchElementException();
    }
}
