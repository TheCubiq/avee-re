package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class bs2 extends wr2 {

    /* renamed from: b */
    public final zr2 f5092b = new zr2();

    /* renamed from: c */
    public ByteBuffer f5093c;

    /* renamed from: d */
    public long f5094d;

    public bs2(int i) {
    }

    @Override // com.daaw.wr2
    /* renamed from: b */
    public final void mo5837b() {
        super.mo5837b();
        ByteBuffer byteBuffer = this.f5093c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    /* renamed from: h */
    public final void m25843h(int i) {
        ByteBuffer byteBuffer = this.f5093c;
        if (byteBuffer == null) {
            this.f5093c = m25841j(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.f5093c.position();
        int i2 = i + position;
        if (capacity >= i2) {
            return;
        }
        ByteBuffer m25841j = m25841j(i2);
        if (position > 0) {
            this.f5093c.position(0);
            this.f5093c.limit(position);
            m25841j.put(this.f5093c);
        }
        this.f5093c = m25841j;
    }

    /* renamed from: i */
    public final boolean m25842i() {
        return m5835d(1073741824);
    }

    /* renamed from: j */
    public final ByteBuffer m25841j(int i) {
        ByteBuffer byteBuffer = this.f5093c;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i + ")");
    }
}
