package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzag;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
/* loaded from: classes2.dex */
final class zzbp extends zzag.zzb {
    private final /* synthetic */ Bundle zzc;
    private final /* synthetic */ Activity zzd;
    private final /* synthetic */ zzag.zzc zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbp(zzag.zzc zzcVar, Bundle bundle, Activity activity) {
        super(zzag.this);
        this.zze = zzcVar;
        this.zzc = bundle;
        this.zzd = activity;
    }

    @Override // com.google.android.gms.internal.measurement.zzag.zzb
    final void zza() throws RemoteException {
        Bundle bundle;
        zzv zzvVar;
        if (this.zzc != null) {
            bundle = new Bundle();
            if (this.zzc.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.zzc.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        zzvVar = zzag.this.zzm;
        zzvVar.onActivityCreated(ObjectWrapper.wrap(this.zzd), bundle, this.zzb);
    }
}
