package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
final class zzbcg extends zzbce {
    private static final Class<?> zzdvs = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzbcg() {
        super();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> zza(Object obj, long j, int i) {
        zzbcc zzbccVar;
        List<L> zzc = zzc(obj, j);
        if (zzc.isEmpty()) {
            List<L> zzbccVar2 = zzc instanceof zzbcd ? new zzbcc(i) : new ArrayList<>(i);
            zzbek.zza(obj, j, zzbccVar2);
            return zzbccVar2;
        }
        if (zzdvs.isAssignableFrom(zzc.getClass())) {
            ArrayList arrayList = new ArrayList(zzc.size() + i);
            arrayList.addAll(zzc);
            zzbccVar = arrayList;
        } else if (!(zzc instanceof zzbeh)) {
            return zzc;
        } else {
            zzbcc zzbccVar3 = new zzbcc(zzc.size() + i);
            zzbccVar3.addAll((zzbeh) zzc);
            zzbccVar = zzbccVar3;
        }
        zzbek.zza(obj, j, zzbccVar);
        return zzbccVar;
    }

    private static <E> List<E> zzc(Object obj, long j) {
        return (List) zzbek.zzp(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbce
    public final <L> List<L> zza(Object obj, long j) {
        return zza(obj, j, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbce
    public final <E> void zza(Object obj, Object obj2, long j) {
        List zzc = zzc(obj2, j);
        List zza = zza(obj, j, zzc.size());
        int size = zza.size();
        int size2 = zzc.size();
        if (size > 0 && size2 > 0) {
            zza.addAll(zzc);
        }
        if (size > 0) {
            zzc = zza;
        }
        zzbek.zza(obj, j, zzc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbce
    public final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzbek.zzp(obj, j);
        if (list instanceof zzbcd) {
            unmodifiableList = ((zzbcd) list).zzadx();
        } else if (zzdvs.isAssignableFrom(list.getClass())) {
            return;
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzbek.zza(obj, j, unmodifiableList);
    }
}
