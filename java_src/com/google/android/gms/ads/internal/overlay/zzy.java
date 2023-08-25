package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.daaw.g93;
import com.daaw.gr3;
import com.daaw.vy4;
import com.daaw.yd0;
import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public final class zzy extends gr3 {
    public final AdOverlayInfoParcel p;
    public final Activity q;
    public boolean r = false;
    public boolean s = false;

    public zzy(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.p = adOverlayInfoParcel;
        this.q = activity;
    }

    @Override // com.daaw.hr3
    public final boolean zzE() {
        return false;
    }

    public final synchronized void zzb() {
        if (this.s) {
            return;
        }
        zzo zzoVar = this.p.zzc;
        if (zzoVar != null) {
            zzoVar.zzf(4);
        }
        this.s = true;
    }

    @Override // com.daaw.hr3
    public final void zzg(int i, int i2, Intent intent) {
    }

    @Override // com.daaw.hr3
    public final void zzh() {
    }

    @Override // com.daaw.hr3
    public final void zzj(yd0 yd0Var) {
    }

    @Override // com.daaw.hr3
    public final void zzk(Bundle bundle) {
        zzo zzoVar;
        if (((Boolean) zzba.zzc().b(g93.V7)).booleanValue()) {
            this.q.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.p;
        if (adOverlayInfoParcel != null && !z) {
            if (bundle == null) {
                com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
                if (zzaVar != null) {
                    zzaVar.onAdClicked();
                }
                vy4 vy4Var = this.p.zzy;
                if (vy4Var != null) {
                    vy4Var.zzq();
                }
                if (this.q.getIntent() != null && this.q.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzoVar = this.p.zzc) != null) {
                    zzoVar.zzb();
                }
            }
            com.google.android.gms.ads.internal.zzt.zzh();
            Activity activity = this.q;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.p;
            zzc zzcVar = adOverlayInfoParcel2.zza;
            if (zza.zzb(activity, zzcVar, adOverlayInfoParcel2.zzi, zzcVar.zzi)) {
                return;
            }
        }
        this.q.finish();
    }

    @Override // com.daaw.hr3
    public final void zzl() {
        if (this.q.isFinishing()) {
            zzb();
        }
    }

    @Override // com.daaw.hr3
    public final void zzn() {
        zzo zzoVar = this.p.zzc;
        if (zzoVar != null) {
            zzoVar.zzbs();
        }
        if (this.q.isFinishing()) {
            zzb();
        }
    }

    @Override // com.daaw.hr3
    public final void zzo() {
    }

    @Override // com.daaw.hr3
    public final void zzp() {
        if (this.r) {
            this.q.finish();
            return;
        }
        this.r = true;
        zzo zzoVar = this.p.zzc;
        if (zzoVar != null) {
            zzoVar.zzbM();
        }
    }

    @Override // com.daaw.hr3
    public final void zzq(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.r);
    }

    @Override // com.daaw.hr3
    public final void zzr() {
    }

    @Override // com.daaw.hr3
    public final void zzs() {
        if (this.q.isFinishing()) {
            zzb();
        }
    }

    @Override // com.daaw.hr3
    public final void zzt() {
        zzo zzoVar = this.p.zzc;
        if (zzoVar != null) {
            zzoVar.zze();
        }
    }

    @Override // com.daaw.hr3
    public final void zzv() {
    }
}
