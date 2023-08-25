package com.daaw;

import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public final class q87 implements t87 {

    /* renamed from: a */
    public final /* synthetic */ n87 f23757a;

    public q87(n87 n87Var) {
        this.f23757a = n87Var;
    }

    @Override // com.daaw.t87
    /* renamed from: a */
    public final n87 mo9437a(Class cls) {
        if (this.f23757a.zzc().equals(cls)) {
            return this.f23757a;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    @Override // com.daaw.t87
    public final n87 zzb() {
        return this.f23757a;
    }

    @Override // com.daaw.t87
    public final Class zzc() {
        return this.f23757a.getClass();
    }

    @Override // com.daaw.t87
    public final Class zzd() {
        return null;
    }

    @Override // com.daaw.t87
    public final Set zze() {
        return Collections.singleton(this.f23757a.zzc());
    }
}
