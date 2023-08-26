package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzjx {
    private static final Class<?> zza = zzd();
    private static final zzkn<?, ?> zzb = zza(false);
    private static final zzkn<?, ?> zzc = zza(true);
    private static final zzkn<?, ?> zzd = new zzkp();

    public static void zza(Class<?> cls) {
        Class<?> cls2;
        if (!zzhv.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zza(int i, List<Double> list, zzlk zzlkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzlkVar.zzg(i, list, z);
    }

    public static void zzb(int i, List<Float> list, zzlk zzlkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzlkVar.zzf(i, list, z);
    }

    public static void zzc(int i, List<Long> list, zzlk zzlkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzlkVar.zzc(i, list, z);
    }

    public static void zzd(int i, List<Long> list, zzlk zzlkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzlkVar.zzd(i, list, z);
    }

    public static void zze(int i, List<Long> list, zzlk zzlkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzlkVar.zzn(i, list, z);
    }

    public static void zzf(int i, List<Long> list, zzlk zzlkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzlkVar.zze(i, list, z);
    }

    public static void zzg(int i, List<Long> list, zzlk zzlkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzlkVar.zzl(i, list, z);
    }

    public static void zzh(int i, List<Integer> list, zzlk zzlkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzlkVar.zza(i, list, z);
    }

    public static void zzi(int i, List<Integer> list, zzlk zzlkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzlkVar.zzj(i, list, z);
    }

    public static void zzj(int i, List<Integer> list, zzlk zzlkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzlkVar.zzm(i, list, z);
    }

    public static void zzk(int i, List<Integer> list, zzlk zzlkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzlkVar.zzb(i, list, z);
    }

    public static void zzl(int i, List<Integer> list, zzlk zzlkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzlkVar.zzk(i, list, z);
    }

    public static void zzm(int i, List<Integer> list, zzlk zzlkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzlkVar.zzh(i, list, z);
    }

    public static void zzn(int i, List<Boolean> list, zzlk zzlkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzlkVar.zzi(i, list, z);
    }

    public static void zza(int i, List<String> list, zzlk zzlkVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzlkVar.zza(i, list);
    }

    public static void zzb(int i, List<zzgm> list, zzlk zzlkVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzlkVar.zzb(i, list);
    }

    public static void zza(int i, List<?> list, zzlk zzlkVar, zzjv zzjvVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzlkVar.zza(i, list, zzjvVar);
    }

    public static void zzb(int i, List<?> list, zzlk zzlkVar, zzjv zzjvVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzlkVar.zzb(i, list, zzjvVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zziu) {
            zziu zziuVar = (zziu) list;
            i = 0;
            while (i2 < size) {
                i += zzhf.zzd(zziuVar.zzb(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzhf.zzd(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zza(list) + (list.size() * zzhf.zze(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zziu) {
            zziu zziuVar = (zziu) list;
            i = 0;
            while (i2 < size) {
                i += zzhf.zze(zziuVar.zzb(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzhf.zze(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzhf.zze(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zziu) {
            zziu zziuVar = (zziu) list;
            i = 0;
            while (i2 < size) {
                i += zzhf.zzf(zziuVar.zzb(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzhf.zzf(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzc(list) + (size * zzhf.zze(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhy) {
            zzhy zzhyVar = (zzhy) list;
            i = 0;
            while (i2 < size) {
                i += zzhf.zzk(zzhyVar.zzc(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzhf.zzk(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzd(list) + (size * zzhf.zze(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhy) {
            zzhy zzhyVar = (zzhy) list;
            i = 0;
            while (i2 < size) {
                i += zzhf.zzf(zzhyVar.zzc(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzhf.zzf(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzhf.zze(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhy) {
            zzhy zzhyVar = (zzhy) list;
            i = 0;
            while (i2 < size) {
                i += zzhf.zzg(zzhyVar.zzc(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzhf.zzg(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzf(list) + (size * zzhf.zze(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhy) {
            zzhy zzhyVar = (zzhy) list;
            i = 0;
            while (i2 < size) {
                i += zzhf.zzh(zzhyVar.zzc(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzhf.zzh(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzhf.zze(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(List<?> list) {
        return list.size() << 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzhf.zzi(i, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(List<?> list) {
        return list.size() << 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzhf.zzg(i, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(List<?> list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzhf.zzb(i, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, List<?> list) {
        int zzb2;
        int zzb3;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zze = zzhf.zze(i) * size;
        if (list instanceof zzin) {
            zzin zzinVar = (zzin) list;
            while (i2 < size) {
                Object zzb4 = zzinVar.zzb(i2);
                if (zzb4 instanceof zzgm) {
                    zzb3 = zzhf.zzb((zzgm) zzb4);
                } else {
                    zzb3 = zzhf.zzb((String) zzb4);
                }
                zze += zzb3;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzgm) {
                    zzb2 = zzhf.zzb((zzgm) obj);
                } else {
                    zzb2 = zzhf.zzb((String) obj);
                }
                zze += zzb2;
                i2++;
            }
        }
        return zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, Object obj, zzjv zzjvVar) {
        if (obj instanceof zzil) {
            return zzhf.zza(i, (zzil) obj);
        }
        return zzhf.zzb(i, (zzjg) obj, zzjvVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, List<?> list, zzjv zzjvVar) {
        int zza2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zze = zzhf.zze(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzil) {
                zza2 = zzhf.zza((zzil) obj);
            } else {
                zza2 = zzhf.zza((zzjg) obj, zzjvVar);
            }
            zze += zza2;
        }
        return zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i, List<zzgm> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zze = size * zzhf.zze(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zze += zzhf.zzb(list.get(i2));
        }
        return zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i, List<zzjg> list, zzjv zzjvVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzhf.zzc(i, list.get(i3), zzjvVar);
        }
        return i2;
    }

    public static zzkn<?, ?> zza() {
        return zzb;
    }

    public static zzkn<?, ?> zzb() {
        return zzc;
    }

    public static zzkn<?, ?> zzc() {
        return zzd;
    }

    private static zzkn<?, ?> zza(boolean z) {
        try {
            Class<?> zze = zze();
            if (zze == null) {
                return null;
            }
            return (zzkn) zze.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzd() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zze() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void zza(zziz zzizVar, T t, T t2, long j) {
        zzkt.zza(t, j, zzizVar.zza(zzkt.zzf(t, j), zzkt.zzf(t2, j)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends zzhq<FT>> void zza(zzhk<FT> zzhkVar, T t, T t2) {
        zzho<FT> zza2 = zzhkVar.zza(t2);
        if (zza2.zza.isEmpty()) {
            return;
        }
        zzhkVar.zzb(t).zza(zza2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void zza(zzkn<UT, UB> zzknVar, T t, T t2) {
        zzknVar.zza(t, zzknVar.zzc(zzknVar.zzb(t), zzknVar.zzb(t2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zza(int i, List<Integer> list, zzic zzicVar, UB ub, zzkn<UT, UB> zzknVar) {
        if (zzicVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (zzicVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) zza(i, intValue, ub, zzknVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzicVar.zza(intValue2)) {
                    ub = (UB) zza(i, intValue2, ub, zzknVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zza(int i, int i2, UB ub, zzkn<UT, UB> zzknVar) {
        if (ub == null) {
            ub = zzknVar.zza();
        }
        zzknVar.zza((zzkn<UT, UB>) ub, i, i2);
        return ub;
    }
}
