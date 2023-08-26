package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
/* loaded from: classes2.dex */
final class zzajf implements Runnable {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzaoj zzcoa;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzajf(zzaje zzajeVar, Context context, zzaoj zzaojVar) {
        this.val$context = context;
        this.zzcoa = zzaojVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzcoa.set(AdvertisingIdClient.getAdvertisingIdInfo(this.val$context));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            this.zzcoa.setException(e);
            zzane.zzb("Exception while getting advertising Id info", e);
        }
    }
}
