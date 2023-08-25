package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Set;
/* loaded from: classes.dex */
public final class s87 implements t87 {
    public final /* synthetic */ df7 a;
    public final /* synthetic */ ee7 b;

    public s87(df7 df7Var, ee7 ee7Var) {
        this.a = df7Var;
        this.b = ee7Var;
    }

    @Override // com.daaw.t87
    public final n87 a(Class cls) {
        try {
            return new u97(this.a, this.b, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.daaw.t87
    public final n87 zzb() {
        df7 df7Var = this.a;
        return new u97(df7Var, this.b, df7Var.g());
    }

    @Override // com.daaw.t87
    public final Class zzc() {
        return this.a.getClass();
    }

    @Override // com.daaw.t87
    public final Class zzd() {
        return this.b.getClass();
    }

    @Override // com.daaw.t87
    public final Set zze() {
        return this.a.j();
    }
}
