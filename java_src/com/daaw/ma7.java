package com.daaw;

import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* loaded from: classes.dex */
public class ma7 extends i37 {

    /* renamed from: b */
    public final d77 f18727b = new d77();

    /* renamed from: c */
    public ByteBuffer f18728c;

    /* renamed from: d */
    public boolean f18729d;

    /* renamed from: e */
    public long f18730e;

    /* renamed from: f */
    public ByteBuffer f18731f;

    /* renamed from: g */
    public final int f18732g;

    static {
        k63.m18024b("media3.decoder");
    }

    public ma7(int i, int i2) {
        this.f18732g = i;
    }

    @Override // com.daaw.i37
    /* renamed from: b */
    public void mo6965b() {
        super.mo6965b();
        ByteBuffer byteBuffer = this.f18728c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f18731f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f18729d = false;
    }

    @EnsuresNonNull({"data"})
    /* renamed from: i */
    public final void m16130i(int i) {
        ByteBuffer byteBuffer = this.f18728c;
        if (byteBuffer == null) {
            this.f18728c = m16127l(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.f18728c = byteBuffer;
            return;
        }
        ByteBuffer m16127l = m16127l(i2);
        m16127l.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            m16127l.put(byteBuffer);
        }
        this.f18728c = m16127l;
    }

    /* renamed from: j */
    public final void m16129j() {
        ByteBuffer byteBuffer = this.f18728c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f18731f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    /* renamed from: k */
    public final boolean m16128k() {
        return m20162d(1073741824);
    }

    /* renamed from: l */
    public final ByteBuffer m16127l(int i) {
        int i2 = this.f18732g;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f18728c;
        throw new j97(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }
}
