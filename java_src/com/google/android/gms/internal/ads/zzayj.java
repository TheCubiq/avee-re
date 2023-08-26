package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes2.dex */
public final class zzayj implements zzatz {
    private final SecretKey zzdna;

    public zzayj(byte[] bArr) {
        this.zzdna = new SecretKeySpec(bArr, "AES");
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[bArr.length + 12 + 16];
            byte[] zzbh = zzazl.zzbh(12);
            System.arraycopy(zzbh, 0, bArr3, 0, 12);
            Cipher zzek = zzayy.zzdnz.zzek("AES/GCM/NoPadding");
            zzek.init(1, this.zzdna, new GCMParameterSpec(128, zzbh));
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            zzek.updateAAD(bArr2);
            zzek.doFinal(bArr, 0, bArr.length, bArr3, 12);
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
