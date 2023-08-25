package com.daaw;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class bb7 implements a87 {
    public static final byte[] c = new byte[0];
    public final vm7 a;
    public final a87 b;

    public bb7(vm7 vm7Var, a87 a87Var) {
        this.a = vm7Var;
        this.b = a87Var;
    }

    @Override // com.daaw.a87
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((a87) w97.i(this.a.Q(), this.b.a(bArr3, c), a87.class)).a(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    @Override // com.daaw.a87
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] a = w97.d(this.a).a();
        byte[] b = this.b.b(a, c);
        byte[] b2 = ((a87) w97.i(this.a.Q(), a, a87.class)).b(bArr, bArr2);
        int length = b.length;
        return ByteBuffer.allocate(length + 4 + b2.length).putInt(length).put(b).put(b2).array();
    }
}
