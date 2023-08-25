package com.daaw;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class w93 extends ba3 {
    public final zzf p;
    public final String q;
    public final String r;

    public w93(zzf zzfVar, String str, String str2) {
        this.p = zzfVar;
        this.q = str;
        this.r = str2;
    }

    @Override // com.daaw.ca3
    public final String zzb() {
        return this.q;
    }

    @Override // com.daaw.ca3
    public final String zzc() {
        return this.r;
    }

    @Override // com.daaw.ca3
    public final void zzd(yd0 yd0Var) {
        if (yd0Var == null) {
            return;
        }
        this.p.zza((View) nt0.M(yd0Var));
    }

    @Override // com.daaw.ca3
    public final void zze() {
        this.p.zzb();
    }

    @Override // com.daaw.ca3
    public final void zzf() {
        this.p.zzc();
    }
}
