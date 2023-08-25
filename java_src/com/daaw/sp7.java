package com.daaw;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
/* loaded from: classes.dex */
public final class sp7 implements wh7 {
    public final ThreadLocal a;
    public final String b;
    public final Key c;
    public final int d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public sp7(String str, Key key) {
        char c;
        int i;
        rp7 rp7Var = new rp7(this);
        this.a = rp7Var;
        if (!xb7.a(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.b = str;
        this.c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 392315023:
                if (str.equals("HMACSHA224")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            i = 20;
        } else if (c == 1) {
            i = 28;
        } else if (c == 2) {
            i = 32;
        } else if (c == 3) {
            i = 48;
        } else if (c != 4) {
            throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        } else {
            i = 64;
        }
        this.d = i;
        rp7Var.get();
    }

    @Override // com.daaw.wh7
    public final byte[] a(byte[] bArr, int i) {
        if (i <= this.d) {
            ((Mac) this.a.get()).update(bArr);
            return Arrays.copyOf(((Mac) this.a.get()).doFinal(), i);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
