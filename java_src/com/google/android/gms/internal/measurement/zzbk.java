package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzag;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzbk extends zzag.zzb {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzhc zzc;
    private final /* synthetic */ zzag zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbk(zzag zzagVar, com.google.android.gms.measurement.internal.zzhc zzhcVar) {
        super(zzagVar);
        this.zzd = zzagVar;
        this.zzc = zzhcVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzag.zzb
    final void zza() throws RemoteException {
        List list;
        Pair pair;
        zzv zzvVar;
        List list2;
        String str;
        List list3;
        List list4;
        int i = 0;
        while (true) {
            list = this.zzd.zzf;
            if (i >= list.size()) {
                pair = null;
                break;
            }
            com.google.android.gms.measurement.internal.zzhc zzhcVar = this.zzc;
            list3 = this.zzd.zzf;
            if (zzhcVar.equals(((Pair) list3.get(i)).first)) {
                list4 = this.zzd.zzf;
                pair = (Pair) list4.get(i);
                break;
            }
            i++;
        }
        if (pair == null) {
            str = this.zzd.zzc;
            Log.w(str, "OnEventListener had not been registered.");
            return;
        }
        zzvVar = this.zzd.zzm;
        zzvVar.unregisterOnMeasurementEventListener((zzab) pair.second);
        list2 = this.zzd.zzf;
        list2.remove(pair);
    }
}
