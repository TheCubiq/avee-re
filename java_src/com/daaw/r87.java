package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Set;
/* loaded from: classes.dex */
public final class r87 implements t87 {
    public final /* synthetic */ ee7 a;

    public r87(ee7 ee7Var) {
        this.a = ee7Var;
    }

    @Override // com.daaw.t87
    public final n87 a(Class cls) {
        try {
            return new p87(this.a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.daaw.t87
    public final n87 zzb() {
        ee7 ee7Var = this.a;
        return new p87(ee7Var, ee7Var.g());
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
        return this.a.j();
    }
}
