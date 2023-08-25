package com.daaw;

import java.io.EOFException;
/* loaded from: classes.dex */
public final class i09 implements m42 {

    /* renamed from: a */
    public final byte[] f13147a = new byte[4096];

    @Override // com.daaw.m42
    /* renamed from: a */
    public final void mo16223a(ik5 ik5Var, int i, int i2) {
        ik5Var.m19715g(i);
    }

    @Override // com.daaw.m42
    /* renamed from: b */
    public final void mo16222b(long j, int i, int i2, int i3, l42 l42Var) {
    }

    @Override // com.daaw.m42
    /* renamed from: c */
    public final /* synthetic */ void mo16221c(ik5 ik5Var, int i) {
        k42.m18050b(this, ik5Var, i);
    }

    @Override // com.daaw.m42
    /* renamed from: d */
    public final int mo16220d(xp8 xp8Var, int i, boolean z, int i2) {
        int mo1980a = xp8Var.mo1980a(this.f13147a, 0, Math.min(4096, i));
        if (mo1980a == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return mo1980a;
    }

    @Override // com.daaw.m42
    /* renamed from: e */
    public final /* synthetic */ int mo16219e(xp8 xp8Var, int i, boolean z) {
        return k42.m18051a(this, xp8Var, i, z);
    }

    @Override // com.daaw.m42
    /* renamed from: f */
    public final void mo16218f(f92 f92Var) {
    }
}
