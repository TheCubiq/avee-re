package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzbv;
import com.google.android.gms.internal.measurement.zzcd;
import com.google.android.gms.internal.measurement.zzms;
import com.google.android.gms.internal.measurement.zzmy;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzo extends zzkm {
    private String zzb;
    private Set<Integer> zzc;
    private Map<Integer, zzq> zzd;
    private Long zze;
    private Long zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzo(zzkp zzkpVar) {
        super(zzkpVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkm
    protected final boolean zzd() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x02d4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<zzcd.zza> zza(String str, List<zzcd.zzc> list, List<zzcd.zzk> list2, Long l, Long l2) {
        int i;
        boolean z;
        zzbv.zze next;
        zzan zzanVar;
        zzt zztVar;
        int i2;
        ArrayMap arrayMap;
        List<zzbv.zzb> list3;
        boolean z2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zzb = str;
        this.zzc = new HashSet();
        this.zzd = new ArrayMap();
        this.zze = l;
        this.zzf = l2;
        Iterator<zzcd.zzc> it = list.iterator();
        while (true) {
            i = 1;
            if (it.hasNext()) {
                if ("_s".equals(it.next().zzc())) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        boolean z3 = zzms.zzb() && zzs().zzd(this.zzb, zzat.zzbc);
        boolean z4 = zzms.zzb() && zzs().zzd(this.zzb, zzat.zzbb);
        if (z) {
            zzac zzi = zzi();
            String str2 = this.zzb;
            zzi.zzaj();
            zzi.zzc();
            Preconditions.checkNotEmpty(str2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_session_count", (Integer) 0);
            try {
                zzi.c_().update("events", contentValues, "app_id = ?", new String[]{str2});
            } catch (SQLiteException e) {
                zzi.zzq().zze().zza("Error resetting session-scoped event counts. appId", zzex.zza(str2), e);
            }
        }
        Map<Integer, List<zzbv.zzb>> emptyMap = Collections.emptyMap();
        if (z4 && z3) {
            emptyMap = zzi().zze(this.zzb);
        }
        Map<Integer, zzcd.zzi> zzg = zzi().zzg(this.zzb);
        if (((zzmy.zzb() && zzs().zzd(this.zzb, zzat.zzcm)) || zzg != null) && !zzg.isEmpty()) {
            HashSet<Integer> hashSet = new HashSet(zzg.keySet());
            if (z) {
                String str3 = this.zzb;
                Preconditions.checkNotEmpty(str3);
                Preconditions.checkNotNull(zzg);
                ArrayMap arrayMap2 = new ArrayMap();
                if (!zzg.isEmpty()) {
                    Map<Integer, List<Integer>> zzf = zzi().zzf(str3);
                    for (Integer num : zzg.keySet()) {
                        int intValue = num.intValue();
                        zzcd.zzi zziVar = zzg.get(Integer.valueOf(intValue));
                        List<Integer> list4 = zzf.get(Integer.valueOf(intValue));
                        if (list4 == null || list4.isEmpty()) {
                            arrayMap2.put(Integer.valueOf(intValue), zziVar);
                        } else {
                            List<Long> zza = f_().zza(zziVar.zzc(), list4);
                            if (!zza.isEmpty()) {
                                zzcd.zzi.zza zzb = zziVar.zzbo().zzb().zzb(zza);
                                zzb.zza().zza(f_().zza(zziVar.zza(), list4));
                                for (int i3 = 0; i3 < zziVar.zzf(); i3++) {
                                    if (list4.contains(Integer.valueOf(zziVar.zza(i3).zzb()))) {
                                        zzb.zza(i3);
                                    }
                                }
                                for (int i4 = 0; i4 < zziVar.zzh(); i4++) {
                                    if (list4.contains(Integer.valueOf(zziVar.zzb(i4).zzb()))) {
                                        zzb.zzb(i4);
                                    }
                                }
                                arrayMap2.put(Integer.valueOf(intValue), (zzcd.zzi) ((com.google.android.gms.internal.measurement.zzhv) zzb.zzy()));
                            }
                        }
                    }
                }
                arrayMap = arrayMap2;
            } else {
                arrayMap = zzg;
            }
            for (Integer num2 : hashSet) {
                int intValue2 = num2.intValue();
                zzcd.zzi zziVar2 = arrayMap.get(Integer.valueOf(intValue2));
                BitSet bitSet = new BitSet();
                BitSet bitSet2 = new BitSet();
                ArrayMap arrayMap3 = new ArrayMap();
                if (zziVar2 != null && zziVar2.zzf() != 0) {
                    for (zzcd.zzb zzbVar : zziVar2.zze()) {
                        if (zzbVar.zza()) {
                            arrayMap3.put(Integer.valueOf(zzbVar.zzb()), zzbVar.zzc() ? Long.valueOf(zzbVar.zzd()) : null);
                        }
                    }
                }
                ArrayMap arrayMap4 = new ArrayMap();
                if (zziVar2 != null && zziVar2.zzh() != 0) {
                    for (zzcd.zzj zzjVar : zziVar2.zzg()) {
                        if (zzjVar.zza() && zzjVar.zzd() > 0) {
                            arrayMap4.put(Integer.valueOf(zzjVar.zzb()), Long.valueOf(zzjVar.zza(zzjVar.zzd() - i)));
                        }
                    }
                }
                if (zziVar2 != null) {
                    for (int i5 = 0; i5 < (zziVar2.zzb() << 6); i5++) {
                        if (zzkt.zza(zziVar2.zza(), i5)) {
                            zzq().zzw().zza("Filter already evaluated. audience ID, filter ID", Integer.valueOf(intValue2), Integer.valueOf(i5));
                            bitSet2.set(i5);
                            if (zzkt.zza(zziVar2.zzc(), i5)) {
                                bitSet.set(i5);
                                z2 = true;
                                if (z2) {
                                    arrayMap3.remove(Integer.valueOf(i5));
                                }
                            }
                        }
                        z2 = false;
                        if (z2) {
                        }
                    }
                }
                zzcd.zzi zziVar3 = zzg.get(Integer.valueOf(intValue2));
                if (z4 && z3 && (list3 = emptyMap.get(Integer.valueOf(intValue2))) != null && this.zzf != null && this.zze != null) {
                    for (zzbv.zzb zzbVar2 : list3) {
                        int zzb2 = zzbVar2.zzb();
                        long longValue = this.zzf.longValue() / 1000;
                        if (zzbVar2.zzi()) {
                            longValue = this.zze.longValue() / 1000;
                        }
                        if (arrayMap3.containsKey(Integer.valueOf(zzb2))) {
                            arrayMap3.put(Integer.valueOf(zzb2), Long.valueOf(longValue));
                        }
                        if (arrayMap4.containsKey(Integer.valueOf(zzb2))) {
                            arrayMap4.put(Integer.valueOf(zzb2), Long.valueOf(longValue));
                        }
                    }
                }
                this.zzd.put(Integer.valueOf(intValue2), new zzq(this, this.zzb, zziVar3, bitSet, bitSet2, arrayMap3, arrayMap4, null));
                arrayMap = arrayMap;
                i = 1;
            }
        }
        if (!list.isEmpty()) {
            zzt zztVar2 = new zzt(this, null);
            ArrayMap arrayMap5 = new ArrayMap();
            for (zzcd.zzc zzcVar : list) {
                zzcd.zzc zza2 = zztVar2.zza(this.zzb, zzcVar);
                if (zza2 != null) {
                    zzac zzi2 = zzi();
                    String str4 = this.zzb;
                    String zzc = zza2.zzc();
                    zzan zza3 = zzi2.zza(str4, zzcVar.zzc());
                    if (zza3 == null) {
                        zzi2.zzq().zzh().zza("Event aggregate wasn't created during raw event logging. appId, event", zzex.zza(str4), zzi2.zzn().zza(zzc));
                        zzanVar = new zzan(str4, zzcVar.zzc(), 1L, 1L, 1L, zzcVar.zze(), 0L, null, null, null, null);
                    } else {
                        zzanVar = new zzan(zza3.zza, zza3.zzb, zza3.zzc + 1, zza3.zzd + 1, zza3.zze + 1, zza3.zzf, zza3.zzg, zza3.zzh, zza3.zzi, zza3.zzj, zza3.zzk);
                    }
                    zzi().zza(zzanVar);
                    long j = zzanVar.zzc;
                    String zzc2 = zza2.zzc();
                    Map<Integer, List<zzbv.zzb>> map = (Map) arrayMap5.get(zzc2);
                    if (map == null) {
                        map = zzi().zzf(this.zzb, zzc2);
                        if ((!zzmy.zzb() || !zzs().zzd(this.zzb, zzat.zzcm)) && map == null) {
                            map = new ArrayMap<>();
                        }
                        arrayMap5.put(zzc2, map);
                    }
                    for (Integer num3 : map.keySet()) {
                        int intValue3 = num3.intValue();
                        if (this.zzc.contains(Integer.valueOf(intValue3))) {
                            zzq().zzw().zza("Skipping failed audience ID", Integer.valueOf(intValue3));
                        } else {
                            Iterator<zzbv.zzb> it2 = map.get(Integer.valueOf(intValue3)).iterator();
                            boolean z5 = true;
                            while (true) {
                                if (!it2.hasNext()) {
                                    zztVar = zztVar2;
                                    i2 = intValue3;
                                    break;
                                }
                                zzbv.zzb next2 = it2.next();
                                zzs zzsVar = new zzs(this, this.zzb, intValue3, next2);
                                zztVar = zztVar2;
                                i2 = intValue3;
                                z5 = zzsVar.zza(this.zze, this.zzf, zza2, j, zzanVar, zza(intValue3, next2.zzb()));
                                if (z5) {
                                    zza(i2).zza(zzsVar);
                                    intValue3 = i2;
                                    zztVar2 = zztVar;
                                } else {
                                    this.zzc.add(Integer.valueOf(i2));
                                    break;
                                }
                            }
                            if (!z5) {
                                this.zzc.add(Integer.valueOf(i2));
                            }
                            zztVar2 = zztVar;
                        }
                    }
                }
            }
        }
        if (!list2.isEmpty()) {
            ArrayMap arrayMap6 = new ArrayMap();
            for (zzcd.zzk zzkVar : list2) {
                String zzc3 = zzkVar.zzc();
                Map<Integer, List<zzbv.zze>> map2 = (Map) arrayMap6.get(zzc3);
                if (map2 == null) {
                    map2 = zzi().zzg(this.zzb, zzc3);
                    if ((!zzmy.zzb() || !zzs().zzd(this.zzb, zzat.zzcm)) && map2 == null) {
                        map2 = new ArrayMap<>();
                    }
                    arrayMap6.put(zzc3, map2);
                }
                Iterator<Integer> it3 = map2.keySet().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        int intValue4 = it3.next().intValue();
                        if (this.zzc.contains(Integer.valueOf(intValue4))) {
                            zzq().zzw().zza("Skipping failed audience ID", Integer.valueOf(intValue4));
                            break;
                        }
                        Iterator<zzbv.zze> it4 = map2.get(Integer.valueOf(intValue4)).iterator();
                        boolean z6 = true;
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            next = it4.next();
                            if (zzq().zza(2)) {
                                zzq().zzw().zza("Evaluating filter. audience, filter, property", Integer.valueOf(intValue4), next.zza() ? Integer.valueOf(next.zzb()) : null, zzn().zzc(next.zzc()));
                                zzq().zzw().zza("Filter definition", f_().zza(next));
                            }
                            if (!next.zza() || next.zzb() > 256) {
                                break;
                            }
                            zzu zzuVar = new zzu(this, this.zzb, intValue4, next);
                            z6 = zzuVar.zza(this.zze, this.zzf, zzkVar, zza(intValue4, next.zzb()));
                            if (z6) {
                                zza(intValue4).zza(zzuVar);
                            } else {
                                this.zzc.add(Integer.valueOf(intValue4));
                                break;
                            }
                        }
                        zzq().zzh().zza("Invalid property filter ID. appId, id", zzex.zza(this.zzb), String.valueOf(next.zza() ? Integer.valueOf(next.zzb()) : null));
                        z6 = false;
                        if (!z6) {
                            this.zzc.add(Integer.valueOf(intValue4));
                        }
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Set<Integer> keySet = this.zzd.keySet();
        keySet.removeAll(this.zzc);
        for (Integer num4 : keySet) {
            int intValue5 = num4.intValue();
            zzcd.zza zza4 = this.zzd.get(Integer.valueOf(intValue5)).zza(intValue5);
            arrayList.add(zza4);
            zzac zzi3 = zzi();
            String str5 = this.zzb;
            zzcd.zzi zzc4 = zza4.zzc();
            zzi3.zzaj();
            zzi3.zzc();
            Preconditions.checkNotEmpty(str5);
            Preconditions.checkNotNull(zzc4);
            byte[] zzbk = zzc4.zzbk();
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("app_id", str5);
            contentValues2.put("audience_id", Integer.valueOf(intValue5));
            contentValues2.put("current_results", zzbk);
            try {
                try {
                    if (zzi3.c_().insertWithOnConflict("audience_filter_values", null, contentValues2, 5) == -1) {
                        zzi3.zzq().zze().zza("Failed to insert filter results (got -1). appId", zzex.zza(str5));
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    zzi3.zzq().zze().zza("Error storing filter results. appId", zzex.zza(str5), e);
                }
            } catch (SQLiteException e3) {
                e = e3;
            }
        }
        return arrayList;
    }

    private final zzq zza(int i) {
        if (this.zzd.containsKey(Integer.valueOf(i))) {
            return this.zzd.get(Integer.valueOf(i));
        }
        zzq zzqVar = new zzq(this, this.zzb, null);
        this.zzd.put(Integer.valueOf(i), zzqVar);
        return zzqVar;
    }

    private final boolean zza(int i, int i2) {
        if (this.zzd.get(Integer.valueOf(i)) == null) {
            return false;
        }
        return zzq.zza(this.zzd.get(Integer.valueOf(i))).get(i2);
    }
}
