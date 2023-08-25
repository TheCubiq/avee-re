package com.daaw;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zp7 implements a87 {

    /* renamed from: a */
    public final tb7 f35389a;

    public zp7(byte[] bArr) {
        this.f35389a = new tb7(bArr);
    }

    @Override // com.daaw.a87
    /* renamed from: a */
    public final byte[] mo1998a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 40) {
            byte[] copyOf = Arrays.copyOf(bArr, 24);
            return this.f35389a.m11445c(ByteBuffer.wrap(bArr, 24, length - 24), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.daaw.a87
    /* renamed from: b */
    public final byte[] mo1997b(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] m6942a = vp7.m6942a(24);
        allocate.put(m6942a);
        this.f35389a.m11446b(allocate, m6942a, bArr, bArr2);
        return allocate.array();
    }
}
