package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzz;
/* loaded from: classes.dex */
public final class x85 implements zza, mf3, zzo, of3, zzz, vy4 {
    public zza p;
    public mf3 q;
    public zzo r;
    public of3 s;
    public zzz t;
    public vy4 u;

    @Override // com.daaw.of3
    public final synchronized void W(String str, String str2) {
        of3 of3Var = this.s;
        if (of3Var != null) {
            of3Var.W(str, str2);
        }
    }

    public final synchronized void c(zza zzaVar, mf3 mf3Var, zzo zzoVar, of3 of3Var, zzz zzzVar, vy4 vy4Var) {
        this.p = zzaVar;
        this.q = mf3Var;
        this.r = zzoVar;
        this.s = of3Var;
        this.t = zzzVar;
        this.u = vy4Var;
    }

    @Override // com.daaw.mf3
    public final synchronized void k(String str, Bundle bundle) {
        mf3 mf3Var = this.q;
        if (mf3Var != null) {
            mf3Var.k(str, bundle);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        zza zzaVar = this.p;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzb() {
        zzo zzoVar = this.r;
        if (zzoVar != null) {
            zzoVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbE() {
        zzo zzoVar = this.r;
        if (zzoVar != null) {
            zzoVar.zzbE();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbM() {
        zzo zzoVar = this.r;
        if (zzoVar != null) {
            zzoVar.zzbM();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbs() {
        zzo zzoVar = this.r;
        if (zzoVar != null) {
            zzoVar.zzbs();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zze() {
        zzo zzoVar = this.r;
        if (zzoVar != null) {
            zzoVar.zze();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzf(int i) {
        zzo zzoVar = this.r;
        if (zzoVar != null) {
            zzoVar.zzf(i);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzz
    public final synchronized void zzg() {
        zzz zzzVar = this.t;
        if (zzzVar != null) {
            ((y85) zzzVar).p.zzb();
        }
    }

    @Override // com.daaw.vy4
    public final synchronized void zzq() {
        vy4 vy4Var = this.u;
        if (vy4Var != null) {
            vy4Var.zzq();
        }
    }

    @Override // com.daaw.vy4
    public final synchronized void zzr() {
        vy4 vy4Var = this.u;
        if (vy4Var != null) {
            vy4Var.zzr();
        }
    }
}
