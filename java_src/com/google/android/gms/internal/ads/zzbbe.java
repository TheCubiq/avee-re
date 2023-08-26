package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
import java.io.IOException;
import java.util.Map;
/* loaded from: classes2.dex */
final class zzbbe extends zzbbd<Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbbd
    public final int zza(Map.Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbbd
    public final Object zza(zzbbb zzbbbVar, zzbcu zzbcuVar, int i) {
        return zzbbbVar.zza(zzbcuVar, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbbd
    public final <UT, UB> UB zza(zzbdl zzbdlVar, Object obj, zzbbb zzbbbVar, zzbbg<Object> zzbbgVar, UB ub, zzbee<UT, UB> zzbeeVar) throws IOException {
        throw new NoSuchMethodError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbbd
    public final void zza(zzbah zzbahVar, Object obj, zzbbb zzbbbVar, zzbbg<Object> zzbbgVar) throws IOException {
        throw new NoSuchMethodError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbbd
    public final void zza(zzbdl zzbdlVar, Object obj, zzbbb zzbbbVar, zzbbg<Object> zzbbgVar) throws IOException {
        throw new NoSuchMethodError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbbd
    public final void zza(zzbey zzbeyVar, Map.Entry<?, ?> entry) throws IOException {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbbd
    public final void zza(Object obj, zzbbg<Object> zzbbgVar) {
        ((zzbbo.zzc) obj).zzdtz = zzbbgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbbd
    public final boolean zzh(zzbcu zzbcuVar) {
        return zzbcuVar instanceof zzbbo.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbbd
    public final zzbbg<Object> zzm(Object obj) {
        return ((zzbbo.zzc) obj).zzdtz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbbd
    public final zzbbg<Object> zzn(Object obj) {
        zzbbg<Object> zzm = zzm(obj);
        if (zzm.isImmutable()) {
            zzbbg<Object> zzbbgVar = (zzbbg) zzm.clone();
            zza(obj, zzbbgVar);
            return zzbbgVar;
        }
        return zzm;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbbd
    public final void zzo(Object obj) {
        zzm(obj).zzaaz();
    }
}
