package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzayf;
import java.security.GeneralSecurityException;
/* loaded from: classes2.dex */
public final class zzaur {
    public static final zzayf zzdht = zzayf.zzaam().zza((zzayf.zza) zzavn.zzdht).zzb(zzaub.zza("TinkAead", "Aead", "AesCtrHmacAeadKey", 0, true)).zzb(zzaub.zza("TinkAead", "Aead", "AesEaxKey", 0, true)).zzb(zzaub.zza("TinkAead", "Aead", "AesGcmKey", 0, true)).zzb(zzaub.zza("TinkAead", "Aead", "ChaCha20Poly1305Key", 0, true)).zzb(zzaub.zza("TinkAead", "Aead", "KmsAeadKey", 0, true)).zzb(zzaub.zza("TinkAead", "Aead", "KmsEnvelopeAeadKey", 0, true)).zzej("TINK_AEAD_1_0_0").zzadi();
    private static final zzayf zzdhu = zzayf.zzaam().zza((zzayf.zza) zzdht).zzej("TINK_AEAD_1_1_0").zzadi();

    static {
        try {
            zzwk();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zzwk() throws GeneralSecurityException {
        zzauo.zza("TinkAead", new zzauq());
        zzavn.zzwk();
    }
}
