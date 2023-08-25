package com.daaw;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class g23 extends u13 {
    public MessageDigest c;
    public final int d;
    public final int e;

    public g23(int i) {
        int i2 = i >> 3;
        this.d = (i & 7) > 0 ? i2 + 1 : i2;
        this.e = i;
    }

    @Override // com.daaw.u13
    public final byte[] b(String str) {
        synchronized (this.a) {
            MessageDigest a = a();
            this.c = a;
            if (a == null) {
                return new byte[0];
            }
            a.reset();
            this.c.update(str.getBytes(Charset.forName("UTF-8")));
            byte[] digest = this.c.digest();
            int length = digest.length;
            int i = this.d;
            if (length > i) {
                length = i;
            }
            byte[] bArr = new byte[length];
            System.arraycopy(digest, 0, bArr, 0, length);
            if ((this.e & 7) > 0) {
                long j = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    if (i2 > 0) {
                        j <<= 8;
                    }
                    j += bArr[i2] & 255;
                }
                long j2 = j >>> (8 - (this.e & 7));
                int i3 = this.d;
                while (true) {
                    i3--;
                    if (i3 < 0) {
                        break;
                    }
                    bArr[i3] = (byte) (255 & j2);
                    j2 >>>= 8;
                }
            }
            return bArr;
        }
    }
}
