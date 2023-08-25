package com.daaw;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class ke2 implements le2 {
    public final ByteBuffer a;

    public ke2(ByteBuffer byteBuffer) {
        this.a = byteBuffer.slice();
    }

    @Override // com.daaw.le2
    public final void a(MessageDigest[] messageDigestArr, long j, int i) {
        ByteBuffer slice;
        synchronized (this.a) {
            int i2 = (int) j;
            this.a.position(i2);
            this.a.limit(i2 + i);
            slice = this.a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }

    @Override // com.daaw.le2
    public final long zza() {
        return this.a.capacity();
    }
}
