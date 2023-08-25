package com.daaw;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class fx5 implements zzf {
    @GuardedBy("this")
    public zzf a;

    public final synchronized void a(zzf zzfVar) {
        this.a = zzfVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zza(View view) {
        zzf zzfVar = this.a;
        if (zzfVar != null) {
            zzfVar.zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zzb() {
        zzf zzfVar = this.a;
        if (zzfVar != null) {
            zzfVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zzc() {
        zzf zzfVar = this.a;
        if (zzfVar != null) {
            zzfVar.zzc();
        }
    }
}
