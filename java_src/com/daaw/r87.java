package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Set;
/* loaded from: classes.dex */
public final class r87 implements t87 {

    /* renamed from: a */
    public final /* synthetic */ ee7 f24979a;

    public r87(ee7 ee7Var) {
        this.f24979a = ee7Var;
    }

    @Override // com.daaw.t87
    /* renamed from: a */
    public final n87 mo9437a(Class cls) {
        try {
            return new p87(this.f24979a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.daaw.t87
    public final n87 zzb() {
        ee7 ee7Var = this.f24979a;
        return new p87(ee7Var, ee7Var.m23536g());
    }

    @Override // com.daaw.t87
    public final Class zzc() {
        return this.f24979a.getClass();
    }

    @Override // com.daaw.t87
    public final Class zzd() {
        return null;
    }

    @Override // com.daaw.t87
    public final Set zze() {
        return this.f24979a.m23533j();
    }
}
