package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
final class zzbeg extends zzbee<zzbef, zzbef> {
    private static void zza(Object obj, zzbef zzbefVar) {
        ((zzbbo) obj).zzdtt = zzbefVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbee
    public final /* synthetic */ void zza(zzbef zzbefVar, int i, long j) {
        zzbefVar.zzb(i << 3, Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbee
    public final /* synthetic */ void zza(zzbef zzbefVar, int i, zzbah zzbahVar) {
        zzbefVar.zzb((i << 3) | 2, zzbahVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbee
    final /* synthetic */ void zza(zzbef zzbefVar, int i, zzbef zzbefVar2) {
        zzbefVar.zzb((i << 3) | 3, zzbefVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbee
    public final /* synthetic */ void zza(zzbef zzbefVar, zzbey zzbeyVar) throws IOException {
        zzbefVar.zzb(zzbeyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbee
    public final boolean zza(zzbdl zzbdlVar) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbee
    public final /* synthetic */ zzbef zzac(Object obj) {
        return ((zzbbo) obj).zzdtt;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbee
    public final /* synthetic */ zzbef zzad(Object obj) {
        zzbef zzbefVar = ((zzbbo) obj).zzdtt;
        if (zzbefVar == zzbef.zzagc()) {
            zzbef zzagd = zzbef.zzagd();
            zza(obj, zzagd);
            return zzagd;
        }
        return zzbefVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbee
    public final /* synthetic */ int zzae(zzbef zzbefVar) {
        return zzbefVar.zzage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbee
    public final /* synthetic */ zzbef zzagb() {
        return zzbef.zzagd();
    }

    @Override // com.google.android.gms.internal.ads.zzbee
    final /* synthetic */ void zzb(zzbef zzbefVar, int i, long j) {
        zzbefVar.zzb((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzbee
    final /* synthetic */ void zzc(zzbef zzbefVar, int i, int i2) {
        zzbefVar.zzb((i << 3) | 5, Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbee
    public final /* synthetic */ void zzc(zzbef zzbefVar, zzbey zzbeyVar) throws IOException {
        zzbefVar.zza(zzbeyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbee
    public final /* synthetic */ void zze(Object obj, zzbef zzbefVar) {
        zza(obj, zzbefVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbee
    public final /* synthetic */ void zzf(Object obj, zzbef zzbefVar) {
        zza(obj, zzbefVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbee
    public final /* synthetic */ zzbef zzg(zzbef zzbefVar, zzbef zzbefVar2) {
        zzbef zzbefVar3 = zzbefVar;
        zzbef zzbefVar4 = zzbefVar2;
        return zzbefVar4.equals(zzbef.zzagc()) ? zzbefVar3 : zzbef.zza(zzbefVar3, zzbefVar4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbee
    public final void zzo(Object obj) {
        ((zzbbo) obj).zzdtt.zzaaz();
    }

    @Override // com.google.android.gms.internal.ads.zzbee
    final /* synthetic */ zzbef zzv(zzbef zzbefVar) {
        zzbef zzbefVar2 = zzbefVar;
        zzbefVar2.zzaaz();
        return zzbefVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbee
    public final /* synthetic */ int zzy(zzbef zzbefVar) {
        return zzbefVar.zzacw();
    }
}
