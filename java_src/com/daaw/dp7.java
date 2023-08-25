package com.daaw;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class dp7 implements a87 {

    /* renamed from: a */
    public final pp7 f7604a;

    /* renamed from: b */
    public final g97 f7605b;

    /* renamed from: c */
    public final int f7606c;

    public dp7(pp7 pp7Var, g97 g97Var, int i) {
        this.f7604a = pp7Var;
        this.f7605b = g97Var;
        this.f7606c = i;
    }

    @Override // com.daaw.a87
    /* renamed from: a */
    public final byte[] mo1998a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f7606c;
        if (length >= i) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, length - i);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length - this.f7606c, length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            this.f7605b.mo8888a(copyOfRange2, qo7.m12307b(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
            return this.f7604a.mo13232a(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.daaw.a87
    /* renamed from: b */
    public final byte[] mo1997b(byte[] bArr, byte[] bArr2) {
        byte[] mo13231b = this.f7604a.mo13231b(bArr);
        return qo7.m12307b(mo13231b, this.f7605b.mo8887b(qo7.m12307b(bArr2, mo13231b, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8))));
    }
}
