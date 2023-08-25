package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class bs2 extends wr2 {
    public final zr2 b = new zr2();
    public ByteBuffer c;
    public long d;

    public bs2(int i) {
    }

    @Override // com.daaw.wr2
    public final void b() {
        super.b();
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final void h(int i) {
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer == null) {
            this.c = j(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.c.position();
        int i2 = i + position;
        if (capacity >= i2) {
            return;
        }
        ByteBuffer j = j(i2);
        if (position > 0) {
            this.c.position(0);
            this.c.limit(position);
            j.put(this.c);
        }
        this.c = j;
    }

    public final boolean i() {
        return d(1073741824);
    }

    public final ByteBuffer j(int i) {
        ByteBuffer byteBuffer = this.c;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i + ")");
    }
}
