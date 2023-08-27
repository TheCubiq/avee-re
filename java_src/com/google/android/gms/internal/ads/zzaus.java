package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaxi;
import java.security.GeneralSecurityException;
import java.util.logging.Logger;
/* loaded from: classes2.dex */
class zzaus implements zzaug<zzatz> {
    private static final Logger logger = Logger.getLogger(zzaus.class.getName());

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaus() throws GeneralSecurityException {
        zzauo.zza("type.googleapis.com/google.crypto.tink.AesCtrKey", new zzaut());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzaug
    /* renamed from: zzd */
    public final zzatz zza(zzbah zzbahVar) throws GeneralSecurityException {
        try {
            zzavo zzi = zzavo.zzi(zzbahVar);
            if (zzi instanceof zzavo) {
                zzavo zzavoVar = zzi;
                zzazq.zzj(zzavoVar.getVersion(), 0);
                return new zzayx((zzazi) zzauo.zzb("type.googleapis.com/google.crypto.tink.AesCtrKey", zzavoVar.zzwn()), (zzauk) zzauo.zzb("type.googleapis.com/google.crypto.tink.HmacKey", zzavoVar.zzwo()), zzavoVar.zzwo().zzym().zzyt());
            }
            throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKey proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final int getVersion() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final /* synthetic */ zzatz zza(zzbcu zzbcuVar) throws GeneralSecurityException {
        if (zzbcuVar instanceof zzavo) {
            zzavo zzavoVar = (zzavo) zzbcuVar;
            zzazq.zzj(zzavoVar.getVersion(), 0);
            return new zzayx((zzazi) zzauo.zzb("type.googleapis.com/google.crypto.tink.AesCtrKey", zzavoVar.zzwn()), (zzauk) zzauo.zzb("type.googleapis.com/google.crypto.tink.HmacKey", zzavoVar.zzwo()), zzavoVar.zzwo().zzym().zzyt());
        }
        throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzbcu zzb(zzbah zzbahVar) throws GeneralSecurityException {
        try {
            return zzb(zzavq.zzj(zzbahVar));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKeyFormat proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzbcu zzb(zzbcu zzbcuVar) throws GeneralSecurityException {
        if (zzbcuVar instanceof zzavq) {
            zzavq zzavqVar = (zzavq) zzbcuVar;
            return zzavo.zzwp().zzb((zzavs) zzauo.zza("type.googleapis.com/google.crypto.tink.AesCtrKey", zzavqVar.zzwr())).zzb((zzaxc) zzauo.zza("type.googleapis.com/google.crypto.tink.HmacKey", zzavqVar.zzws())).zzal(0).zzadi();
        }
        throw new GeneralSecurityException("expected AesCtrHmacAeadKeyFormat proto");
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzaxi zzc(zzbah zzbahVar) throws GeneralSecurityException {
        return zzaxi.zzyz().zzeb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").zzai(((zzavo) zzb(zzbahVar)).zzaav()).zzb(zzaxi.zzb.SYMMETRIC).zzadi();
    }
}
