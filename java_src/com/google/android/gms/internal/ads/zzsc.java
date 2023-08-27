package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
/* loaded from: classes2.dex */
final class zzsc implements Runnable {
    private final /* synthetic */ PublisherAdView zzblg;
    private final /* synthetic */ zzks zzblh;
    private final /* synthetic */ zzsb zzbli;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzsc(zzsb zzsbVar, PublisherAdView publisherAdView, zzks zzksVar) {
        this.zzbli = zzsbVar;
        this.zzblg = publisherAdView;
        this.zzblh = zzksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener;
        if (!this.zzblg.zza(this.zzblh)) {
            zzane.zzdk("Could not bind.");
            return;
        }
        onPublisherAdViewLoadedListener = this.zzbli.zzblf;
        onPublisherAdViewLoadedListener.onPublisherAdViewLoaded(this.zzblg);
    }
}
