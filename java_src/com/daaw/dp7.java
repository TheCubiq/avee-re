package com.daaw;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class dp7 implements a87 {
    public final pp7 a;
    public final g97 b;
    public final int c;

    public dp7(pp7 pp7Var, g97 g97Var, int i) {
        this.a = pp7Var;
        this.b = g97Var;
        this.c = i;
    }

    @Override // com.daaw.a87
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.c;
        if (length >= i) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, length - i);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length - this.c, length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            this.b.a(copyOfRange2, qo7.b(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
            return this.a.a(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.daaw.a87
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] b = this.a.b(bArr);
        return qo7.b(b, this.b.b(qo7.b(bArr2, b, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8))));
    }
}
