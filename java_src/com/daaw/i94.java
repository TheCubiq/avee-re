package com.daaw;

import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class i94 implements wz7 {
    public final e94 a;

    public i94(e94 e94Var) {
        this.a = e94Var;
    }

    public final WeakReference a() {
        WeakReference f = this.a.f();
        e08.b(f);
        return f;
    }

    @Override // com.daaw.m08
    public final /* synthetic */ Object zzb() {
        WeakReference f = this.a.f();
        e08.b(f);
        return f;
    }
}
