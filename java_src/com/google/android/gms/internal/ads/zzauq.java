package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* loaded from: classes2.dex */
final class zzauq implements zzaua<zzatz> {
    @Override // com.google.android.gms.internal.ads.zzaua
    public final zzaug<zzatz> zzb(String str, String str2, int i) throws GeneralSecurityException {
        zzaug<zzatz> zzausVar;
        String lowerCase = str2.toLowerCase();
        char c = 65535;
        if (((lowerCase.hashCode() == 2989895 && lowerCase.equals("aead")) ? (char) 0 : (char) 65535) == 0) {
            switch (str.hashCode()) {
                case 360753376:
                    if (str.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1215885937:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1469984853:
                    if (str.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1797113348:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1855890991:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2079211877:
                    if (str.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                zzausVar = new zzaus();
            } else if (c == 1) {
                zzausVar = new zzauu();
            } else if (c == 2) {
                zzausVar = new zzauv();
            } else if (c == 3) {
                zzausVar = new zzauw();
            } else if (c == 4) {
                zzausVar = new zzaux();
            } else if (c != 5) {
                throw new GeneralSecurityException(String.format("No support for primitive 'Aead' with key type '%s'.", str));
            } else {
                zzausVar = new zzauz();
            }
            if (zzausVar.getVersion() >= i) {
                return zzausVar;
            }
            throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", str, Integer.valueOf(i)));
        }
        throw new GeneralSecurityException(String.format("No support for primitive '%s'.", str2));
    }
}
