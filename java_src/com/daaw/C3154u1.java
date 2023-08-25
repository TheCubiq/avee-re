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
/* renamed from: com.daaw.u1 */
/* loaded from: classes.dex */
public final class C3154u1 implements InterfaceC2200mp {

    /* renamed from: a */
    public final InterfaceC2200mp f28314a;

    /* renamed from: b */
    public final byte[] f28315b;

    /* renamed from: c */
    public final byte[] f28316c;

    /* renamed from: d */
    public CipherInputStream f28317d;

    public C3154u1(InterfaceC2200mp interfaceC2200mp, byte[] bArr, byte[] bArr2) {
        this.f28314a = interfaceC2200mp;
        this.f28315b = bArr;
        this.f28316c = bArr2;
    }

    @Override // com.daaw.InterfaceC2200mp
    /* renamed from: b */
    public int mo8642b(byte[] bArr, int i, int i2) {
        C2914s6.m10685f(this.f28317d != null);
        int read = this.f28317d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    @Override // com.daaw.InterfaceC2200mp
    /* renamed from: c */
    public long mo8641c(C2570pp c2570pp) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f28315b, "AES"), new IvParameterSpec(this.f28316c));
                C2464op c2464op = new C2464op(this.f28314a, c2570pp);
                this.f28317d = new CipherInputStream(c2464op, cipher);
                c2464op.m14113q();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.daaw.InterfaceC2200mp
    public void close() {
        if (this.f28317d != null) {
            this.f28317d = null;
            this.f28314a.close();
        }
    }

    @Override // com.daaw.InterfaceC2200mp
    /* renamed from: d */
    public Uri mo8640d() {
        return this.f28314a.mo8640d();
    }
}
