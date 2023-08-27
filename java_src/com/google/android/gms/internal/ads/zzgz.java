package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import javax.annotation.ParametersAreNonnullByDefault;
import kotlin.UByte;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzgz extends zzgq {
    private MessageDigest zzaje;
    private final int zzajh;
    private final int zzaji;

    public zzgz(int i) {
        int i2 = i / 8;
        this.zzajh = i % 8 > 0 ? i2 + 1 : i2;
        this.zzaji = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final byte[] zzx(String str) {
        synchronized (this.mLock) {
            MessageDigest zzhg = zzhg();
            this.zzaje = zzhg;
            if (zzhg == null) {
                return new byte[0];
            }
            zzhg.reset();
            this.zzaje.update(str.getBytes(Charset.forName("UTF-8")));
            byte[] digest = this.zzaje.digest();
            int length = digest.length > this.zzajh ? this.zzajh : digest.length;
            byte[] bArr = new byte[length];
            System.arraycopy(digest, 0, bArr, 0, length);
            if (this.zzaji % 8 > 0) {
                long j = 0;
                for (int i = 0; i < length; i++) {
                    if (i > 0) {
                        j <<= 8;
                    }
                    j += bArr[i] & UByte.MAX_VALUE;
                }
                long j2 = j >>> (8 - (this.zzaji % 8));
                for (int i2 = this.zzajh - 1; i2 >= 0; i2--) {
                    bArr[i2] = (byte) (255 & j2);
                    j2 >>>= 8;
                }
            }
            return bArr;
        }
    }
}
