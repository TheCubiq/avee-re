package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
public final class zzbfx extends CustomTabsServiceConnection {
    private WeakReference<zzbfy> zzedz;

    public zzbfx(zzbfy zzbfyVar) {
        this.zzedz = new WeakReference<>(zzbfyVar);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        zzbfy zzbfyVar = this.zzedz.get();
        if (zzbfyVar != null) {
            zzbfyVar.zza(customTabsClient);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbfy zzbfyVar = this.zzedz.get();
        if (zzbfyVar != null) {
            zzbfyVar.zzjo();
        }
    }
}
