package com.daaw;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class w93 extends ba3 {

    /* renamed from: p */
    public final zzf f31072p;

    /* renamed from: q */
    public final String f31073q;

    /* renamed from: r */
    public final String f31074r;

    public w93(zzf zzfVar, String str, String str2) {
        this.f31072p = zzfVar;
        this.f31073q = str;
        this.f31074r = str2;
    }

    @Override // com.daaw.ca3
    public final String zzb() {
        return this.f31073q;
    }

    @Override // com.daaw.ca3
    public final String zzc() {
        return this.f31074r;
    }

    @Override // com.daaw.ca3
    public final void zzd(yd0 yd0Var) {
        if (yd0Var == null) {
            return;
        }
        this.f31072p.zza((View) nt0.m14831M(yd0Var));
    }

    @Override // com.daaw.ca3
    public final void zze() {
        this.f31072p.zzb();
    }

    @Override // com.daaw.ca3
    public final void zzf() {
        this.f31072p.zzc();
    }
}
