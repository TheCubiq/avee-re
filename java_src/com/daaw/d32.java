package com.daaw;

import android.os.Bundle;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class d32 extends uk4 {

    /* renamed from: a */
    public final dr6 f6444a;

    /* renamed from: b */
    public final p28 f6445b;

    public d32(dr6 dr6Var) {
        super(null);
        ry0.m10830j(dr6Var);
        this.f6444a = dr6Var;
        this.f6445b = dr6Var.m24050I();
    }

    @Override // com.daaw.s28
    /* renamed from: a */
    public final List mo1806a(String str, String str2) {
        return this.f6445b.m13696Z(str, str2);
    }

    @Override // com.daaw.s28
    /* renamed from: b */
    public final Map mo1805b(String str, String str2, boolean z) {
        return this.f6445b.m13695a0(str, str2, z);
    }

    @Override // com.daaw.s28
    /* renamed from: c */
    public final void mo1804c(Bundle bundle) {
        this.f6445b.m13718D(bundle);
    }

    @Override // com.daaw.s28
    /* renamed from: d */
    public final void mo1803d(String str, String str2, Bundle bundle) {
        this.f6445b.m13686q(str, str2, bundle);
    }

    @Override // com.daaw.s28
    /* renamed from: e */
    public final void mo1802e(String str, String str2, Bundle bundle) {
        this.f6444a.m24050I().m13689n(str, str2, bundle);
    }

    @Override // com.daaw.s28
    /* renamed from: r */
    public final void mo1801r(String str) {
        this.f6444a.m24021y().m7082k(str, this.f6444a.mo3909b().mo15859b());
    }

    @Override // com.daaw.s28
    public final int zza(String str) {
        this.f6445b.m13705Q(str);
        return 25;
    }

    @Override // com.daaw.s28
    public final long zzb() {
        return this.f6444a.m24045N().m24467r0();
    }

    @Override // com.daaw.s28
    public final String zzh() {
        return this.f6445b.m13700V();
    }

    @Override // com.daaw.s28
    public final String zzi() {
        return this.f6445b.m13699W();
    }

    @Override // com.daaw.s28
    public final String zzj() {
        return this.f6445b.m13698X();
    }

    @Override // com.daaw.s28
    public final String zzk() {
        return this.f6445b.m13700V();
    }

    @Override // com.daaw.s28
    public final void zzr(String str) {
        this.f6444a.m24021y().m7081l(str, this.f6444a.mo3909b().mo15859b());
    }
}
