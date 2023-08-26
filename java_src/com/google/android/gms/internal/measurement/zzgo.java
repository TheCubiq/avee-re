package com.google.android.gms.internal.measurement;

import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
final class zzgo implements Comparator<zzgm> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzgm zzgmVar, zzgm zzgmVar2) {
        int zzb;
        int zzb2;
        zzgm zzgmVar3 = zzgmVar;
        zzgm zzgmVar4 = zzgmVar2;
        zzgv zzgvVar = (zzgv) zzgmVar3.iterator();
        zzgv zzgvVar2 = (zzgv) zzgmVar4.iterator();
        while (zzgvVar.hasNext() && zzgvVar2.hasNext()) {
            zzb = zzgm.zzb(zzgvVar.zza());
            zzb2 = zzgm.zzb(zzgvVar2.zza());
            int compare = C$r8$backportedMethods$utility$Integer$2$compare.compare(zzb, zzb2);
            if (compare != 0) {
                return compare;
            }
        }
        return C$r8$backportedMethods$utility$Integer$2$compare.compare(zzgmVar3.zza(), zzgmVar4.zza());
    }
}
