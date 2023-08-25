package com.daaw;

import java.io.EOFException;
/* loaded from: classes.dex */
public final class i09 implements m42 {
    public final byte[] a = new byte[4096];

    @Override // com.daaw.m42
    public final void a(ik5 ik5Var, int i, int i2) {
        ik5Var.g(i);
    }

    @Override // com.daaw.m42
    public final void b(long j, int i, int i2, int i3, l42 l42Var) {
    }

    @Override // com.daaw.m42
    public final /* synthetic */ void c(ik5 ik5Var, int i) {
        k42.b(this, ik5Var, i);
    }

    @Override // com.daaw.m42
    public final int d(xp8 xp8Var, int i, boolean z, int i2) {
        int a = xp8Var.a(this.a, 0, Math.min(4096, i));
        if (a == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return a;
    }

    @Override // com.daaw.m42
    public final /* synthetic */ int e(xp8 xp8Var, int i, boolean z) {
        return k42.a(this, xp8Var, i, z);
    }

    @Override // com.daaw.m42
    public final void f(f92 f92Var) {
    }
}
