package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
final class zzir extends zziq {
    private zzir() {
        super();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zziq
    public final <L> List<L> zza(Object obj, long j) {
        zzid zzc = zzc(obj, j);
        if (zzc.zza()) {
            return zzc;
        }
        int size = zzc.size();
        zzid zza = zzc.zza(size == 0 ? 10 : size << 1);
        zzkt.zza(obj, j, zza);
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zziq
    public final void zzb(Object obj, long j) {
        zzc(obj, j).i_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.measurement.zzid] */
    @Override // com.google.android.gms.internal.measurement.zziq
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzid<E> zzc = zzc(obj, j);
        zzid<E> zzc2 = zzc(obj2, j);
        int size = zzc.size();
        int size2 = zzc2.size();
        zzid<E> zzidVar = zzc;
        zzidVar = zzc;
        if (size > 0 && size2 > 0) {
            boolean zza = zzc.zza();
            zzid<E> zzidVar2 = zzc;
            if (!zza) {
                zzidVar2 = zzc.zza(size2 + size);
            }
            zzidVar2.addAll(zzc2);
            zzidVar = zzidVar2;
        }
        if (size > 0) {
            zzc2 = zzidVar;
        }
        zzkt.zza(obj, j, zzc2);
    }

    private static <E> zzid<E> zzc(Object obj, long j) {
        return (zzid) zzkt.zzf(obj, j);
    }
}
