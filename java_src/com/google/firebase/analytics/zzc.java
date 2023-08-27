package com.google.firebase.analytics;

import com.google.android.gms.internal.measurement.zzag;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement-api@@17.5.0 */
/* loaded from: classes2.dex */
final class zzc implements Callable<String> {
    private final /* synthetic */ FirebaseAnalytics zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzc(FirebaseAnalytics firebaseAnalytics) {
        this.zza = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        String zzb;
        zzag zzagVar;
        zzb = this.zza.zzb();
        if (zzb != null) {
            return zzb;
        }
        zzagVar = this.zza.zzb;
        String zzh = zzagVar.zzh();
        this.zza.zza(zzh);
        return zzh;
    }
}
