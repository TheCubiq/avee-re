package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzxa extends zzxu {
    private final Object mLock = new Object();
    private zzxf zzbtf;
    private zzwz zzbtg;

    @Override // com.google.android.gms.internal.ads.zzxt
    public final void onAdClicked() {
        synchronized (this.mLock) {
            if (this.zzbtg != null) {
                this.zzbtg.zzce();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final void onAdClosed() {
        synchronized (this.mLock) {
            if (this.zzbtg != null) {
                this.zzbtg.zzcf();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final void onAdFailedToLoad(int i) {
        synchronized (this.mLock) {
            if (this.zzbtf != null) {
                this.zzbtf.zzx(i == 3 ? 1 : 2);
                this.zzbtf = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final void onAdImpression() {
        synchronized (this.mLock) {
            if (this.zzbtg != null) {
                this.zzbtg.zzcj();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final void onAdLeftApplication() {
        synchronized (this.mLock) {
            if (this.zzbtg != null) {
                this.zzbtg.zzcg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final void onAdLoaded() {
        synchronized (this.mLock) {
            if (this.zzbtf != null) {
                this.zzbtf.zzx(0);
                this.zzbtf = null;
                return;
            }
            if (this.zzbtg != null) {
                this.zzbtg.zzci();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final void onAdOpened() {
        synchronized (this.mLock) {
            if (this.zzbtg != null) {
                this.zzbtg.zzch();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final void onAppEvent(String str, String str2) {
        synchronized (this.mLock) {
            if (this.zzbtg != null) {
                this.zzbtg.zzb(str, str2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final void onVideoEnd() {
        synchronized (this.mLock) {
            if (this.zzbtg != null) {
                this.zzbtg.zzcd();
            }
        }
    }

    public final void zza(zzwz zzwzVar) {
        synchronized (this.mLock) {
            this.zzbtg = zzwzVar;
        }
    }

    public final void zza(zzxf zzxfVar) {
        synchronized (this.mLock) {
            this.zzbtf = zzxfVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final void zza(zzxw zzxwVar) {
        synchronized (this.mLock) {
            if (this.zzbtf != null) {
                this.zzbtf.zza(0, zzxwVar);
                this.zzbtf = null;
                return;
            }
            if (this.zzbtg != null) {
                this.zzbtg.zzci();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final void zzb(zzqs zzqsVar, String str) {
        synchronized (this.mLock) {
            if (this.zzbtg != null) {
                this.zzbtg.zza(zzqsVar, str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final void zzbj(String str) {
    }
}
