package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import java.util.Set;
/* loaded from: classes2.dex */
public class zzakt extends zzaks {
    @Override // com.google.android.gms.internal.ads.zzakq
    public zzaqx zza(zzaqw zzaqwVar, boolean z) {
        return new zzart(zzaqwVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaks, com.google.android.gms.internal.ads.zzakq
    public final boolean zza(DownloadManager.Request request) {
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzakq
    public boolean zza(Context context, WebSettings webSettings) {
        super.zza(context, webSettings);
        return ((Boolean) zzaml.zza(context, new zzaku(this, context, webSettings))).booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.zzakq
    public final boolean zza(Window window) {
        window.setFlags(16777216, 16777216);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzakq
    public final Set<String> zzh(Uri uri) {
        return uri.getQueryParameterNames();
    }

    @Override // com.google.android.gms.internal.ads.zzakq
    public final boolean zzy(View view) {
        view.setLayerType(0, null);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzakq
    public final boolean zzz(View view) {
        view.setLayerType(1, null);
        return true;
    }
}
