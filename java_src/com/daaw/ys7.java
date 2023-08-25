package com.daaw;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class ys7 extends InputStream {
    public Iterator p;
    public ByteBuffer q;
    public int r = 0;
    public int s;
    public int t;
    public boolean u;
    public byte[] v;
    public int w;
    public long x;

    public ys7(Iterable iterable) {
        this.p = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            this.r++;
        }
        this.s = -1;
        if (n()) {
            return;
        }
        this.q = vs7.e;
        this.s = 0;
        this.t = 0;
        this.x = 0L;
    }

    public final void d(int i) {
        int i2 = this.t + i;
        this.t = i2;
        if (i2 == this.q.limit()) {
            n();
        }
    }

    public final boolean n() {
        this.s++;
        if (this.p.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) this.p.next();
            this.q = byteBuffer;
            this.t = byteBuffer.position();
            if (this.q.hasArray()) {
                this.u = true;
                this.v = this.q.array();
                this.w = this.q.arrayOffset();
            } else {
                this.u = false;
                this.x = gw7.m(this.q);
                this.v = null;
            }
            return true;
        }
        return false;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte i;
        if (this.s == this.r) {
            return -1;
        }
        if (this.u) {
            i = this.v[this.t + this.w];
        } else {
            i = gw7.i(this.t + this.x);
        }
        d(1);
        return i & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.s == this.r) {
            return -1;
        }
        int limit = this.q.limit();
        int i3 = this.t;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.u) {
            System.arraycopy(this.v, i3 + this.w, bArr, i, i2);
        } else {
            int position = this.q.position();
            ByteBuffer byteBuffer = (ByteBuffer) this.q.position(this.t);
            this.q.get(bArr, i, i2);
            ByteBuffer byteBuffer2 = (ByteBuffer) this.q.position(position);
        }
        d(i2);
        return i2;
    }
}
