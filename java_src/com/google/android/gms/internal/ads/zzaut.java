package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaxi;
import java.security.GeneralSecurityException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaut implements zzaug<zzazi> {
    private static void zza(zzavw zzavwVar) throws GeneralSecurityException {
        if (zzavwVar.zzxb() < 12 || zzavwVar.zzxb() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzaug
    /* renamed from: zze */
    public final zzayh zza(zzbah zzbahVar) throws GeneralSecurityException {
        try {
            zzavs zzl = zzavs.zzl(zzbahVar);
            if (zzl instanceof zzavs) {
                zzavs zzavsVar = zzl;
                zzazq.zzj(zzavsVar.getVersion(), 0);
                zzazq.zzbi(zzavsVar.zzwv().size());
                zza(zzavsVar.zzwu());
                return new zzayh(zzavsVar.zzwv().toByteArray(), zzavsVar.zzwu().zzxb());
            }
            throw new GeneralSecurityException("expected AesCtrKey proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized AesCtrKey proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final int getVersion() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final /* synthetic */ zzazi zza(zzbcu zzbcuVar) throws GeneralSecurityException {
        if (zzbcuVar instanceof zzavs) {
            zzavs zzavsVar = (zzavs) zzbcuVar;
            zzazq.zzj(zzavsVar.getVersion(), 0);
            zzazq.zzbi(zzavsVar.zzwv().size());
            zza(zzavsVar.zzwu());
            return new zzayh(zzavsVar.zzwv().toByteArray(), zzavsVar.zzwu().zzxb());
        }
        throw new GeneralSecurityException("expected AesCtrKey proto");
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzbcu zzb(zzbah zzbahVar) throws GeneralSecurityException {
        try {
            return zzb(zzavu.zzn(zzbahVar));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized AesCtrKeyFormat proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzbcu zzb(zzbcu zzbcuVar) throws GeneralSecurityException {
        if (zzbcuVar instanceof zzavu) {
            zzavu zzavuVar = (zzavu) zzbcuVar;
            zzazq.zzbi(zzavuVar.getKeySize());
            zza(zzavuVar.zzwu());
            return zzavs.zzww().zzc(zzavuVar.zzwu()).zzm(zzbah.zzo(zzazl.zzbh(zzavuVar.getKeySize()))).zzam(0).zzadi();
        }
        throw new GeneralSecurityException("expected AesCtrKeyFormat proto");
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzaxi zzc(zzbah zzbahVar) throws GeneralSecurityException {
        return zzaxi.zzyz().zzeb("type.googleapis.com/google.crypto.tink.AesCtrKey").zzai(((zzavs) zzb(zzbahVar)).zzaav()).zzb(zzaxi.zzb.SYMMETRIC).zzadi();
    }
}
