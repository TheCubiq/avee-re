package com.daaw;

import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public final class q87 implements t87 {
    public final /* synthetic */ n87 a;

    public q87(n87 n87Var) {
        this.a = n87Var;
    }

    @Override // com.daaw.t87
    public final n87 a(Class cls) {
        if (this.a.zzc().equals(cls)) {
            return this.a;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    @Override // com.daaw.t87
    public final n87 zzb() {
        return this.a;
    }

    @Override // com.daaw.t87
    public final Class zzc() {
        return this.a.getClass();
    }

    @Override // com.daaw.t87
    public final Class zzd() {
        return null;
    }

    @Override // com.daaw.t87
    public final Set zze() {
        return Collections.singleton(this.a.zzc());
    }
}
