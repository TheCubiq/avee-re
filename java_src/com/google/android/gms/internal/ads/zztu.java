package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Random;
/* loaded from: classes2.dex */
final class zztu extends zzki {
    private final zzkh zzboi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zztu(zzkh zzkhVar) {
        this.zzboi = zzkhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final void onAdClicked() throws RemoteException {
        this.zzboi.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final void onAdClosed() throws RemoteException {
        if (zzud.zzlv()) {
            int intValue = ((Integer) zzkb.zzik().zzd(zznk.zzazg)).intValue();
            int intValue2 = ((Integer) zzkb.zzik().zzd(zznk.zzazh)).intValue();
            if (intValue <= 0 || intValue2 < 0) {
                com.google.android.gms.ads.internal.zzbv.zzex().zzld();
            } else {
                zzakk.zzcrm.postDelayed(zztv.zzboj, intValue + new Random().nextInt(intValue2 + 1));
            }
        }
        this.zzboi.onAdClosed();
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final void onAdFailedToLoad(int i) throws RemoteException {
        this.zzboi.onAdFailedToLoad(i);
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final void onAdImpression() throws RemoteException {
        this.zzboi.onAdImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final void onAdLeftApplication() throws RemoteException {
        this.zzboi.onAdLeftApplication();
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final void onAdLoaded() throws RemoteException {
        this.zzboi.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final void onAdOpened() throws RemoteException {
        this.zzboi.onAdOpened();
    }
}
