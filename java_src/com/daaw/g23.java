package com.daaw;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class g23 extends u13 {

    /* renamed from: c */
    public MessageDigest f10184c;

    /* renamed from: d */
    public final int f10185d;

    /* renamed from: e */
    public final int f10186e;

    public g23(int i) {
        int i2 = i >> 3;
        this.f10185d = (i & 7) > 0 ? i2 + 1 : i2;
        this.f10186e = i;
    }

    @Override // com.daaw.u13
    /* renamed from: b */
    public final byte[] mo8635b(String str) {
        synchronized (this.f28320a) {
            MessageDigest m8636a = m8636a();
            this.f10184c = m8636a;
            if (m8636a == null) {
                return new byte[0];
            }
            m8636a.reset();
            this.f10184c.update(str.getBytes(Charset.forName("UTF-8")));
            byte[] digest = this.f10184c.digest();
            int length = digest.length;
            int i = this.f10185d;
            if (length > i) {
                length = i;
            }
            byte[] bArr = new byte[length];
            System.arraycopy(digest, 0, bArr, 0, length);
            if ((this.f10186e & 7) > 0) {
                long j = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    if (i2 > 0) {
                        j <<= 8;
                    }
                    j += bArr[i2] & 255;
                }
                long j2 = j >>> (8 - (this.f10186e & 7));
                int i3 = this.f10185d;
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
