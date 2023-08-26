package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaxi;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
/* loaded from: classes2.dex */
final class zzava implements zzaug<zzaue> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzaug
    /* renamed from: zzf */
    public final zzaue zza(zzbah zzbahVar) throws GeneralSecurityException {
        try {
            zzaws zzx = zzaws.zzx(zzbahVar);
            if (zzx instanceof zzaws) {
                zzaws zzawsVar = zzx;
                zzazq.zzj(zzawsVar.getVersion(), 0);
                zzavh.zza(zzawsVar.zzxz().zzxs());
                zzawq zzxs = zzawsVar.zzxz().zzxs();
                zzaww zzxu = zzxs.zzxu();
                zzayv zza = zzavh.zza(zzxu.zzyh());
                byte[] byteArray = zzawsVar.zzwv().toByteArray();
                return new zzayo((ECPrivateKey) zzayy.zzdof.zzek("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, byteArray), zzayt.zza(zza))), zzxu.zzyj().toByteArray(), zzavh.zza(zzxu.zzyi()), zzavh.zza(zzxs.zzxw()), new zzavj(zzxs.zzxv().zzxp()));
            }
            throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPrivateKey proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final int getVersion() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final /* synthetic */ zzaue zza(zzbcu zzbcuVar) throws GeneralSecurityException {
        if (zzbcuVar instanceof zzaws) {
            zzaws zzawsVar = (zzaws) zzbcuVar;
            zzazq.zzj(zzawsVar.getVersion(), 0);
            zzavh.zza(zzawsVar.zzxz().zzxs());
            zzawq zzxs = zzawsVar.zzxz().zzxs();
            zzaww zzxu = zzxs.zzxu();
            zzayv zza = zzavh.zza(zzxu.zzyh());
            byte[] byteArray = zzawsVar.zzwv().toByteArray();
            return new zzayo((ECPrivateKey) zzayy.zzdof.zzek("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, byteArray), zzayt.zza(zza))), zzxu.zzyj().toByteArray(), zzavh.zza(zzxu.zzyi()), zzavh.zza(zzxs.zzxw()), new zzavj(zzxs.zzxv().zzxp()));
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzbcu zzb(zzbah zzbahVar) throws GeneralSecurityException {
        try {
            return zzb(zzawo.zzw(zzbahVar));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("invalid EciesAeadHkdf key format", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzbcu zzb(zzbcu zzbcuVar) throws GeneralSecurityException {
        if (zzbcuVar instanceof zzawo) {
            zzawo zzawoVar = (zzawo) zzbcuVar;
            zzavh.zza(zzawoVar.zzxs());
            KeyPair zza = zzayt.zza(zzayt.zza(zzavh.zza(zzawoVar.zzxs().zzxu().zzyh())));
            ECPoint w = ((ECPublicKey) zza.getPublic()).getW();
            return zzaws.zzya().zzar(0).zzb(zzawu.zzye().zzas(0).zzc(zzawoVar.zzxs()).zzac(zzbah.zzo(w.getAffineX().toByteArray())).zzad(zzbah.zzo(w.getAffineY().toByteArray())).zzadi()).zzy(zzbah.zzo(((ECPrivateKey) zza.getPrivate()).getS().toByteArray())).zzadi();
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfKeyFormat proto");
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final zzaxi zzc(zzbah zzbahVar) throws GeneralSecurityException {
        return zzaxi.zzyz().zzeb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").zzai(((zzaws) zzb(zzbahVar)).zzaav()).zzb(zzaxi.zzb.ASYMMETRIC_PRIVATE).zzadi();
    }
}
