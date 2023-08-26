package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzag;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzap extends zzag.zzb {
    private final /* synthetic */ Boolean zzc;
    private final /* synthetic */ zzag zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzap(zzag zzagVar, Boolean bool) {
        super(zzagVar);
        this.zzd = zzagVar;
        this.zzc = bool;
    }

    @Override // com.google.android.gms.internal.measurement.zzag.zzb
    final void zza() throws RemoteException {
        zzv zzvVar;
        zzv zzvVar2;
        if (this.zzc != null) {
            zzvVar2 = this.zzd.zzm;
            zzvVar2.setMeasurementEnabled(this.zzc.booleanValue(), this.zza);
            return;
        }
        zzvVar = this.zzd.zzm;
        zzvVar.clearMeasurementEnabled(this.zza);
    }
}
