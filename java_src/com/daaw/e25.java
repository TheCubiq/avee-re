package com.daaw;

import java.lang.ref.WeakReference;
import java.util.Map;
/* loaded from: classes.dex */
public final class e25 implements zg3 {

    /* renamed from: a */
    public final WeakReference f8055a;

    public /* synthetic */ e25(f25 f25Var, d25 d25Var) {
        this.f8055a = new WeakReference(f25Var);
    }

    @Override // com.daaw.zg3
    /* renamed from: a */
    public final void mo2341a(Object obj, Map map) {
        f25 f25Var = (f25) this.f8055a.get();
        if (f25Var == null) {
            return;
        }
        f25.m22955v(f25Var).zza();
    }
}
