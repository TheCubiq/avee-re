package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Set;
/* loaded from: classes.dex */
public final class s87 implements t87 {

    /* renamed from: a */
    public final /* synthetic */ df7 f26003a;

    /* renamed from: b */
    public final /* synthetic */ ee7 f26004b;

    public s87(df7 df7Var, ee7 ee7Var) {
        this.f26003a = df7Var;
        this.f26004b = ee7Var;
    }

    @Override // com.daaw.t87
    /* renamed from: a */
    public final n87 mo9437a(Class cls) {
        try {
            return new u97(this.f26003a, this.f26004b, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.daaw.t87
    public final n87 zzb() {
        df7 df7Var = this.f26003a;
        return new u97(df7Var, this.f26004b, df7Var.m23536g());
    }

    @Override // com.daaw.t87
    public final Class zzc() {
        return this.f26003a.getClass();
    }

    @Override // com.daaw.t87
    public final Class zzd() {
        return this.f26004b.getClass();
    }

    @Override // com.daaw.t87
    public final Set zze() {
        return this.f26003a.m23533j();
    }
}
