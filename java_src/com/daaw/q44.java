package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class q44 implements iz7 {
    public final ByteBuffer p;

    public q44(ByteBuffer byteBuffer) {
        this.p = byteBuffer.duplicate();
    }

    @Override // com.daaw.iz7
    public final int N(ByteBuffer byteBuffer) {
        if (this.p.remaining() != 0 || byteBuffer.remaining() <= 0) {
            int min = Math.min(byteBuffer.remaining(), this.p.remaining());
            byte[] bArr = new byte[min];
            this.p.get(bArr);
            byteBuffer.put(bArr);
            return min;
        }
        return -1;
    }

    @Override // com.daaw.iz7
    public final ByteBuffer R(long j, long j2) {
        int position = this.p.position();
        this.p.position((int) j);
        ByteBuffer slice = this.p.slice();
        slice.limit((int) j2);
        this.p.position(position);
        return slice;
    }

    @Override // com.daaw.iz7
    public final void b(long j) {
        this.p.position((int) j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.daaw.iz7
    public final long zzb() {
        return this.p.position();
    }

    @Override // com.daaw.iz7
    public final long zzc() {
        return this.p.limit();
    }
}
