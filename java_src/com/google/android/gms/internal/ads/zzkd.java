package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
@zzadh
/* loaded from: classes2.dex */
public class zzkd extends AdListener {
    private final Object lock = new Object();
    private AdListener zzasi;

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClosed() {
        synchronized (this.lock) {
            if (this.zzasi != null) {
                this.zzasi.onAdClosed();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(int i) {
        synchronized (this.lock) {
            if (this.zzasi != null) {
                this.zzasi.onAdFailedToLoad(i);
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLeftApplication() {
        synchronized (this.lock) {
            if (this.zzasi != null) {
                this.zzasi.onAdLeftApplication();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        synchronized (this.lock) {
            if (this.zzasi != null) {
                this.zzasi.onAdLoaded();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdOpened() {
        synchronized (this.lock) {
            if (this.zzasi != null) {
                this.zzasi.onAdOpened();
            }
        }
    }

    public final void zza(AdListener adListener) {
        synchronized (this.lock) {
            this.zzasi = adListener;
        }
    }
}
