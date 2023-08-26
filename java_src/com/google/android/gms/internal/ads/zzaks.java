package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
/* loaded from: classes2.dex */
public class zzaks extends zzakq {
    public zzaks() {
        super();
    }

    @Override // com.google.android.gms.internal.ads.zzakq
    public boolean zza(DownloadManager.Request request) {
        request.setShowRunningNotification(true);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzakq
    public final int zzrl() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.zzakq
    public final int zzrm() {
        return 7;
    }
}
