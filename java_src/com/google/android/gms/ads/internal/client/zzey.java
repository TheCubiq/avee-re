package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.daaw.an3;
import com.daaw.d04;
import com.daaw.gj3;
import com.daaw.k04;
import com.daaw.yd0;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class zzey extends zzcn {

    /* renamed from: p */
    public gj3 f36184p;

    public final /* synthetic */ void zzb() {
        gj3 gj3Var = this.f36184p;
        if (gj3Var != null) {
            try {
                gj3Var.mo8956k2(Collections.emptyList());
            } catch (RemoteException e) {
                k04.zzk("Could not notify onComplete event.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final float zze() {
        return 1.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() {
        return "";
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() {
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzk() {
        k04.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        d04.f6340b.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzex
            @Override // java.lang.Runnable
            public final void run() {
                zzey.this.zzb();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzl(String str, yd0 yd0Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(zzda zzdaVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(yd0 yd0Var, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(an3 an3Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzp(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzq(float f) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzr(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(gj3 gj3Var) {
        this.f36184p = gj3Var;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(zzff zzffVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final boolean zzv() {
        return false;
    }
}
