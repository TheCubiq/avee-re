package com.daaw;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class bp7 {
    public final ECPublicKey a;

    public bp7(ECPublicKey eCPublicKey) {
        this.a = eCPublicKey;
    }

    public final ap7 a(String str, byte[] bArr, byte[] bArr2, int i, int i2) {
        KeyPair c = cp7.c(this.a.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) c.getPublic();
        byte[] g = cp7.g((ECPrivateKey) c.getPrivate(), this.a);
        byte[] m = cp7.m(eCPublicKey.getParams().getCurve(), i2, eCPublicKey.getW());
        int i3 = 1;
        byte[] b = qo7.b(m, g);
        Mac mac = (Mac) ep7.f.a(str);
        if (i > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr == null || bArr.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr, str));
        }
        byte[] doFinal = mac.doFinal(b);
        byte[] bArr3 = new byte[i];
        mac.init(new SecretKeySpec(doFinal, str));
        byte[] bArr4 = new byte[0];
        int i4 = 0;
        while (true) {
            mac.update(bArr4);
            mac.update(bArr2);
            mac.update((byte) i3);
            bArr4 = mac.doFinal();
            int length = bArr4.length;
            int i5 = i4 + length;
            if (i5 >= i) {
                System.arraycopy(bArr4, 0, bArr3, i4, i - i4);
                return new ap7(m, bArr3);
            }
            System.arraycopy(bArr4, 0, bArr3, i4, length);
            i3++;
            i4 = i5;
        }
    }
}
