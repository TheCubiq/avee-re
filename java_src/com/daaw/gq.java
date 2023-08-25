package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class gq extends rc {
    public final jn q = new jn();
    public ByteBuffer r;
    public long s;
    public final int t;

    public gq(int i) {
        this.t = i;
    }

    public static gq r() {
        return new gq(0);
    }

    @Override // com.daaw.rc
    public void f() {
        super.f();
        ByteBuffer byteBuffer = this.r;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final ByteBuffer m(int i) {
        int i2 = this.t;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.r;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i + ")");
    }

    public void n(int i) {
        ByteBuffer byteBuffer = this.r;
        if (byteBuffer == null) {
            this.r = m(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.r.position();
        int i2 = i + position;
        if (capacity >= i2) {
            return;
        }
        ByteBuffer m = m(i2);
        if (position > 0) {
            this.r.position(0);
            this.r.limit(position);
            m.put(this.r);
        }
        this.r = m;
    }

    public final void o() {
        this.r.flip();
    }

    public final boolean p() {
        return h(1073741824);
    }

    public final boolean q() {
        return this.r == null && this.t == 0;
    }
}
