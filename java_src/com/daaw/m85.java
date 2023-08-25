package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzz;
/* loaded from: classes.dex */
public final class m85 implements zza, mf3, zzo, of3, zzz {

    /* renamed from: p */
    public zza f18654p;

    /* renamed from: q */
    public mf3 f18655q;

    /* renamed from: r */
    public zzo f18656r;

    /* renamed from: s */
    public of3 f18657s;

    /* renamed from: t */
    public zzz f18658t;

    public /* synthetic */ m85(l85 l85Var) {
    }

    @Override // com.daaw.of3
    /* renamed from: W */
    public final synchronized void mo2586W(String str, String str2) {
        of3 of3Var = this.f18657s;
        if (of3Var != null) {
            of3Var.mo2586W(str, str2);
        }
    }

    /* renamed from: c */
    public final synchronized void m16164c(zza zzaVar, mf3 mf3Var, zzo zzoVar, of3 of3Var, zzz zzzVar) {
        this.f18654p = zzaVar;
        this.f18655q = mf3Var;
        this.f18656r = zzoVar;
        this.f18657s = of3Var;
        this.f18658t = zzzVar;
    }

    @Override // com.daaw.mf3
    /* renamed from: k */
    public final synchronized void mo5430k(String str, Bundle bundle) {
        mf3 mf3Var = this.f18655q;
        if (mf3Var != null) {
            mf3Var.mo5430k(str, bundle);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        zza zzaVar = this.f18654p;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzb() {
        zzo zzoVar = this.f18656r;
        if (zzoVar != null) {
            zzoVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbE() {
        zzo zzoVar = this.f18656r;
        if (zzoVar != null) {
            zzoVar.zzbE();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbM() {
        zzo zzoVar = this.f18656r;
        if (zzoVar != null) {
            zzoVar.zzbM();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbs() {
        zzo zzoVar = this.f18656r;
        if (zzoVar != null) {
            zzoVar.zzbs();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zze() {
        zzo zzoVar = this.f18656r;
        if (zzoVar != null) {
            zzoVar.zze();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzf(int i) {
        zzo zzoVar = this.f18656r;
        if (zzoVar != null) {
            zzoVar.zzf(i);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzz
    public final synchronized void zzg() {
        zzz zzzVar = this.f18658t;
        if (zzzVar != null) {
            ((n85) zzzVar).f19707p.zzb();
        }
    }
}
