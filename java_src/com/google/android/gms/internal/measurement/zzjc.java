package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
final class zzjc implements zziz {
    @Override // com.google.android.gms.internal.measurement.zziz
    public final Map<?, ?> zza(Object obj) {
        return (zzja) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zziz
    public final zzix<?, ?> zzf(Object obj) {
        zziy zziyVar = (zziy) obj;
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.zziz
    public final Map<?, ?> zzb(Object obj) {
        return (zzja) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zziz
    public final boolean zzc(Object obj) {
        return !((zzja) obj).zzd();
    }

    @Override // com.google.android.gms.internal.measurement.zziz
    public final Object zzd(Object obj) {
        ((zzja) obj).zzc();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.zziz
    public final Object zze(Object obj) {
        return zzja.zza().zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zziz
    public final Object zza(Object obj, Object obj2) {
        zzja zzjaVar = (zzja) obj;
        zzja zzjaVar2 = (zzja) obj2;
        if (!zzjaVar2.isEmpty()) {
            if (!zzjaVar.zzd()) {
                zzjaVar = zzjaVar.zzb();
            }
            zzjaVar.zza(zzjaVar2);
        }
        return zzjaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zziz
    public final int zza(int i, Object obj, Object obj2) {
        zzja zzjaVar = (zzja) obj;
        zziy zziyVar = (zziy) obj2;
        if (zzjaVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzjaVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw new NoSuchMethodError();
        }
        return 0;
    }
}
