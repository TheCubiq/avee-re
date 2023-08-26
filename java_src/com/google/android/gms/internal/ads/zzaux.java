package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaxi;
import java.security.GeneralSecurityException;
/* loaded from: classes2.dex */
final class zzaux implements zzaug<zzatz> {
    private static zzatz zzc(zzbcu zzbcuVar) throws GeneralSecurityException {
        if (zzbcuVar instanceof zzaxv) {
            zzaxv zzaxvVar = (zzaxv) zzbcuVar;
            zzazq.zzj(zzaxvVar.getVersion(), 0);
            String zzaab = zzaxvVar.zzzy().zzaab();
            return zzauj.zzdx(zzaab).zzdw(zzaab);
        }
        throw new GeneralSecurityException("expected KmsAeadKey proto");
    }

    private static zzatz zzd(zzbah zzbahVar) throws GeneralSecurityException {
        try {
            return zzc(zzaxv.zzaj(zzbahVar));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected KmsAeadKey proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final int getVersion() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final /* synthetic */ zzatz zza(zzbah zzbahVar) throws GeneralSecurityException {
        return zzd(zzbahVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final /* synthetic */ zzatz zza(zzbcu zzbcuVar) throws GeneralSecurityException {
        return zzc(zzbcuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzbcu zzb(zzbah zzbahVar) throws GeneralSecurityException {
        try {
            return zzb(zzaxx.zzak(zzbahVar));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized KmsAeadKeyFormat proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzbcu zzb(zzbcu zzbcuVar) throws GeneralSecurityException {
        if (zzbcuVar instanceof zzaxx) {
            return zzaxv.zzzz().zzb((zzaxx) zzbcuVar).zzbe(0).zzadi();
        }
        throw new GeneralSecurityException("expected KmsAeadKeyFormat proto");
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzaxi zzc(zzbah zzbahVar) throws GeneralSecurityException {
        return zzaxi.zzyz().zzeb("type.googleapis.com/google.crypto.tink.KmsAeadKey").zzai(((zzaxv) zzb(zzbahVar)).zzaav()).zzb(zzaxi.zzb.REMOTE).zzadi();
    }
}
