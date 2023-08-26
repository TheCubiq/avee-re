package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzag;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzar extends zzag.zzb {
    private final /* synthetic */ zzag zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzar(zzag zzagVar) {
        super(zzagVar);
        this.zzc = zzagVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzag.zzb
    final void zza() throws RemoteException {
        zzv zzvVar;
        zzvVar = this.zzc.zzm;
        zzvVar.resetAnalyticsData(this.zza);
    }
}
