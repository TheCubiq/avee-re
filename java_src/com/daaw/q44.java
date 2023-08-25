package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class q44 implements iz7 {

    /* renamed from: p */
    public final ByteBuffer f23672p;

    public q44(ByteBuffer byteBuffer) {
        this.f23672p = byteBuffer.duplicate();
    }

    @Override // com.daaw.iz7
    /* renamed from: N */
    public final int mo12775N(ByteBuffer byteBuffer) {
        if (this.f23672p.remaining() != 0 || byteBuffer.remaining() <= 0) {
            int min = Math.min(byteBuffer.remaining(), this.f23672p.remaining());
            byte[] bArr = new byte[min];
            this.f23672p.get(bArr);
            byteBuffer.put(bArr);
            return min;
        }
        return -1;
    }

    @Override // com.daaw.iz7
    /* renamed from: R */
    public final ByteBuffer mo12774R(long j, long j2) {
        int position = this.f23672p.position();
        this.f23672p.position((int) j);
        ByteBuffer slice = this.f23672p.slice();
        slice.limit((int) j2);
        this.f23672p.position(position);
        return slice;
    }

    @Override // com.daaw.iz7
    /* renamed from: b */
    public final void mo12773b(long j) {
        this.f23672p.position((int) j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.daaw.iz7
    public final long zzb() {
        return this.f23672p.position();
    }

    @Override // com.daaw.iz7
    public final long zzc() {
        return this.f23672p.limit();
    }
}
