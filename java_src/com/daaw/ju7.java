package com.daaw;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class ju7 extends qq7 {

    /* renamed from: p */
    public final zu7 f15425p;

    /* renamed from: q */
    public sq7 f15426q = m18236a();

    /* renamed from: r */
    public final /* synthetic */ bv7 f15427r;

    public ju7(bv7 bv7Var) {
        this.f15427r = bv7Var;
        this.f15425p = new zu7(bv7Var, null);
    }

    /* renamed from: a */
    public final sq7 m18236a() {
        zu7 zu7Var = this.f15425p;
        if (zu7Var.hasNext()) {
            return zu7Var.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15426q != null;
    }

    @Override // com.daaw.sq7
    public final byte zza() {
        sq7 sq7Var = this.f15426q;
        if (sq7Var != null) {
            byte zza = sq7Var.zza();
            if (!this.f15426q.hasNext()) {
                this.f15426q = m18236a();
            }
            return zza;
        }
        throw new NoSuchElementException();
    }
}
