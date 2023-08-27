package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzjr;
@zzadh
/* loaded from: classes2.dex */
public final class zzmb {
    private static final Object sLock = new Object();
    private static zzmb zzate;
    private zzlj zzatf;
    private RewardedVideoAd zzatg;

    private zzmb() {
    }

    public static zzmb zziv() {
        zzmb zzmbVar;
        synchronized (sLock) {
            if (zzate == null) {
                zzate = new zzmb();
            }
            zzmbVar = zzate;
        }
        return zzmbVar;
    }

    public final RewardedVideoAd getRewardedVideoAdInstance(Context context) {
        synchronized (sLock) {
            if (this.zzatg != null) {
                return this.zzatg;
            }
            zzahm zzahmVar = new zzahm(context, (zzagz) zzjr.zza(context, false, (zzjr.zza<Object>) new zzjz(zzkb.zzig(), context, new zzxm())));
            this.zzatg = zzahmVar;
            return zzahmVar;
        }
    }

    public final void openDebugMenu(Context context, String str) {
        Preconditions.checkState(this.zzatf != null, "MobileAds.initialize() must be called prior to opening debug menu.");
        try {
            this.zzatf.zzb(ObjectWrapper.wrap(context), str);
        } catch (RemoteException e) {
            zzane.zzb("Unable to open debug menu.", e);
        }
    }

    public final void setAppMuted(boolean z) {
        Preconditions.checkState(this.zzatf != null, "MobileAds.initialize() must be called prior to setting app muted state.");
        try {
            this.zzatf.setAppMuted(z);
        } catch (RemoteException e) {
            zzane.zzb("Unable to set app mute state.", e);
        }
    }

    public final void setAppVolume(float f) {
        Preconditions.checkArgument(0.0f <= f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        Preconditions.checkState(this.zzatf != null, "MobileAds.initialize() must be called prior to setting the app volume.");
        try {
            this.zzatf.setAppVolume(f);
        } catch (RemoteException e) {
            zzane.zzb("Unable to set app volume.", e);
        }
    }

    public final void zza(Context context, String str, zzmd zzmdVar) {
        synchronized (sLock) {
            if (this.zzatf != null) {
                return;
            }
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null.");
            }
            try {
                zzlj zzljVar = (zzlj) zzjr.zza(context, false, (zzjr.zza<Object>) new zzjw(zzkb.zzig(), context));
                this.zzatf = zzljVar;
                zzljVar.zza();
                if (str != null) {
                    this.zzatf.zza(str, ObjectWrapper.wrap(new zzmc(this, context)));
                }
            } catch (RemoteException e) {
                zzane.zzc("MobileAdsSettingManager initialization failed", e);
            }
        }
    }

    public final float zzdo() {
        zzlj zzljVar = this.zzatf;
        if (zzljVar == null) {
            return 1.0f;
        }
        try {
            return zzljVar.zzdo();
        } catch (RemoteException e) {
            zzane.zzb("Unable to get app volume.", e);
            return 1.0f;
        }
    }

    public final boolean zzdp() {
        zzlj zzljVar = this.zzatf;
        if (zzljVar == null) {
            return false;
        }
        try {
            return zzljVar.zzdp();
        } catch (RemoteException e) {
            zzane.zzb("Unable to get app mute state.", e);
            return false;
        }
    }
}
