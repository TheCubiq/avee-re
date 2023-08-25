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

    /* renamed from: p */
    public final AdOverlayInfoParcel f36237p;

    /* renamed from: q */
    public final Activity f36238q;

    /* renamed from: r */
    public boolean f36239r = false;

    /* renamed from: s */
    public boolean f36240s = false;

    public zzy(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f36237p = adOverlayInfoParcel;
        this.f36238q = activity;
    }

    @Override // com.daaw.hr3
    public final boolean zzE() {
        return false;
    }

    public final synchronized void zzb() {
        if (this.f36240s) {
            return;
        }
        zzo zzoVar = this.f36237p.zzc;
        if (zzoVar != null) {
            zzoVar.zzf(4);
        }
        this.f36240s = true;
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
        if (((Boolean) zzba.zzc().m23658b(g93.f10579V7)).booleanValue()) {
            this.f36238q.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f36237p;
        if (adOverlayInfoParcel != null && !z) {
            if (bundle == null) {
                com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
                if (zzaVar != null) {
                    zzaVar.onAdClicked();
                }
                vy4 vy4Var = this.f36237p.zzy;
                if (vy4Var != null) {
                    vy4Var.zzq();
                }
                if (this.f36238q.getIntent() != null && this.f36238q.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzoVar = this.f36237p.zzc) != null) {
                    zzoVar.zzb();
                }
            }
            com.google.android.gms.ads.internal.zzt.zzh();
            Activity activity = this.f36238q;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f36237p;
            zzc zzcVar = adOverlayInfoParcel2.zza;
            if (zza.zzb(activity, zzcVar, adOverlayInfoParcel2.zzi, zzcVar.zzi)) {
                return;
            }
        }
        this.f36238q.finish();
    }

    @Override // com.daaw.hr3
    public final void zzl() {
        if (this.f36238q.isFinishing()) {
            zzb();
        }
    }

    @Override // com.daaw.hr3
    public final void zzn() {
        zzo zzoVar = this.f36237p.zzc;
        if (zzoVar != null) {
            zzoVar.zzbs();
        }
        if (this.f36238q.isFinishing()) {
            zzb();
        }
    }

    @Override // com.daaw.hr3
    public final void zzo() {
    }

    @Override // com.daaw.hr3
    public final void zzp() {
        if (this.f36239r) {
            this.f36238q.finish();
            return;
        }
        this.f36239r = true;
        zzo zzoVar = this.f36237p.zzc;
        if (zzoVar != null) {
            zzoVar.zzbM();
        }
    }

    @Override // com.daaw.hr3
    public final void zzq(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f36239r);
    }

    @Override // com.daaw.hr3
    public final void zzr() {
    }

    @Override // com.daaw.hr3
    public final void zzs() {
        if (this.f36238q.isFinishing()) {
            zzb();
        }
    }

    @Override // com.daaw.hr3
    public final void zzt() {
        zzo zzoVar = this.f36237p.zzc;
        if (zzoVar != null) {
            zzoVar.zze();
        }
    }

    @Override // com.daaw.hr3
    public final void zzv() {
    }
}
