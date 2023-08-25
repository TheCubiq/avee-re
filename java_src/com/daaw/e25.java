package com.daaw;

import java.lang.ref.WeakReference;
import java.util.Map;
/* loaded from: classes.dex */
public final class e25 implements zg3 {
    public final WeakReference a;

    public /* synthetic */ e25(f25 f25Var, d25 d25Var) {
        this.a = new WeakReference(f25Var);
    }

    @Override // com.daaw.zg3
    public final void a(Object obj, Map map) {
        f25 f25Var = (f25) this.a.get();
        if (f25Var == null) {
            return;
        }
        f25.v(f25Var).zza();
    }
}
