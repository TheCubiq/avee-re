package com.daaw;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class u26 implements i76 {

    /* renamed from: a */
    public final AtomicReference f28493a = new AtomicReference();

    /* renamed from: b */
    public final InterfaceC0623ag f28494b;

    /* renamed from: c */
    public final i76 f28495c;

    /* renamed from: d */
    public final long f28496d;

    public u26(i76 i76Var, long j, InterfaceC0623ag interfaceC0623ag) {
        this.f28494b = interfaceC0623ag;
        this.f28495c = i76Var;
        this.f28496d = j;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 16;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        t26 t26Var = (t26) this.f28493a.get();
        if (t26Var == null || t26Var.m9642a()) {
            t26Var = new t26(this.f28495c.zzb(), this.f28496d, this.f28494b);
            this.f28493a.set(t26Var);
        }
        return t26Var.f26946a;
    }
}
