package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzag;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzbf extends zzag.zzb {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzhd zzc;
    private final /* synthetic */ zzag zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbf(zzag zzagVar, com.google.android.gms.measurement.internal.zzhd zzhdVar) {
        super(zzagVar);
        this.zzd = zzagVar;
        this.zzc = zzhdVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzag.zzb
    final void zza() throws RemoteException {
        zzv zzvVar;
        zzvVar = this.zzd.zzm;
        zzvVar.setEventInterceptor(new zzag.zza(this.zzc));
    }
}
