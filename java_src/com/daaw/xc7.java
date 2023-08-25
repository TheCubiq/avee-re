package com.daaw;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class xc7 {
    public final String a;

    public xc7(String str) {
        this.a = str;
    }

    public final int a() {
        return Mac.getInstance(this.a).getMacLength();
    }

    public final byte[] b(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, byte[] bArr4, int i) {
        return f(g(ld7.e("eae_prk", bArr2, bArr4), null), ld7.f("shared_secret", bArr3, bArr4, i), i);
    }

    public final byte[] c() {
        char c;
        String str = this.a;
        int hashCode = str.hashCode();
        if (hashCode == 984523022) {
            if (str.equals("HmacSha256")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 984524074) {
            if (hashCode == 984525777 && str.equals("HmacSha512")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("HmacSha384")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c == 2) {
                    return ld7.h;
                }
                throw new GeneralSecurityException("Could not determine HPKE KDF ID");
            }
            return ld7.g;
        }
        return ld7.f;
    }

    public final byte[] d(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i) {
        return f(bArr, ld7.f(str, bArr2, bArr3, i), i);
    }

    public final byte[] e(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return g(ld7.e(str, bArr2, bArr3), bArr);
    }

    public final byte[] f(byte[] bArr, byte[] bArr2, int i) {
        Mac mac = (Mac) ep7.f.a(this.a);
        if (i > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        byte[] bArr3 = new byte[i];
        mac.init(new SecretKeySpec(bArr, this.a));
        byte[] bArr4 = new byte[0];
        int i2 = 1;
        int i3 = 0;
        while (true) {
            mac.update(bArr4);
            mac.update(bArr2);
            mac.update((byte) i2);
            bArr4 = mac.doFinal();
            int length = bArr4.length;
            int i4 = i3 + length;
            if (i4 >= i) {
                System.arraycopy(bArr4, 0, bArr3, i3, i - i3);
                return bArr3;
            }
            System.arraycopy(bArr4, 0, bArr3, i3, length);
            i2++;
            i3 = i4;
        }
    }

    public final byte[] g(byte[] bArr, byte[] bArr2) {
        Mac mac = (Mac) ep7.f.a(this.a);
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], this.a));
        } else {
            mac.init(new SecretKeySpec(bArr2, this.a));
        }
        return mac.doFinal(bArr);
    }
}
