package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdt;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class i35 extends zzdp {

    /* renamed from: p */
    public final Object f13221p = new Object();
    @Nullable

    /* renamed from: q */
    public final zzdq f13222q;
    @Nullable

    /* renamed from: r */
    public final sn3 f13223r;

    public i35(@Nullable zzdq zzdqVar, @Nullable sn3 sn3Var) {
        this.f13222q = zzdqVar;
        this.f13223r = sn3Var;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zze() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzf() {
        sn3 sn3Var = this.f13223r;
        if (sn3Var != null) {
            return sn3Var.zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzg() {
        sn3 sn3Var = this.f13223r;
        if (sn3Var != null) {
            return sn3Var.zzh();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final int zzh() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    @Nullable
    public final zzdt zzi() {
        synchronized (this.f13221p) {
            zzdq zzdqVar = this.f13222q;
            if (zzdqVar != null) {
                return zzdqVar.zzi();
            }
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzj(boolean z) {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzk() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzl() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzm(@Nullable zzdt zzdtVar) {
        synchronized (this.f13221p) {
            zzdq zzdqVar = this.f13222q;
            if (zzdqVar != null) {
                zzdqVar.zzm(zzdtVar);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzn() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzo() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzp() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzq() {
        throw new RemoteException();
    }
}
