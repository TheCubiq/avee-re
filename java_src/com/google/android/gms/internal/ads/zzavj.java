package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzavs;
import com.google.android.gms.internal.ads.zzawe;
import com.google.android.gms.internal.ads.zzaxc;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* loaded from: classes2.dex */
final class zzavj implements zzayn {
    private final String zzdic;
    private final int zzdid;
    private zzawe zzdie;
    private zzavo zzdif;
    private int zzdig;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzavj(zzaxn zzaxnVar) throws GeneralSecurityException {
        String zzyw = zzaxnVar.zzyw();
        this.zzdic = zzyw;
        if (zzyw.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzawg zzt = zzawg.zzt(zzaxnVar.zzyx());
                this.zzdie = (zzawe) zzauo.zzb(zzaxnVar);
                this.zzdid = zzt.getKeySize();
            } catch (zzbbu e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (!this.zzdic.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            String valueOf = String.valueOf(this.zzdic);
            throw new GeneralSecurityException(valueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(valueOf) : new String("unsupported AEAD DEM key type: "));
        } else {
            try {
                zzavq zzj = zzavq.zzj(zzaxnVar.zzyx());
                this.zzdif = (zzavo) zzauo.zzb(zzaxnVar);
                this.zzdig = zzj.zzwr().getKeySize();
                this.zzdid = this.zzdig + zzj.zzws().getKeySize();
            } catch (zzbbu e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayn
    public final zzatz zzi(byte[] bArr) throws GeneralSecurityException {
        zzavo zzadi;
        if (bArr.length == this.zzdid) {
            if (this.zzdic.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                zzadi = zzawe.zzxk().zza((zzawe.zza) this.zzdie).zzs(zzbah.zzc(bArr, 0, this.zzdid)).zzadi();
            } else if (!this.zzdic.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                throw new GeneralSecurityException("unknown DEM key type");
            } else {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.zzdig);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.zzdig, this.zzdid);
                zzadi = zzavo.zzwp().zzal(this.zzdif.getVersion()).zzb(zzavs.zzww().zza((zzavs.zza) this.zzdif.zzwn()).zzm(zzbah.zzo(copyOfRange)).zzadi()).zzb(zzaxc.zzyn().zza((zzaxc.zza) this.zzdif.zzwo()).zzaf(zzbah.zzo(copyOfRange2)).zzadi()).zzadi();
            }
            return (zzatz) zzauo.zzb(this.zzdic, zzadi);
        }
        throw new GeneralSecurityException("Symmetric key has incorrect length");
    }

    @Override // com.google.android.gms.internal.ads.zzayn
    public final int zzwm() {
        return this.zzdid;
    }
}
