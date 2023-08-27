package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
@zzadh
/* loaded from: classes2.dex */
public final class zzahv extends zzaid {
    private volatile zzahw zzclm;
    private volatile zzaht zzcma;
    private volatile zzahu zzcmb;
    private volatile zzaia zzcmc;

    public zzahv(zzahu zzahuVar) {
        this.zzcmb = zzahuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaic
    public final void zza(IObjectWrapper iObjectWrapper, zzaig zzaigVar) {
        if (this.zzcmb != null) {
            this.zzcmb.zzc(zzaigVar);
        }
    }

    public final void zza(zzaht zzahtVar) {
        this.zzcma = zzahtVar;
    }

    public final void zza(zzahw zzahwVar) {
        this.zzclm = zzahwVar;
    }

    public final void zza(zzaia zzaiaVar) {
        this.zzcmc = zzaiaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaic
    public final void zzc(Bundle bundle) {
        if (this.zzcmc != null) {
            this.zzcmc.zzc(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaic
    public final void zzc(IObjectWrapper iObjectWrapper, int i) {
        if (this.zzcma != null) {
            this.zzcma.zzac(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaic
    public final void zzd(IObjectWrapper iObjectWrapper, int i) {
        if (this.zzclm != null) {
            this.zzclm.zza(ObjectWrapper.unwrap(iObjectWrapper).getClass().getName(), i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaic
    public final void zzq(IObjectWrapper iObjectWrapper) {
        if (this.zzcma != null) {
            this.zzcma.zzpc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaic
    public final void zzr(IObjectWrapper iObjectWrapper) {
        if (this.zzclm != null) {
            this.zzclm.zzcb(ObjectWrapper.unwrap(iObjectWrapper).getClass().getName());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaic
    public final void zzs(IObjectWrapper iObjectWrapper) {
        if (this.zzcmb != null) {
            this.zzcmb.onRewardedVideoAdOpened();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaic
    public final void zzt(IObjectWrapper iObjectWrapper) {
        if (this.zzcmb != null) {
            this.zzcmb.onRewardedVideoStarted();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaic
    public final void zzu(IObjectWrapper iObjectWrapper) {
        if (this.zzcmb != null) {
            this.zzcmb.onRewardedVideoAdClosed();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaic
    public final void zzv(IObjectWrapper iObjectWrapper) {
        if (this.zzcmb != null) {
            this.zzcmb.zzdm();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaic
    public final void zzw(IObjectWrapper iObjectWrapper) {
        if (this.zzcmb != null) {
            this.zzcmb.onRewardedVideoAdLeftApplication();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaic
    public final void zzx(IObjectWrapper iObjectWrapper) {
        if (this.zzcmb != null) {
            this.zzcmb.onRewardedVideoCompleted();
        }
    }
}
