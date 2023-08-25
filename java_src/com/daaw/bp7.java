package com.daaw;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class bp7 {

    /* renamed from: a */
    public final ECPublicKey f5035a;

    public bp7(ECPublicKey eCPublicKey) {
        this.f5035a = eCPublicKey;
    }

    /* renamed from: a */
    public final ap7 m25925a(String str, byte[] bArr, byte[] bArr2, int i, int i2) {
        KeyPair m25140c = cp7.m25140c(this.f5035a.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) m25140c.getPublic();
        byte[] m25136g = cp7.m25136g((ECPrivateKey) m25140c.getPrivate(), this.f5035a);
        byte[] m25130m = cp7.m25130m(eCPublicKey.getParams().getCurve(), i2, eCPublicKey.getW());
        int i3 = 1;
        byte[] m12307b = qo7.m12307b(m25130m, m25136g);
        Mac mac = (Mac) ep7.f8659f.m23314a(str);
        if (i > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr == null || bArr.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr, str));
        }
        byte[] doFinal = mac.doFinal(m12307b);
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
                return new ap7(m25130m, bArr3);
            }
            System.arraycopy(bArr4, 0, bArr3, i4, length);
            i3++;
            i4 = i5;
        }
    }
}
