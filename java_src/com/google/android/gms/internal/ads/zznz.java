package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.doubleclick.CustomRenderedAd;
import com.google.android.gms.dynamic.ObjectWrapper;
@zzadh
/* loaded from: classes2.dex */
public final class zznz implements CustomRenderedAd {
    private final zzoa zzbgv;

    public zznz(zzoa zzoaVar) {
        this.zzbgv = zzoaVar;
    }

    @Override // com.google.android.gms.ads.doubleclick.CustomRenderedAd
    public final String getBaseUrl() {
        try {
            return this.zzbgv.zzjn();
        } catch (RemoteException e) {
            zzane.zzd("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.doubleclick.CustomRenderedAd
    public final String getContent() {
        try {
            return this.zzbgv.getContent();
        } catch (RemoteException e) {
            zzane.zzd("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.doubleclick.CustomRenderedAd
    public final void onAdRendered(View view) {
        try {
            this.zzbgv.zzg(view != null ? ObjectWrapper.wrap(view) : null);
        } catch (RemoteException e) {
            zzane.zzd("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.doubleclick.CustomRenderedAd
    public final void recordClick() {
        try {
            this.zzbgv.recordClick();
        } catch (RemoteException e) {
            zzane.zzd("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.doubleclick.CustomRenderedAd
    public final void recordImpression() {
        try {
            this.zzbgv.recordImpression();
        } catch (RemoteException e) {
            zzane.zzd("#007 Could not call remote method.", e);
        }
    }
}
