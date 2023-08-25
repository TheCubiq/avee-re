package com.daaw;

import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* loaded from: classes.dex */
public class ma7 extends i37 {
    public final d77 b = new d77();
    public ByteBuffer c;
    public boolean d;
    public long e;
    public ByteBuffer f;
    public final int g;

    static {
        k63.b("media3.decoder");
    }

    public ma7(int i, int i2) {
        this.g = i;
    }

    @Override // com.daaw.i37
    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.d = false;
    }

    @EnsuresNonNull({"data"})
    public final void i(int i) {
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer == null) {
            this.c = l(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.c = byteBuffer;
            return;
        }
        ByteBuffer l = l(i2);
        l.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            l.put(byteBuffer);
        }
        this.c = l;
    }

    public final void j() {
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean k() {
        return d(1073741824);
    }

    public final ByteBuffer l(int i) {
        int i2 = this.g;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.c;
        throw new j97(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }
}
