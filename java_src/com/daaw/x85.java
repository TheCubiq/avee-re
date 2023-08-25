package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzz;
/* loaded from: classes.dex */
public final class x85 implements zza, mf3, zzo, of3, zzz, vy4 {

    /* renamed from: p */
    public zza f32182p;

    /* renamed from: q */
    public mf3 f32183q;

    /* renamed from: r */
    public zzo f32184r;

    /* renamed from: s */
    public of3 f32185s;

    /* renamed from: t */
    public zzz f32186t;

    /* renamed from: u */
    public vy4 f32187u;

    @Override // com.daaw.of3
    /* renamed from: W */
    public final synchronized void mo2586W(String str, String str2) {
        of3 of3Var = this.f32185s;
        if (of3Var != null) {
            of3Var.mo2586W(str, str2);
        }
    }

    /* renamed from: c */
    public final synchronized void m5431c(zza zzaVar, mf3 mf3Var, zzo zzoVar, of3 of3Var, zzz zzzVar, vy4 vy4Var) {
        this.f32182p = zzaVar;
        this.f32183q = mf3Var;
        this.f32184r = zzoVar;
        this.f32185s = of3Var;
        this.f32186t = zzzVar;
        this.f32187u = vy4Var;
    }

    @Override // com.daaw.mf3
    /* renamed from: k */
    public final synchronized void mo5430k(String str, Bundle bundle) {
        mf3 mf3Var = this.f32183q;
        if (mf3Var != null) {
            mf3Var.mo5430k(str, bundle);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        zza zzaVar = this.f32182p;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzb() {
        zzo zzoVar = this.f32184r;
        if (zzoVar != null) {
            zzoVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbE() {
        zzo zzoVar = this.f32184r;
        if (zzoVar != null) {
            zzoVar.zzbE();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbM() {
        zzo zzoVar = this.f32184r;
        if (zzoVar != null) {
            zzoVar.zzbM();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbs() {
        zzo zzoVar = this.f32184r;
        if (zzoVar != null) {
            zzoVar.zzbs();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zze() {
        zzo zzoVar = this.f32184r;
        if (zzoVar != null) {
            zzoVar.zze();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzf(int i) {
        zzo zzoVar = this.f32184r;
        if (zzoVar != null) {
            zzoVar.zzf(i);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzz
    public final synchronized void zzg() {
        zzz zzzVar = this.f32186t;
        if (zzzVar != null) {
            ((y85) zzzVar).f33426p.zzb();
        }
    }

    @Override // com.daaw.vy4
    public final synchronized void zzq() {
        vy4 vy4Var = this.f32187u;
        if (vy4Var != null) {
            vy4Var.zzq();
        }
    }

    @Override // com.daaw.vy4
    public final synchronized void zzr() {
        vy4 vy4Var = this.f32187u;
        if (vy4Var != null) {
            vy4Var.zzr();
        }
    }
}
