package com.daaw;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class ke2 implements le2 {

    /* renamed from: a */
    public final ByteBuffer f16324a;

    public ke2(ByteBuffer byteBuffer) {
        this.f16324a = byteBuffer.slice();
    }

    @Override // com.daaw.le2
    /* renamed from: a */
    public final void mo16049a(MessageDigest[] messageDigestArr, long j, int i) {
        ByteBuffer slice;
        synchronized (this.f16324a) {
            int i2 = (int) j;
            this.f16324a.position(i2);
            this.f16324a.limit(i2 + i);
            slice = this.f16324a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }

    @Override // com.daaw.le2
    public final long zza() {
        return this.f16324a.capacity();
    }
}
