package com.daaw;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* loaded from: classes.dex */
public abstract class mb7 {

    /* renamed from: a */
    public int[] f18772a;

    /* renamed from: b */
    public final int f18773b;

    public mb7(byte[] bArr, int i) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f18772a = ib7.m19982d(bArr);
        this.f18773b = i;
    }

    /* renamed from: a */
    public abstract int mo10469a();

    /* renamed from: b */
    public abstract int[] mo10468b(int[] iArr, int i);

    /* renamed from: c */
    public final ByteBuffer m16113c(byte[] bArr, int i) {
        int[] mo10468b = mo10468b(ib7.m19982d(bArr), i);
        int[] iArr = (int[]) mo10468b.clone();
        ib7.m19983c(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            mo10468b[i2] = mo10468b[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(mo10468b, 0, 16);
        return order;
    }

    /* renamed from: d */
    public final void m16112d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        m16110f(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
    }

    /* renamed from: e */
    public final byte[] m16111e(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        m16110f(bArr, allocate, byteBuffer);
        return allocate.array();
    }

    /* renamed from: f */
    public final void m16110f(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length != mo10469a()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + mo10469a());
        }
        int remaining = byteBuffer2.remaining();
        int i = (remaining / 64) + 1;
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer m16113c = m16113c(bArr, this.f18773b + i2);
            if (i2 == i - 1) {
                qo7.m12308a(byteBuffer, byteBuffer2, m16113c, remaining % 64);
            } else {
                qo7.m12308a(byteBuffer, byteBuffer2, m16113c, 64);
            }
        }
    }
}
