package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaxi;
import java.security.GeneralSecurityException;
/* loaded from: classes2.dex */
final class zzauu implements zzaug<zzatz> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzaug
    /* renamed from: zzd */
    public final zzatz zza(zzbah zzbahVar) throws GeneralSecurityException {
        try {
            zzavy zzo = zzavy.zzo(zzbahVar);
            if (zzo instanceof zzavy) {
                zzavy zzavyVar = zzo;
                zzazq.zzj(zzavyVar.getVersion(), 0);
                zzazq.zzbi(zzavyVar.zzwv().size());
                if (zzavyVar.zzxe().zzxb() != 12 && zzavyVar.zzxe().zzxb() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return new zzayi(zzavyVar.zzwv().toByteArray(), zzavyVar.zzxe().zzxb());
            }
            throw new GeneralSecurityException("expected AesEaxKey proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized AesEaxKey proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final int getVersion() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final /* synthetic */ zzatz zza(zzbcu zzbcuVar) throws GeneralSecurityException {
        if (zzbcuVar instanceof zzavy) {
            zzavy zzavyVar = (zzavy) zzbcuVar;
            zzazq.zzj(zzavyVar.getVersion(), 0);
            zzazq.zzbi(zzavyVar.zzwv().size());
            if (zzavyVar.zzxe().zzxb() == 12 || zzavyVar.zzxe().zzxb() == 16) {
                return new zzayi(zzavyVar.zzwv().toByteArray(), zzavyVar.zzxe().zzxb());
            }
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
        throw new GeneralSecurityException("expected AesEaxKey proto");
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzbcu zzb(zzbah zzbahVar) throws GeneralSecurityException {
        try {
            return zzb(zzawa.zzq(zzbahVar));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized AesEaxKeyFormat proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzbcu zzb(zzbcu zzbcuVar) throws GeneralSecurityException {
        if (zzbcuVar instanceof zzawa) {
            zzawa zzawaVar = (zzawa) zzbcuVar;
            zzazq.zzbi(zzawaVar.getKeySize());
            if (zzawaVar.zzxe().zzxb() == 12 || zzawaVar.zzxe().zzxb() == 16) {
                return zzavy.zzxf().zzp(zzbah.zzo(zzazl.zzbh(zzawaVar.getKeySize()))).zzb(zzawaVar.zzxe()).zzan(0).zzadi();
            }
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
        throw new GeneralSecurityException("expected AesEaxKeyFormat proto");
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzaxi zzc(zzbah zzbahVar) throws GeneralSecurityException {
        return zzaxi.zzyz().zzeb("type.googleapis.com/google.crypto.tink.AesEaxKey").zzai(((zzavy) zzb(zzbahVar)).zzaav()).zzb(zzaxi.zzb.SYMMETRIC).zzadi();
    }
}
