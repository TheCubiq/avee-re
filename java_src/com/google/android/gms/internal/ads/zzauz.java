package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaxi;
import java.security.GeneralSecurityException;
/* loaded from: classes2.dex */
final class zzauz implements zzaug<zzatz> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzaug
    /* renamed from: zzd */
    public final zzatz zza(zzbah zzbahVar) throws GeneralSecurityException {
        try {
            zzaxz zzal = zzaxz.zzal(zzbahVar);
            if (zzal instanceof zzaxz) {
                zzaxz zzaxzVar = zzal;
                zzazq.zzj(zzaxzVar.getVersion(), 0);
                String zzaah = zzaxzVar.zzaae().zzaah();
                return new zzauy(zzaxzVar.zzaae().zzaai(), zzauj.zzdx(zzaah).zzdw(zzaah));
            }
            throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized KmSEnvelopeAeadKey proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final int getVersion() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final /* synthetic */ zzatz zza(zzbcu zzbcuVar) throws GeneralSecurityException {
        if (zzbcuVar instanceof zzaxz) {
            zzaxz zzaxzVar = (zzaxz) zzbcuVar;
            zzazq.zzj(zzaxzVar.getVersion(), 0);
            String zzaah = zzaxzVar.zzaae().zzaah();
            return new zzauy(zzaxzVar.zzaae().zzaai(), zzauj.zzdx(zzaah).zzdw(zzaah));
        }
        throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzbcu zzb(zzbah zzbahVar) throws GeneralSecurityException {
        try {
            return zzb(zzayb.zzam(zzbahVar));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized KmsEnvelopeAeadKeyFormat proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzbcu zzb(zzbcu zzbcuVar) throws GeneralSecurityException {
        if (zzbcuVar instanceof zzayb) {
            return zzaxz.zzaaf().zzb((zzayb) zzbcuVar).zzbf(0).zzadi();
        }
        throw new GeneralSecurityException("expected KmsEnvelopeAeadKeyFormat proto");
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzaxi zzc(zzbah zzbahVar) throws GeneralSecurityException {
        return zzaxi.zzyz().zzeb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").zzai(((zzaxz) zzb(zzbahVar)).zzaav()).zzb(zzaxi.zzb.REMOTE).zzadi();
    }
}
