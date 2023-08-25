package com.daaw;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zp7 implements a87 {
    public final tb7 a;

    public zp7(byte[] bArr) {
        this.a = new tb7(bArr);
    }

    @Override // com.daaw.a87
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 40) {
            byte[] copyOf = Arrays.copyOf(bArr, 24);
            return this.a.c(ByteBuffer.wrap(bArr, 24, length - 24), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.daaw.a87
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] a = vp7.a(24);
        allocate.put(a);
        this.a.b(allocate, a, bArr, bArr2);
        return allocate.array();
    }
}
