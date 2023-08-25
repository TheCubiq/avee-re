package com.daaw;

import android.os.Bundle;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class d32 extends uk4 {
    public final dr6 a;
    public final p28 b;

    public d32(dr6 dr6Var) {
        super(null);
        ry0.j(dr6Var);
        this.a = dr6Var;
        this.b = dr6Var.I();
    }

    @Override // com.daaw.s28
    public final List a(String str, String str2) {
        return this.b.Z(str, str2);
    }

    @Override // com.daaw.s28
    public final Map b(String str, String str2, boolean z) {
        return this.b.a0(str, str2, z);
    }

    @Override // com.daaw.s28
    public final void c(Bundle bundle) {
        this.b.D(bundle);
    }

    @Override // com.daaw.s28
    public final void d(String str, String str2, Bundle bundle) {
        this.b.q(str, str2, bundle);
    }

    @Override // com.daaw.s28
    public final void e(String str, String str2, Bundle bundle) {
        this.a.I().n(str, str2, bundle);
    }

    @Override // com.daaw.s28
    public final void r(String str) {
        this.a.y().k(str, this.a.b().b());
    }

    @Override // com.daaw.s28
    public final int zza(String str) {
        this.b.Q(str);
        return 25;
    }

    @Override // com.daaw.s28
    public final long zzb() {
        return this.a.N().r0();
    }

    @Override // com.daaw.s28
    public final String zzh() {
        return this.b.V();
    }

    @Override // com.daaw.s28
    public final String zzi() {
        return this.b.W();
    }

    @Override // com.daaw.s28
    public final String zzj() {
        return this.b.X();
    }

    @Override // com.daaw.s28
    public final String zzk() {
        return this.b.V();
    }

    @Override // com.daaw.s28
    public final void zzr(String str) {
        this.a.y().l(str, this.a.b().b());
    }
}
