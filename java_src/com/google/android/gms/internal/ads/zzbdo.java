package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes2.dex */
final class zzbdo {
    private static final Class<?> zzdyf = zzafq();
    private static final zzbee<?, ?> zzdyg = zzas(false);
    private static final zzbee<?, ?> zzdyh = zzas(true);
    private static final zzbee<?, ?> zzdyi = new zzbeg();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zza(int i, int i2, UB ub, zzbee<UT, UB> zzbeeVar) {
        if (ub == null) {
            ub = zzbeeVar.zzagb();
        }
        zzbeeVar.zza((zzbee<UT, UB>) ub, i, i2);
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zza(int i, List<Integer> list, zzbbs<?> zzbbsVar, UB ub, zzbee<UT, UB> zzbeeVar) {
        if (zzbbsVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (zzbbsVar.zzq(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) zza(i, intValue, ub, zzbeeVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (zzbbsVar.zzq(intValue2) == null) {
                    ub = (UB) zza(i, intValue2, ub, zzbeeVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static void zza(int i, List<String> list, zzbey zzbeyVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbeyVar.zza(i, list);
    }

    public static void zza(int i, List<?> list, zzbey zzbeyVar, zzbdm zzbdmVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbeyVar.zza(i, list, zzbdmVar);
    }

    public static void zza(int i, List<Double> list, zzbey zzbeyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbeyVar.zzg(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends zzbbi<FT>> void zza(zzbbd<FT> zzbbdVar, T t, T t2) {
        zzbbg<FT> zzm = zzbbdVar.zzm(t2);
        if (zzm.isEmpty()) {
            return;
        }
        zzbbdVar.zzn(t).zza(zzm);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void zza(zzbcp zzbcpVar, T t, T t2, long j) {
        zzbek.zza(t, j, zzbcpVar.zzb(zzbek.zzp(t, j), zzbek.zzp(t2, j)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void zza(zzbee<UT, UB> zzbeeVar, T t, T t2) {
        zzbeeVar.zze(t, zzbeeVar.zzg(zzbeeVar.zzac(t), zzbeeVar.zzac(t2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzaf(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbci) {
            zzbci zzbciVar = (zzbci) list;
            i = 0;
            while (i2 < size) {
                i += zzbav.zzp(zzbciVar.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzbav.zzp(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zzbee<?, ?> zzafn() {
        return zzdyg;
    }

    public static zzbee<?, ?> zzafo() {
        return zzdyh;
    }

    public static zzbee<?, ?> zzafp() {
        return zzdyi;
    }

    private static Class<?> zzafq() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzafr() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzag(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbci) {
            zzbci zzbciVar = (zzbci) list;
            i = 0;
            while (i2 < size) {
                i += zzbav.zzq(zzbciVar.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzbav.zzq(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzah(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbci) {
            zzbci zzbciVar = (zzbci) list;
            i = 0;
            while (i2 < size) {
                i += zzbav.zzr(zzbciVar.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzbav.zzr(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzai(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbbp) {
            zzbbp zzbbpVar = (zzbbp) list;
            i = 0;
            while (i2 < size) {
                i += zzbav.zzcj(zzbbpVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzbav.zzcj(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzaj(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbbp) {
            zzbbp zzbbpVar = (zzbbp) list;
            i = 0;
            while (i2 < size) {
                i += zzbav.zzce(zzbbpVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzbav.zzce(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzak(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbbp) {
            zzbbp zzbbpVar = (zzbbp) list;
            i = 0;
            while (i2 < size) {
                i += zzbav.zzcf(zzbbpVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzbav.zzcf(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzal(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbbp) {
            zzbbp zzbbpVar = (zzbbp) list;
            i = 0;
            while (i2 < size) {
                i += zzbav.zzcg(zzbbpVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzbav.zzcg(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzam(List<?> list) {
        return list.size() << 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzan(List<?> list) {
        return list.size() << 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzao(List<?> list) {
        return list.size();
    }

    private static zzbee<?, ?> zzas(boolean z) {
        try {
            Class<?> zzafr = zzafr();
            if (zzafr == null) {
                return null;
            }
            return (zzbee) zzafr.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zzb(int i, List<zzbah> list, zzbey zzbeyVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbeyVar.zzb(i, list);
    }

    public static void zzb(int i, List<?> list, zzbey zzbeyVar, zzbdm zzbdmVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbeyVar.zzb(i, list, zzbdmVar);
    }

    public static void zzb(int i, List<Float> list, zzbey zzbeyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbeyVar.zzf(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i, Object obj, zzbdm zzbdmVar) {
        return obj instanceof zzbcb ? zzbav.zza(i, (zzbcb) obj) : zzbav.zzb(i, (zzbcu) obj, zzbdmVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zzcd = zzbav.zzcd(i) * size;
        if (list instanceof zzbcd) {
            zzbcd zzbcdVar = (zzbcd) list;
            while (i2 < size) {
                Object zzcp = zzbcdVar.zzcp(i2);
                zzcd += zzcp instanceof zzbah ? zzbav.zzao((zzbah) zzcp) : zzbav.zzeo((String) zzcp);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                zzcd += obj instanceof zzbah ? zzbav.zzao((zzbah) obj) : zzbav.zzeo((String) obj);
                i2++;
            }
        }
        return zzcd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i, List<?> list, zzbdm zzbdmVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzcd = zzbav.zzcd(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            zzcd += obj instanceof zzbcb ? zzbav.zza((zzbcb) obj) : zzbav.zza((zzbcu) obj, zzbdmVar);
        }
        return zzcd;
    }

    public static void zzc(int i, List<Long> list, zzbey zzbeyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbeyVar.zzc(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i, List<zzbah> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzcd = size * zzbav.zzcd(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzcd += zzbav.zzao(list.get(i2));
        }
        return zzcd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i, List<zzbcu> list, zzbdm zzbdmVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzbav.zzc(i, list.get(i3), zzbdmVar);
        }
        return i2;
    }

    public static void zzd(int i, List<Long> list, zzbey zzbeyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbeyVar.zzd(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzd(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zze(int i, List<Long> list, zzbey zzbeyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbeyVar.zzn(i, list, z);
    }

    public static boolean zze(int i, int i2, int i3) {
        if (i2 < 40) {
            return true;
        }
        long j = i3;
        return ((((long) i2) - ((long) i)) + 1) + 9 <= ((2 * j) + 3) + ((j + 3) * 3);
    }

    public static void zzf(int i, List<Long> list, zzbey zzbeyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbeyVar.zze(i, list, z);
    }

    public static void zzf(Class<?> cls) {
        Class<?> cls2;
        if (!zzbbo.class.isAssignableFrom(cls) && (cls2 = zzdyf) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzg(int i, List<Long> list, zzbey zzbeyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbeyVar.zzl(i, list, z);
    }

    public static void zzh(int i, List<Integer> list, zzbey zzbeyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbeyVar.zza(i, list, z);
    }

    public static void zzi(int i, List<Integer> list, zzbey zzbeyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbeyVar.zzj(i, list, z);
    }

    public static void zzj(int i, List<Integer> list, zzbey zzbeyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbeyVar.zzm(i, list, z);
    }

    public static void zzk(int i, List<Integer> list, zzbey zzbeyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbeyVar.zzb(i, list, z);
    }

    public static void zzl(int i, List<Integer> list, zzbey zzbeyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbeyVar.zzk(i, list, z);
    }

    public static void zzm(int i, List<Integer> list, zzbey zzbeyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbeyVar.zzh(i, list, z);
    }

    public static void zzn(int i, List<Boolean> list, zzbey zzbeyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbeyVar.zzi(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzo(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzaf(list) + (list.size() * zzbav.zzcd(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzp(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzag(list) + (size * zzbav.zzcd(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzq(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzah(list) + (size * zzbav.zzcd(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzr(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzai(list) + (size * zzbav.zzcd(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzs(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzaj(list) + (size * zzbav.zzcd(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzt(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzak(list) + (size * zzbav.zzcd(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzu(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzal(list) + (size * zzbav.zzcd(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzv(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbav.zzt(i, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzw(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbav.zzg(i, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzx(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbav.zzg(i, true);
    }
}
