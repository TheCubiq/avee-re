package com.daaw;

import com.google.android.gms.ads.internal.overlay.zzo;
/* loaded from: classes.dex */
public final class g74 implements zzo {
    public final a74 p;
    public final zzo q;

    public g74(a74 a74Var, zzo zzoVar) {
        this.p = a74Var;
        this.q = zzoVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        zzo zzoVar = this.q;
        if (zzoVar != null) {
            zzoVar.zzb();
        }
        this.p.zzZ();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbE() {
        zzo zzoVar = this.q;
        if (zzoVar != null) {
            zzoVar.zzbE();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbM() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbs() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
        zzo zzoVar = this.q;
        if (zzoVar != null) {
            zzoVar.zze();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i) {
        zzo zzoVar = this.q;
        if (zzoVar != null) {
            zzoVar.zzf(i);
        }
        this.p.zzX();
    }
}
