package com.google.android.gms.measurement.internal;

import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.zzcd;
import com.google.android.gms.internal.measurement.zzms;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzq {
    private String zza;
    private boolean zzb;
    private zzcd.zzi zzc;
    private BitSet zzd;
    private BitSet zze;
    private Map<Integer, Long> zzf;
    private Map<Integer, List<Long>> zzg;
    private final /* synthetic */ zzo zzh;

    private zzq(zzo zzoVar, String str) {
        this.zzh = zzoVar;
        this.zza = str;
        this.zzb = true;
        this.zzd = new BitSet();
        this.zze = new BitSet();
        this.zzf = new ArrayMap();
        this.zzg = new ArrayMap();
    }

    private zzq(zzo zzoVar, String str, zzcd.zzi zziVar, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.zzh = zzoVar;
        this.zza = str;
        this.zzd = bitSet;
        this.zze = bitSet2;
        this.zzf = map;
        this.zzg = new ArrayMap();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(num));
                this.zzg.put(num, arrayList);
            }
        }
        this.zzb = false;
        this.zzc = zziVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzv zzvVar) {
        int zza = zzvVar.zza();
        if (zzvVar.zzc != null) {
            this.zze.set(zza, zzvVar.zzc.booleanValue());
        }
        if (zzvVar.zzd != null) {
            this.zzd.set(zza, zzvVar.zzd.booleanValue());
        }
        if (zzvVar.zze != null) {
            Long l = this.zzf.get(Integer.valueOf(zza));
            long longValue = zzvVar.zze.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.zzf.put(Integer.valueOf(zza), Long.valueOf(longValue));
            }
        }
        if (zzvVar.zzf != null) {
            List<Long> list = this.zzg.get(Integer.valueOf(zza));
            if (list == null) {
                list = new ArrayList<>();
                this.zzg.put(Integer.valueOf(zza), list);
            }
            if (zzvVar.zzb()) {
                list.clear();
            }
            if (zzms.zzb() && this.zzh.zzs().zzd(this.zza, zzat.zzbc) && zzvVar.zzc()) {
                list.clear();
            }
            if (zzms.zzb() && this.zzh.zzs().zzd(this.zza, zzat.zzbc)) {
                long longValue2 = zzvVar.zzf.longValue() / 1000;
                if (list.contains(Long.valueOf(longValue2))) {
                    return;
                }
                list.add(Long.valueOf(longValue2));
                return;
            }
            list.add(Long.valueOf(zzvVar.zzf.longValue() / 1000));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable] */
    public final zzcd.zza zza(int i) {
        ArrayList arrayList;
        ?? arrayList2;
        zzcd.zza.C0018zza zzh = zzcd.zza.zzh();
        zzh.zza(i);
        zzh.zza(this.zzb);
        zzcd.zzi zziVar = this.zzc;
        if (zziVar != null) {
            zzh.zza(zziVar);
        }
        zzcd.zzi.zza zza = zzcd.zzi.zzi().zzb(zzkt.zza(this.zzd)).zza(zzkt.zza(this.zze));
        if (this.zzf == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.zzf.size());
            for (Integer num : this.zzf.keySet()) {
                int intValue = num.intValue();
                arrayList.add((zzcd.zzb) ((com.google.android.gms.internal.measurement.zzhv) zzcd.zzb.zze().zza(intValue).zza(this.zzf.get(Integer.valueOf(intValue)).longValue()).zzy()));
            }
        }
        zza.zzc(arrayList);
        if (this.zzg == null) {
            arrayList2 = Collections.emptyList();
        } else {
            arrayList2 = new ArrayList(this.zzg.size());
            for (Integer num2 : this.zzg.keySet()) {
                zzcd.zzj.zza zza2 = zzcd.zzj.zze().zza(num2.intValue());
                List<Long> list = this.zzg.get(num2);
                if (list != null) {
                    Collections.sort(list);
                    zza2.zza(list);
                }
                arrayList2.add((zzcd.zzj) ((com.google.android.gms.internal.measurement.zzhv) zza2.zzy()));
            }
        }
        zza.zzd(arrayList2);
        zzh.zza(zza);
        return (zzcd.zza) ((com.google.android.gms.internal.measurement.zzhv) zzh.zzy());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzq(zzo zzoVar, String str, zzcd.zzi zziVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2, zzr zzrVar) {
        this(zzoVar, str, zziVar, bitSet, bitSet2, map, map2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzq(zzo zzoVar, String str, zzr zzrVar) {
        this(zzoVar, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ BitSet zza(zzq zzqVar) {
        return zzqVar.zzd;
    }
}
