package com.daaw;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;
@ThreadSafe
/* loaded from: classes.dex */
public final class zc7 {
    public static final byte[] g = new byte[0];
    public final yc7 a;
    public final BigInteger b;
    public final byte[] c;
    public final byte[] d;
    public final byte[] e;
    @GuardedBy("this")
    public BigInteger f = BigInteger.ZERO;

    public zc7(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, yc7 yc7Var) {
        this.e = bArr;
        this.c = bArr2;
        this.d = bArr3;
        this.b = bigInteger;
        this.a = yc7Var;
    }

    public static zc7 c(byte[] bArr, byte[] bArr2, cd7 cd7Var, xc7 xc7Var, yc7 yc7Var, byte[] bArr3) {
        byte[] b = ld7.b(cd7Var.zzb(), xc7Var.c(), yc7Var.zzb());
        byte[] bArr4 = ld7.l;
        byte[] bArr5 = g;
        byte[] b2 = qo7.b(ld7.a, xc7Var.e(bArr4, bArr5, "psk_id_hash", b), xc7Var.e(bArr4, bArr3, "info_hash", b));
        byte[] e = xc7Var.e(bArr2, bArr5, "secret", b);
        byte[] d = xc7Var.d(e, b2, "key", b, yc7Var.zza());
        byte[] d2 = xc7Var.d(e, b2, "base_nonce", b, 12);
        BigInteger bigInteger = BigInteger.ONE;
        return new zc7(bArr, d, d2, bigInteger.shiftLeft(96).subtract(bigInteger), yc7Var);
    }

    public final byte[] a() {
        return this.e;
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        return this.a.a(this.c, d(), bArr, bArr2);
    }

    public final synchronized byte[] d() {
        byte[] c;
        byte[] bArr = this.d;
        byte[] byteArray = this.f.toByteArray();
        int length = byteArray.length;
        if (length != 12) {
            if (length > 13) {
                throw new GeneralSecurityException("integer too large");
            }
            if (length != 13) {
                byte[] bArr2 = new byte[12];
                System.arraycopy(byteArray, 0, bArr2, 12 - length, length);
                byteArray = bArr2;
            } else if (byteArray[0] != 0) {
                throw new GeneralSecurityException("integer too large");
            } else {
                byteArray = Arrays.copyOfRange(byteArray, 1, 13);
            }
        }
        c = qo7.c(bArr, byteArray);
        if (this.f.compareTo(this.b) >= 0) {
            throw new GeneralSecurityException("message limit reached");
        }
        this.f = this.f.add(BigInteger.ONE);
        return c;
    }
}
