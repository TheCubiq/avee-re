package com.daaw;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;
@ThreadSafe
/* loaded from: classes.dex */
public final class zc7 {

    /* renamed from: g */
    public static final byte[] f34946g = new byte[0];

    /* renamed from: a */
    public final yc7 f34947a;

    /* renamed from: b */
    public final BigInteger f34948b;

    /* renamed from: c */
    public final byte[] f34949c;

    /* renamed from: d */
    public final byte[] f34950d;

    /* renamed from: e */
    public final byte[] f34951e;
    @GuardedBy("this")

    /* renamed from: f */
    public BigInteger f34952f = BigInteger.ZERO;

    public zc7(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, yc7 yc7Var) {
        this.f34951e = bArr;
        this.f34949c = bArr2;
        this.f34950d = bArr3;
        this.f34948b = bigInteger;
        this.f34947a = yc7Var;
    }

    /* renamed from: c */
    public static zc7 m2485c(byte[] bArr, byte[] bArr2, cd7 cd7Var, xc7 xc7Var, yc7 yc7Var, byte[] bArr3) {
        byte[] m17038b = ld7.m17038b(cd7Var.zzb(), xc7Var.m5236c(), yc7Var.zzb());
        byte[] bArr4 = ld7.f17303l;
        byte[] bArr5 = f34946g;
        byte[] m12307b = qo7.m12307b(ld7.f17292a, xc7Var.m5234e(bArr4, bArr5, "psk_id_hash", m17038b), xc7Var.m5234e(bArr4, bArr3, "info_hash", m17038b));
        byte[] m5234e = xc7Var.m5234e(bArr2, bArr5, "secret", m17038b);
        byte[] m5235d = xc7Var.m5235d(m5234e, m12307b, "key", m17038b, yc7Var.zza());
        byte[] m5235d2 = xc7Var.m5235d(m5234e, m12307b, "base_nonce", m17038b, 12);
        BigInteger bigInteger = BigInteger.ONE;
        return new zc7(bArr, m5235d, m5235d2, bigInteger.shiftLeft(96).subtract(bigInteger), yc7Var);
    }

    /* renamed from: a */
    public final byte[] m2487a() {
        return this.f34951e;
    }

    /* renamed from: b */
    public final byte[] m2486b(byte[] bArr, byte[] bArr2) {
        return this.f34947a.mo3861a(this.f34949c, m2484d(), bArr, bArr2);
    }

    /* renamed from: d */
    public final synchronized byte[] m2484d() {
        byte[] m12306c;
        byte[] bArr = this.f34950d;
        byte[] byteArray = this.f34952f.toByteArray();
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
        m12306c = qo7.m12306c(bArr, byteArray);
        if (this.f34952f.compareTo(this.f34948b) >= 0) {
            throw new GeneralSecurityException("message limit reached");
        }
        this.f34952f = this.f34952f.add(BigInteger.ONE);
        return m12306c;
    }
}
