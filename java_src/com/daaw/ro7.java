package com.daaw;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class ro7 implements a87 {

    /* renamed from: a */
    public final qb7 f25457a;

    public ro7(byte[] bArr) {
        this.f25457a = new qb7(bArr);
    }

    @Override // com.daaw.a87
    /* renamed from: a */
    public final byte[] mo1998a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 28) {
            byte[] copyOf = Arrays.copyOf(bArr, 12);
            return this.f25457a.m11445c(ByteBuffer.wrap(bArr, 12, length - 12), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.daaw.a87
    /* renamed from: b */
    public final byte[] mo1997b(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] m6942a = vp7.m6942a(12);
        allocate.put(m6942a);
        this.f25457a.m11446b(allocate, m6942a, bArr, bArr2);
        return allocate.array();
    }
}
