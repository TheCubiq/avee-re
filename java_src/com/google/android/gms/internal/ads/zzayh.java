package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes2.dex */
public final class zzayh implements zzazi {
    private final SecretKeySpec zzdmu;
    private final int zzdmv;
    private final int zzdmw;

    public zzayh(byte[] bArr, int i) throws GeneralSecurityException {
        this.zzdmu = new SecretKeySpec(bArr, "AES");
        int blockSize = zzayy.zzdnz.zzek("AES/CTR/NoPadding").getBlockSize();
        this.zzdmw = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.zzdmv = i;
    }

    @Override // com.google.android.gms.internal.ads.zzazi
    public final byte[] zzk(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.zzdmv;
        if (length > Integer.MAX_VALUE - i) {
            StringBuilder sb = new StringBuilder(43);
            sb.append("plaintext length can not exceed ");
            sb.append(Integer.MAX_VALUE - this.zzdmv);
            throw new GeneralSecurityException(sb.toString());
        }
        byte[] bArr2 = new byte[bArr.length + i];
        byte[] zzbh = zzazl.zzbh(i);
        System.arraycopy(zzbh, 0, bArr2, 0, this.zzdmv);
        int length2 = bArr.length;
        int i2 = this.zzdmv;
        Cipher zzek = zzayy.zzdnz.zzek("AES/CTR/NoPadding");
        byte[] bArr3 = new byte[this.zzdmw];
        System.arraycopy(zzbh, 0, bArr3, 0, this.zzdmv);
        zzek.init(1, this.zzdmu, new IvParameterSpec(bArr3));
        if (zzek.doFinal(bArr, 0, length2, bArr2, i2) == length2) {
            return bArr2;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
