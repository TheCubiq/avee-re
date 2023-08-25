package com.daaw;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class u1 implements mp {
    public final mp a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream d;

    public u1(mp mpVar, byte[] bArr, byte[] bArr2) {
        this.a = mpVar;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // com.daaw.mp
    public int b(byte[] bArr, int i, int i2) {
        s6.f(this.d != null);
        int read = this.d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    @Override // com.daaw.mp
    public long c(pp ppVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                op opVar = new op(this.a, ppVar);
                this.d = new CipherInputStream(opVar, cipher);
                opVar.q();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.daaw.mp
    public void close() {
        if (this.d != null) {
            this.d = null;
            this.a.close();
        }
    }

    @Override // com.daaw.mp
    public Uri d() {
        return this.a.d();
    }
}
