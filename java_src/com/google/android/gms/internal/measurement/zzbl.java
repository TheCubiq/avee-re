package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzag;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzbl extends zzag.zzb {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzhc zzc;
    private final /* synthetic */ zzag zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbl(zzag zzagVar, com.google.android.gms.measurement.internal.zzhc zzhcVar) {
        super(zzagVar);
        this.zzd = zzagVar;
        this.zzc = zzhcVar;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000b */
    @Override // com.google.android.gms.internal.measurement.zzag.zzb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zza() throws RemoteException {
        List list;
        List list2;
        zzv zzvVar;
        List list3;
        String str;
        for (int i = 0; i < list.size(); i++) {
            com.google.android.gms.measurement.internal.zzhc zzhcVar = this.zzc;
            list3 = this.zzd.zzf;
            if (zzhcVar.equals(((Pair) list3.get(i)).first)) {
                str = this.zzd.zzc;
                Log.w(str, "OnEventListener already registered.");
                return;
            }
        }
        zzag.zzd zzdVar = new zzag.zzd(this.zzc);
        list2 = this.zzd.zzf;
        list2.add(new Pair(this.zzc, zzdVar));
        zzvVar = this.zzd.zzm;
        zzvVar.registerOnMeasurementEventListener(zzdVar);
    }
}
