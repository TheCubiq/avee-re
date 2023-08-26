package com.google.android.gms.internal.measurement;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
final class zzkp extends zzkn<zzkq, zzkq> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkn
    public final boolean zza(zzjw zzjwVar) {
        return false;
    }

    /* renamed from: zza  reason: avoid collision after fix types in other method */
    private static void zza2(Object obj, zzkq zzkqVar) {
        ((zzhv) obj).zzb = zzkqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkn
    public final void zzd(Object obj) {
        ((zzhv) obj).zzb.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkn
    public final /* synthetic */ int zzf(zzkq zzkqVar) {
        return zzkqVar.zze();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkn
    public final /* synthetic */ int zze(zzkq zzkqVar) {
        return zzkqVar.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkn
    public final /* synthetic */ zzkq zzc(zzkq zzkqVar, zzkq zzkqVar2) {
        zzkq zzkqVar3 = zzkqVar;
        zzkq zzkqVar4 = zzkqVar2;
        return zzkqVar4.equals(zzkq.zza()) ? zzkqVar3 : zzkq.zza(zzkqVar3, zzkqVar4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkn
    public final /* synthetic */ void zzb(zzkq zzkqVar, zzlk zzlkVar) throws IOException {
        zzkqVar.zza(zzlkVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkn
    public final /* synthetic */ void zza(zzkq zzkqVar, zzlk zzlkVar) throws IOException {
        zzkqVar.zzb(zzlkVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkn
    public final /* synthetic */ void zzb(Object obj, zzkq zzkqVar) {
        zza2(obj, zzkqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkn
    public final /* synthetic */ zzkq zzc(Object obj) {
        zzkq zzkqVar = ((zzhv) obj).zzb;
        if (zzkqVar == zzkq.zza()) {
            zzkq zzb = zzkq.zzb();
            zza2(obj, zzb);
            return zzb;
        }
        return zzkqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkn
    public final /* synthetic */ zzkq zzb(Object obj) {
        return ((zzhv) obj).zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkn
    public final /* bridge */ /* synthetic */ void zza(Object obj, zzkq zzkqVar) {
        zza2(obj, zzkqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzkn
    final /* synthetic */ zzkq zza(zzkq zzkqVar) {
        zzkq zzkqVar2 = zzkqVar;
        zzkqVar2.zzc();
        return zzkqVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkn
    public final /* synthetic */ zzkq zza() {
        return zzkq.zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzkn
    final /* synthetic */ void zza(zzkq zzkqVar, int i, zzkq zzkqVar2) {
        zzkqVar.zza((i << 3) | 3, zzkqVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkn
    public final /* synthetic */ void zza(zzkq zzkqVar, int i, zzgm zzgmVar) {
        zzkqVar.zza((i << 3) | 2, zzgmVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzkn
    final /* synthetic */ void zzb(zzkq zzkqVar, int i, long j) {
        zzkqVar.zza((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.measurement.zzkn
    final /* synthetic */ void zza(zzkq zzkqVar, int i, int i2) {
        zzkqVar.zza((i << 3) | 5, Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkn
    public final /* synthetic */ void zza(zzkq zzkqVar, int i, long j) {
        zzkqVar.zza(i << 3, Long.valueOf(j));
    }
}
