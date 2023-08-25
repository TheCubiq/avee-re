package com.daaw;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class ys7 extends InputStream {

    /* renamed from: p */
    public Iterator f34006p;

    /* renamed from: q */
    public ByteBuffer f34007q;

    /* renamed from: r */
    public int f34008r = 0;

    /* renamed from: s */
    public int f34009s;

    /* renamed from: t */
    public int f34010t;

    /* renamed from: u */
    public boolean f34011u;

    /* renamed from: v */
    public byte[] f34012v;

    /* renamed from: w */
    public int f34013w;

    /* renamed from: x */
    public long f34014x;

    public ys7(Iterable iterable) {
        this.f34006p = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            this.f34008r++;
        }
        this.f34009s = -1;
        if (m3323n()) {
            return;
        }
        this.f34007q = vs7.f30561e;
        this.f34009s = 0;
        this.f34010t = 0;
        this.f34014x = 0L;
    }

    /* renamed from: d */
    public final void m3324d(int i) {
        int i2 = this.f34010t + i;
        this.f34010t = i2;
        if (i2 == this.f34007q.limit()) {
            m3323n();
        }
    }

    /* renamed from: n */
    public final boolean m3323n() {
        this.f34009s++;
        if (this.f34006p.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) this.f34006p.next();
            this.f34007q = byteBuffer;
            this.f34010t = byteBuffer.position();
            if (this.f34007q.hasArray()) {
                this.f34011u = true;
                this.f34012v = this.f34007q.array();
                this.f34013w = this.f34007q.arrayOffset();
            } else {
                this.f34011u = false;
                this.f34014x = gw7.m21173m(this.f34007q);
                this.f34012v = null;
            }
            return true;
        }
        return false;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte m21177i;
        if (this.f34009s == this.f34008r) {
            return -1;
        }
        if (this.f34011u) {
            m21177i = this.f34012v[this.f34010t + this.f34013w];
        } else {
            m21177i = gw7.m21177i(this.f34010t + this.f34014x);
        }
        m3324d(1);
        return m21177i & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.f34009s == this.f34008r) {
            return -1;
        }
        int limit = this.f34007q.limit();
        int i3 = this.f34010t;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f34011u) {
            System.arraycopy(this.f34012v, i3 + this.f34013w, bArr, i, i2);
        } else {
            int position = this.f34007q.position();
            ByteBuffer byteBuffer = (ByteBuffer) this.f34007q.position(this.f34010t);
            this.f34007q.get(bArr, i, i2);
            ByteBuffer byteBuffer2 = (ByteBuffer) this.f34007q.position(position);
        }
        m3324d(i2);
        return i2;
    }
}
